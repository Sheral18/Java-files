package d1;
import  s1.Staff;
import java.util.Scanner;

public class Doctor extends Staff
{

int roomno;
String specialist;

public Doctor()
{
super();
this.roomno = roomno;
this.specialist = specialist;
}

public void read()
{
super.read();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the room no. ");
roomno = sc.nextInt();
System.out.println("Enter the type of specialisation ");
specialist = sc.next();
}

public void print()
{
System.out.println("Details of the doctor are " );
super.print();
System.out.println("Room no. of the doctor is "  + roomno);
System.out.println("Doctor is specialised in " + specialist);

}

}