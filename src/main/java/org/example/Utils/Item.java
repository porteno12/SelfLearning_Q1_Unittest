package org.example.Utils;

public class Item {
    private int startNumber;
    private int length;

    public Item(int startNumber, int length) {
        this.startNumber = startNumber;
        this.length = length;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Item{" +
                "startNumber=" + startNumber +
                ", length=" + length +
                '}';
    }
}

