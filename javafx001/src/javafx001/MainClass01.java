package javafx001; //!!프로젝트명 이름 바꾸기 금지!!

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{
	/*프로젝트 > 속성 > 빌드패스 > 라이브러리 > 모듈인포 > 외부입력 > javafx-sdk-21.0.2 > lib 안 파일 전부 넣기
		 프로젝트 > 컨피그 > 모듈인포 생성 > 클래스명에서 umimplement method(오버라이딩) > 오버라이딩 된 메소드에 코드 적기

		 라이브러리 자체를 만들기
		 윈도우>프리퍼런스 > java 검색 > 빌드패스-유저라이브러리 > 라이브러리 만들고 javafx-sdk-21.0.2 > lib 안 파일 전부 넣기 >
		 이후 첫번째 방법대로 가서 외부입력대신 '라이브러리 추가' > 유저라이브러리 > 내가 만든 라이브러리 넣기
	 */

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("start 실행");
		Label lb = new Label(); //라벨도 실행하려면 모듈인포에 인포트 필요
		lb.setFont(new Font(30));
		lb.setText("안녕하세요");

		Scene scane = new Scene(lb, 200, 300);//가로, 세로 크기를 정해주는 두번째,세번째 자리 숫자
		arg0.setScene(scane);

		arg0.setTitle("제목을 설정합니다");
		arg0.show();
		/* 보여지는 하얀창은 스테이지로 장판같은 기본틀 scene
		 */

	}
	public static void main(String[] args) {
		launch(args);
	}
}
