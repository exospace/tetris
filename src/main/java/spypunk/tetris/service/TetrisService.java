/*
 * Copyright © 2016 spypunk <spypunk@gmail.com>
 *
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 */

package spypunk.tetris.service;

import spypunk.tetris.model.Movement;
import spypunk.tetris.model.Tetris;

public interface TetrisService {

    void newInstance(Tetris tetris);

    void updateInstance(Tetris tetris);

    void updateInstanceMovement(Tetris tetris, Movement movement);

    void pauseInstance(Tetris tetris);
}
