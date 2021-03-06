class deployUsersWebApi implements Serializable {
    def getDeploySteps() { 
		
		List deploySteps = new ArrayList<Map<String,String>>();

		//Initialisation
		Map<String,String> initialisationMap  = new HashMap<String,String>();
		initialisationMap.put("Project", "Initialisation"); 
		initialisationMap.put("Operation", "Initialisation"); 
		deploySteps.add(initialisationMap);

		//GetAllCodeLatestVersion
		Map<String,String> getAllCodeMap  = new HashMap<String,String>();
		getAllCodeMap.put("Project", "GetAllCodeLatestVersion"); 
		getAllCodeMap.put("Operation", "GetAllCodeLatestVersion"); 
		deploySteps.add(getAllCodeMap);

		//Exaxe.SolutionManager - GetCodeLatestVersion
		Map<String,String> solutionManagerGetCodeMap  = new HashMap<String,String>();
		solutionManagerGetCodeMap.put("Project", "Exaxe.SolutionManager-Update"); 
		solutionManagerGetCodeMap.put("Operation", "GetCodeLatestVersion"); 
		deploySteps.add(solutionManagerGetCodeMap);

		//Exaxe.SolutionManager - RestoreNuGetPackages
		Map<String,String> solutionManagerRestoreNuGetMap  = new HashMap<String,String>();
		solutionManagerRestoreNuGetMap.put("Project", "Exaxe.SolutionManager-Update"); 
		solutionManagerRestoreNuGetMap.put("Operation", "RestoreNuGetPackages"); 
		deploySteps.add(solutionManagerRestoreNuGetMap);

		/// WEB SITES
		//Exaxe.Users - GetCodeLatestVersion
		Map<String,String> usersWebApiGetCodeMap  = new HashMap<String,String>();
		usersWebApiGetCodeMap.put("Project", "Exaxe.Users"); 
		usersWebApiGetCodeMap.put("Operation", "GetCodeLatestVersion"); 
		deploySteps.add(usersWebApiGetCodeMap);

		//Exaxe.Users - RestoreNuGetPackages
		Map<String,String> usersWebApiRestoreNugetMap  = new HashMap<String,String>();
		usersWebApiRestoreNugetMap.put("Project", "Exaxe.Users"); 
		usersWebApiRestoreNugetMap.put("Operation", "RestoreNuGetPackages"); 
		deploySteps.add(usersWebApiRestoreNugetMap);
		
		//Exaxe.Users - PublishWebSite
		Map<String,String> usersWebApiPublishMap  = new HashMap<String,String>();
		usersWebApiPublishMap.put("Project", "Exaxe.Users"); 
		usersWebApiPublishMap.put("Operation", "PublishWebSite"); 
		deploySteps.add(usersWebApiPublishMap);

		//Release Content
		Map<String,String> releaseContentMap  = new HashMap<String,String>();
		releaseContentMap.put("Project", "ReleaseContent"); 
		releaseContentMap.put("Operation", "ReleaseContent"); 
		deploySteps.add(releaseContentMap);
		
		//Return All of the defined steps (Broker)
		deploySteps
    }
}
