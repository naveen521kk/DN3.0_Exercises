package ex6;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book[] books = {
                new Book("B001", "Java Programming", "Author A"),
                new Book("B002", "Data Structures", "Author B"),
                new Book("B003", "Algorithms", "Author C"),
                new Book("B004", "Database Systems", "Author D"),
                new Book("B005", "Operating Systems", "Author E")
        };

        // Test Linear Search
        System.out.println("Linear Search:");
        Book foundBookLinear = LinearSearch.linearSearchByTitle(books, "Data Structures");
        System.out.println(foundBookLinear != null ? foundBookLinear : "Book not found");

        // Sort the array for binary search
        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        // Test Binary Search
        System.out.println("\nBinary Search:");
        Book foundBookBinary = BinarySearch.binarySearchByTitle(books, "Data Structures");
        System.out.println(foundBookBinary != null ? foundBookBinary : "Book not found");
    }
}
