/*
 * State.java
 * Copyright (c) 2019 Mark Maloof.  All Rights Reserved.  See LICENSE.
 */

import java.util.*;
import java.io.*;

public abstract class State extends Object implements Comparable<State> {
  public State() { }
  public State( State s ) { this(); }
  public void readFile();
  abstract protected Object clone() throws CloneNotSupportedException;
  abstract public int compareTo( State s );
  abstract public boolean equals( Object o );
  abstract public int hashCode();
  abstract public String toString();
  //should be an arraylist of french cities?
 // State class
}
