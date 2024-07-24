public class CountDigits{
    public static void main(String[] args) {
        int number = 453432;
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