package com.company;


import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {
    private List<Node<K, V>> data;

    public Map() {
        data = new ArrayList<>();
    }

    public void put(K key, V value) {
        Node<K, V> newArr = new Node<>(key, value);

        for (Node<K, V> node : data) {
            if (node.getKey().equals(key)) {
                node.setValue(value);
                return;
            }
        }

        data.add(newArr);
    }

    public V get(K key) {
        for (Node<K, V> node : data) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }

        return null;
    }

    public void remove(K key) {
        Node<K, V> ToRemove = null;

        for (Node<K, V> node : data) {
            if (node.getKey().equals(key)) {
                ToRemove = node;
                break;
            }
        }

        if (ToRemove != null) {
            data.remove(ToRemove);
        }
    }

    public boolean containsKey(K key) {
        for (Node<K, V> node : data) {
            if (node.getKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsValue(V value) {
        for (Node<K, V> node : data) {
            if (node.getValue().equals(value)) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return data.size();
    }
}
