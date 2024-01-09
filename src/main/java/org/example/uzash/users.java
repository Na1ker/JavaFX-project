package org.example.uzash;

public class users {

    String marka,name,cost,year;


    //Конструктор
    public users(String marka, String name, String cost, String year) {

        this.marka = marka;
        this.name = name;
        this.cost = cost;
        this.year = year;
    }



    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public String getMarka() {
        return marka;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getYear() {
        return year;
    }
}
