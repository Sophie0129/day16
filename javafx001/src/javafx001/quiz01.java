package javafx001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class quiz01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane fp = new FlowPane();
		//Label lb = new Label();
		
		fp.setVgap(10); //행간 만들기
		fp.setHgap(20); //자간 만들기
		
		for(int i=1;i<11;i++) {
		Button btn01 = new Button("버튼"+i);
		fp.getChildren().add(btn01);
		}
		
		Scene sc = new Scene(fp);
		arg0.setScene(sc);
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
