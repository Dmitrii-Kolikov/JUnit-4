public class DRoot {
    public static int sumOfDigits(int num)  {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
            }
        sum = (sum <10) ? sum : sumOfDigits(sum);
        return sum;
    }

}
