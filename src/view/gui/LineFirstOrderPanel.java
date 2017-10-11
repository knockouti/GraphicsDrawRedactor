package view.gui;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.CompletionException;

public class LineFirstOrderPanel implements ModeOperation {
    private JPanel workPanelLineFirst;
    private JPanel debugPanelLineFirst;
    private JTextField textFieldX1;
    private JTextField textFieldY1;
    private JTextField textFieldX2;
    private JTextField textFieldY2;
    private CartesianPanel cartesianPanel;
    private JButton addButtonRun(){
        JButton buttonRun = new JButton("Build");
        return buttonRun;
    }
    @Override
    public JPanel addWorkPanel() {
        workPanelLineFirst = new JPanel();
        cartesianPanel = new CartesianPanel();
        workPanelLineFirst.setSize(new Dimension(1000,500));
        JLabel labelX1 = new JLabel("Input X1");
        JLabel labelY1 = new JLabel("Input Y1");
        JLabel labelX2 = new JLabel("Input X2");
        JLabel labelY2 = new JLabel("Input Y2");
        textFieldX1 = new JTextField();
        textFieldY1 = new JTextField();
        textFieldX2 = new JTextField();
        textFieldY2 = new JTextField();
        textFieldX1.setPreferredSize(new Dimension(100, 30));
        textFieldY1.setPreferredSize(new Dimension(100, 30));
        textFieldX2.setPreferredSize(new Dimension(100, 30));
        textFieldY2.setPreferredSize(new Dimension(100, 30));
        JPanel panelInput = new JPanel();
        panelInput.setLayout(new FlowLayout());
        panelInput.add(labelX1);
        panelInput.add(textFieldX1);
        panelInput.add(labelY1);
        panelInput.add(textFieldY1);
        panelInput.add(labelX2);
        panelInput.add(textFieldX2);
        panelInput.add(labelY2);
        panelInput.add(textFieldY2);
        workPanelLineFirst.add(panelInput, BorderLayout.PAGE_START);
        workPanelLineFirst.add(addButtonRun());
        workPanelLineFirst.repaint();


        return workPanelLineFirst;
    }

    @Override
    public JPanel addDebugPanel() {
        debugPanelLineFirst = new JPanel();
        debugPanelLineFirst.setBackground(Color.RED);
        debugPanelLineFirst.setLayout(new BorderLayout());
        return debugPanelLineFirst;
    }

    @Override
    public String checkUserInput() {
        String returnMessage = new String();
        String revertingMessage = new String();
        return returnMessage;

    }

    @Override
    public JPanel getWorkPanel() {
        return workPanelLineFirst;
    }

    @Override
    public JPanel getDebugPanel() {
        return debugPanelLineFirst;
    }

    @Override
    public void buildLine() {

    }

    public String checkTextField(JTextField textField) {
        String outString = new String();
        if (Integer.valueOf(textFieldX1.getText()) > 10)
            outString = "The value is more than 10";
        if (Integer.valueOf(textFieldX1.getText()) < 10)
            outString = "The value must be positive";
        return outString;
    }

}
