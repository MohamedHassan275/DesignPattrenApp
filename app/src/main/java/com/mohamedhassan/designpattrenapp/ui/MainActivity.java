package com.mohamedhassan.designpattrenapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.mohamedhassan.designpattrenapp.Model.MovieModel;
import com.mohamedhassan.designpattrenapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,MovieView {

    @BindView(R.id.textViewShowMovie)
    TextView textViewShowMovie;
    @BindView(R.id.BtnGetMovie)
    Button BtnGetMovie;
  //  MovieViewModel movieViewModel;
    MoviePressenter pressenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        pressenter = new MoviePressenter(this);
        BtnGetMovie.setOnClickListener(this);
//        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
//        movieViewModel.mutableLiveData.observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//
//                textViewShowMovie.setText(s);
//            }
//        });

    }

//    public MovieModel GetViewMovies() {
//        return new MovieModel("CastOfBable", "15-05-2015", "Is Amazing Movie", 1);
//
//    }

//    public void GetMovie() {
//        textViewShowMovie.setText(GetViewMovies().getDescraptionMovie());
//    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.BtnGetMovie) {

           // movieViewModel.GetShowMovie();
           // GetMovie();
            // textViewShowMovie.setText(GetViewMovies().getDateMovie());
           pressenter.movieView.GetMovieName(pressenter.GetViewFromDataMovies().getDateMovie());
          //  pressenter.GetViewFromDataMovies();
        }
    }


    @Override
    public void GetMovieName(String descraptionMovie) {
        textViewShowMovie.setText(descraptionMovie);
    }
}