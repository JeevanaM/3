package org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalesTaxCalculaterTest {
	double itemprice=0.0;
@Test
public void salestaxtest(){						
		Assert.assertEquals(SalesTaxCalculater.totalitemprice("basic",10.1),10.201);
		Assert.assertEquals(SalesTaxCalculater.totalitemprice("luxury",10.1),11.009);
		Assert.assertEquals(SalesTaxCalculater.totalitemprice("",10.1),11.009);
		Assert.assertEquals(SalesTaxCalculater.totalitemprice("",10.1),10.1);	
				
		}

}
    		
		

	


