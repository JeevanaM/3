package org;
public class SalesTaxCalculater {
	
	public  static double totalitemprice(String itemtype,double itemprice){
		
    	if (itemtype.equalsIgnoreCase("basic"))
    	{			    		    		
    	 itemprice= itemprice+(itemprice * 0.01); 
    	
    	}
        
        else if(itemtype.equalsIgnoreCase("luxury")){
        	
        itemprice= itemprice+(itemprice * 0.09);
    	
    	
        }
    	else{
    		itemprice= itemprice+(itemprice * 0.0);
    	}
    	return itemprice;
    }
}
    		
		

	


