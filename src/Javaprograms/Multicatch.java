package Javaprograms;

public class Multicatch {
	public static void main(String[] args) {  
        
        try{    
             int arr1[]=new int[8];    
             
             System.out.println(arr1[10]); 
             int c=5/0;
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }
        finally{
        	System.out.println("finally block is printed");
        }  
        System.out.println("rest of the code...");  
        }  
   
            
 }    

