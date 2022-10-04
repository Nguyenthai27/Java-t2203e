package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class PhoneController {
    public TextField nameleft;
    public TextField numberleft;
    public ListView<PhoneNumber> lv;
    public Text error;


    private ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    public void taoMoi(){
        try{
            if(nameleft.getText().isEmpty()||numberleft.getText().isEmpty()){
                throw new Exception("Vui long nhap lai");
            }
            phoneList.add(new PhoneNumber(nameleft.getText(),numberleft.getText()));
            printfResult();
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
    public void printfResult(){
        ObservableList iteams = FXCollections.observableArrayList();
        iteams.addAll(phoneList);
        lv.setItems(iteams);
    }
}
