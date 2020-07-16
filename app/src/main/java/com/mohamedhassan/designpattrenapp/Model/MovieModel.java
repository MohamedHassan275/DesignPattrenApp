package com.mohamedhassan.designpattrenapp.Model;

public class MovieModel {
    String NameMovie,DateMovie,DescraptionMovie;
    int Id;

    public MovieModel(String nameMovie, String dateMovie, String descraptionMovie, int id) {
        NameMovie = nameMovie;
        DateMovie = dateMovie;
        DescraptionMovie = descraptionMovie;
        Id = id;
    }

    public String getNameMovie() {
        return NameMovie;
    }

    public void setNameMovie(String nameMovie) {
        NameMovie = nameMovie;
    }

    public String getDateMovie() {
        return DateMovie;
    }

    public void setDateMovie(String dateMovie) {
        DateMovie = dateMovie;
    }

    public String getDescraptionMovie() {
        return DescraptionMovie;
    }

    public void setDescraptionMovie(String descraptionMovie) {
        DescraptionMovie = descraptionMovie;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
