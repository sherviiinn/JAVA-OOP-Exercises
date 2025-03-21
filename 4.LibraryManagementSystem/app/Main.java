package app;

import Admin;

public class Main {
    public static void main(String[] args) {

        //** this is a simple main class to test the classes, you can make a complete library with this classes if you want **//
        
        Admin admin = new Admin();
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        admin.addBook(book1);
        admin.addBook(book2);

        User user = new User("Kourosh");
        user.borrowBook(book1);
        user.returnBook(book1);
    }
}
