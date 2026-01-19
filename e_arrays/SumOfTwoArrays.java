package e_arrays;

public class SumOfTwoArrays {
    public static void sum(int[] a, int[] b, int[] ans){
        int i = a.length - 1;
        int j = b.length - 1;
        int k = ans.length - 1;
        int carry = 0;

        while(i >= 0 && j >= 0) {
            int sum = a[i] + b[j] + carry;
            ans[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }

         while(i >= 0) {
            int sum = a[i] + carry;
            ans[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }

        while(j >= 0) {
            int sum = b[j] + carry;
            ans[k] = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        }
        ans[0] = carry;
    }
}