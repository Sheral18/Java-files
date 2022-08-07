package sheral;
import java.util.Scanner;
public class Matrix

{

private int m ;
private int n ;
int[][] mat1 = new int[m][n];
int[][] mat2 = new int[m][n];
int[][] add = new int[m][n];
int[][] diff = new int[m][n];

public Matrix(int m , int n)
{
this.m = m;
this.n = n;
this.mat1 = new int[m][n];
this.mat2 = new int[m][n];
this.add = new int[m][n];
this.diff = new int[m][n];
}
public void read()
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter elements of 1st matrix ");


for (int i=0;i<m;i++)
{
for (int j=0;j<n;j++)
{
mat1[i][j] = sc.nextInt();
}
}

System.out.println("Enter elements of 2nd matrix ");
for (int i=0;i<m ;i++)
{
for (int j=0;j<n;j++)
{
mat2[i][j] = sc.nextInt();
}
}

}

public void sub()
{
System.out.println("The difference of 2 matrices is : ");
for (int i=0;i<m;i++)
{
for (int j=0;j<n;j++)
{
diff[i][j] = mat1[i][j] - mat2[i][j] ;
System.out.print(diff[i][j] + " ");

}
System.out.println();

}

}

public void add()
{
System.out.println("The addition of 2 matrices is : ");
for (int i=0;i<m;i++)
{

for (int j=0;j<n;j++)
{
add[i][j] = mat1[i][j] + mat2[i][j] ;
System.out.print(add[i][j]+ " ");

}
System.out.println();
}

}

public void print()
{
System.out.println("Matrix 1 elements are :" );
for (int i=0;i<m;i++)
{

for (int j=0;j<n;j++)
{
System.out.print( mat1[i][j] + "  ") ;

}
System.out.println();
}

System.out.println("Matrix 2 elements are :" );
for (int i=0;i<m;i++)
{

for (int j=0;j<n;j++)
{
System.out.print( mat2[i][j] + "  ") ;

}
System.out.println();
}

}
}











 
