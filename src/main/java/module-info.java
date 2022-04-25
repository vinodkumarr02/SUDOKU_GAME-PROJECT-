module com.sudoku.sudoku_solver {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    //requires jfxrt;

    opens com.sudoku.sudoku_solver to javafx.fxml;
    exports com.sudoku.sudoku_solver;
}