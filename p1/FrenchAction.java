public class FrenchAction extends Action{
  public FrenchAction(){ }

  public int compareTo( Action a );
  public boolean equals( Object o );
  public int hashCode();
  public String toString();
  public String getAction() { return action; }

  public String action;
  public int cost;

  public FrenchAction(String action, int cost){
    this.action = action;
    this.cost = cost;
  }

  protected Object clone() throws CloneNotSupportedException{
    try{
      return super.clone();
    } catch (CloneNotSupportedException e){
      System.out.println("This clone is not supported");
    }
  }

  public int compareTo( Action a ){
    return action.compareTo(a.action);
  }

  public boolean equals( Object o ){
    if (o == null){
      return false;
    } else if (this == o){
      return true;
    } else if (!o.isInstance(FrenchAction)) {
      return false;
    }
    int value = this.compareTo((Action)o);
    if (value < 0) return false;
    else return true;
  }

  public int hashCode(){
    return this.hashCode(action);
  }

  public String toString(){
    System.out.println("The action: " + action + " Cost of action: " + cost);
  }


}
