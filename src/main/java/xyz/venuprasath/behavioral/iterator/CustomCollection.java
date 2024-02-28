package xyz.venuprasath.behavioral.iterator;

import java.util.Iterator;

public class CustomCollection implements Iterable<String> {
    private String[] items;
    private int index;

    public CustomCollection(int size) {
        this.items = new String[size];
        this.index = 0;
    }

    public void add(String item) {
        if (index < items.length) {
            items[index++] = item;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < items.length && items[currentIndex] != null;
        }

        @Override
        public String next() {
            return items[currentIndex++];
        }
    }
}
