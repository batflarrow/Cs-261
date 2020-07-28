 import java.util.*;
class   armstrongOrNot  {

    public static void main(String args[])
    {   Scanner cin=new Scanner(System.in);
        int a;
        System.out.println("Enter the number which you wanna check if it is armstrong number or not");
        a=cin.nextInt();

        int b=a;

        double sum=0;
        int remainder;
        while(a!=0)
        {
            remainder=a%10;
            sum=sum+Math.pow(remainder,3);
            a=a/10;

        }
        if(b==sum)
            System.out.println("The number entered is armstrong number");
       else
       System.out.println("The number entered is not a armstrong number");
        
    }

}