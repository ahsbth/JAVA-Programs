package EXAMPREP;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class Studentsmarks {
    public static void main(String[] args) {
        int[] marks = new int[5];
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        try {
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter marks for student " + (i + 1) + ": ");
                int input = scanner.nextInt();
                validateMarks(input);
                marks[i] = input;
            }
        } catch (InvalidMarksException e) {
            System.out.println("Invalid marks entered: " + e.getMessage());
        }

        scanner.close();

        System.out.println("Student marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }

    public static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100 (inclusive).");
        }
    }
}
