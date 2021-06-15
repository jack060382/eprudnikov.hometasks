package task8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Btn {

    protected CalcState calcState;

    protected String name;

    public Btn(CalcState calcState, String name) {
        this.name = name;
        this.calcState = calcState;
    }

    protected void pushBtn() {
        calcState.getTextArea().setText(calcState.toString());
    }

}
