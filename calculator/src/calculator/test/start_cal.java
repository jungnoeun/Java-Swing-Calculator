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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class start_cal extends JFrame{

	JPanel startP;
	JLabel numbers;
	String firstNum = "";
	String PMDM = "";
	String secondNum = "";
	String resultNum = "";
	int firN, secN;
	int res = 0;
	
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6,btn7,btn8,btn9;
	JButton btnPlus, btnMin, btnDiv, btnMul, btnInit, btnRes;
	
	public start_cal() {
		setSize(430,600);
		startP = new JPanel();
		numbers = new JLabel("0");

		
		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnPlus = new JButton("+");
		btnMin = new JButton("-");
		btnDiv = new JButton("/");
		btnMul = new JButton("*");
		btnInit = new JButton("C");
		btnRes = new JButton("=");
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
		
		ClickAfterButton();
		
		startP.add(numbers);
		
		
		
		// 기존 패널에 startPanel 추가
		getContentPane().add(startP);
		
		setVisible(true);// 화면 창 윈도우에 띄우는 기능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 화면창 닫으면 프로그램 종료
	}
	
	public void InitSetting() {
		firstNum = "";
		secondNum = "";
		resultNum = "";
		firN = 0;
		secN = 0;
		res = 0;
		PMDM = "";
		numbers.setText("0");
	}
	
	
	public void ClickAfterButton() {
		
		
		// 버튼을 누르면 숫자가 입력&저장 
		btnInit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InitSetting();
			}
		});
		
		
		
		btnRes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(firstNum != "" && PMDM != "" && secondNum != "") {
					numbers.setText(secondNum);
					firN = Integer.parseInt(firstNum);
					secN = Integer.parseInt(secondNum);
					switch(PMDM) {
					case "+":
						res = firN + secN;
						break;
					case "-":
						res = firN - secN;
						break;
					case "/":
						res = firN / secN;
						break;
					case "*":
						res = firN * secN;
						break;
					}
					
					resultNum = res + "";
					numbers.setText(resultNum);
				}
					
				//InitSetting();
			}
		});
		
		
		
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PMDM = "+";
				numbers.setText(firstNum);
			}
		});
		
		btnMin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PMDM = "-";
				numbers.setText(firstNum);
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PMDM = "/";
				numbers.setText(firstNum);
			}
		});
		
		btnMul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PMDM = "*";
				numbers.setText(firstNum);
			}
		});
		
		
		
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//firstNum이나 secondNum이 ""이면 아무것도 하지 말아야 함
				if(firstNum != "" && PMDM.equals("")){
					firstNum += "0";
				}else if(secondNum != "" && PMDM != ""){
					secondNum += "0";
				}else {
					;
				}
			}
		});
				
				
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PMDM.equals("")) {
					firstNum += "1";
				}else {
					secondNum += "1";
				}
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PMDM.equals("")) {
					firstNum += "2";
				}else {
					secondNum += "2";
				}
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PMDM.equals("")) {
					firstNum += "3";
				}else {
					secondNum += "3";
				}
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PMDM.equals("")) {
					firstNum += "4";
				}else {
					secondNum += "4";
				}
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PMDM.equals("")) {
					firstNum += "5";
				}else {
					secondNum += "5";
				}
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PMDM.equals("")) {
					firstNum += "6";
				}else {
					secondNum += "6";
				}
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PMDM.equals("")) {
					firstNum += "7";
				}else {
					secondNum += "7";
				}
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PMDM.equals("")) {
					firstNum += "8";
				}else {
					secondNum += "8";
				}
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PMDM.equals("")) {
					firstNum += "9";
				}else {
					secondNum += "9";
				}
			}
		});
		
		
	}
	
	
	
	public static void main(String[] args) {
		//계산기 시작
		new start_cal();
	}
}
