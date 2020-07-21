package edu.movdb.demo;

import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONValue;

public class Movie {

  private String title;
  private int year;
  private String imdbID;

  public Movie(String title, int year, String imdbID){
    this.title = title;
    this.year = year;
    this.imdbID = imdbID;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public String getTitle(){
    return title;
  }

  public void setYear(int year){
    this.year = year;
  }

  public int getYear(){
    return year;
  }

  public void setImdbID(String imdbID){
    this.imdbID = imdbID;
  }

  public String getImdbID(){
    return imdbID;
  }

  @Override
  public String toString() {
    Map obj=new LinkedHashMap(); 
    obj.put("Title",title); 
    obj.put("Year", year); 
    obj.put("imdbID", imdbID); 
    return JSONValue.toJSONString(obj); 
  }
}