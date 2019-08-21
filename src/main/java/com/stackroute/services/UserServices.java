package com.stackroute.services;

import com.stackroute.domain.Movie;
import com.stackroute.domain.User;

import java.util.Collection;

public interface UserServices {

    public User saveUser(User user);
    public Collection<User> getAllUser();
    public User updateUser(User user);
    public User deleteUser(User user);

    public Movie saveMovie(Movie movie);
    public Iterable<Movie> getAllMovie();
    public Movie updateMovie(Movie movie);
    public Movie deleteMovie(Movie movie);

    public User setRelation(int userId, int movieId, int rating);

}
