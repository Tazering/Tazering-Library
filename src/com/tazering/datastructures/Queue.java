package com.tazering.datastructures;

public class Queue {

    final int INITIAL_SIZE = 10;
    String[] elements;
    int currentSize, head, tail;

    public Queue() {
        this.elements = new String[INITIAL_SIZE];
        this.currentSize = this.head = this.tail = 0;
    }

    public void add(String element) {
        growIfNecessary();
        this.elements[tail] = element;
        tail = (tail + 1) % this.elements.length;
        currentSize++;
    }

    public String remove() {
        if(currentSize == 0) {
            return null;
        }
        String element = elements[head];
        head = (head + 1) % elements.length;
        currentSize--;
        return element;
    }

    public String peek() {
        return elements[tail];
    }

    private void growIfNecessary() {
        if(currentSize == elements.length) {
            String[] newElements = new String[2 * elements.length];
            for(int i = 0; i < elements.length; i++) {
                newElements[i] = elements[(head+i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }

}
