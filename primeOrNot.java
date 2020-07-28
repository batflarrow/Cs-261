import java.util.*;

public class primeOrNot {
    
    public static void main(String args[])
    {   Scanner cin=new Scanner(System.in);
        int n;
        System.out.println("Enter the number for which you wanna check it is prime or not");
        n=cin.nextInt();
        boolean flag=false;
        int a=n/2;

        for(int i=2;i<=a;i++)
        {
            if(n%i==0)
         {   flag=true;
            break;
        }
        }
        if(flag||n==1)
        System.out.println("The given Number is not prime");
        else
        if(flag==false)
        System.out.println("The given Number is prime");
    }

}