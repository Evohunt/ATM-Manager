package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public Label lbl_title;
    public Label lbl_deposit;
    public Label lbl_withdraw;
    public Label lbl_checkBalance;
    public Label lbl_accountInfo;

    public TextField txt_deposit;
    public TextField txt_withdraw;

    public Label lbl_balance;

    public Button btn_exit;

    public void btnExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void btnSave(ActionEvent actionEvent) {

    }

    public void btnLoad(ActionEvent actionEvent) {
    }

    public void btnCheckBalance(MouseEvent mouseEvent) {

    }
}
