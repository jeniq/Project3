package com.company;

import com.company.controller.Controller;
import com.company.view.View;

public class Main {

    public static void main(String[] args) {
        // Initialization
        View view = new View();
        Controller controller = new Controller(view);

        // Execute
        controller.processUser();
    }
}
