public class test {
    public static void main(String[] args) {
        // binary search
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 90;

        int left = -1, right = arr.length;
        // 红蓝染色法
        // < target 红色
        // >= target 蓝色
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if(arr[mid] < target){
                left = mid;
            }else{
                right = mid;
            }
        }
        System.out.println(arr[right]);
    }
}
