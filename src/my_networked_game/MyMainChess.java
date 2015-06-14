package my_networked_game;
import java.io.*;
import my_networked_game.gameNet.*;



// ***************************************************
public class MyMainChess extends GameCreator{   
 
  public GameNet_CoreGame createGame()
  {
	  return new MyGame();
  }
  


  public static void main(String[] args) throws IOException 
  {   
  	MyMainChess myMain = new MyMainChess();
  	GameNet_UserInterface myUserInterface = new MyUserInterface();
    
  	myMain.enterGame( myUserInterface); 
  }// end of main
}// end of class
