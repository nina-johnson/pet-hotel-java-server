package com.example.demo;

public class Owner {

    private long id;
    private String o_name;
	public Owner getName;

    public Owner(){};

    public Owner( long id, String o_name ) {
        this.id = id;
        this.o_name = o_name;
    }

    // Methods to get data for owners
    public long getId() {
        return id;
    }

    public String getName() {
        return o_name;
    }

    //Methods to set data
    public void setId( long id ) {
        this.id = id;
    }

    public void setName( String o_name ) {
        this.o_name = o_name;
    }
}