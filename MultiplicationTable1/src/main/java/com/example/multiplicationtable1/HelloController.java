package com.example.multiplicationtable1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label l;
    @FXML
    private TextField tf;
    private int result;

    @FXML
    protected void onHelloButtonClick() {
        int us;
        try {
            us = Integer.parseInt(this.tf.getText());
        } catch (NumberFormatException e) {
            this.alertWindow("", "Введите число!", "Ошибка");
            this.tf.requestFocus();
            return;
        }
        if (us == result) {
            this.alertWindow("ВЕРНО!", this.l.getText() + "=" + us, "Результат");
        } else {
            this.alertWindow("НЕВЕРНО!", "Верный ответ:\n " + this.l.getText() + "=" + this.result, "Результат");
        }
        l.setText(multiplicationGenerator());
        tf.setText("");
        tf.requestFocus();
    }

    private String multiplicationGenerator() {
        int a, b;
        final Random random = new Random();
        do {
            a = random.nextInt(10);
            b = random.nextInt(10);
        } while (a == 0 || b == 0 || a == 1 || b == 1);
        this.result = a * b;
        return a + " * " + b;
    }

    private void alertWindow(final String s, final String s1, final String s2) {
        final Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(s2);
        alert.setHeaderText(s);
        alert.setContentText(s1);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        l.setText(multiplicationGenerator());
        tf.requestFocus();
    }
}
