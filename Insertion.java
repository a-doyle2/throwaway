import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Insertion {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("insertionData.txt"));
        ArrayList<Integer> arr1 = new ArrayList<>();
        while (scanner.hasNextInt()) {
            arr1.add(scanner.nextInt());
        }
        scanner.close();
        
        int[] arr = new int[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            arr[i] = arr1.get(i);
        }

        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int insertionSort(int[] arr) {
        int steps = 0;
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int current = i-1;
            while (current >= 0 && arr[current] > element) {
                arr[current + 1] = arr[current];
                current--;
                steps++;
            }
            arr[current+1] = element;
        }
        return steps;
    }
}