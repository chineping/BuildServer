class deployCommonBuildSteps implements Serializable {
    def getDeployCommonBuildSteps(val) { 
		
		List commonDeploySteps = new ArrayList<Map<String,String>>();

		switch (val) {
            case "DeployAdvicePlus":
                def deployAdvicePlusClass = new deployAdvicePlus();
				commonDeploySteps = deployAdvicePlusClass.getDeploySteps();
                break
            case "DeployAdvicePlusRelease":
                def deployAdvicePlusReleaseClass = new deployAdvicePlusRelease();
				commonDeploySteps = deployAdvicePlusReleaseClass.getDeploySteps();
                break
			case "DeployAdminPlus":
                def deployAdminPlusClass = new deployAdminPlus();
				commonDeploySteps = deployAdminPlusClass.getDeploySteps();
                break
			case "DeployPolicyEBI":
                def deployPolicyEbiClass = new deployPolicyEbi();
				commonDeploySteps = deployPolicyEbiClass.getDeploySteps();
                break
			case "DeployChannelPlus":
                def deployChannelPlusClass = new deployChannelPlus();
				commonDeploySteps = deployChannelPlusClass.getDeploySteps();
                break
			case "DeployChannelPlusUI":
                def deployChannelPlusUIClass = new deployChannelPlusUI();
				commonDeploySteps = deployChannelPlusUIClass.getDeploySteps();
                break
			case "DeployPortalsBroker":
                def deployHansardsPortalsBrokerClass = new deployHansardsPortalsBroker();
				commonDeploySteps = deployHansardsPortalsBrokerClass.getDeploySteps();
                break
			case "DeployPortalsClient":
                def deployHansardsPortalsClientClass = new deployHansardsPortalsClient();
				commonDeploySteps = deployHansardsPortalsClientClass.getDeploySteps();
                break
            default:             
                break
        }  

		//Return All of the defined steps
		commonDeploySteps
    }
}