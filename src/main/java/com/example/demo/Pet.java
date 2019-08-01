
package com.example.demo;

public class Pet {

    private long id;
    private String p_name;
    private String p_breed;
    private String p_color;
    private boolean p_checkIn;
    private String p_owner;

    public Pet(){};

    public Pet( long id, String p_name, String p_breed, String p_color, boolean p_checkIn ) {
        this.id = id;
        this.p_name = p_name;
        this.p_breed = p_breed;
        this.p_color = p_color;
        this.p_checkIn = p_checkIn;
        this.p_owner = p_owner;
    }

    // Methods to get data
    public long getId() {
        return id;
    }

    public String getName() {
        return p_name;
    }

    public String getBreed() {
        return p_breed;
    }

    public String getColor() {
        return p_color;
    }

    public boolean getCheckIn() {
        return p_checkIn;
    }

    public String getOwner() {
        return p_owner;
    }


    // Methods to set data
    public void setId( long id ) {
        this.id = id;
    }

    public void setName( String p_name ) {
        this.p_name = p_name;
    }

    public void setBreed( String p_breed ) {
        this.p_breed = p_breed;
    }

    public void setColor( String p_color ) {
        this.p_color = p_color;
    }

    public void setCheckIn( boolean p_checkIn ) {
        this.p_checkIn = p_checkIn;
    }

    public void setOwner( String p_owner ) {
        this.p_owner = p_owner;
    }
}
