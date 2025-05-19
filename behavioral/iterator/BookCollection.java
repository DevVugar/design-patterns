package designPattern.behavioral.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

class BookCollection implements Iterable<String> {
    private String[] books;

    public BookCollection(String[] books) {
        this.books = books;
    }

    @Override
    public Iterator<String> iterator() {
        return new BookIterator();
    }

    public Iterator<String> prefixIterator(String prefix) {
        return new PrefixIterator(prefix);
    }

    private class BookIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return books[index++];
        }
    }

    private class PrefixIterator implements Iterator<String> {
        private int index = 0;
        private String prefix;

        public PrefixIterator(String prefix) {
            this.prefix = prefix;
            moveToNext();
        }

        private void moveToNext() {
            while (index < books.length && !books[index].startsWith(prefix)) {
                index++;
            }
        }

        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String book = books[index++];
            moveToNext();
            return book;
        }
    }
}