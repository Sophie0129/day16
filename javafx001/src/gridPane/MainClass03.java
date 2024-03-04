package gridPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass03 extends Application{

	@Override
	public void start(Stage aaa) throws Exception {
		// TODO Auto-generated method stub
		
		GridPane gp = new GridPane();
		
		gp.add(new Button("Button"), 0, 0);
		gp.add(new Button("B1, B0"), 1, 0);
		gp.add(new Button("L0, L1"), 0, 1);
		gp.add(new Button("Lable"), 1, 1);
		
		FlowPane fp = new FlowPane();
		fp.getChildren().add(new Button("merge col(0), row(2)"));
		fp.setAlignment(Pos.CENTER);
		fp.setStyle("-fx-background-color:black;");
		gp.add(fp, 0, 2,2,1); //가로, 세로, 가로병합, 세로병합
		
		aaa.setScene(new Scene(gp,300,300));
		aaa.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
