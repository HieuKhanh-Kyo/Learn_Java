package Array;

public class _1295_FindNumbersWithEvenNumberOfDigits {
    public static int CountDigits(int digit ) {
        int count = 0;
        while (digit > 0) {
            digit /= 10;
            count++;
        }
        return count;
    }

    public static boolean CheckEvenNumber(int number) {
        return number % 2 == 0? true : false;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (CheckEvenNumber(CountDigits(num)) == true) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
