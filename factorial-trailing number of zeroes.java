/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
		    int n = s.nextInt();
		    int count=0;
		    for(int i =5 ;i<=n;i=i*5)
		    {
		        count+=n/i;
		    }
		    System.out.println(count);
		}
	}
}
