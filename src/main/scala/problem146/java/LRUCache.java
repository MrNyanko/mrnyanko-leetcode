package problem146.java;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {

    private Map<Integer, Integer> cache;
    private final int max;

    public LRUCache(int capacity) {
        max = capacity;
        cache = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true) {

            public boolean removeEldestEntry(Map.Entry eldes) {
                return cache.size() > max;
            }
        };
    }

    public int get(int key) {

        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

