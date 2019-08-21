package com.stackroute.controller;

import com.stackroute.domain.Movie;
import com.stackroute.domain.User;
import com.stackroute.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("neo/graph")
public class UserController {


    private UserServices userServices;


    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userServices.saveUser(user);
    }

    @GetMapping("/users")
    public Collection<User> getAllUsers(){
        return userServices.getAllUser();
    }

    @PutMapping(value = "/user")
    public User updateUser(@RequestBody User user) {
        return userServices.updateUser(user);
    }

    @DeleteMapping(value = "/user")
    public User deleteUser(@RequestBody User user) {
        return userServices.deleteUser(user);
    }

    @PostMapping("/movie")
    public Movie saveMovie(@RequestBody Movie movie){
        return userServices.saveMovie(movie);
    }

    @GetMapping("/movies")
    public Iterable<Movie> getAllMovies(){
        return userServices.getAllMovie();
    }

    @PutMapping(value = "/movie")
    public Movie updateMovie(@RequestBody Movie movie) {
        return userServices.updateMovie(movie);
    }

    @DeleteMapping(value = "/movie")
    public Movie deleteMovie(@RequestBody Movie movie) {
        return userServices.deleteMovie(movie);
    }


}
