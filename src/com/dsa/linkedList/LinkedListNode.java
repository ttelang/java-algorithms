package com.dsa.linkedList;

/**
 * Linked List Node of a generic type
 * @param <E>
 */
public class LinkedListNode<E> {

  private E data;
  private LinkedListNode next;

  // no-argument constructor
  public LinkedListNode() {
    this.data = data;
    this.next = null;
  }

  //constructor
  public LinkedListNode(E data) {
    this.data = data;
    this.next = null;
  }

  public E getData() {
    return data;
  }

  public void setData(E data) {
    this.data = data;
  }

  public LinkedListNode getNext() {
    return next;
  }

  public void setNext(LinkedListNode next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return this.getData().toString();
  }
}
