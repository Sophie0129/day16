package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		Button btn = new Button("Top 버튼");
		btn.setPrefSize(200, 20);//가로 세로
		bp.setTop(btn);
		
		bp.setCenter(new Button("center 버튼"));
		bp.setBottom(new Button("아래 버튼"));
		bp.setLeft(new Button("왼쪽 버튼"));
		bp.setRight(new Button("오른쪽 버튼"));
		
		arg0.setScene(new Scene(bp, 300, 100));
		
		arg0.setTitle("border pane");
		arg0.show();
		//여러개 추가할때는 pane에다가 한번에 다 넣고 씬에 한꺼번에 추가해주면 된다
	}
public static void main(String[] args) {
	launch(args);
}
}
