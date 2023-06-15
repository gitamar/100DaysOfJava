import java.io.*;
import java.util.*;

public class StdinAndStdout {


    public static String fmt(double d)
    {
        if(d == (long) d)
        return String.format("Double: %d",(long)d);
        else
        return String.format("Double: %s",d);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        double secondFloat = scanner.nextFloat();
        scanner.nextLine();
        String thirdString = scanner.nextLine();
        
        // String secondFloatFormated = String.format("Double: %d", (long)secondFloat);
        System.out.println("String: " +thirdString);
        System.out.println(fmt(secondFloat));
        System.out.println("Int: "+firstInt);
    }
}