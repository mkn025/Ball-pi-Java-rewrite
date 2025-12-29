  
package ballPi.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainView extends JFrame{

    private final int width;
    private final int height;
    private final ColorTheme colorTheme;
    private final JPanel mainPanel;

    /**
     * konstukørr som legger til nødvedinge ting i main framet
     * 
     * @param width
     * @param height
     */
    public MainView(int width, int height) {
        this.width = width;
        this.height = height;
        colorTheme = new ColorTheme();
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(colorTheme.getBackgroundColor());
        setupFrame();
    }
    /**
     * legge main kompoenener og forteller hvilken layout vi skal ha
     */
    private void setupFrame() {

        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
                
        setTitle("BALL PI");
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

