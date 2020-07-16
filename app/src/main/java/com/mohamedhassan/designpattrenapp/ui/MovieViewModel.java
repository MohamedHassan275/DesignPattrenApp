package com.mohamedhassan.designpattrenapp.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mohamedhassan.designpattrenapp.Model.MovieModel;

public class MovieViewModel extends ViewModel {

    MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    public void GetShowMovie(){
        String ShowMovies = GetViewFromDataMovies().getDateMovie();
        mutableLiveData.setValue(ShowMovies);

    }
    public MovieModel GetViewFromDataMovies() {
        return new MovieModel("CastOfBable", "15-05-2015", "Is Amazing Movie", 1);

    }

}
