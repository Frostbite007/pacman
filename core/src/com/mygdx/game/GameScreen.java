package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter{
	private Texture pacmanImg;
	private MyPacman myPacman;
	private Pacman pacman;
	World world;
	public GameScreen(MyPacman myPacman){
		this.myPacman = myPacman;
		pacmanImg = new Texture("pacman.png");
		world = new World(myPacman);
		pacman = world.getPacman();
	}
	 @Override
	 public void render(float delta) {
		 update(delta);
		 Gdx.gl.glClearColor(0, 0, 0, 1);
	     Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	     SpriteBatch batch = myPacman.batch;
	     batch.begin();
		 Vector2 pos = pacman.getPosition();
		 batch.draw(pacmanImg,pos.x,pos.y);
		 batch.end();
	 }
	 public void update(float delta){
		  if(Gdx.input.isKeyPressed(Keys.UP)) {
	            pacman.move(Pacman.DIRECTION_UP);
	      }
		  else if(Gdx.input.isKeyPressed(Keys.DOWN)) {
	            pacman.move(Pacman.DIRECTION_DOWN);
	      }
		  else if(Gdx.input.isKeyPressed(Keys.LEFT)) {
	            pacman.move(Pacman.DIRECTION_LEFT);
	      }
		  else if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
	            pacman.move(Pacman.DIRECTION_RIGHT);
	      }
	 }
}
