/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author mathe
 */
public class Scrollbar {
     public static void apply(JScrollPane scrollPane) {
        JScrollBar scroll = scrollPane.getVerticalScrollBar();
        
        scroll.setPreferredSize(new Dimension(8,0));
        scroll.setUnitIncrement(16);
        scroll.setOpaque(false);

        scroll.setUI(new BasicScrollBarUI() {
            
            //Customize the scrollbar
            private final Color THUMB = new Color(84,184,114);
            private final Color TRACK = new Color(240,240,240,80);
            
            private final Dimension ZERO = new Dimension(0,0);

            @Override
            protected JButton createDecreaseButton(int orientation) {
                return emptyButton();
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return emptyButton();
            }

            private JButton emptyButton() {
                JButton button = new JButton();
                button.setPreferredSize(ZERO);
                button.setMinimumSize(ZERO);
                button.setMaximumSize(ZERO);
                return button;
            }

            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle bounds) {
                Graphics2D g2 = (Graphics2D) g.create();
                
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(THUMB);
                g2.fillRoundRect(bounds.x, bounds.y, bounds.width, bounds.height, 10, 10);

                g2.dispose();
            }

            @Override
            protected void paintTrack(Graphics g, JComponent c, Rectangle bounds) {
                Graphics2D g2 = (Graphics2D) g.create();
                
                g2.setColor(TRACK);
                g2.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
                
                g2.dispose();
            }
        });
    }
}
