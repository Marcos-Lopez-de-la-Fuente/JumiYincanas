package layouts.segundaanimacion.controller;

import layouts.segundaanimacion.model.AnimatedObject;
import layouts.segundaanimacion.model.AnimationModel;
import layouts.segundaanimacion.view.AnimationView;

public class AnimationController implements Runnable {

    private AnimationModel animationModel;
    private AnimationView animationView;

    public AnimationController(AnimationModel animationModel, AnimationView animationView) {
        this.setAnimationModel(animationModel);
        this.setAnimationView(animationView);
    }

    /*
     * Tendrá que ir contactando con el AnimationModel para decirle al AnimationView
     * que vaya refrescando sus FPS
     * 
     * También, antes de decirle a un objeto que se pinte, mirará si está dentro de
     * las coordenadas de visión
     */
    @Override
    public void run() {

        for (AnimatedObject animatedObject : this.getAnimationModel().getAnimatedObjects()) {

        }
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

}
