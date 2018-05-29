package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class Controller {

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Sprawdz kod");
    }
    @FXML
    TextField textField;

    @FXML
    Label wynik;


}
