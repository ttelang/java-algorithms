package com.dsa.linkedList;

import java.util.function.Consumer;

public interface List<E> {
  void traverse(Consumer op);
}
