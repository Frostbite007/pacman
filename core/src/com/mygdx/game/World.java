package com.mygdx.game;

public class World {
	 private Pacman pacman;
	 private MyPacman myPacman;
	 private Maze maze;
	 private int score;
	 World(MyPacman myPacman) {
		 maze = new Maze();
	     pacman = new Pacman(60,60,this);
	     this.myPacman = myPacman;
	     score =0;
	    }
	 Pacman getPacman() {
	     return pacman;
	 }
	 Maze  getMaze(){
		 return maze;
	 }
	 public void update(float delta){
		 pacman.update();
	 }
	 public int getScore(){
		 return score;
	 }
	 public void increaseScore(){
		 score++;
	 }
}
