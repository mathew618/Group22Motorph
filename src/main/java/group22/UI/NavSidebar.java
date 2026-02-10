/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.UI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mathe
 */
public class NavSidebar extends JPanel {

    private final JPanel panel;
    private final CardLayout cardLayout;
    private final JPanel tabName;
    private JButton activeButton;
    private static final Color DEFAULT_BG = new Color(205, 255, 255);

    public NavSidebar(JPanel panelName, CardLayout cardLayout, JPanel tabName) {
        this.panel = panelName;
        this.cardLayout = cardLayout;
        this.tabName = tabName;

        panelName.setLayout(new BoxLayout(panelName, BoxLayout.Y_AXIS));
    }

    private JButton createBtn(String text) {
        JButton button = new JButton(text);

        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);

        button.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));

        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        button.setPreferredSize(new Dimension(145, 40));

        return button;
    }

    public void addBtn(String text, String cardName) {
        JButton button = createBtn(text);

        button.setBackground(DEFAULT_BG);

        button.addActionListener(e -> {
            setActive(button);
            cardLayout.show(tabName, cardName);
        });

        panel.add(button);
    }

    public void addLogout(Runnable logOut) {
        panel.add(Box.createVerticalGlue());
        JButton button = createBtn("LOG OUT");

        button.setBackground(new Color(0, 51, 153));
        button.setForeground(new Color(255, 255, 255));

        button.addActionListener(e -> logOut.run());

        panel.add(button);
        
        panel.add(Box.createVerticalStrut(30));
    }

    public void addLabel(String text) {
        JLabel label = new JLabel(text);
        label.setBorder(BorderFactory.createEmptyBorder(10, 5, 8, 5));

        panel.add(label);
    }

    public void reload() {
        panel.revalidate();
        panel.repaint();
    }

    private void setActive(JButton button) {
        if (activeButton != null) {
            activeButton.setBackground(DEFAULT_BG);
        }
        activeButton = button;
        activeButton.setBackground(new Color(200, 220, 255));
    }
}
