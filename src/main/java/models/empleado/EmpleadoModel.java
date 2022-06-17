package models.empleado;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.HashMap;
import java.util.List;

@JsonRootName("employee")
public class EmpleadoModel {
    private String name;
    private String lastname;
    private int numCats;
    private double height;
    private String country;
    private boolean married;
    private List<String> favoriteBooks;
    private List<VideoGameModel> videoGames;
    private HashMap<String, HobbiesModel> hobbies;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getNumCats() {
        return numCats;
    }

    public double getHeight() {
        return height;
    }

    public String getCountry() {
        return country;
    }

    public boolean isMarried() {
        return married;
    }

    public List<String> getFavoriteBooks() {
        return favoriteBooks;
    }

    public List<VideoGameModel> getVideoGames() {
        return videoGames;
    }

    public HashMap<String, HobbiesModel> getHobbies() {
        return hobbies;
    }
}
