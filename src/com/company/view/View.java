package com.company.view;

import com.company.model.Gun;

import java.util.List;

/**
 * This class contains string constants that
 * uses for messages at console.
 * It contains method to print messages at console.
 *
 * @version 05 Jule 2016
 * @author Yevhen Hryshchenko
 */
public class View {
    public static final String SAX_PARSER = "----- SAX parser -----";
    public static final String STAX_PARSER = "------ StAX parser ------";
    public static final String DOM_PARSER = "------ DOM parser ------";
    public static final String INVALID_DOCUMENT = "Invalid document!";

    public void print(String message){
        System.out.println(message);
    }

    public void print(List<Gun.Weapon> weapons){
        for (Gun.Weapon weapon : weapons){
            print(weapon.toString());
        }
    }
}
