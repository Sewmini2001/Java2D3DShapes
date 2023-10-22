import javax.swing.JDialog;
import javax.swing.JColorChooser;
import java.awt.Color;
import java.awt.FlowLayout;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class ShapesGradientColor extends JDialog {
    private Color startColor;
    private Color endColor;

    public ShapesGradientColor() {
        setTitle("Gradient Color Selection");
        setLayout(new FlowLayout());

        startColor = JColorChooser.showDialog(this, "Select Start Color", Color.RED);
        endColor = JColorChooser.showDialog(this, "Select End Color", Color.YELLOW);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setModal(true);
    }

    public Color getStartColor() {
        return startColor;
    }

    public Color getEndColor() {
        return endColor;
    }
}
