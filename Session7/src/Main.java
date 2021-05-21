import Session7.gui.CFrame;
import javax.swing.*;

/**
 * A class to drive program.
 *
 * @author Ali Tabesh
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        CFrame frame = new CFrame("Note App");
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
