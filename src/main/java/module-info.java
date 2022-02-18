module io.dbc.github.tallytracker {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens io.dbc.github.tallytracker to javafx.fxml;
    exports io.dbc.github.tallytracker;
}