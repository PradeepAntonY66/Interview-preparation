import java.util.Scanner;

/**
 * Main
 * 
 * 1. Insert - right shit
 * 2. Delete - left shit
 * 
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ArrayOperations op = new ArrayOperations();

        while (true) {

            System.out.println();
            System.out.println("Array Operations");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Display");
            System.out.println("5. Create");
            System.out.println("6. Exit");


            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    op.insertElement();
                    break;

                case 2:
                    op.deleteElement();
                    break;

                case 3:
                    op.updateElement();
                    break;

                case 4:
                    op.display();
                    break;

                case 5:
                    op.createArray();
                    break;
            
                case 6:
                    System.exit(0);
                    break;
            }
        }

    }
}