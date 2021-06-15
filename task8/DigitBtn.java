package task8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitBtn extends Btn implements ActionListener {

    public DigitBtn(CalcState calcState, String name) {
        super(calcState, name);
    }

    protected void push() {
        double operand;
        if (!calcState.isWaitSecondOperand()) {
            operand = calcState.getFirstOperand();
        }
        else {
            operand = calcState.getSecondOperand();
        }

        if (operand == 0) {
            operand = Integer.valueOf(name);
        }
        else {
            if (calcState.isWaitDecimalPart()) {
                if (Math.round(operand) < operand) {
                    operand = Double.valueOf(String.valueOf(operand) + name);
                }
                else {
                    operand = Math.round(operand) + 0.1*Integer.parseInt(name);
                }
            }
            else {
                operand = Double.valueOf(String.valueOf(Integer.valueOf(String.valueOf(Math.round(operand)))) + name);
            }
        }

        if (!calcState.isWaitSecondOperand()) {
            calcState.setFirstOperand(Double.valueOf(operand));
        }
        else{
            calcState.setSecondOperand(Double.valueOf(operand));
        }

        super.push();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        push();
    }

}
