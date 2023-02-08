package com.github.curriculeon;

import java.util.Iterator;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType> {

    private SomeType[] content;
    private Integer index;
    public MyArrayList() {
        index = 0;
        content = (SomeType[]) new Object[10];
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {

    }

    @Override
    public void add(SomeType objectToAdd) {

    }

    @Override
    public void remove(SomeType objectToRemove) {

    }

    @Override
    public void remove(int indexOfObjectToRemove) {

    }

    @Override
    public SomeType get(int indexOfElement) {
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return null;
    }

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
