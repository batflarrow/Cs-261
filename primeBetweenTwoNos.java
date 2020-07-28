import java.util.*;
class primeBetweenTwoNos {
    
    public static void main(String args[])
    {    Scanner cin=new Scanner(System.in);
         int a,b;
        System.out.println("Enter two numbers between which you want prime numbers");
        
        a=cin.nextInt();
        b=cin.nextInt();
        System.out.println("Prime numbers between "+a+" and "+b+" are ");
        
        for(int i=a+1;i<=b-1;i++)
        {   boolean flag=false;
            for(int j=2;j<=(i/2);j++)
            {
                if(i%j==0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            System.out.print(i+" ");
        }
    }
}