import java.util.*;

public class France extends Problem{
  Hashtable<String, State> cities = new Hashtable<String, State>();
  Hashtable<State, ArrayList<Action>> actions = new Hashtable<State, ArrayList<Action>>();

  String name = "";
  State initialState;
  State goalState;
  int d1, d2, h1, h2, s1, s2, cost;
  char q1, q2;
  String action = "";
  String arrow = "";
  FrenchCity city;

  public France(){
    readFile();
  }

  public void readFile(){
     File file = new File("france.txt");
     Scanner input = new Scanner(file);
     ArrayList<Action> FrenchActions = new ArrayList<Action>();

     while (input.hasNext()){
       name = input.next();
       d1 = input.nextInt();
       h1 = input.nextInt();
       s1 = input.nextInt();
       q1 = input.next().charAt(0);
       d2 = input.nextInt();
       h2 = input.nextInt();
       s2 = input.nextInt();
       q2 = input.next().charAt(0);
       arrow = input.next();
       // read up until right before the actions
       while (input.next() != "\n"){
         action = input.next();
         cost = input.nextInt();
         FrenchAction Faction = new FrenchAction(action, cost);
         FrenchActions.add(Faction);
       }
       Longlat longlat = new LongLat( d1, d2, h1, h2, s1, s2, q1, q2);
       city = new FrenchCity(name, longlat);

       cities.put(name, city);
       actions.put(name, FrenchActions);
       FrenchActions.clear();
     }
   }

   public ArrayList<Action> getActions( State state ){
     return actions.get(state);
   }

   public State getInitialState(){
     return initialState;
   }

   public State getResult( State state, Action action ){
     ArrayList<Action> steps = actions.get(state);
     State result;
     for (int i = 0; i < steps.size(); i++){
       if (steps.get(i).action.equals(action){
         String[] wherego = str.split("-");
         result = cities.get(wherego[1]);
       }
     }
     return result;
   }

   public double getStepCost( State state, Action action ){
     ArrayList<Action> steps = actions.get(state);
     for (int i = 0; i < steps.size(); i++){
       if (steps.get(i).action.equals(action){
         return steps.get(i).cost;
       }
     }
     else return 0;
   }

   public boolean goalTest( State state ){
     return (FrenchCity)state.equals(goalState);
   }

   public double h( State state ){
     return (FrenchCity)state.longLat.getDistance((FrenchCity)goalState.longlat);
   }

   public void setInitialStateByName( String s ){
     intialState = cities.get(s);
   }

   public void setGoalStateByName( String s ){
     goalState = cities.get(s);
   }

}
