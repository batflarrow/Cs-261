import java.util.*;

class meanMedian {
    

public static void main(String args[])
{
    Scanner cin =new Scanner(System.in);

System.out.println("Enter Five Numbers in ascending order whose mean and median is required");
float arr[];
arr=new float[5];
float sum=0;
for(int i=0;i<5;i++)
{
arr[i]=cin.nextInt();
sum=sum+arr[i];
}
float median=arr[2];
float mean=sum/5;
System.out.println("Mean of the above five numbers is "+mean+"\nMedian of above fove numbers is "+median);


}
}