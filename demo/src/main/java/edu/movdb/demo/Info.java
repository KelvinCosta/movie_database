package edu.movdb.demo;

import java.util.*;

public class Info {

  private int page;
  private int perPage;
  private int total;
  private int totalPages;
  private List<Movie> movies;

  public Info(int page, int perPage, int total, int totalPages, List<Movie> movies){
    this.page = page;
    this.perPage = perPage;
    this.total = total;
    this.totalPages = totalPages;
    this.movies = movies;
  }

  public void setPage(int page){
    this.page = page;
  }

  public int getPage(){
    return page;
  }

  public void setPerPage(int perPage){
    this.perPage = perPage;
  }

  public int getPerPage(){
    return perPage;
  }

  public void setTotal(int total){
    this.total = total;
  }

  public int getTotal(){
    return total;
  }

  public void setTotalPages(int totalPages){
    this.totalPages = totalPages;
  }

  public int getTotalPages(){
    return totalPages;
  }

  public void setMovies(List<Movie> movies){
    this.movies = movies;
  }

  public List<Movie> getMovies(){
    return movies;
  }

  public Movie getMovie(int index){
    return movies.get(index);
  }
}