package com.tazering.datastructures;

public class DataStructureMain {

    public static void main(String[] args) {

    }

    class Stack {

        String[] theStack;
        int top;
        final int INITIAL_SIZE = 3;

        public Stack() {
            theStack = new String[INITIAL_SIZE];
            top = 0;
        }

        public void push(String str) {
            growIfNecessary();
            theStack[top] = str;
            top++;
        }

        public String pop() {

            if(top == 0) {
                return null;
            }
            top--;
            return theStack[top];

        }

        public String peek() {
            return theStack[top];
        }

        public void growIfNecessary(){
            if(top == theStack.length) {
                String[] newStack = new String[2 * theStack.length];

                for(int i = 0; i < theStack.length; i++) {
                    newStack[i] = theStack[i];
                }

                theStack = newStack;
            }
        }

    }

    class Queue {

        final int INITIAL_SIZE = 10;
        String[] elements;
        int head, tail, currentSize;

        public Queue() {
            elements = new String[INITIAL_SIZE];
            this.head = this.tail = this.currentSize = 0;
        }

        public void add(String element) {
            this.elements[tail] = element;
            currentSize++;
            tail = (tail + 1) % this.elements.length;
        }

        public String remove() {
            if(currentSize == 0) {
                return null;
            }

            String poppedHead = this.elements[head];


            currentSize--;
            head = (head + 1) & this.elements.length;

            return poppedHead;

        }

        public String peek() {
            return this.elements[head];
        }

        public void growIfNecessary() {
            if(this.currentSize == this.elements.length){
                String[] newElements = new String[2 * elements.length];
                for(int i = 0; i < elements.length; i++) {
                    newElements[i] = this.elements[head + i % elements.length];
                }
                this.head = 0;
                this.tail = currentSize;
                this.elements = newElements;

            }
        }
    }

}


