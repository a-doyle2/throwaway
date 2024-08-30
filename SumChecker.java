public class SumChecker {
    public static void main(String[] args) {
        int[] arr = new int[25];
        int max = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*max+1);
        }

        insertionSort(arr);
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i+", ");
        }
        System.out.println("]");

        int target = (int)(Math.random()*max*2+1);
        System.out.println("Target: "+target);

        int[] result = checkSum(arr, target);
        if (result != null) {
            System.out.println(result[0] + " + " + result[1] + " = " + target);
        } else {
            System.out.println("No pair found");
        }

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

    public static int[] checkSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[]{arr[left], arr[right]};
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}