/*
   Create a program which takes its first command-line argument as an integer number, and decides whether this number is a perfect number.
   In number theory, a natural number is called perfect, if the sum of its positive divisors (excluding the number itself) is equal to the number.
   (Or, equivalently, the sum of the positive divisors equals to two times the number.) 
   The first four perfect numbers are: 6, 28, 496 and 8128. For example, 6=1+2+3.
*/

public class Exercise1 {
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int sum =0;

		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum +=i;
			}
		}

		if(sum == n)
		{
			System.out.println("The given number is a Perfect Number.");
		} else {
			System.out.println("The given number is not a Perfect Number.");
		}
	}

}
