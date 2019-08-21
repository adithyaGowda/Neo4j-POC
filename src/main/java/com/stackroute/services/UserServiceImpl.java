package com.stackroute.services;

import com.stackroute.domain.Movie;
import com.stackroute.domain.User;
import com.stackroute.repository.MovieRepository;
import com.stackroute.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServices {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);


    private UserRepository userRepository;
    private MovieRepository movieRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository, MovieRepository movieRepository) {
        this.userRepository = userRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Collection<User> getAllUser() {
        return userRepository.getAllUsers();
    }

    @Override
    public User updateUser(User user) {
        userRepository.deleteById(user.getId());
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        userRepository.deleteById(user.getId());
        return optionalUser.get();
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Iterable<Movie> getAllMovie() {
        return movieRepository.findAll();
    }

    @Override
    public Movie updateMovie(Movie movie) {
        movieRepository.deleteById(movie.getId());
        return movieRepository.save(movie);
    }

    @Override
    public Movie deleteMovie(Movie movie) {
        Optional<Movie> optionalMovie = movieRepository.findById(movie.getId());
        movieRepository.deleteById(movie.getId());
        return optionalMovie.get();
    }

    @Override
    public User setRelation(int userId, int movieId, int rating) {
        return userRepository.setRelation(rating);
    }
}
