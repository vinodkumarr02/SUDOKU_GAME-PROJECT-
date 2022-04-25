package com.sudoku.sudoku_solver.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws  IOException;
}
