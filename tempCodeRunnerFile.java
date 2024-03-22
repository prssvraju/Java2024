try{    
            System.out.println("going to divide by 0");    
            int b =39/0;    
          }  
           //catch block of inner try block 1  
           catch(ArithmeticException e)  
           {  
             System.out.println(e);  
           }    