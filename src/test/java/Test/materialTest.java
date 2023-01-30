package Test;






import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import Page.materialPage;

import base.initial;



  public class materialTest extends initial{
	

	 materialPage check=new  materialPage ();

	@Test	 
		 public void  Page() throws InterruptedException,IOException {
			 
			 PageFactory.initElements(driver, check);	 
			 Thread.sleep(2000);
			 materialPage.master.click();
			 
			 Thread.sleep(2000);
			 materialPage.material.click();
			 
			 Thread.sleep(2000);
			 materialPage. materialState.click();
			
//			 Thread.sleep(2000);
//			 materialPage.addMaterial.click();
//		
			//SoftAssert sa = new SoftAssert();
			
			boolean AcctualElementDisplayed = materialPage.addMaterial.isDisplayed();
			materialPage.addMaterial.isDisplayed();
			boolean ExpectedElementDisplayed = true;
			//AssertJUnit.assertEquals(AcctualElement, ExpectedElement);

			boolean elementvisible = true;
			testCase = extent.createTest("Element Visible");
			try {
				AssertJUnit.assertEquals(AcctualElementDisplayed, ExpectedElementDisplayed);
			} catch (AssertionError find) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementDisplayed);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementDisplayed);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct Element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementDisplayed);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementDisplayed);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
			Thread.sleep(2000);                 
			                      
			 //check the Text
//            String txt= materialPage.addMaterial.getText();
//            System.out.println("text:"+txt);
//            String  expectedText="Add Material State";
//            sa.assertEquals(txt,expectedText);           
      //...
           /* Thread.sleep(2000);

      		String txt = materialPage.addMaterial.getText();
      		System.out.println("Title = " + txt);
      		String bgc = "rgba(255, 255, 255, 1)";
      		
      		boolean backgroundColor1 = true;
      		testCase = extent.createTest("color");
      		try {
      			AssertJUnit.assertEquals(txt, bgc);
      		} catch (AssertionError e) {
      			backgroundColor1 = false;

      		}
      			if (backgroundColor1) {
      				testCase.log(Status.INFO, "ActualElement :- " + txt);
      				testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
      				testCase.log(Status.INFO, "correct backgroundColor");
      				testCase.log(Status.PASS, "Correct ");
      			} else {
      				testCase.log(Status.INFO, "ActualElement :- " + txt);
      				testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
      				testCase.log(Status.INFO, "wrong backgroundColor");
      				testCase.log(Status.FAIL, "wrong");
      			}

                */  
			
			
			//check the enablebutton
            
            
            
            boolean ActualElementEnable=materialPage.addMaterial.isEnabled();
            boolean ExpectedElementEnable=true;         
                
                boolean enablity = true;
                testCase = extent.createTest("Button-Enabled");
                try {
                    AssertJUnit.assertEquals(ActualElementEnable,ExpectedElementEnable);
                    
                } catch (AssertionError find) {
                	enablity=false;
                }
                if (enablity) {
                    testCase.log(Status.INFO,"ActualElementEnable :- " + ActualElementEnable);
                    testCase.log(Status.INFO,"ExpectedElementEnable :- " + ExpectedElementEnable);
                    testCase.log(Status.PASS,"Element enable");
                } else {
                    testCase.log(Status.INFO,"ActualElementEnable :- " + ActualElementEnable);
                    testCase.log(Status.INFO,"ExpectedElementEnable :- " + ExpectedElementEnable);
                    testCase.log(Status.FAIL,"Element is not enable");
                }
                    Thread.sleep(2000);
			
			//check the background color
//			              String clour= materialPage.addMaterial.getCssValue("color");
//			              System.out.println("clour:"+clour);
//			              String  expectedclour="rgba(255, 255, 255, 1)";
//			              sa.assertEquals(clour,expectedclour);           
//			         
			//......
			              Thread.sleep(2000);

			      		String ActualbackgroundColor = materialPage.addMaterial.getCssValue("background-color");
			      		System.out.println("backgroundcolor = " + ActualbackgroundColor);
			      		String expectedBackGroundColor = "rgba(0, 19, 40, 1)";
			      		
			      		boolean backgroundclr1 = true;
			      		testCase = extent.createTest("background-color");
			      		try {
			      			AssertJUnit.assertEquals(ActualbackgroundColor, expectedBackGroundColor);
			      		} catch (AssertionError find) {
			      			backgroundclr1 = false;

			      		}
			      			if (backgroundclr1) {
			      				testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
			      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
		
			      				testCase.log(Status.PASS, "Correct ");
			      			} else {
			      				testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
			      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
			      				
			      				testCase.log(Status.FAIL, "wrong");
			      			}

			              
			              
			              
			              
			              
			              
			              //check the position location

