package com.almasb.fxglgames.tanks.components;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.dsl.components.view.ChildViewComponent;

import static com.almasb.fxgl.dsl.FXGL.*;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class PlayerArrowViewComponent extends ChildViewComponent {

    public PlayerArrowViewComponent() {
        super(26, -10, false);

        var arrow = texture("ui_arrow.png", 32, 32);

        getViewRoot().getChildren().addAll(arrow);
    }
}