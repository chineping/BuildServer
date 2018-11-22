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
			case "DeployAdminPlusV2":
                def deployAdminPlusV2Class = new deployAdminPlusV2();
				commonDeploySteps = deployAdminPlusV2Class.getDeploySteps();
                break
			case "DeployPolicyEBI":
                def deployPolicyEbiClass = new deployPolicyEbi();
				commonDeploySteps = deployPolicyEbiClass.getDeploySteps();
                break
			case "DeployChannelPlus":
                def deployChannelPlusClass = new deployChannelPlus();
				commonDeploySteps = deployChannelPlusClass.getDeploySteps();
                break
			case "DeployPortalsBroker":
                def deployHansardPortalsBrokerClass = new deployHansardPortalsBroker();
				commonDeploySteps = deployHansardPortalsBrokerClass.getDeploySteps();
                break
			case "DeployPortalsClient":
                def deployHansardsPortalClientClass = new deployHansardPortalsClient();
				commonDeploySteps = deployHansardsPortalClientClass.getDeploySteps();
                break
			case "DeployAdminPlusWebApi":
                def deployAdminPlusWebApiClass = new deployAdminPlusWebApi();
				commonDeploySteps = deployAdminPlusWebApiClass.getDeploySteps();
                break
			case "DeployAuthWebApi":
                def deployAuthWebApiClass = new deployAuthWebApi();
				commonDeploySteps = deployAuthWebApiClass.getDeploySteps();
                break
			case "DeployChannelPlusWebApi":
                def deployChannelPlusWebApiClass = new deployChannelPlusWebApi();
				commonDeploySteps = deployChannelPlusWebApiClass.getDeploySteps();
                break
			case "DeployClientWebApi":
                def deployClientWebApiClass = new deployClientWebApi();
				commonDeploySteps = deployClientWebApiClass.getDeploySteps();
                break
			case "DeployConfigurationWebApi":
                def deployConfigurationWebApiClass = new deployConfigurationWebApi();
				commonDeploySteps = deployConfigurationWebApiClass.getDeploySteps();
                break
			case "DeployUsersWebApi":
                def deployUsersWebApiClass = new deployUsersWebApi();
				commonDeploySteps = deployUsersWebApiClass.getDeploySteps();
                break
			case "DeployDocumentWebApi":
                def deployDocumentWebApiClass = new deployDocumentWebApi();
				commonDeploySteps = deployDocumentWebApiClass.getDeploySteps();
                break
			case "DeployAggregateWebApi":
                def deployAggregateWebApiClass = new deployAggregateWebApi();
				commonDeploySteps = deployAggregateWebApiClass.getDeploySteps();
                break
			case "DeployApexWebApi":
                def deployApexWebApiClass = new deployApexWebApi();
				commonDeploySteps = deployApexWebApiClass.getDeploySteps();
                break
			case "DeployQuoteWebApi":
                def deployQuoteWebApiClass = new deployQuoteWebApi();
				commonDeploySteps = deployQuoteWebApiClass.getDeploySteps();
                break
			case "DeployWebApi":
                def deployWebApiClass = new deployWebApi();
				commonDeploySteps = deployWebApiClass.getDeploySteps();
                break
			case "DeploySystemConfiguration":
                def deploySystemConfigurationClass = new deploySystemConfiguration();
				commonDeploySteps = deploySystemConfigurationClass.getDeploySteps();
                break
            default:             
                break
        }  

		//Return All of the defined steps
		commonDeploySteps
    }
}