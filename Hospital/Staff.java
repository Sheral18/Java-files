package s1;
import p1.Person;
import java.util.Scanner;


public class Staff extends Person
{
int  stno;


public Staff()
{
super();
this.stno = stno;

}


public void read()
{
Scanner sc = new Scanner(System.in);
super.read();
System.out.println("Enter staff id no. ");

stno = sc.nextInt();

}


public void print()
{
super.print();
System.out.println("Staff id no. is " + stno);
}
}