package main;

import java.util.LinkedList;
import java.util.Optional;

import kotlin.Pair;

public class LRUCache<K, V> implements Cache<K, V> {
    @Override
    public boolean set(K key, V value) {
        return false;
    }

    @Override
    public Optional<V> getMaybe(K key) {
        return Optional.empty();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }
//    private int capacity;
//    private Map<K, Node<Pair<K,V>>> cacheIndex;
//    private LinkedList<Pair<K,V>> timeQueue;
//
//    public LRUCache<>
}
