package com.joysistvi.stage2.day19;

import com.joysistvi.stage2.day19.controller.UserAccountController;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UserAccountApplication {

    public static void main(String[] args) {

        Logger.getLogger("org.hibernate.validator").setLevel(Level.WARNING);

        new UserAccountController().run();
    }
}
