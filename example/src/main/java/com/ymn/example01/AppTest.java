package com.ymn.example01;

public class AppTest {

	public static void main(String[] args) {
		
		PlayerRunner player1 =  new PlayerRunner(new Player1("Steven Gerrard","Liverpool","CM"));
		player1.score();
		//System.out.println(player1.toString());
		
		PlayerRunner player2 = new PlayerRunner(new Player2("Frank Lampard","Chelsea","CM"));
		player2.assist();
		
		PlayerRunner player3 = new PlayerRunner(new Player3("Didier Drogba","Chelsea","ST"));
		player3.score();
	}
}
