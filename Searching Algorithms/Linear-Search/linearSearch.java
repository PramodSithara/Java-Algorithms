public class linearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Element Is Not Found On Array");
        } else {
            System.out.println("Element Found On Array " + result);
        }
    }
}
