import java.util.Scanner;

public class LMS {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    LibraryManager manager = new LibraryManager();
    int choice;

    do {

        System.out.println("\nLibrary Management System");
        System.out.println("1 Add Book");
        System.out.println("2 View Books");
        System.out.println("3 Search Book by ID");
        System.out.println("4 Search Book by Title");
        System.out.println("5 Issue Book");
        System.out.println("6 Return Book");
        System.out.println("7 Delete Book");
        System.out.println("8 Exit");

        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Author: ");
                String author = sc.nextLine();

                Book b = new Book(id, title, author);
                manager.addBook(b);
                break;

            case 2:
                manager.displayBooks();
                break;

            case 3:
                System.out.print("Enter Book ID to search: ");
                int searchId = sc.nextInt();

                Book foundBook = manager.findBookById(searchId);

                if(foundBook != null)
                    System.out.println(foundBook);
                else
                    System.out.println("Book not found.");
                break;

            case 4:
                sc.nextLine();
                System.out.print("Enter title to search: ");
                String searchTitle = sc.nextLine();
                manager.searchBookByTitle(searchTitle);
                break;

            case 5:
                System.out.print("Enter Book ID to issue: ");
                int issueId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String studentName = sc.nextLine();
                manager.issueBook(issueId, studentName);
                break;

            case 6:
                System.out.print("Enter Book ID to return: ");
                int returnId = sc.nextInt();
                manager.returnBook(returnId);
                break;

            case 7:
                System.out.print("Enter Book ID to delete: ");
                int deleteId = sc.nextInt();
                manager.deleteBook(deleteId);
                break;

            case 8:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }

    } while(choice != 8);

}
}