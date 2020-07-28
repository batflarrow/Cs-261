import java.util.*;
class tempConv {

    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        float f,c;
        System.out.println("Enter Temperature in Farenhiet");

        f=cin.nextFloat();

        c=(f-32)*5/9;

        System.out.println("Temperature in degree celcius is "+c);

    }

}