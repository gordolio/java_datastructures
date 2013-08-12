package com.gordonchild.structures;

public interface List<T> {
  public void add(final T item);
  public void insertAt(final T item, final int index);
  public void remove(final T item);
  public void remove(final int index);

  public int size();

  public void clear();
}

