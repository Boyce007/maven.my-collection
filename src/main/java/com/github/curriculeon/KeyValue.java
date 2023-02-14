package com.github.curriculeon;

import javax.naming.OperationNotSupportedException;

public class KeyValue<KeyType, ValueType> {

    private KeyType key;
    private ValueType value;
    public KeyValue(KeyType key, ValueType value) {
        // TODO - Implement method
        this.key = key;
        this.value = value;
    }

    public KeyType getKey() {
        return key; // TODO - Implement method

    }

    public ValueType getValue() {
        return value; // TODO - Implement method
    }

    public void setKey(KeyType key) {
        // TODO - Implement method
        this.key = key;
    }

    public void setValue(ValueType value) {
        // TODO - Implement method
        this.value = value;
    }
}
