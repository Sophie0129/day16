package gridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass02 extends Application {

	@Override //클래스를 새로 만들때 Main으로 만들면 오버라이딩을 자동으로 해준다.(class, interface 선택하는 그 위치에서 main 검색후)
	public void start(Stage primaryStage) {
		GridPane gp = new GridPane();
		Button btn  = new Button("Button");
		
		Label lb = new Label("Label");
		
		GridPane.setConstraints(btn, 0, 0);
		GridPane.setConstraints(lb, 1, 1);
		
		gp.getChildren().addAll(btn, lb);
		gp.add(new Button("B1, B0"), 1, 0);
		gp.add(new Label("L0, L1"), 0, 1);
		
		gp.setPadding(new Insets(20));
		gp.setHgap(50);//세로
		gp.setVgap(50);//가로
		
		
		primaryStage.setScene(new Scene(gp, 300,300));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
