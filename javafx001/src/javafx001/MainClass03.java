package javafx001;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainClass03 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane fp = new FlowPane(Orientation.VERTICAL);//세로배치하기
		fp.setColumnHalignment(HPos.RIGHT); //오른쪽 정렬
		fp.setPadding(new Insets(10,10,10,30)); //위, 오른쪽, 아래, 왼쪽 순으로 내용을 안으로 밀어내 가장자리에 여백을 만든다.
		
		
		for(int i=0;i<10;i++) {
			fp.getChildren().add(new Button("btn"+(i*i*i*i*10)));
		}
		arg0.setScene(new Scene(fp, 300, 250)); 
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
