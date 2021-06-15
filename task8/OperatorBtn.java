package task8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorBtn extends Btn implements ActionListener {

    public OperatorBtn(CalcState calcState, String name) {
        super(calcState, name);
    }

    protected void push() {
        if (calcState.isWaitSecondOperand()) {
            // Calculating
            String operator = calcState.getOperator();
            switch (operator) {
                case "+" : {
                    calcState.setFirstOperand(
                            calcState.getFirstOperand() + calcState.getSecondOperand()
                    );
                } break;
                case "-" : {
                    calcState.setFirstOperand(
                            calcState.getFirstOperand() - calcState.getSecondOperand()
                    );
                } break;
                case "*" : {
                    calcState.setFirstOperand(
                            calcState.getFirstOperand() * calcState.getSecondOperand()
                    );
                } break;
                case "/" : {
                    calcState.setFirstOperand(
                            calcState.getFirstOperand() / calcState.getSecondOperand()
                    );
                } break;
            }
            calcState.setOperator("");
            calcState.setSecondOperand(0);
        }
        if (name != "=") {
            calcState.setOperator(name);
        }
        else {
            calcState.setOperator("");
        }
        calcState.setWaitState(true);

        super.push();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        push();
    }

}
