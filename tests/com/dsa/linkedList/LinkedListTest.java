package com.dsa.linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

  LinkedList<String> fixture;
  LinkedListNode<String> head;
  LinkedListNode<String> first;
  LinkedListNode<String> second;
  LinkedListNode<String> tail;

  @Test
  void getHead() {
    assertEquals(head, fixture.getHead());
  }

  @Test
  void setHead() {
    fixture.setHead(head);
    assertEquals(head, fixture.getHead());
  }

  @Test
  void traverse() {
    java.util.LinkedList<Object> str = new java.util.LinkedList<>();
    fixture.traverse(e -> str.add(e));

    assertEquals(4, str.size());
  }

  @BeforeEach
  void setUp() {
    fixture = new LinkedList<>();

    head = new LinkedListNode<>("Head");
    first = new LinkedListNode<>("First");
    second = new LinkedListNode<>("Second");
    tail = new LinkedListNode<>("Last");

    fixture.setHead(head);
    head.setNext(first);
    first.setNext(second);
    second.setNext(tail);

  }
}
