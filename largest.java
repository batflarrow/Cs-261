import java.util.*;

class largest {

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three numbers");
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        System.out.println("The largest number of above thre numbers is " + max);
    }
}