import com.java.backend.MainModel;
import controller.Controller;
import view.gui.MainView;

public class MainCalss {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        MainModel mainModel = new MainModel();
        Controller controller = new Controller(mainView, mainModel);
        mainView.initGUI(controller);
        mainModel.initModel(controller);

    }
}
