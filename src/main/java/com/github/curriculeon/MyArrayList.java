package com.github.curriculeon;

import java.util.Iterator;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType> {

    private SomeType[] content;
    private Integer index;

    private static final Integer RE_SIZE = 1;
    public MyArrayList() {
        index = 0;
        content = (SomeType[]) new Object[1];
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        content = (SomeType[]) new Object[1];
        for (SomeType value:valuesToBePopulatedWith) {
            add(value);
        }



    }

    @Override
    public void add(SomeType objectToAdd) {
        Integer threshold = content.length-1;
        // Do we have enough space
        if(index >= threshold) {
            // If we don't enough space , we need create more space
            Integer newSize = content.length + RE_SIZE;
            SomeType[] newContent = (SomeType[])  new Object[newSize];
            System.arraycopy(content, 0, newContent, 0 , content.length);
            content = newContent;
        }
        // place element where ever index is
        content[index] = objectToAdd;
        // increment index by 1
        index++;
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
        return index;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
