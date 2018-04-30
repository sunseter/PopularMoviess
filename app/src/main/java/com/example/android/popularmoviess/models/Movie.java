package com.example.android.popularmoviess.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yubaarrami on 12/9/17.
 */

public class Movie implements Parcelable {


    private String mMovieTitle;
    private String mMovieSynopsis;
    private String mMoviePosterPath;
    private String mMovieVoteAverage;
    private String mMovieReleaseDate;
    private String mMovieId;

    /**
     * Constructor that initializes MovieListing object
     */
    public Movie(String sMovieTitle, String sMovieSynopsis, String sMoviePosterPath,
                        String sMovieVoteRating, String sMovieReleaseDate, String sMovieId){
        this.mMovieTitle = sMovieTitle;
        this.mMovieSynopsis = sMovieSynopsis;
        this.mMoviePosterPath = sMoviePosterPath;
        this.mMovieVoteAverage = sMovieVoteRating;
        this.mMovieReleaseDate = sMovieReleaseDate;
        this.mMovieId = sMovieId;
    }

    /**
     * Auto-generated method stub
     */
    @Override
    public int describeContents(){
        return 0;
    }

    /**
     * This constructor retrieves data from the Parcel object
     * and is invoked by the method createFromParcel (Parcel source) of the object CREATOR
     * @param in
     */
    private Movie(Parcel in) {
        mMovieTitle = in.readString();
        mMovieSynopsis = in.readString();
        mMoviePosterPath = in.readString();
        mMovieVoteAverage = in.readString();
        mMovieReleaseDate = in.readString();
        mMovieId = in.readString();
    }

    /**
     * Stores the MovieListing data to the Parcel object
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mMovieTitle);
        dest.writeString(mMovieSynopsis);
        dest.writeString(mMoviePosterPath);
        dest.writeString(mMovieVoteAverage);
        dest.writeString(mMovieReleaseDate);
        dest.writeString(mMovieId);
    }


    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getMovieTitle() {
        return mMovieTitle;
    }

    public String getMovieSynopsis() {
        return mMovieSynopsis;
    }

    public String getMoviePosterPath() {
        return mMoviePosterPath;
    }

    public String getMovieVoteAverage() {
        return mMovieVoteAverage;
    }

    public String getMovieReleaseDate() {
        return mMovieReleaseDate;
    }

    public String getMovieId(){
        return mMovieId;
    }
}
