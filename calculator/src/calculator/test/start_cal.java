package calculator.test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lombok.Getter;
import lombok.Setter;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Color;


public class start_cal extends JFrame{

	public start_cal() {
		setSize(430,600);
		JPanel startP = new JPanel();
		JLabel numbers = new JLabel("0");
		String firstNum = "";

		
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnPlus = new JButton("+");
		JButton btnMin = new JButton("-");
		JButton btnDiv = new JButton("/");
		JButton btnMul = new JButton("*");
		JButton btnInit = new JButton("C");
		JButton btnRes = new JButton("=");
		//JButton btnDel = new JButton("del");
		
		// 패널추가
		startP.setBounds(0, 0, 0, 0);
		startP.setLayout(null);
		
		//버튼 추가
		btn0.setBounds(12,145,90,90);
		startP.add(btn0);
		
		btnPlus.setBounds(112,145,90,90);
		startP.add(btnPlus);
		
		btnMin.setBounds(212,145,90,90);
		startP.add(btnMin);
		
		btnMul.setBounds(312,145,90,90);
		startP.add(btnMul);
		
		btn1.setBounds(12,245,90,90);
		startP.add(btn1);
		
		btn2.setBounds(112,245,90,90);
		startP.add(btn2);
		
		btn3.setBounds(212,245,90,90);
		startP.add(btn3);
		
		btnDiv.setBounds(312,245,90,90);
		startP.add(btnDiv);
		
		btn4.setBounds(12,345,90,90);
		startP.add(btn4);
		
		btn5.setBounds(112,345,90,90);
		startP.add(btn5);
		
		btn6.setBounds(212,345,90,90);
		startP.add(btn6);
		
		btnInit.setBounds(312,345,90,90);
		startP.add(btnInit);

		btn7.setBounds(12,445,90,90);
		startP.add(btn7);
		
		btn8.setBounds(112,445,90,90);
		startP.add(btn8);
		
		btn9.setBounds(212,445,90,90);
		startP.add(btn9);
		
		btnRes.setBounds(312,445,90,90);
		startP.add(btnRes);
		
		
		//패널에 JLabel 추가
		numbers.setBorder(new LineBorder(Color.GRAY));
		numbers.setFont(new Font("굴림", Font.BOLD, 30));
		numbers.setHorizontalAlignment(SwingConstants.RIGHT);
		numbers.setBounds(12, 22, 390, 110);
		startP.add(numbers);
		
		
		// 버튼을 누르면 숫자가 입력&저장 
		
		
		
		
		
		// 기존 패널에 startPanel 추가
		getContentPane().add(startP);
		
		setVisible(true);// 화면 창 윈도우에 띄우는 기능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 화면창 닫으면 프로그램 종료
	}
	
	public static void main(String[] args) {
		//계산기 시작
		new start_cal();
	}
}
