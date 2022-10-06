package mutilpage.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mutilpage.Main;

public class Controller  {

    public void backTolist(ActionEvent actionEvent) throws  Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Liet ke");
        Main.rootStage.setScene(listScene);
    }
}
