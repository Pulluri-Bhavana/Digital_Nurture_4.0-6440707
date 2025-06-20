package com.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook(new Book(101, "Data Structures", "Srinivas"));
        library.addBook(new Book(102, "Java Programming", "Anita"));
        library.addBook(new Book(103, "Operating Systems", "Rahul"));
        library.addBook(new Book(104, "Database Systems", "Kavita"));

        System.out.println("All Books in Library:");
        library.displayAllBooks();

        System.out.println("\nSearching for 'Java Programming' using Linear Search:");
        library.searchBookLinear("Java Programming");

        System.out.println("\nSearching for 'Operating Systems' using Binary Search:");
        library.searchBookBinary("Operating Systems");

        System.out.println("\nSearching for 'Python Basics' using Binary Search:");
        library.searchBookBinary("Python Basics");
    }
}
