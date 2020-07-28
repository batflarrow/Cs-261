import java.util.Scanner;

class evenOrOdd {
public static void main(String args[])
{
Scanner cin= new Scanner(System.in);

System.out.println("Enter the number which you wanna check ");
int n;
n=cin.nextInt();

if(n%2==0)
System.out.println("The number you entered is even");
else
System.out.println("The number you entered is odd");
}
    


}