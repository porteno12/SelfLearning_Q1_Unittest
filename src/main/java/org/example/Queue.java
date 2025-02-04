package org.example;

public class Queue <T> {
    private Node<T> first;
    private Node<T> last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void insert(T x) {
        Node<T> temp = new Node<>(x);
        if (this.last == null) {
            this.first = temp;
        } else {
            this.last.setNext(temp);
        }
        this.last = temp;
    }

    public T remove() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T x = this.first.getValue();
        this.first = this.first.getNext();
        if (this.first == null) {
            this.last = null;
        }
        return x;
    }

    public T head() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return this.first.getValue();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        Node<T> pos = this.first;
        while (pos != null) {
            str.append(pos.getValue());
            if (pos.hasNext()) {
                str.append(", ");
            }
            pos = pos.getNext();
        }
        str.append("]");
        return str.toString();
    }
}//23 22 33

