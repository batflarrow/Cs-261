
import java.util.*;

import javax.lang.model.util.ElementScanner6;
class leapYear    {

    public static void main(String args[])
    {   Scanner cin=new Scanner(System.in);
        int year;
        System.out.println("Enter the year for which you wana check is a leap year or not ");
        year=cin.nextInt();

        if(year%400==0)
        System.out.println("The entered year is a leap year");
        else if(year%100==0)
        System.out.println("The entered year is not a leap year");
        else 
        if(year%4==0)
        System.out.println("The entered year is a leap year");
        else
        System.out.println("The entered year is not a leap year");
        
    }
}