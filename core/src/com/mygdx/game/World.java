package com.mygdx.game;

public class World {
	 private Pacman pacman;
	 private MyPacman myPacman;
	 private Maze maze;
	 
	 World(MyPacman myPacman) {
		 maze = new Maze();
	     pacman = new Pacman(60,60,maze);
	     this.myPacman = myPacman;
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
}
