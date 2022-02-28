package A;  
 
import guess.old.game.Game;   //guess.old.game패키지 사용

class Start { //default 접근자 사용   //두번째 클래스
	String user;
	protected Start(String user) {  //protected 접근자 사용
		this.user=user;
	}
	public String toString() {     //JDK에서 제공하는(java.lang 패키지에 있는) String() 사용
		return user+" 여러분 게임을 시작해볼까요";
	}
	
	public static void main(String[] args) {
		Start s1=new Start("사용자");
		System.out.println(s1.toString());
		
		Game game=new Game();
		game.print();
	}
}
