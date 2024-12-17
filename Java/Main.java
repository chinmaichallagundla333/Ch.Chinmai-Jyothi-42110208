import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Add Student");
            System.out.println("5. Display Students");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = scanner.nextInt();
                    library.removeBook(removeId);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    library.addStudent(new Student(studentId, name));
                    break;

                case 5:
                    library.displayStudents();
                    break;

                case 6:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = scanner.nextInt();
                    library.issueBook(issueId);
                    break;

                case 7:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;

                case 8:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
