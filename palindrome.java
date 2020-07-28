import java.util.*;
class palindrome {
    
public static void main(String args[])
{
    Scanner cin=new Scanner(System.in);
    String s;
System.out.println("Enter the number which you wanna check for palindrome ");
boolean flag=false;
s=cin.nextLine();
int n=s.length();
for(int i=0;i<n;i++)
{
if(s.charAt(i)==s.charAt(n-i-1))
{
    flag=true;
}
else
if(s.charAt(i)!=s.charAt(n-i-1))
{
flag=false;
}

}

if(flag)
{
    System.out.println("number is a palindrome");
}
else
System.out.println("number is not a palindrome");

}

}