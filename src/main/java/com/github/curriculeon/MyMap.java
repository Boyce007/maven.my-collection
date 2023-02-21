package com.github.curriculeon;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType,ValueType> {
   private MyArrayList<KeyValue<KeyType,ValueType>> keyValues;


    public MyMap() {
        this.keyValues = new MyArrayList<>();
    }

    @Override
    public void put(KeyType key, ValueType value) {
        KeyValue<KeyType,ValueType> valueToPut = new KeyValue<>(key,value);
        keyValues.add(valueToPut);
    }

    @Override
    public ValueType get(KeyType key) {

        for (int i = 0; i < keyValues.size(); i++) {
            KeyValue<KeyType,ValueType> currentElement = keyValues.get(i);
            if (key == currentElement.getKey()) {
               return  currentElement.getValue();
            }

        }
        return null;
    }

    @Override
    public MySet<KeyType> getKeySet() {
        MySet<KeyType> set = new MySet<>();
        for (int i = 0; i < keyValues.size(); i++) {
            KeyValue<KeyType,ValueType> currentElement = keyValues.get(i);
            KeyType currentKey = currentElement.getKey();
            set.add(currentKey);
        }
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
