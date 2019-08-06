package com.acleau.beeradvisor;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String preferredBeerColor){
        List<String> brands = new ArrayList<>();
        if (preferredBeerColor.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
