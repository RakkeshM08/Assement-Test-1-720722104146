import java.util.*;
public class Program4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[] b = new int[9];
        int index = 0;
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.println("Enter the matrix element at position (" + i + ", " + j + "): ");
                arr[i][j] = scanner.nextInt();
                b[index++] = arr[i][j];
            }
        }
        System.out.println("The Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int abundantCount = 0;
        int nonAbundantCount = 0;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                int num = arr[i][j];
                int sum = 0;
                for (int k = 1; k <= num / 2; k++) 
                {
                    if (num % k == 0) 
                    {
                        sum += k;
                        System.out.print(" "+k);
                    }
                    
                }
                System.out.println(" "+sum);
                if (sum > num)
                {
                    abundantCount++;
                }
                else {
                    nonAbundantCount++;
                }
            }
        }
        System.out.println("Abundant numbers count: " + abundantCount);
        System.out.println("Non-Abundant numbers count: " + nonAbundantCount);
        
        if (abundantCount % 2 == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


/*
Enter the elements of the 3x3 matrix:
Enter the matrix element at position (0, 0): 
1000
Enter the matrix element at position (0, 1): 
1001
Enter the matrix element at position (0, 2): 
1002
Enter the matrix element at position (1, 0): 
1003
Enter the matrix element at position (1, 1): 
1004
Enter the matrix element at position (1, 2): 
1005
Enter the matrix element at position (2, 0): 
1006
Enter the matrix element at position (2, 1): 
1007
Enter the matrix element at position (2, 2): 
1008
The Matrix:
1000 1001 1002 
1003 1004 1005 
1006 1007 1008 
 1 2 4 5 8 10 20 25 40 50 100 125 200 250 500 1340
 1 7 11 13 77 91 143 343
 1 2 3 6 167 334 501 1014
 1 17 59 77
 1 2 4 251 502 760
 1 3 5 15 67 201 335 627
 1 2 503 506
 1 19 53 73
 1 2 3 4 6 7 8 9 12 14 16 18 21 24 28 36 42 48 56 63 72 84 112 126 144 168 252 336 504 2216
Abundant numbers count: 3
Non-Abundant numbers count: 6
Yes

*/
