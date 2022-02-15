module io.dbc.github.tallytracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.tallytracker to javafx.fxml;
    exports io.dbc.github.tallytracker;
}