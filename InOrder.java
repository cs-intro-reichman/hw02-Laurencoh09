 import java.util.Random;
  
public class  InOrder {
   	public static void main (String[] args) {

   	    int num1 = -1;
   		int num2 = 0;
   		String res = "";

   		do{
   			num2 = (int)(Math.random() * 10);

            if( num2 >= num1 ){
        	 
        	  res = res + num2 + " ";
              num1 = num2 ;
             
            } 
            else {
            	break;
            }

        
        }
        while( true );

        System.out.println(res);
    }
}
