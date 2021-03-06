package GUI;

import Main.Window;
import org.newdawn.slick.Image;

import java.util.ArrayList;

public class ScrollDown extends Button {

    ScrollDown(float posX, float posY, Image imgButton, Image imgButton2, Window window) {
        super(posX, posY, imgButton, imgButton2, window);
    }

    @Override
    void onClick() {
        if(window.legacy.generalHeight < 0) {
            window.legacy.generalHeight += 0.7f;
            ArrayList<CheckBox> checkboxes = window.legacy.getCheckBoxes();

            for (CheckBox item : checkboxes) {
                item.setPosY(item.getPosY() + 0.7f);
            }

            window.legacy.setCheckBoxes(checkboxes);
        }
    }

}
