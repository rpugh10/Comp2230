import java.util.Arrays;

public class MergeSortedArray {

      public static void main(String[] args) {
          int[] num1 = new int[5];
          int m = num1.length;
          int[] num2 = new int[4];
          int n = num2.length;

          for(int i = 0; i < m; i++){
            num1[i] = i;
          }
          for(int i = 0; i < n; i++){
            num2[i] = i + 2;
          }

          int[] numbers = merge(num1, m, num2, n);
          System.out.println(Arrays.toString(numbers));

      }
    
    
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] numbers = new int[m + n];
        System.arraycopy(nums1, 0, numbers, 0, m);
        System.arraycopy(nums2, 0, numbers, m, n);
        Arrays.sort(numbers);

        return numbers;
    }
}
