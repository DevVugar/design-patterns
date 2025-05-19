package designPattern.behavioal.iterator;

import java.util.Iterator;

class IteratorPatternDemo {
    public static void main(String[] args) {
        String[] bookArr = {"Design Patterns", "Clean Code", "Deep Work", "Digital Minimalism"};
        BookCollection books = new BookCollection(bookArr);

        System.out.println("All books:");
        for (String book : books) {
            System.out.println("- " + book);
        }

        System.out.println("\nBooks starting with 'D':");
        Iterator<String> prefixIter = books.prefixIterator("D");
        while (prefixIter.hasNext()) {
            System.out.println("- " + prefixIter.next());
        }
    }
}
