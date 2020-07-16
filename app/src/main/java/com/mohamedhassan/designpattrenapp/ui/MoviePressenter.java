package com.mohamedhassan.designpattrenapp.ui;

import com.mohamedhassan.designpattrenapp.Model.MovieModel;

public class MoviePressenter {
    MovieView movieView;

    public MoviePressenter(MovieView movieView) {
        this.movieView = movieView;
    }

    public MovieModel GetViewFromDataMovies() {
        return new MovieModel("CastOfBable", "15-05-2015", "Is Amazing Movie", 1);

    }

//    public void GetViewMovies(){
//        movieView.GetMovieName(GetViewFromDataMovies().getDescraptionMovie());
//
//    }
}
