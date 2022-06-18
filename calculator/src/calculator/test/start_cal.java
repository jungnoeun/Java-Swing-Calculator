package calculator.test;

import javax.swing.JFrame;

import lombok.Getter;
import lombok.Setter;

public class start_cal extends JFrame{

	public start_cal() {
		setSize(500,640);
		setLayout(null); //그림그릴떄 절대적 위치 아닌 상대적 위치 가능
		setVisible(true);// 화면 창 윈도우에 띄우는 기능
	}
	
	public static void main(String[] args) {
		//계산기 시작
		new start_cal();
		
	}

}
