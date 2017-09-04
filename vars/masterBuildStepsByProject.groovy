class masterBuildStepsByProject implements Serializable {
    def getMasterBuildStepsByProject(masterBuildType, firstProject) { 

        List<String> masterBuildAdminPlusDev001 = new ArrayList<String>()
		masterBuildAdminPlusDev001.add("Build-Exaxe.AdminPlus-Dev001"); 
		masterBuildAdminPlusDev001.add("Build-Exaxe.Apex-Dev001");
		masterBuildAdminPlusDev001.add("Build-Exaxe.Aggregate-Dev001"); 
		masterBuildAdminPlusDev001.add("Build-Exaxe.Apex.Activities-Dev001"); 
		masterBuildAdminPlusDev001.add("Build-Exaxe.Apex.Server-Dev001"); 
		masterBuildAdminPlusDev001.add("Build-AdminPlusUI-Dev001"); 
		masterBuildAdminPlusDev001.add("Deploy-AdminPlus-Dev001-SalesDemo"); 

        List<String> masterBuildAdminPlusDev002 = new ArrayList<String>();
		masterBuildAdminPlusDev002.add("Build-Exaxe.Client-Dev002"); 
		masterBuildAdminPlusDev002.add("Build-Exaxe.AdminPlus-Dev002"); 
		masterBuildAdminPlusDev002.add("Build-Exaxe.Apex-Dev002"); 
		masterBuildAdminPlusDev002.add("Build-Exaxe.Aggregate-Dev002"); 
		masterBuildAdminPlusDev002.add("Build-Exaxe.Apex.Activities-Dev002"); 
		masterBuildAdminPlusDev002.add("Build-Exaxe.Apex.Server-Dev002"); 
		masterBuildAdminPlusDev002.add("Build-AdminPlusUI-Dev002"); 
		masterBuildAdminPlusDev002.add("Deploy-AdminPlus-Dev002-SalesDemo"); 
		masterBuildAdminPlusDev002.add("Deploy-AdminPlus-Dev002-OneFamily"); 
		
		List<String> masterBuildBaseDev001 = new ArrayList<String>()
		masterBuildBaseDev001.add("Build-Exaxe.Types-Dev001"); 
		masterBuildBaseDev001.add("Build-Exaxe.Libraries-Dev001"); 
		masterBuildBaseDev001.add("Build-Exaxe.External-Dev001"); 
		masterBuildBaseDev001.add("Build-Exaxe.Agent-Dev001"); 
		masterBuildBaseDev001.add("Build-Exaxe.App-Dev001"); 
		masterBuildBaseDev001.add("Build-Exaxe.Common-Dev001"); 
		masterBuildBaseDev001.add("Build-Exaxe.Configuration-Dev001"); 
		masterBuildBaseDev001.add("Build-Exaxe.Rules-Dev001"); 
		masterBuildBaseDev001.add("Build-Exaxe.SystemConfiguration-Dev001"); 
		masterBuildBaseDev001.add("Build-Exaxe.Users-Dev001");
		masterBuildBaseDev001.add("Build-Exaxe.Accounting-Dev001");
		masterBuildBaseDev001.add("Build-Exaxe.UIElements-Dev001");
		masterBuildBaseDev001.add("Build-SystemConfigurationUI-Dev001");
		masterBuildBaseDev001.add("Build-Exaxe.Calculations-Dev001");
		
		List<String> masterBuildePOSDev002 = new ArrayList<String>()
        masterBuildePOSDev002.add("Build-Exaxe.Client-Dev003");
        masterBuildePOSDev002.add("Build-Exaxe.FactFind-Dev002");
        masterBuildePOSDev002.add("Build-Exaxe.Quote.Rules-Dev001");
        masterBuildePOSDev002.add("Build-Exaxe.Quote-Dev002");
        masterBuildePOSDev002.add("Build-Exaxe.ExistingBusiness-Dev001");
        masterBuildePOSDev002.add("Build-PointOfSaleUI-Dev001");
        masterBuildePOSDev002.add("Deploy-ePOS-Dev002-ACORN");

		List<String> masterBuildPolicyEBIDev001 = new ArrayList<String>()
		masterBuildPolicyEBIDev001.add("Build-Exaxe.PolicyEBI-Dev001"); 
		masterBuildPolicyEBIDev001.add("Build-ExistingBusinessUI"); 
		masterBuildPolicyEBIDev001.add("Deploy-PolicyEBI-Dev001-Aviva"); 
		
		List<String> buildSteps = new ArrayList<String>();
        switch (masterBuildType) {
            case "MasterBuildAdminPlusDev001":
                buildSteps = masterBuildAdminPlusDev001;
                break
            case "MasterBuildAdminPlusDev002":
                buildSteps = masterBuildAdminPlusDev002;
                break
			case "MasterBuildBaseDev001":
                buildSteps = masterBuildBaseDev001;
                break
			case "MasterBuildePOSDev002":
                buildSteps = masterBuildePOSDev002;
                break
			case "MasterBuildPolicyEBIDev001":
                buildSteps = masterBuildPolicyEBIDev001;
                break
            default:
                buildSteps.add("MasterBuildNotDefined");
                break
        }   

		int indexOfStartStep = buildSteps.indexOf(val);
        
		if(indexOfStartStep == -1){
			indexOfStartStep = 0;
		}

		// Return Selected MasterBuildSteps
		def steps = buildSteps.subList(Math.max(indexOfStartStep, 0), buildSteps.size()).collect();
		
		steps
    }
}