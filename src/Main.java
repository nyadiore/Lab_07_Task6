public class Main {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) { // Outer loop for the number of lines

            for (int j = 0; j < i; j++) { // Inner loop for the number of stars on each line

                System.out.print("* "); // Print star followed by a space

            }

            System.out.println(); // Move to the next line after each row

        }

    }

}