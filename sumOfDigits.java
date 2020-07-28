
import java.util.*;
class  sumOfDigits  {

    public static void main(String args[])
    {   Scanner cin=new Scanner(System.in);
        int a;
        System.out.println("Enter the number whoose sum of digits you want ");
        a=cin.nextInt();
        int b=a;
        int sum=0,remainder;
        while(a!=0)
        {
            remainder=a%10;
            sum=sum+remainder;
            a=a/10;

        }
        System.out.println("Sum of digits of "+b+" is "+sum);
        

    }


}