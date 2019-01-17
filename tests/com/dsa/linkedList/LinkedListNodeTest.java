package com.dsa.linkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LinkedListNodeTest {
  LinkedListNode<Integer> fixture;

  @BeforeEach
  void setUp() {
    fixture = new LinkedListNode(5);
  }

  @AfterEach
  void tearDown() {
    fixture = null;
  }

  @Test
  void getData() {
    assertEquals(5, fixture.getData());
  }

  @Test
  void setData() {
    fixture.setData(10);
    assertEquals(10, fixture.getData());
  }

  @Test
  void getNext() {
    assertNull(fixture.getNext());
  }

  @Test
  void setNext() {
    LinkedListNode<String> node = new LinkedListNode<>("Hello");
    fixture.setNext(node);
    assertEquals(node, fixture.getNext());

  }

  @Test
  void testToString() {
    fixture.setData(20);
    assertEquals("20", fixture.toString());
  }


}
