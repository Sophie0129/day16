package gridPane; //새패키지를 만들면 모듈인포에 엑스포트를 해줘야 fx기능을 사용할 수 있다.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Mainclass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		GridPane gp = new GridPane();
		Button btn = new Button("Button");
		gp.setRowIndex(btn, 0); //세로 0번째 배치
		//setRowIndex가 static이여서 왜 클래스가 아니고 변수로 사용하냐는 의미의 오류 그냥 진행해도 무관
		GridPane.setColumnIndex(btn, 0); //가로 0번째 배치
		
		Label lb01 = new Label("label");
		Label lb02 = new Label("label02");
		GridPane.setConstraints(lb01, 0, 2);//가로 세로
		GridPane.setConstraints(lb02, 1, 1);//가로 세로
		
		//TextArea ta = new TextArea(); //아래와 다른 메소드지만 기능은 비슷함
		TextField tf = new TextField();
		GridPane.setConstraints(tf, 1, 2);
		
		gp.getChildren().addAll(btn, lb01, lb02, tf);
		
		arg0.setScene(new Scene(gp));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
