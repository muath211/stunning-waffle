import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    private Deque<Integer> dq;
    private HashMap<Integer, Integer> map;
    private final int CACHE_SIZE;

    public LRUCache(int size) {
        this.CACHE_SIZE = size;
        dq = new LinkedList<>();
        map = new HashMap<>();
    }
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        dq.remove(key);
        dq.addFirst(key);
        return map.get(key);
    }
    public void put(int key, int value) {
        if(map.containsKey(key)){
            dq.remove(key);
        }
        if(dq.size() == CACHE_SIZE){
            int last = dq.removeLast();
            map.remove(last);
        }
        dq.addFirst(key);
        map.put(key, value);
    }
}
