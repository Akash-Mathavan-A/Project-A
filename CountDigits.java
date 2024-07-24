import java.util.*;
public class CountDigits{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int number = in.nextInt();
        int result = countDigit(number);
        System.out.println("Result is : " + result);
    }
    public static int countDigit(int number){
        return (int)(Math.log10(number)) + 1;
    }
}
