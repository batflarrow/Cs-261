 import java.util.*;
 class factorial {
    public static void main(String args[])
    {   int n;
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter the number whose factorial is required ");
        n=cin.nextInt();
        System.out.println("Factorial of "+n+" is equal to ");
        if(n==0)
        System.out.print("1");
        else
        {
            int fact=1;
            for(int i=n;i>=1;i--)
            {
                fact*=i;
            }
            System.out.print(fact);
        }
    }
}