import java.util.Scanner;

class multiplicationTable {
    public static void main(String args[])
    {   Scanner cin=new Scanner(System.in);
        int n;
        System.out.println("Enter the number whose multiplication Table you want");
        n=cin.nextInt();
        System.out.println("Multiplication Table of "+n+" is ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);


        }


    }
}