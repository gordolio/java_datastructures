package com.gordonchild.structures;

import java.util.Iterator;
import java.lang.Iterable;

public interface List<T> extends Iterable<T> {
  public void add(final T item);
  public void insertAt(final T item, final int index);
  public void remove(final T item);
  public void remove(final int index);

  public T get(final int index);

  public int size();

  public void clear();

  /*
  public boolean hasNext();
  public T next();
  public void remove();
  */
}

