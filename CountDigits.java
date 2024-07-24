import java.util.*;
public class CountDigits{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Input get from Keyboard
        int number = in.nextInt();
        
        int result = countDigit(number);
        System.out.println("Result is : " + result);
    }
    public static int countDigit(int number){
        int count = 0;
        while(number > 0){
            number /= 10;
            count += 1;
        }
        return count;
    }
}
