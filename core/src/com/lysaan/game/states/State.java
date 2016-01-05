package com.lysaan.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by malik on 12/18/15.
 */
public abstract class State {

    protected OrthographicCamera cam ;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();
    }

    protected abstract void handleIput();
    public abstract void update(float dt);
    public abstract void render (SpriteBatch ab);
    public abstract void dispose();

}
