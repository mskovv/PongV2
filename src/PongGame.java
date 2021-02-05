import javax.swing.*;
import java.awt.*;

public class PongGame {
    public static String selection;

    public static void main(String[] args) throws AWTException {
        final JOptionPane jOptionPane = new JOptionPane();

        Object[] selectionList = {"Play vs bot", "Player vs player"};

        selection = (String)JOptionPane.showInputDialog(jOptionPane,
                "Select game mode:\n"
                ,"Choise Dialog",JOptionPane.PLAIN_MESSAGE,
                null,selectionList,"Player vs player");
//        System.out.println(PongGame.selection.equals("Play vs bot"));
        GameFrame frame = new GameFrame();
    }
}