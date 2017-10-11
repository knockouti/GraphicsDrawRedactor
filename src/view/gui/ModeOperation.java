package view.gui;

import javax.swing.*;

public interface ModeOperation {
    public JPanel addWorkPanel();
    public JPanel addDebugPanel();
    public String checkUserInput();
    public JPanel getWorkPanel();
    public JPanel getDebugPanel();
    public void buildLine();

}
