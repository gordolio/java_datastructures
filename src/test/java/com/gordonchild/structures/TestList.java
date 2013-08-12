package com.gordonchild.structures;

import com.gordonchild.structures.List;
import com.gordonchild.structures.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class TestList {
  @Test
  public void thisAlwaysPasses() {
  }

  @Test
  public void testInitializer() {
    List<Integer> arr = new ArrayList<Integer>();
  }

  @Test
  @Ignore
  public void thisFails() {
    assertTrue(false);
  }
}

