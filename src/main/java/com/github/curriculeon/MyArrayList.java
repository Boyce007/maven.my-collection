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

        SomeType[] newContent = (SomeType[]) new Object[content.length];
        Integer newIndex = 0;
        for(int x = 0; x < content.length; x++){
            SomeType currentElement = content[x];
            if( currentElement == null) {
                continue;
            }
            if(!currentElement.equals(objectToRemove) ){
                newContent[newIndex] = content[x];
                newIndex++;
            }else {

                index --;
            }
        }
        content = newContent;


    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        remove(get(indexOf(indexOfObjectToRemove)));

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
            if (objectToCheckFor.equals(currentElement)) {
                return true;
            }

        }

        return false;
    }

    @Override
    public Integer size() {
        return index;
    }

    public int indexOf(Object o) {

        for (int i = 0; i < content.length; i++) {
            if(content[i] == null) {
                continue;
            }
            if(content[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
