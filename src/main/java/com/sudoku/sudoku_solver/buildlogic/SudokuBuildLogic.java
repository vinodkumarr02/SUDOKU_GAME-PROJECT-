package com.sudoku.sudoku_solver.buildlogic;

import com.sudoku.sudoku_solver.computationlogic.GameLogic;
import com.sudoku.sudoku_solver.persistance.LocalStorageImpl;
import com.sudoku.sudoku_solver.problemdomain.IStorage;
import com.sudoku.sudoku_solver.problemdomain.SudokuGame;
import com.sudoku.sudoku_solver.userinterface.IUserInterfaceContract;
import com.sudoku.sudoku_solver.userinterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {

    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
        SudokuGame initialState;
        IStorage storage=new LocalStorageImpl();

        try{
            initialState=storage.getGameData();
        }
        catch (IOException e){
            initialState= GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic=new ControlLogic(storage,userInterface);

        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
