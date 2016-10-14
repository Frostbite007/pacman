package com.mygdx.game;

public class World {
	 private Pacman pacman;
	 private MyPacman myPacman;
	 private Maze maze;
	 
	 World(MyPacman myPacman) {
		 this.myPacman = myPacman;
	     pacman = new Pacman(60,60);
	     maze = new Maze();
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
