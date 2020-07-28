import java.util.*;
class simpleInterest {
    
public static void main(String args[])
{
Scanner cin=new Scanner(System.in);
float p,r,t;
System.out.println("Enter the principal on which simple interest is to be calculated ");
p=cin.nextInt();
System.out.println("Enter the rate of simple interest in %");
r=cin.nextInt();
System.out.println("Enter the time duration of simple interest ");
t=cin.nextInt();
float si=(p*r*t)/100;
System.out.println("Simple interest for the above data is " +si);


}

}