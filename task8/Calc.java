package task8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {

    private JTextField inputArea;

    public Calc() {
        setTitle("Calc v1.0");
        setBounds(100, 100, 300,500);
        setResizable(false);
        setJMenuBar(createMenuBar());

        add(createTopPannel(), BorderLayout.NORTH);
        add(createBottomPannel(),BorderLayout.CENTER);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel createBottomPannel() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 3));

        DigitBtn digitBtn = new DigitBtn(inputArea);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(digitBtn);
            bottom.add(btn);
        }

        JButton clear = new JButton(String.valueOf("C"));
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputArea.setText("");
            }
        });
        bottom.add(clear);

        JButton plus = new JButton(String.valueOf("+"));
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputArea.setText(inputArea.getText() + "+");
            }
        });
        bottom.add(plus);

        JButton calc = new JButton(String.valueOf("="));
        calc.addActionListener(new CalcBtn(inputArea));
        bottom.add(calc);

        return bottom;
    }

    private JPanel createTopPannel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputArea = new JTextField();
        inputArea.setEditable(false);
        top.add(inputArea, BorderLayout.CENTER);

        return top;
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setVisible(true);
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        JMenuItem editItem = new JMenuItem("Edit");
        fileMenu.add(editItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        return menuBar;
    }

}
