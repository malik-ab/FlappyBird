package com.lysaan.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.lysaan.game.FlappyDemo;

/**
 * Created by malik on 12/18/15.
 */
public class MenuState extends  State{
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        cam.setToOrtho(false, FlappyDemo.WIDTH / 2, FlappyDemo.HEIGHT / 2);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");

    }

    @Override
    public void handleIput() {

        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));

        }

    }

    @Override
    public void update(float dt) {

        handleIput();
    }

    @Override
    public void render(SpriteBatch sb) {

        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(background, 0, 0);
        sb.draw(playBtn, cam.position.x = playBtn.getWidth()/2, cam.position.y);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();

    }
}
