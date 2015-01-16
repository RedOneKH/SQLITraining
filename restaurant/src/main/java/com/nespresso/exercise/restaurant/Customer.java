package com.nespresso.exercise.restaurant;

import java.util.ArrayList;
import java.util.List;


public class Customer {
    
    private String name;
    private List<String> listRequests = new ArrayList<String>();
    
    public Customer(String name){
        this.name = name;
    }
    
    public void addRequest(String request){
        listRequests.add(request);
    }

}
