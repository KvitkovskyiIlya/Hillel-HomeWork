package com.hillel.hw13.newLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class List<E> implements Iterable<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public List() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }


    public void addAllArray(E[] array) {
        int arr = array.length;
        for (E e : array) {
            addLast(e);
        }
        size = arr;
    }


    public void addFirst(E data) {
        Node<E> current = first;
        first = new Node<>(data, current);

        if (current == null) {
            last = first;
        }

        size++;
    }

    public void addLast(E data) {
        Node<E> current = last;
        last = new Node<>(data, null);

        if (current == null) {
            first = last;
        } else {
            current.next = last;
        }

        size++;
    }

    public void addByIndex(E data, int index) {
        int position = 1;
        Node<E> previous = first;
        Node<E> current = first.next;

        while (position < index) {
            previous = current;
            current = current.next;
            position++;
        }

        Node<E> node = new Node<>(data, current);
        previous.next = node;
        size++;

    }

    public boolean removeByIndex(int index) {
        if (index < 1 || index > size())
            return false;

        Node<E> current = first;
        for (int i = 1; i < index; i++) {
            if (current.next == null)
                return false;

            current = current.next;
        }
        current.setNext(current.next.next);
        size++;
        return true;
    }

    public void remove(E data) {
        if (first == null) {
            return;
        } else if (first.data.equals(data)) {
            first = first.next;
            size--;
            return;
        }

        Node<E> current = first;
        Node<E> next = current.next;
        while (next != null) {
            if (next.data.equals(data)) {
                current.setNext(next.next);
                if (current.getNext() == null) {
                    last = current;
                }
                size--;
                return;
            }
            current = next;
            next = current.next;
        }

    }


    public void reversByIndex(int firstIndex, int secondIndex) {
        if (firstIndex > secondIndex || firstIndex >= size || secondIndex >= size) {
            throw new NoSuchElementException();
        } else if (firstIndex == secondIndex) {
            return;
        } else {
            interLink(firstIndex, secondIndex);
        }
    }

    public void interLink(int firstIndex, int secondIndex) {
        int current = 1;
        Node<E> node = first;
        Node<E> nextNode = first.next;

        while (current < firstIndex) {
            node = nextNode;
            nextNode = nextNode.next;
            current++;
        }

        Node<E> firstPairLast = nextNode.next;

        current = 1;
        Node<E> secondPairPrevious = first;
        Node<E> secondPairCurrent = first.next;

        while (current < secondIndex) {
            secondPairPrevious = secondPairCurrent;
            secondPairCurrent = secondPairCurrent.next;
            current++;
        }

        Node<E> secondPairLast = secondPairCurrent.next;

        node.next = secondPairCurrent;
        secondPairCurrent.next = firstPairLast;
        secondPairPrevious.next = nextNode;
        nextNode.next = secondPairLast;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (first == null) {
            return "[ ]";
        }
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");

        Node<E> current = first;
        while (current != null) {
            buffer.append(current.data);

            if (current.next != null) {
                buffer.append(", ");
            }

            current = current.next;
        }

        buffer.append("]");

        return buffer.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {

        private Node<E> nextNodeToReturn = first;

        @Override
        public boolean hasNext() {
            return nextNodeToReturn != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            E result = nextNodeToReturn.getData();
            nextNodeToReturn = nextNodeToReturn.getNext();
            return result;
        }

    }

    private class Node<E> {

        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
