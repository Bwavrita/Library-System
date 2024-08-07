package System_src;

import Books_src.Book;
import Excpetion.CpfIncorrect;
import Members_src.Client;
import java.util.Scanner;

public class LybrarySystemTest {

    public static void main(String[] args) {
        SystemLibrary systemLibrary = new SystemLibrary();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Library System Menu:");
            System.out.println("1. Register Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Register Client");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Show All Clients");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String bookAuthor = scanner.nextLine();
                    Book book = new Book(bookTitle, bookAuthor);
                    if (systemLibrary.registerBook(book)) {
                        System.out.println("Book registered successfully.");
                    } else {
                        System.out.println("Failed to register book.");
                    }
                    break;

                case 2:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    System.out.println("Enter your cpf");
                    String cpf = scanner.nextLine();
                    if (systemLibrary.borrowBook(borrowTitle, cpf)) {
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Failed to borrow book.");
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Enter client name: ");
                        String clientName = scanner.nextLine();
                        System.out.print("Enter client CPF: ");
                        String clientCpf = scanner.nextLine();
                        Client client = new Client(clientName, clientCpf);
                        if (systemLibrary.registerClient(client)) {
                            System.out.println("Client registered successfully.");
                        } else {
                            System.out.println("Failed to register client.");
                        }
                    } catch (CpfIncorrect e) {
                        System.out.println("Cpf incorrect, try again");
                    }
                    break;

                case 4:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = systemLibrary.searchBook(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook.getTittle() + " by " + foundBook.getAuthor());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("Registered Clients:");
                    for (Client client : systemLibrary.getAllClients()) {
                        System.out.println("Name: " + client.getName() + ", CPF: " + client.getCpf());
                    }
                    break;

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Library system closed.");
    }
}
