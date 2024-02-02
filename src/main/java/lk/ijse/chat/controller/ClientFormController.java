package lk.ijse.chat.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.ResourceBundle;

public class ChatRoomController implements Initializable {

    @FXML
    private Button btnSend;

    @FXML
    private AnchorPane root;

    @FXML
    private ScrollPane spMain;

    @FXML
    private TextField txtSend;

    @FXML
    private VBox vBoxMessages;
    private Server server;
    @FXML
    private HBox hBox;


    @FXML
    void btnSendOnAction(ActionEvent event) {
        String messageToSend=txtSend.getText();
        if (!messageToSend.isEmpty()){
            HBox hBox1=new HBox();
            hBox1.setAlignment(Pos.CENTER_RIGHT);
            hBox1.setPadding(new Insets(5,5,5,10));

            Text text=new Text(messageToSend);
            TextFlow textFlow=new TextFlow(text);

            textFlow.setStyle(String.format("-fx-color: rgb(239,242,255 -fx-background-color : rgb(15,125,242)-fx-background-radius:20px"));

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
      /*  try {
            server= new ServerSocket(3001);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        vBoxMessages.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                spMain.setVvalue((Double) newValue);
            }
        });

        server.reciveMessageFromClient(vBoxMessages);*/
    }
}
