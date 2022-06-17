package models;

import com.github.javafaker.Faker;

public class DigimonModel {
    private final String nombre;
    private final double peso;
    private final int edad;
    private final String frase;
    private final boolean esMacho;
    private final String email;
    private final String zipcode;

    public DigimonModel() {
        var faker = new Faker();
        nombre = faker.name().name();
        peso = faker.number().randomDouble(2, 5, 10);
        edad = faker.number().numberBetween(2, 15);
        frase = faker.backToTheFuture().quote();
        esMacho = faker.bool().bool();
        email = faker.internet().emailAddress();
        zipcode = faker.address().zipCode();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public String getFrase() {
        return frase;
    }

    public boolean isEsMacho() {
        return esMacho;
    }

    public String getEmail() {
        return email;
    }

    public String getZipcode() {
        return zipcode;
    }
}
