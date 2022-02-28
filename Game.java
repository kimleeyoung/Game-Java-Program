package guess.old.game;  

import java.util.Scanner;  //java.util 패키지 사용
public class Game {  //public 접근자 사용  //첫번째 클래스
	int User =0;
	int hint = 0;
	double randomValue = Math.random();   //JDK에서 제공하는(java.lang 패키지에 있는) Math() 사용
	int Com = (int)(randomValue * 100) + 1; 
	
	public void print() {  //public 접근자 사용   //JDK에서 제공하는(java.lang 패키지에 있는) void() 사용
		System.out.println("나이를 맞추는 게임입니다.");
		System.out.println("1세~99세 입력하세요");
		//System.out.println(Com);
		Scanner input = new Scanner(System.in);
		while (true) {
			User = input.nextInt();
			if(User>0 && User<100) {
				
				if(User < Com) {
					System.out.println( User + "살" + "보다  높습니다!" );
					//JDK에서 제공하는(java.lang 패키지에 있는) System() 사용
				}else if(User > Com) {
					System.out.println( User + "살" + "보다  낮습니다!" );
				}else  {
					System.out.println("===== 총 " + hint + "회만에 성공하셨습니다. 축하합니다! =====" );
					break;
				}
				hint++;
				System.out.println("시행횟수는 "+hint+" 회");
			}else {
				System.out.println("입력오류! 1~100 사이 숫자로 다시 입력하세요");
			}
		}
		input.close();
	}
}
	