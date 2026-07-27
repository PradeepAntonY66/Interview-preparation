import java.util.Scanner;

/**
 * ArrayOperations
 */
public class ArrayOperations {

    int capacity = -1, size = -1, value, index ;
    int[] arr;

    Scanner sc = new Scanner(System.in);

    public void createArray() {

    // Check if array already exists
        if (arr != null) {
            System.out.println("Array already exists.");
            return;
        }

        // Read capacity
        System.out.print("Enter array capacity: ");
        capacity = sc.nextInt();

        // Validate capacity
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }

        // Create array
        arr = new int[capacity];

        // Read size
        System.out.print("Enter number of elements: ");
        size = sc.nextInt();

        // Validate size
        if (size < 0 || size > capacity) {
            throw new IllegalArgumentException(
                    "Size must be between 0 and " + capacity);
        }

        // Read elements
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array created successfully.");
    }


    public void insertElement() {

        if (arr == null) {
            System.out.println("Please create the array first.");
            return;
        }

        if (size == capacity) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(
                    "Index must be between 0 and " + size);
        }

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        // Right shift
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        size++;

        System.out.println("Element inserted successfully.");
    }

    public void updateElement() {

        if (arr == null) {
            System.out.println("Please create the array first.");
            return;
        }

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(
                    "Index must be between 0 and " + (size - 1));
        }

        System.out.print("Enter new value: ");
        int value = sc.nextInt();

        arr[index] = value;

        System.out.println("Element updated successfully.");
    }

    public void deleteElement() {

        if (arr == null) {
            System.out.println("Please create the array first.");
            return;
        }

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();

        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(
                    "Index must be between 0 and " + (size - 1));
        }

        // Left shift
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = 0;
        size--;

        System.out.println("Element deleted successfully.");
    }

    public void display() {

        if (arr == null) {
            System.out.println("Please create the array first.");
            return;
        }

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}