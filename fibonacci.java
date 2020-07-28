import java.util.*;


class fibonacci {

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of elements you want in the fibonacci sequence");
        n=cin.nextInt();
        int a=0;
        int b=1;
        System.out.println("The first "+n+" Fibonacci numbers are:-");
        for(int i=1;i<=n;i++)
       { System.out.print(b+" ");
        int fib=a+b;
        a=b;
        b=fib;
    }
    }
}