import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.StreamSupport;

public class test {
    private int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
    private double[] wages; // wages to be computed in part (b)

    public static void main(String[] args) {
System.out.println(doSomething("jiayu"));
    }

    public static String doSomething(String str)

    {

        if (str.length() < 1)

        {

            return "";

        }

        else

        {

            return str.substring(0, 1) + doSomething(str.substring(1));

        }

    }}




