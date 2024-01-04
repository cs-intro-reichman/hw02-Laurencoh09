import java.util.Random;

public class OneOfEachStats {
   	public static void main (String[] args) {

		
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		double num1 = 0.0;
		int num2 = 0, num3 = 0, num4 = 0;
		Random generator = new Random(seed);

		for (int i = 1; i <= T; i++) {
		int children = 0;
   		boolean boy = false; 
   		boolean girl = false;

   		while(!boy || !girl) { 
   			
   		if (generator.nextDouble() < 0.5) {
   			boy = true;	 
   			children++;
   		}
   		else {
   			girl = true;
   			children++;
   		}


	}
			if (children == 2) {
				num2++;
			} else if (children == 3) {
				num3++;
			} else if (children >= 4) {
				num4++;
			}
			num1 += children;
			
		}
		double average = num1 / T;
		System.out.println("Average: " + average + " children to get at least one of each gender.");

		                  System.out.println("Number of families with 2 children: " + num2);

		System.out.println("Number of families with 3 children: " + num3);
		                   System.out.println("Number of families with 4 or more children: " + num4);
		if (num2 > num3 && num2 > num4 ) {

			               System.out.println("The most common number of children is 2.");
		} else if (num3 > num4 && num3 > num2) {

			                 System.out.println("The most common number of children is 3.");
		} else {
			                System.out.println("The most common number of children is 4 or more.");
		}

	}
}
