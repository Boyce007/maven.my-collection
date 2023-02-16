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
        content = valuesToBePopulatedWith;





    }

    @Override
    public void add(SomeType objectToAdd) {
        Integer threshold = content.length-1;
        // Do we have enough space
        if(index >= threshold) {
            // If we don't enough space , we need create more space
            Integer newSize = content.length + RE_SIZE;
            SomeType[] newContent = (SomeType[])  new Object[newSize];
            for (int i = 0; i < content.length; i++) {
                newContent[i] = content[i];
            }
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

        for (int i = 0; i < content.length; i++) {
            SomeType currentElement = content[i];
            if (currentElement == null) {
                continue;
            }
            if(indexOfElement == i) {
                return currentElement;
            }

        }
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        for (int i = 0; i < content.length; i++) {
            SomeType  currentElement = content[i];
            if (objectToCheckFor == currentElement ) {
                return true;
            }

        }

        return false;
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
