package com.github.curriculeon;

import java.util.Iterator;

public class MySet<SomeType> implements MyCollectionInterface<SomeType>{
     private  MyArrayList<SomeType> content;
    public MySet() {
        content = new MyArrayList<>();

    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        content = new MyArrayList<>();
        for (SomeType obj:valuesToBePopulatedWith) {
            add(obj);
        }


    }

    @Override
    public void add(SomeType objectToAdd) {
        if (!content.contains(objectToAdd)) {
            content.add(objectToAdd);
        }

    }

    @Override
    public void remove(SomeType objectToRemove) {
        content.remove(objectToRemove);

    }

    @Override
    public void remove(int indexOfObjectToRemove) {

    }

    @Override
    public SomeType get(int indexOfElement) {

        return content.get(indexOfElement);
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return content.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return content.size();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