//			              Point location= materialPage.addMaterial.getLocation();
//			              System.out.println("location:"+location);
//			              int x = location.getX();
//			             int y = location.getY();
//			               Point expectedLocation  =new Point(608, 93);
//			               sa.assertEquals(location,expectedLocation);   
			               
//....
			       		Thread.sleep(2000);

			    		Point actualLocation = materialPage.addMaterial.getLocation();

			    		int x = actualLocation.getX();
			    		int y = actualLocation.getY();
			    		
			    		System.out.println("x-axis = " + x);
			    		System.out.println("y-axis = " + y);
			    		
			    		
			    		Point expectedLocation = new Point(608, 93);
			    		testCase = extent.createTest("position");
			    		boolean position = true;
			    		
			    		try {
			    			AssertJUnit.assertEquals(actualLocation, expectedLocation);
			    		} catch (AssertionError find) {
			    			position = false;
			    		}
			    			if (position) {
			    				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
			    				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
			    			
			    				testCase.log(Status.PASS, "Correct ");
			    			} else {
			    				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
			    				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
			    				
			    				testCase.log(Status.FAIL, "wrong");
			    			}
			    			Thread.sleep(2000);
			    			               
			               
			  			 //check the button size
//			  			               Dimension buttonSize = materialPage.addMaterial.getSize();
//			  			                 System.out.println("ButtonSize :"+buttonSize);
//			  			                 Dimension expectedButtonSize = new Dimension(145, 32);
//			  			                 sa.assertEquals(buttonSize,expectedButtonSize);

			       		//.....
			  			          /*     Thread.sleep(2000);

			  				      		Dimension buttonSize = materialPage.addMaterial.getSize();
			  				      		System.out.println("buttonSize = " + buttonSize);
			  				      		String bts = "rgba(145, 32)";
			  				      		
			  				      		boolean buttonsize1 = true;
			  				      		testCase = extent.createTest("buttonSize");
			  				      		try {
			  				      			AssertJUnit.assertEquals(buttonSize, bts);
			  				      		} catch (AssertionError find) {
			  				      			buttonsize1 = false;

			  				      		}
			  				      			if (buttonsize1) {
			  				      				testCase.log(Status.INFO, "ActualElement :- " + buttonSize);
			  				      				testCase.log(Status.INFO, "ExpectedElement :- " + bts);
			  				      				testCase.log(Status.INFO, "correct backgroundColor");
			  				      				testCase.log(Status.PASS, "Correct ");
			  				      			} else {
			  				      				testCase.log(Status.INFO, "ActualElement :- " + buttonSize);
			  				      				testCase.log(Status.INFO, "ExpectedElement :- " + bts);
			  				      				testCase.log(Status.INFO, "wrong backgroundColor");
			  				      				testCase.log(Status.FAIL, "wrong");
			  				      			}*/
//... another way
			    			Dimension size = materialPage.addMaterial.getSize();
			    			int actualWidth = size.getWidth();
			    			System.out.println("width  = " + actualWidth);
			    			int expectedSize = 145;
			    			//AssertJUnit.assertEquals(width, expectedresult1);
			    			testCase = extent.createTest("width");
			    			boolean width1 = true;
			    			
			    			try {
			    				AssertJUnit.assertEquals(actualWidth, expectedSize);
			    			} catch (AssertionError find) {
			    				width1 = false;
			    			}
			    			if (width1) {
			    					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
			    					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
			    					
			    					testCase.log(Status.PASS, "Correct ");
			    				} else {
			    					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
			    					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
			    					
			    					testCase.log(Status.FAIL, "wrong");
			    				}

			    			

			    			Thread.sleep(2000);

			    			int actualHeight = size.getHeight();
			    			System.out.println("height = " + actualHeight);
			    			int expectedHeight = 32;
			    			//AssertJUnit.assertEquals(height, expectedresult2);

			    			boolean height1 = true;
			    			testCase = extent.createTest("height");
			    			try {
			    				AssertJUnit.assertEquals(actualHeight, expectedHeight);
			    			} catch (AssertionError find) {
			    				height1 = false;

			    			}
			    			if (height1) {
			    					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
			    					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
			    					
			    					testCase.log(Status.PASS, "Correct ");
			    				} else {
			    					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
			    					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
			    					
			    					testCase.log(Status.FAIL, "wrong");
			    				}

			    			

			    			
			  				              
