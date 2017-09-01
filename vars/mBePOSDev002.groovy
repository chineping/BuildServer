class mBePOSDev002 implements Serializable {
    def getMasterBuildSteps(val) { 
        
		List<String> masterBuildSteps = new ArrayList<String>();

		List<String> allSteps = new ArrayList<String>();
        allSteps.add("Build-Exaxe.Client-Dev003");
        allSteps.add("Build-Exaxe.FactFind-Dev002");
        allSteps.add("Build-Exaxe.Quote.Rules-Dev001");
        allSteps.add("Build-Exaxe.Quote-Dev002");
        allSteps.add("Build-Exaxe.ExistingBusiness-Dev001");
        allSteps.add("Build-PointOfSaleUI-Dev001");
        allSteps.add("Deploy-ePOS-Dev002-ACORN");
		
		int indexOfStartStep = allSteps.indexOf(val);
        
		if(indexOfStartStep == -1){
			indexOfStartStep = allSteps.size();
		}

		// Return Selected MasterBuildSteps
		allSteps.subList(Math.max(allSteps.size() - indexOfStartStep, 0), allSteps.size());
    }
}