package p2;
import java.util.Scanner;
import p1.Person;

public class Patient extends Person
{

int name;
String diagnosis;
int pno;
int wdno;

public Patient()
{

super();
this.diagnosis = diagnosis;
this.pno = pno;
this.wdno = wdno ;
}

public void read()
{

super.read();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the type of diagnosis ");
diagnosis = sc.next();
System.out.println("Enter the patient id ");
pno = sc.nextInt();
System.out.println("Enter the ward no. ");
wdno = sc.nextInt();

}

public void print()
{
System.out.println("Details of the patient are ");
super.print();
System.out.println("Diagnosis of the patient is : " + diagnosis);
System.out.println("Ward number of the patient is : " + wdno);
System.out.println("Patient id is  : " + pno);
}
}


