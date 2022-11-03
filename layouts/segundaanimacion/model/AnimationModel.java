package layouts.segundaanimacion.model;

import java.util.ArrayList;

public class AnimationModel {

    // ! Atributos
    private ArrayList<AnimatedObject> animatedObjects;

    // ! Constructor
    public AnimationModel() {
        this.setAnimatedObjects(new ArrayList<>());
    }

    // ! Añadir un AnimatedObject al ArrayList
    public void addAnimatedObject(int x, int y) {
        this.getAnimatedObjects().add(new AnimatedObject(x, y));
    }

    // ! Getters y Setters
    /**
     * @return the animatedObjects
     */
    public ArrayList<AnimatedObject> getAnimatedObjects() {
        return animatedObjects;
    }

    /**
     * @param animatedObjects the animatedObjects to set
     */
    public void setAnimatedObjects(ArrayList<AnimatedObject> animatedObjects) {
        this.animatedObjects = animatedObjects;
    }

}
