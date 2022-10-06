//package javafx;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.scene.control.TextField;
//import javafx.scene.text.Text;
//
//import java.util.ArrayList;
//
//public class Ass2Controller {
//    public TextField name;
//    public TextField email;
//    public TextField point;
//    public Text error;
////    public ListView<StudentInformation> lv;
//    private ObservableList<StudentInformation> list = FXCollections.observableArrayList();
//    public nhapThongtin(){
//        try {
//            error.setVisible(false);
//            if(name.getText().isEmpty() || email.getText().isEmpty()||point.getText().isEmpty())
//            {
//                throw new Exception("Xin vui long nhap lai");
//            }
//            list.add(new StudentInformation(name.getText(),email.getText(),point.getText()));
////            lv.setItems(list);
////            lv.refresh();
//        }catch (Exception e){
//            error.setText(e.getMessage());
//            error.setVisible(true);
//        }
//    }
//    public void printfResult(){
//
//    }
//}
