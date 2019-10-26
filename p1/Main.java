/*
 * Main.java
 * Copyright (c) 2019 Mark Maloof.  All Rights Reserved.  See LICENSE.
 */

import java.io.*;

public class Main {

  public static void main( String[] args ) {
    try {
      String initial = "grenoble";
      String goal = "paris";
      Search search = new Search();
      Problem problem = new France();
      problem.setInitialStateByName( initial );
      problem.setGoalStateByName( goal );
      Solution solution = search.ucs( problem );
      System.out.println( solution );
      System.out.println( "Cost: " + solution.getCost() );
      System.out.println( "Number of actions: " + solution.size() );
    } // try
    catch( Exception e ) {
      System.out.println( e.getMessage() );
      e.printStackTrace();
    } // catch
  } // main

} // Main class
