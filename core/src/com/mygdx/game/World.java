package com.mygdx.game;

public class World {
	 private Pacman pacman;
	 private MyPacman myPacman;
	 
	 World(MyPacman myPacman) {
		 this.myPacman = myPacman;
	     pacman = new Pacman(100,100);
	    }
	 Pacman getPacman() {
	     return pacman;
	 }
}
