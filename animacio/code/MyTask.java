package animacio.code;

import animacio.code.controller.AnimationController;
import animacio.code.model.AnimationModel;
import animacio.code.view.AnimationView;

public class MyTask {

    // ! Attributes
    private AnimationView animationView;
    private AnimationController animationController;
    private AnimationModel animationModel;

    // ! Constructor
    public MyTask(int refreshMillis, int numObjects) {
        this.setAnimationView(refreshMillis, numObjects);
        this.setAnimationModel();
        this.setAnimationController(this.getAnimationView(), this.getAnimationModel());
    }

    // ! Main
    public static void main(String[] args) {
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
    public void setAnimationView(int refreshMillis, int numObjects) {
        this.animationView = new AnimationView(refreshMillis, numObjects);
    }

    /**
     * @return the animationController
     */
    public AnimationController getAnimationController() {
        return animationController;
    }

    /**
     * @param animationController the animationController to set
     */
    public void setAnimationController(AnimationView animationView, AnimationModel animationModel) {
        this.animationController = new AnimationController(animationView, animationModel);
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
    public void setAnimationModel() {
        this.animationModel = new AnimationModel();
    }

}
