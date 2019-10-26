//French city extends abstract class State
import java.util.*;

public class FrenchCity extends State{

  public String name = "";
  public LongLat longlat;

  public FrenchCity(){
    name = "";
    longlat = new LongLat();
  }

  public FrenchCity( String name, LongLat longlat ){
    this.name = name;
    this.longlat = longlat;
  }

  protected Object clone() throws CloneNotSupportedException{
    try{
      return super.clone();
    } catch (CloneNotSupportedException e){
      System.out.println("This clone is not supported");
    }
  }

  public int compareTo( State s ){
    return name.compareTo(s.name);
  }

  public boolean equals( Object o ){
    //cast frenchcity to a state
    if (o == null){
      return false;
    } else if (this == o){
      return true;
    } else if (!o.isInstance(FrenchCity)) {
      return false;
    }
    int value = this.compareTo((State)o);
    if (value < 0) return false;
    else return true;
  }

  public int hashCode(){
    return this.hashCode(name); //only need to hash for names because names unique
  }

  public String toString(){
    System.out.println("City:" + name + latlong.toString());
  }
}
