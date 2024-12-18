import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(int bookId) {
        books.removeIf(book -> book.getBookId() == bookId);
        System.out.println("Book removed successfully.");
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayStudents() {
        System.out.println("\nRegistered Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
