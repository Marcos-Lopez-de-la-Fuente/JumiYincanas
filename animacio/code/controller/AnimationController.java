package animacio.code.controller;

import java.util.ArrayList;

import animacio.code.model.AnimatedObject;
import animacio.code.model.AnimationModel;
import animacio.code.view.AnimationView;

public class AnimationController {

    // ! Attributes
    private AnimationView animationView;
    private AnimationModel animationModel;

    // ! Constructor
    public AnimationController(AnimationView animationView, AnimationModel animationModel) {
        this.setAnimationView(animationView);
        this.setAnimationModel(animationModel);
    }

    // ! Methods
    public ArrayList<AnimatedObject> getObjects() {
        return new ArrayList<AnimatedObject>();
    }

    public int[][] getStatistics() {
        return new int[0][0];
    }

    public Status getAnimationStatus() {
        return new Status();
    }

    public void pause() {
    }

    public void play() {
    }

    // ! Getters and Setters
    /**
     * @return the animationView
     */
    public AnimationView getAnimationView() {
        return animationView;
    }

    /**
     * @param animationView the animationView to set
     */
    public void setAnimationView(AnimationView animationView) {
        this.animationView = animationView;
    }

    /**
     * @return the animationModel
     */
    public AnimationModel getAnimationModel() {
        return animationModel;
    }

    /**
     * @param animationModel the animationModel to set
     */
    public void setAnimationModel(AnimationModel animationModel) {
        this.animationModel = animationModel;
    }

}
