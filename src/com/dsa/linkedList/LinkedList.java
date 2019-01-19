package com.dsa.linkedList;

import java.util.function.Consumer;

public class LinkedList<E> implements List<E> {

  private LinkedListNode head;

  // constructs an empty list
  public LinkedList() {
    LinkedListNode head = null;
  }

  public LinkedListNode getHead() {
    return head;
  }

  public void setHead(LinkedListNode head) {
    this.head = head;
  }

  /**
   * find a particular item in the lis
   * complexity O(n)
   * @return position of the node
   * @param data
   */
  public int find(E data){

    LinkedListNode<E> node = new LinkedListNode<>();
    node = head;

    int position = -1; // not found

    // Non empty list
    while (node != null){

      position++;

      if (node.getData().equals(data)){
        break;
      } else {
        node.setNext(node.getNext());
      }

    }

    return position;
  }

  /**
   * complexity O(n)
   * @param position
   */
  public E fetch(int position){
    // empty list
    LinkedListNode<E> node = new LinkedListNode<>();
    node = head;

    E data = null;

    for (int i=0; i <= position; i++) {
      if (node != null) {
        node.setNext(node.getNext());
      }
    }
    // single node
  }

  /**
   * insert node at position
   * @param position
   */
  public void insert(int position){
    // empty list

    // single node
  }


  /**
   * clone a linked list
   * @param list
   */
  public void clone(LinkedList<E> list){
    // empty list

    // single node
  }

  /**
   * delete node at position
   * complexity O(n)
   * @param position
   */
  public void delete(int position){
    // empty list

    // single node
  }

  /**
   * function to print the contents of the linked list starting from head
   */
  @Override
  public void traverse(Consumer op)
  {
    LinkedListNode node = head;
    while (node != null)
    {
      op.accept(node.getData());
      node = node.getNext();
    }
  }
}
