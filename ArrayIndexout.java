     public class ArrayIndexout{
    public static void main(String[] args) {
        String[] names = { "Ahsan", "Ankit", "Aman", "Sonu", "Kushagra", "Satyajit", "Anuj", "Shreeram", "Subham", "Nitesh" };
        int[] admissionNumbers = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };

        try {
            for (int i = 0; i < 11; i++) {
                System.out.println("Student Name: " + names[i]);
                System.out.println("Admission Number: " + admissionNumbers[i]);
                System.out.println("-------------------------");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array Index Out of Bounds");
        }
    }
}

 