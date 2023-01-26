import java.util.ArrayList;

public class HashTable {
    private ArrayList<Integer>[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new ArrayList<Integer>();
        }
    }

    public void insert(int value) {
        int index = hash(value);
        table[index].add(value);
    }

    public boolean contains(int value) {
        int index = hash(value);
        return table[index].contains(value);
    }

    private int hash(int value) {
        return value % size;
    }
}
