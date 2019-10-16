import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow() {
        setTitle("скучно що пиз***");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 350);
        setLocation(400, 400);
        add(new GameController());
        setVisible(true);
    }

    public static void main(String[] args) {
        GameWindow gw = new GameWindow();
    }
}
