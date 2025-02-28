import java.util.*;

public class Prorgram2
{
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[]=new int[9];
		int temp,k,d;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        System.out.println("Enter the elements at position ("+i+","+j+")"+": ");
		        a[i][j]=in.nextInt();
		    }
		}
		System.out.println("Given matrix");
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		k=0;
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        b[k]=a[i][j];
		        k++;
		    }
		}
		
		for(int i=0;i<b.length;i++)
		{
		    System.out.print(b[i]);
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
		    for(int j=i+1;j<b.length;j++)
		    {
		        if(b[i]>b[j])
		        {
		            temp=b[i];
		            b[i]=b[j];
		            b[j]=temp;
		        }
		    }
		}
		
		for(int i=0;i<b.length;i++)
		{
		    System.out.print(b[i]);
		}
		d=0;
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        a[i][j]=b[d++];
		    }
		}
		System.out.println("\nThe Sorted Matrix");
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}



/*
Enter the elements at position (0,0): 
5
Enter the elements at position (0,1): 
4
Enter the elements at position (0,2): 
7
Enter the elements at position (1,0): 
1
Enter the elements at position (1,1): 
8
Enter the elements at position (1,2): 
3
Enter the elements at position (2,0): 
9
Enter the elements at position (2,1): 
6
Enter the elements at position (2,2): 
2
Given matrix
5 4 7 
1 8 3 
9 6 2 
547183962
123456789
The Sorted Matrix
1 2 3 
4 5 6 
7 8 9 


*/