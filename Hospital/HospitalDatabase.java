package h;


import  p1.Person;
import s1.Staff;
import n1.Nurse;
import d1.Doctor;
import p2.Patient;

public class HospitalDatabase
{
public static void main(String[] args)
{
/*
Person p = new Person();
p.read();
p.print();

Staff s = new Staff();
s.read();
s.print();
*/

System.out.println();

Doctor[] d = new Doctor[2];
for (int i=0;i<d.length;i++)
{
d[i] = new Doctor();
d[i].read();
d[i].print();
System.out.println();
}

System.out.println("\n");
Patient[] p1 = new Patient[2];
for(int i=0;i<p1.length;i++)
{
p1[i]= new Patient();
p1[i].read();
p1[i].print();
System.out.println();
}

System.out.println("\n");
Nurse[] n = new Nurse[2];
for(int i=0;i<n.length;i++)
{
n[i]= new Nurse();
n[i].read();
n[i].print();
System.out.println();

}


}
}