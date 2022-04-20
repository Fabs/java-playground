package main;

import java.util.Optional;

public interface Cache<K, V> {
    boolean set(K key, V value);
    Optional<V> getMaybe(K key);
    boolean isEmpty();
    void clear();

    int size();
}
