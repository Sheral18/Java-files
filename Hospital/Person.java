package p1;
import java.util.Scanner;

public class Person
{

String pname;
String padhaarno;

public Person()
{
this.pname = pname;
this.padhaarno = padhaarno;

}
public void read()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter  name " );
pname = sc.next();
System.out.println("Enter adhaar no .");
padhaarno =sc.next(); 
}

public void print()
{
System.out.println("Name is  " + pname  + "\nAdhaar no . is " + padhaarno );
}

}
