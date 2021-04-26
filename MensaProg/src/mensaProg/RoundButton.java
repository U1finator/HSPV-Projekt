package mensaProg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class RoundButton extends JButton {
    
    private int arc;
    private Color color;
    
    public RoundButton( int arc) {
        this.arc = arc;
        initComponents();
    }
    
    public RoundButton(String text, int arc) {
        super(text);
        this.arc = arc;
        this.color = new Color (229,90,213);
        initComponents();
    }
    
    public RoundButton(int arc, Color color) {
        super();
        this.arc = arc;
        this.color = color;
        initComponents();
    }
    
    public RoundButton(String text, int arc, Color color) {
        super(text);
        this.arc = arc;
        this.color = color;
        initComponents();
    }
    
    private void initComponents() {
     
        final Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width, size.height);
        setPreferredSize(size);
        
        setContentAreaFilled(false);
        setFocusable(false);
    }

/*
 * Methoden aus dem Internet geklaut. Bin ein Rebell.
 */
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setColor(getModel().isArmed() ? color: getBackground());
        g2d.fill(new RoundRectangle2D.Double(0, 0, getWidth()-1, getHeight()-1, arc, arc));
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setColor(getBackground().darker());
        g2d.draw(new RoundRectangle2D.Double(0, 0, getWidth()-1, getHeight()-1, arc, arc));
    }
}