//			  check the font size
//			                 String fontSize = materialPage.addMaterial.getCssValue("font-size"); 
//			                 System.out.println("Font Size: "+fontSize); 
//			                 String expectedfontsSize ="14px";
//			                 sa.assertEquals(fontSize,expectedfontsSize); 
//....
			                 Thread.sleep(2000);

					      		String actualfontsize = materialPage.addMaterial.getCssValue("font-size");
					      		System.out.println("fontsize = " + actualfontsize);
					      		String expectedFontsize = "14px";
					      		
					      		boolean fontsize1 = true;
					      		testCase = extent.createTest("font-size");
					      		try {
					      			AssertJUnit.assertEquals(actualfontsize, expectedFontsize);
					      		} catch (AssertionError find) {
					      			fontsize1 = false;

					      		}
					      			if (fontsize1) {
					      				testCase.log(Status.INFO, "ActualElement :- " + actualfontsize);
					      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontsize);
					      				
					      				testCase.log(Status.PASS, "Correct ");
					      			} else {
					      				testCase.log(Status.INFO, "ActualElement :- " + actualfontsize);
					      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontsize);
					      				
					      				testCase.log(Status.FAIL, "wrong");
					      			}

					              
			                 
			   //Check the font style
			   
//			   String fontStyle = materialPage.addMaterial.getCssValue("font-Style"); 
//               System.out.println("Font Style: "+fontStyle); 
//               String expectedfontsStyle ="normal";
//               sa.assertEquals(fontStyle,expectedfontsStyle); 
//            
               //....
               Thread.sleep(2000);

	      		String actualFontstyle = materialPage.addMaterial.getCssValue("font-style");
	      		System.out.println("fontStyle = " + actualFontstyle);
	      		String expectedFontStyle = "normal";
	      		
	      		boolean fontstyle1 = true;
	      		testCase = extent.createTest("font-style");
	      		try {
	      			AssertJUnit.assertEquals(actualFontstyle, expectedFontStyle);
	      		} catch (AssertionError find) {
	      			fontstyle1 = false;

	      		}
	      			if (fontstyle1) {
	      				testCase.log(Status.INFO, "ActualElement :- " + actualFontstyle);
	      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontStyle);
	      				
	      				testCase.log(Status.PASS, "Correct ");
	      			} else {
	      				testCase.log(Status.INFO, "ActualElement :- " + actualFontstyle);
	      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontStyle);
	      				
	      				testCase.log(Status.FAIL, "wrong");
	      			}

	              
               
              // sa.assertAll();         	    
               
               
               
               
               //  check the font clour
//			                
//			                 String fontColor = materialPage.addMaterial.getCssValue("color"); 
//			                 System.out.println("Font clour: "+fontColor); 
//			                 String expectedFontClour ="14px";
//			                 sa.assertEquals(fontColor,expectedFontClour);             

			              
			                 //......
	                Thread.sleep(2000);

	                String actualfontcolor = materialPage.addMaterial.getCssValue("color");
	        		System.out.println("FontColor: " + actualfontcolor);
	        		String expectedfontcolor = "rgba(255, 255, 255, 1)";
	        		

	        		boolean color1 = true;
	        		testCase = extent.createTest("color");
	        		try {
	        			AssertJUnit.assertEquals(actualfontcolor, expectedfontcolor);
	        		} catch (AssertionError find) {
	        			color1 = false;
	        		}
	        			if (color1) {
	        				testCase.log(Status.INFO, "ActualElement :- " + actualfontcolor);
	        				testCase.log(Status.INFO, "ExpectedElement :- " + expectedfontcolor);
	        				
	        				testCase.log(Status.PASS, "Correct ");
	        			} else {
	        				testCase.log(Status.INFO, "ActualElement :- " + actualfontcolor);
	        				testCase.log(Status.INFO, "ExpectedElement :- " + expectedfontcolor);
	        				
	        				testCase.log(Status.FAIL, "wrong");
	        			}

	        		
	        		Thread.sleep(2000);
			                 
			                 
			                 
			                 
			              

			                    
			         
			     
			     }
			
	
	}

