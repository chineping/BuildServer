import hudson.Util;

def jobBuild = "";

def duration = "";

try{
	
    node{
		// INPUT PARAMS
		def masterBuildName = SelectedMasterBuild; 
		def buildFrom = BuildFromProject; 

		def masterBuildStepsClass = new masterBuildSteps();

		def buildSteps = masterBuildStepsClass.getMasterBuildSteps(masterBuildName, buildFrom);
    
		for (String buildStep : buildSteps) {
			jobBuild = buildStep; //// So it can be included in the failure notification

			echo "Building: ${buildStep}";

			stage("${buildStep}")
			{
				build buildStep;
			}
		}

		currentBuild.result = "SUCCESS";
		duration = "Build duration: ${Util.getTimeSpanString(System.currentTimeMillis() - currentBuild.startTimeInMillis)}";

		try{
			stage("Success Notification"){
                echo duration;
				
                mail to: "${DEV_TEAM_EMAIL}", 
                subject: " ${JOB_NAME} (Build ${currentBuild.displayName} / ${currentBuild.result})", 
                body: "${env.BUILD_URL} \r\n ${duration}" 
            }
        }
        catch(err){
            echo "Notification stage failed, but build was successful.";
            echo "Error: ${err}"
        }

	} // END NODE
}
catch(err){
    echo "Build Failed...";
	
    currentBuild.result = "FAILURE";
	
    node{
        stage("Error Notification"){
            mail to: "${DEV_TEAM_EMAIL}", 
            subject: " ${JOB_NAME} (Build ${currentBuild.displayName} / ${currentBuild.result})", 
            body: "The build failed on stage: ${jobBuild} \r\nError: ${err} \r\nURL: ${env.BUILD_URL}"      
        }
    }
}