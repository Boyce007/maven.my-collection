package com.github.curriculeon;

import java.util.Iterator;

public class MyLinkedList<SomeType> implements MyCollectionInterface<SomeType>{
    private MyNode<SomeType> headNode;



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
           MyNode<SomeType>  nextNode = current.getNext();
            boolean isNextNodeNull = nextNode == null;
            if (isNextNodeNull) {
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
        MyNode<SomeType> current = headNode;
        Integer index =0;
        while ()


    }

    @Override
    public SomeType get(int indexOfElement) {
        Integer index = 0;
        MyNode<SomeType> current = headNode;
        while(current!=null) {
            if (indexOfElement==index) {
                return current.getData();
            }

            current = current.getNext();
            index++;
        }
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        MyNode<SomeType> current = headNode;
        while(current!=null) {
            if (current.getData() == objectToCheckFor) {
                return true;
            }

            current = current.getNext();
        }
        return false;
    }

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return new MyLinkedListIterator<>(this);
    }

    private static class MyLinkedListIterator<SomeType> implements Iterator<SomeType> {
        private MyLinkedList<SomeType> list;
        private MyNode<SomeType> currentNode;

        public MyLinkedListIterator(MyLinkedList<SomeType> list) {
            this.list = list;
            this.currentNode = new MyNode<>();
            this.currentNode.setData(list.headNode.getData()); // this is the head
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public SomeType next() {
            SomeType value = currentNode.getData();
            currentNode = currentNode.getNext();
            return value;
        }
    }
}
