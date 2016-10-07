package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private SpriteBatch batch;
	private MyPacman myPacman;
	private World world;
	private Texture pacmanImg;
	private Pacman pacman;
	public WorldRenderer(MyPacman myPacman, World world) {
        this.myPacman = myPacman;
        batch = myPacman.batch;
        this.world = world;
        pacmanImg = new Texture("pacman.png");
        pacman = world.getPacman();
    }
	 public void render(float delta) {
	     batch.begin();
		 Vector2 pos = pacman.getPosition();
		 batch.draw(pacmanImg,pos.x,pos.y);
		 batch.end();
	 }
}
