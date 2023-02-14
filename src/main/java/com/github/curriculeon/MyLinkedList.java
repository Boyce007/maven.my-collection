package com.github.curriculeon;

import java.util.Iterator;

public class MyLinkedList<SomeType> implements MyCollectionInterface<SomeType>{
    MyNode<SomeType> headNode;
    public MyLinkedList() {

    }

    public MyLinkedList(SomeType... valuesToBePopulatedWith) {
        for (SomeType value:valuesToBePopulatedWith) {
            add(value);
        }

    }

    @Override
    public void add(SomeType objectToAdd) {
        MyNode<SomeType> nodeToAdd = new MyNode<>();
        nodeToAdd.setData(objectToAdd);
        if (headNode == null) {
            headNode = nodeToAdd;
            return;

        }
        MyNode<SomeType> current = headNode;
        while(current!=null) {
            if (current.getNext() == null) {
                current.setNext(nodeToAdd);
                break;
            }
            current = current.getNext();
        }

    }

    @Override
    public void remove(SomeType objectToRemove) {
        MyNode<SomeType> nodeToAdd = new MyNode<>();
        nodeToAdd.setData(objectToRemove);
        if (headNode.getData() == objectToRemove) {
            headNode.setData(null);
            return;
        }
        MyNode<SomeType> current = headNode;
        while(current!=null&&current.getNext()!=null) {

            MyNode<SomeType> next = current.getNext();
            if (current.getData() == objectToRemove) {
                MyNode<SomeType> swapped = next.getNext();
                current.setNext(swapped);
                next = null;
                break;
            }
            current = current.getNext();

        }
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
