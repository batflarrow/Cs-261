import java.util.Scanner;


class circle {
    


public static void main(String args[])
{
Scanner cin=new Scanner(System.in);

System.out.println("Enter the radius of the circles whose circumference and area are required ");
int r;
r=cin.nextInt();
double circumference=2*Math.PI*r;
double area=Math.PI*r*r;
System.out.println("Circumference of the circle is "+circumference+"\nArea of the Circle is "+area);



}







}