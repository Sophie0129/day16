package scene01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainClass01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(getClass().getResource("testfx.fxml")); // 파일 위치를 알려줌
		FXMLLoader loader = new FXMLLoader(getClass().getResource("testfx.fxml")); // loader가 fxml 경로를 할당받음
		
		//AnchorPane root = loader.load(); //fxml에서 앵커팬을 만들었기 때문에 앵커팬으로 받아옴
		// 모든 pane의 부모로 Parent가 있다. (굳이 형태를 맞출필요 없이 부모로 불로 올 수 있다.)	
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
