import java.util.*;
public class Program3
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        System.out.println("Enter the elements at position ("+i+","+j+")"+": ");
		        a[i][j]=in.nextInt();
		    }
		}
		System.out.println("\nThe Input is :");
		for(int i=0;i<3;i++)
		{
	        for(int j=0;j<3;j++)
	        {
	            System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		int temp=0,temp2=0,temp3=0;
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        if(a[i][j]==4)
		        {
		            temp=a[i][j];
		        }
		         if(a[i][j]==7)
		        {
		            temp2=a[i][j];
		        }
		         if(a[i][j]==3)
		        {
		            temp3=a[i][j];
		        }
		    }
		}
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        if(a[i][j]==1)
		        {
		            a[i][j]=temp;
		        }
		        if(a[i][j]==9)
		        {
		            a[i][j]=temp2;
		        }
		        if(a[i][j]==6)
		        {
		            a[i][j]=temp3;
		        }
		    }
		}
		
		System.out.println("\nThe Output is :");
		
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

The Input is :
5 4 7 
1 8 3 
9 6 2 

The Output is :
5 4 7 
4 8 3 
7 3 2 


*/