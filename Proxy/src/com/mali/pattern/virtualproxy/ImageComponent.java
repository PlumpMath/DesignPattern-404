package com.mali.pattern.virtualproxy;

import javax.swing.*;
import java.awt.*;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-24
 *  Time:    下午4:34
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ImageComponent extends JComponent {

    private Icon icon;
    public ImageComponent (Icon icon) {
        this.icon = icon;
    }


    public void setIcon (Icon icon) {
        this.icon = icon;
    }

    //@Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (600 - h) / 2;
        System.out.println("re paint ImageCompoents " + x + " " + y);
        icon.paintIcon(this, g, x, y);
    }
}
