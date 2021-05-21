package com.example.myapplication;
public class Country {

    private String countryName;

    // Image name (Without extension)
    private int flagName;
    private String population;

    public Country(String countryName, int flagName, String population) {
        this.countryName= countryName;
        this.flagName= flagName;
        this.population= population;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getFlagName() {
        return flagName;
    }

    public void setFlagName(int flagName) {
        this.flagName = flagName;
    }

    @Override
    public String toString()  {
        return this.countryName+" (Population: "+ this.population+")";
    }
}