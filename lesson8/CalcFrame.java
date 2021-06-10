package lesson8;

import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame {
    public CalcFrame() {
        setTitle("Calculator");

        setBounds(100, 100 , 300, 500);
        //setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setJMenuBar(createMenuBar());

        setLayout(new BorderLayout());




        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(4,3));
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            bottom.add(btn, BorderLayout.CENTER);
        }

        setVisible(true);
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextField input_area = new JTextField();
        input_area.setEditable(false);
        top.add(input_area, BorderLayout.NORTH);

        return top;
    }

    private JMenuBar createMenuBar() {
        JMenuBar menu_bar = new JMenuBar();
        JMenu file_menu = new JMenu();
        file_menu.setName("File");

        JMenuItem open_item = new JMenuItem("Open");
        file_menu.add(open_item);

        JMenuItem exit_item = new JMenuItem("Exit");
        file_menu.add(exit_item);

        menu_bar.add(file_menu);

        return menu_bar;
    }
}
