/*
Change the previous program in such a way that it computes how many perfect numbers are in the range between 1 and the number given
as the first command-line argument!
*/

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args){
		int last= Integer.parseInt(args[0]);
		int sum=0;
		int i;
		int cnt =0;
		for (i=1;i<=last;i++) 
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}

			if(sum==i)
			{
				cnt++;
			}

			sum = 0;
		}

		System.out.println("Perfect Numbers are : " + cnt);
	}

}
