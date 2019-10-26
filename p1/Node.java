import java.util.*;

public class Node{
  Node parent;
  FrenchAction action;
  int cost;
  FrenchCity state;

  public Node(){
    parent = null;
    action = new FrenchAction();
    cost = 0;
    state = new FrenchCity();
  }

  public Node(Node parent, FrenchAction action, int cost, FrenchCity state){
    this.parent = parent;
    this.action = action;
    this.cost = cost;
    this.state = state;
  }

  public Node childNode(France problem, Node parent, FrenchAction action){
    state = problem.getResult(state, action);
    parent = parent;
    action = action;
    cost = parent.cost + problem.getStepCost(parent.state, action);
  }




  // private String name;
  // private ArrayList<T> latitude = new ArrayList<T>();
  // private ArrayList<T> longitude = new ArrayList<T>();
  // private ArryaList<FrenchAction> actions = new ArrayList<FrenchAction>();
  //
  // public Node() { }
  // public Node(String name, T d1, T d2, T s1, T s2, T h1, T h2, T q1, T q1);
  // public String getName(){ return name; }
  // public ArrayList<T> getLatitude() { return latitude; }
  // public ArrayList<T> getLongitude() { return longitude; }
  // public ArrayList<FrenchAction> getActions() { return actions; }
  //
  // private void setLatitude(T d1, T h1, T s1, T q1);
  // private void setLongitude(T d2, T h2, T s2, T q2);
  //
  // public Node(String name, T d1, T d2, T s1, T s2, T h1, T h2, T q1, T q1, ArrayList<FrenchAction> actions){
  //   this.name = name;
  //   setLatitude(d1, h1, s1, q1);
  //   setLongitude(d2, h2, s2, q2);
  //   this.actions = actions;
  // }
  //
  // private void setLatitude(T d1, T h1, T s1, T q1){
  //   latitude.add(d1);
  //   latitude.add(s1);
  //   latitude.add(h1);
  //   latitude.add(q1);
  // }
  //
  // private void setLongitude(T d2, T h2, T s2, T q2){
  //   longitude.add(d2);
  //   longitude.add(s2);
  //   longitude.add(h2);
  //   longitude.add(q2);
  // }
}
