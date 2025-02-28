import java.util.*;
class Program1
{
    public static void main(String[] args) 
    {
        int a[][] = new int[3][3];
        int b[] = new int[9];
        int index = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("Enter the matrix element at position (" + i + ", " + j + "): ");
                a[i][j] = in.nextInt();
                b[index++] = a[i][j];
            }
        }
        System.out.println("The Matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < b.length - 1; i++) 
        {
            for (int j = 0; j < b.length - i - 1; j++) 
            {
                if (b[j] < b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
        System.out.println("3rd Max Element: " + b[2]);
    }
}
/*
Enter the matrix element at position (0, 0): 
1
Enter the matrix element at position (0, 1): 
2
Enter the matrix element at position (0, 2): 
3
Enter the matrix element at position (1, 0): 
4
Enter the matrix element at position (1, 1): 
5
Enter the matrix element at position (1, 2): 
6
Enter the matrix element at position (2, 0): 
7
Enter the matrix element at position (2, 1): 
8
Enter the matrix element at position (2, 2): 
9
The Matrix:
1 2 3 
4 5 6 
7 8 9 
3rd Max Element: 7

*/
