/*
 * Copyright (C) Raymond Kampmann - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Raymond Kampmann <ray.kampmann@gmail.com>, May 2016
 */
package net._5tingr4y.endoftime;

public class GameController implements Runnable {

    private GameController() {

    }

    @Override
    public void run() {
        init();
        loop();
    }

    private void init() {

    }

    private void loop() {

    }

    //static
    private static final GameController instance = new GameController();

    public static GameController get() {
        return instance;
    }
}
