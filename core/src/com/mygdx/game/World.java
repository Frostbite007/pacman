package com.mygdx.game;

public class World {
	 private Pacman pacman;
	 private MyPacman myPacman;
	 private Maze maze;
	 
	 World(MyPacman myPacman) {
		 this.myPacman = myPacman;
	     pacman = new Pacman(100,100);
	     maze = new Maze();
	    }
	 Pacman getPosition() {
	     return pacman;
	 }
	 Maze  getMaze(){
		 return maze;
	 }
	 
}
