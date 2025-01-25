package Leetcode_problems;

//reverse array by k elements

class reversearray {
    public int[] rotate(int[] arr, int order) {
        if (arr == null || arr.length == 0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        if (order > arr.length) {
            order = order % arr.length;
        }

        //length of first part
        int a = arr.length - order;
        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] ignoredArgs) {
        reversearray r = new reversearray();
        int[] s=r.rotate(new int[]{1,2,3,4,5,6},2);
        for(int i=0;i<s.length;i++){
            if(i==s.length-1)
                System.out.print(s[i]);
            else
               System.out.print(s[i]+",");
        }
    }
}
