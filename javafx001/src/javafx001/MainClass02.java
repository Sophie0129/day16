package javafx001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//화면 분할을 정하는 layout, stage에 scene 하나만 올릴 수 있어서 레이아웃 사용 
public class MainClass02 extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
		Label lb = new Label("라벨입니다");
		Button btn01 = new Button("버튼 01");
		Button btn02 = new Button();
		btn02.setText("버튼 02");

		flowPane.getChildren().add(lb);
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);

		Scene sc = new Scene(flowPane);
		arg0.setScene(sc);
		arg0.show();

	}
	public static void main(String[] args) {
		launch(args); //런치가 있어야 그래픽화면으로 볼수 있다(start를 실행시킬수 있다)
		//라벨, 버튼, 씬 검색해보기
	}
}
