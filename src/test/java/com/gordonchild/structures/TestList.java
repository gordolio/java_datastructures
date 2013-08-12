package com.gordonchild.structures;

import com.gordonchild.structures.List;
import com.gordonchild.structures.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class TestList {
  @Test
  public void testInitializer() {
    List<Integer> arr = new ArrayList<Integer>();
  }

  @Test
  public void testAddSize() {
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(5);
    arr.add(6);
    assertEquals(2,arr.size());
  }

  @Test
  public void testAddGet() {
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(new Integer(5));
    arr.add(new Integer(6));
    assertEquals(new Integer(6),arr.get(1));
  }

  @Test
  public void testIterator() {
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(new Integer(5));
    arr.add(new Integer(6));
    int i=0;
    for(Integer iObj : arr) {
      assertNotEquals(iObj,null);
      if(i==0) {
        assertEquals(new Integer(5),iObj);
      } else if(i==1) {
        assertEquals(new Integer(6),iObj);
      } else {
        // Too many objects from the iterator
        fail();
      }
      i++;
    }
    assertEquals(2,i);
  }
}

