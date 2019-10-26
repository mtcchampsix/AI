import java.util.*;
import java.lang.Math;

public class LongLat{
  public LongLat() { latitude = 0; longitude = 0; }

  public int latitude;
  public int longitude;

  public LongLat( int d1, int h1, int s1, char q1, int d2, int h2, int s2, char q2){
    latitude = getLat(double d2, double h2, double s2, char q2);
    longitude = getLong(double d1, double h1, double s1, char q1);
  }

  public double getLong(int d1, int h1, int s1, char q1){
    longitude = (d1*3600) + (h1*60) + s1;
    if (q1 == 'S'){
      longitude = (-1)*longitude;
    }
    return longitude;
  }

  public double getLat(int d2, int h2, int s2, char q2){
    latitude = (d1*3600) + (h2*60) + s2;
    if (q2 == 'W'){
      latitude = (-1)*latitude;
    }
    return latitude;
  }

  public int getDistance(LongLat longlat2){
    double distance = sqrt(Math.pow(longlat2.latitude - this.latitude) + Math.pow(longlat2.longitude - this.longitude));
    return distance;
  }


}
