package com.library;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    Book[] books;
    int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            System.out.println("Library is full.");
        }
    }

    // Linear Search by Title
    public void searchBookLinear(String title) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                books[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book with title \"" + title + "\" not found.");
        }
    }

    // Binary Search by Title (assumes sorted array)
    public void searchBookBinary(String title) {
        Arrays.sort(books, 0, size, Comparator.comparing(b -> b.title.toLowerCase()));

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = title.compareToIgnoreCase(books[mid].title);

            if (comparison == 0) {
                books[mid].display();
                return;
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Book with title \"" + title + "\" not found.");
    }

    public void displayAllBooks() {
        for (int i = 0; i < size; i++) {
            books[i].display();
        }
    }
}
