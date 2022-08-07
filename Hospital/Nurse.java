package n1;
import s1.Staff;
import java.util.Scanner;

public class Nurse extends Staff
{


int wdno;

public Nurse()
{
 super();
 this.wdno  = wdno;
}

public void read()
{
super.read();
Scanner sc = new Scanner(System.in);
System.out.println("Enter ward number ");
wdno = sc.nextInt();
}

public void print()
{
System.out.println("Details of the nurse are as follows ");
super.print();
System.out.println("The ward no. is " + wdno);
}

}