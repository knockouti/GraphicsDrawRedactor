package view.gui;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {
    private JFrame mainFrame;
    private final JTabbedPane tabbedPane;
    private JPanel workPanelLineFirst;
    private JPanel debugPanelLineFirst;
    private Controller controller;

    public MainView() {
        mainFrame = new JFrame("MainWindow");
        tabbedPane = new JTabbedPane();
        mainFrame.setSize(new Dimension(1500, 1000));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void initGUI(Controller controller) {
        this.controller = controller;
        mainFrame.add(tabbedPane, BorderLayout.CENTER);
        mainFrame.add(getToolBar(), BorderLayout.LINE_START);

    }

    private JToolBar getToolBar() {
        JToolBar toolBar = new JToolBar();
        toolBar.setLayout(new BoxLayout(toolBar, BoxLayout.Y_AXIS));
        toolBar.add(addButtonLineFirst());
        return toolBar;
    }

    private JButton addButtonLineFirst() {
        JButton buttonLineFirst = new JButton(new ImageIcon("images\\firstline.png"));
        ModeOperation lineFirstOrderPanel = new LineFirstOrderPanel();
        buttonLineFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(lineFirstOrderPanel.getWorkPanel() == null && lineFirstOrderPanel.getDebugPanel() == null) {
                        tabbedPane.addTab("Work tab", lineFirstOrderPanel.addWorkPanel());
                        tabbedPane.addTab("Debug tab", lineFirstOrderPanel.addDebugPanel());
                    }

                controller.drowLineFirst();
            }
        });
        return buttonLineFirst;
    } private JButton addButtonRun(){
        JButton buttonRun = new JButton("Build");
        return buttonRun;
    }

}
