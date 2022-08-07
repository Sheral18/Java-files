import javafx.application.Application; 
//import static javafx.application.Application.launch; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.*; 
import javafx.scene.control.*;
import java.io.*;

class GridPane extends Application
{

public void start(Stage stage) throws Exception
{

    GridPane gp = new GridPane();
Button btn1 = new Button("Button1");
Button btn2 = new Button("Button2");
Button btn3 = new Button("Button3");
Button btn4 = new Button("Button4");

//int add();


gp.add(btn1, 0 , 1);

gp.add(btn2, 1 , 1);

gp.add(btn3, 2 , 1);

gp.add(btn4, 3 , 1);

Scene s = new Scene(gp);
stage.setScene(s);
stage.show();

}
public static void main(String[] args)
{
launch(args);

}
}





