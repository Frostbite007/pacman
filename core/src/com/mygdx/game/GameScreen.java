package com.mygdx.game;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter{
	private Texture pacmanImg;
	private MyPacman myPacman;
	public GameScreen(MyPacman myPacman){
		this.myPacman = myPacman;
		pacmanImg = new Texture("pacman.png");
	}
	 @Override
	 public void render(float delta) {
	     SpriteBatch batch = myPacman.batch;
	     batch.begin();
	     batch.draw(pacmanImg, 100, 100);
	     batch.end();
	}

}
