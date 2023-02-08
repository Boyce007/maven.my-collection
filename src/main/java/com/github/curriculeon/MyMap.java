package com.github.curriculeon;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType,ValueType> {
    @Override
    public void put(KeyType key, ValueType value) {

    }

    @Override
    public ValueType get(KeyType key) {
        return null;
    }

    @Override
    public MySet<KeyType> getKeySet() {
        return null;
    }

    @Override
    public MyCollectionInterface<ValueType> getValues() {
        return null;
    }

    @Override
    public MySet<KeyValue<KeyType, ValueType>> getList() {
        return null;
    }

    @Override
    public MyMapInterface<ValueType, KeyType> invert() {
        return null;
    }
}
