package controller;

import com.java.backend.MainModel;
import view.gui.MainView;

public class Controller implements ControllerInterface {
    private MainModel mainModel;
    private MainView mainView;
    public Controller(MainView mainView, MainModel mainModel){
        this.mainModel = mainModel;
        this.mainView = mainView;
    }

    @Override
    public void drowLineFirst() {

    }
}
