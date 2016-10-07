package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter{
	private int x;
	private int y;
	private Texture pacmanImg;
	private MyPacman myPacman;
	public GameScreen(MyPacman myPacman){
		this.myPacman = myPacman;
		pacmanImg = new Texture("pacman.png");
		x=100;
		y=100;
	}
	 @Override
	 public void render(float delta) {
		 update(delta);
		 Gdx.gl.glClearColor(0, 0, 0, 1);
	     Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	     SpriteBatch batch = myPacman.batch;
	     batch.begin();
	     batch.draw(pacmanImg,x,y);
	     batch.end();
	 }
	 public void update(float delta){
		 x += 5;
	 }
}
