/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */


public class Perfect{
   	public static void main (String[] args){
        int x = Integer.parseInt(args[0]);
if (x < 0) {
 System.out.println(x + " is not a perfect number ");
}
String res = x + " is a prefect number since " + x + " = 1"; 
int counter = 1;
   		for (int i = 2; i < x-1; i++) {
            if ( x % i == 0 ) {
               
counter = counter + i;
res = res+ " + " +i;
    }
}
if (counter == x){
System.out.println(res);
} 
else {
        System.out.println(x + " is not a perfect number ");

   
   		}
   	}

   		}
     
 		
