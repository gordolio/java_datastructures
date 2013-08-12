package com.gordonchild.structures;

import com.gordonchild.structures.List;

import java.util.Iterator;

public class ArrayList<T> implements List<T> {
  private int size;
  private ArrayListItem<T> firstItem;
  private ArrayListItem<T> lastItem;

  public ArrayList() {
    firstItem = null;
    lastItem = null;
    size = 0;
  }

  public void add(final T item) {
    lastItem = new ArrayListItem<T>(item,lastItem);
    if(firstItem == null) {
      firstItem = lastItem;
    }
    size++;
  }

  public T get(final int index) {
    if(index >= size) {
      // TODO: Throw exception
      return null;
    }
    int i=0;
    // TODO: Implement BTREE to speed up lookups
    for(T iObj : this) {
      if(i==index) {
        return iObj;
      }
      i++;
    }
    // TODO: could not find?
    return null;
  }

  public void insertAt(final T item, final int index) {
    size++;
  }

  public void remove(final T item) {
    size--;
  }

  public void remove(final int index) {
    size--;
  }

  public int size() {
    return size;
  }

  public void clear() {
    size = 0;
  }

  public Iterator<T> iterator() {
    return new ListIterator<T>(firstItem);
  }

  public class ListIterator<T> implements Iterator<T> {
    private ArrayListItem<T> currentItem;
    public ListIterator(final ArrayListItem<T> firstItem) {
      this.currentItem = firstItem;
    }

    public boolean hasNext() {
      if(currentItem == null) {
        return false;
      } else {
        return true;
      }
    }

    public T next() {
      T data = null;
      if(currentItem != null) {
        data = currentItem.getData();
        currentItem = currentItem.getNextItem();
      }
      return data;
    }

    public void remove() {
      System.out.println("removed called??");
    }
  }

  public class ArrayListItem<T> {
    private T data;
    private ArrayListItem<T> nextItem;
    private ArrayListItem<T> prevItem;

    public ArrayListItem(final T data) {
      this.prevItem = null;
      this.nextItem = null;
      this.data = data;
    }

    public ArrayListItem(final T data,
        final ArrayListItem<T> prevItem) {
      this(data);
      setPrevItem(prevItem);
    }

    public final void setNextItem(final ArrayListItem<T> nextItem) {
      this.nextItem = nextItem;
    }

    public final void setPrevItem(final ArrayListItem<T> prevItem) {
      this.prevItem = prevItem;
      if(prevItem != null) {
          prevItem.setNextItem(this);
      }
    }

    public ArrayListItem<T> getNextItem() {
      return nextItem;
    }

    public ArrayListItem<T> getPrevItem() {
      return prevItem;
    }

    public boolean hasNext() {
      return nextItem != null;
    }

    public T getData() {
      return data;
    }
  }
}

