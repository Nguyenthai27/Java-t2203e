package javafx;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class PhoneController {
    public TextField nameleft;
    public TextField numberleft;
    public Text result;
    public Text error;


    private ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    public void taoMoi(){
        try{
            if(nameleft.getText().isEmpty()||numberleft.getText().isEmpty()){
                throw new Exception("Vui long nhap lai");
            }
            phoneList.add(new PhoneNumber(nameleft.getText(),numberleft.getText()));
            printResult();

        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
    public void updatePhone(){
        for(PhoneNumber p :phoneList){
            if(p.getName().equals(nameleft.getText())){
            }
        }
    }
    public void printResult(){
       String left = "";

    }
}
