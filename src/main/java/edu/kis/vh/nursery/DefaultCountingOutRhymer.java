package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer reprezentuje strukturę danych wyliczania rymów.
 * Pozwala na wliczanie i wyliczanie pierwiastków w oparciu o zasadę LIFO.
 */
public class DefaultCountingOutRhymer {

    private final int EMPTY = -1;
    private final int SIZE = 12;
    private final int[] numbers = new int[SIZE];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
