package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass02 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(); //가로배열
		//VBox hbox = new VBox(); //세로배열
		Button[] btn = new Button[3];
		for(int i=0 ; i < btn.length ; i++) {
			btn[i] = new Button("btn_"+i);
		}
		hbox.getChildren().addAll(btn);
		hbox.setStyle("-fx-background-color : pink;"); //색상 변경
		hbox.setPrefSize(10, 50); //가로 세로(기본 border가 맞춰진다)
		
		BorderPane bp = new BorderPane(); //여러개를 할땐 pane에 pane을 누적해서 한번에 넣기
		bp.setTop(hbox);
		
		VBox vbox = new VBox();
		vbox.getChildren().add(new Label("라벨 추가"));
		vbox.getChildren().add(new Button("버튼 추가"));
		hbox.setStyle("-fx-background-color : yellow;");
		
		arg0.setResizable(false); //사이즈를 고정시킨다.
		
		arg0.setScene(new Scene(hbox, 200, 100));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
