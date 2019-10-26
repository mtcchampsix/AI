/*
 * Problem.java
 * Copyright (c) 2019 Mark Maloof.  All Rights Reserved.  See LICENSE.
 */

import java.util.ArrayList;

public abstract class Problem
{
  protected State initial;
  protected State goal;

  public Problem() { }
  abstract public ArrayList<Action> getActions( State state );
  abstract public State getInitialState();
  abstract public State getResult( State state, Action action );
  abstract public double getStepCost( State state, Action action );
  abstract public boolean goalTest( State state );
  abstract public double h( State state );
  abstract public void setInitialStateByName( String s );
  abstract public void setGoalStateByName( String s );
}
