public class Aadhar extends Application
{

public void start(Stage stage)
{

Text t = new Text("I have ");

ToggleGroup tg = new ToggleGroup();
RadioButton rb1 = new RadioButton("Enrollment Number");
rb1.setToggleGroup(tg);
RadioButton rb2 = new RadionButton("Aadhaar Number ");
rb2.setToggleGroup(tg);
Text t1 = new Text("Enrollment Number/Aadhaar Number ");

TextField tf1a = new TextField();

TextField tf1b = new TextField();

Text t2 = new Text("Full Name " );

TextField tf2 = new TextField(); 

Text t3 = new Text("Pin Code ");

TextField tf3 = new TextFIeld();


Text t4 = new Text("Image" ); 	
int s1 = Math.random()*999999;
Label l1 = new Label(s1);
TextField tf4 = new TextField();





Text t5 = new Text("Mobile Number ");

TextField tf5 = new TexField();


Button btreg = new Button("Get One Time Pasword");

GridPane gp1 = new GridPane();
gridPane.setMinSize(500,500);
gridPane.setPading(new Insets(10,10,10));

gridPane.setVgap(5);
gridPane.setVgap(5);

gridPane.setAlignment(Pos.CENTER);

gridPane.add(tg,0,0);
gridPane.add(rb1,1,0);
gridPane.add(rb2,2,0);


gridPane.add(t1,0,1);
gridPane.add(tf1a,1,1);
gridPane.add(tf1b,2,1);
gridPane.add(t2,3,3);

gridPane.add(tf2,3,4);
gridPane.add(t3,4,5);

gridPane.add(tf3,5,4);
gridPane.add(t4,6,5);

gridPane.add(tf4,6,6);
gridPane.add(l1,6,6);
gridPane.add(t5,5,7);


gridPane.add(tf5,5,8);
gridPane.add(btnreg,6,9);

Scene scene = new Scene(gridPane);
stage.setTitle("Personal Details");
stage.setScene(scene);
stage.show();

File f = new File

}


private boolean validateFields()
{
if(tf1a.getText().isEmpty() | tf1b.getText().isEmpty() | tf2.getText().getEmpty() | tf3.getText() | tf4.getText() | tf5.getText())
return false;
}


public static void main(String[] args)
{
launch(Args);
}}



