package layouts.segundaanimacion.view;

import javax.swing.JFrame;

import layouts.segundaanimacion.model.AnimatedObject;

import java.awt.GridBagLayout;
import java.util.ArrayList;

public class AnimationView extends JFrame {

    // ! Atributos
    private GridBagLayout gridBagLayout;
    private StadisticsPanel stadisticsPanel;
    private ControlPanel controlPanel;
    private Viewer viewer;

    public void refesh(ArrayList<AnimatedObject> animatedObjects) {

    }

}
