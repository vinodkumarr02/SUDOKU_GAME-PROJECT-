package com.sudoku.sudoku_solver;

import com.sudoku.sudoku_solver.buildlogic.SudokuBuildLogic;
import com.sudoku.sudoku_solver.userinterface.IUserInterfaceContract;
import com.sudoku.sudoku_solver.userinterface.UserInterfaceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application{

    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception{
        uiImpl=new UserInterfaceImpl(primaryStage);
        try{
            SudokuBuildLogic.build(uiImpl);
        }
        catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String args[]){
        launch(args);
    }
}
