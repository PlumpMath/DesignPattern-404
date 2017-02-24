package com.mali.pattern.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-24
 *  Time:    下午4:22
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ImageProxy implements Icon {
//    private ImageIcon imageIcon;
//    private URL imageUrl;
//    private Thread getImageThread;
//    private boolean gettingImageFlag = false;
//
//    public ImageProxy (URL imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    @Override
//    public void paintIcon (Component c, Graphics g, int x, int y) {
//        if (imageIcon == null) {
//            g.drawString("加载中...", x + 300, y + 200);
//            System.out.println("加载中....");
//            if (!gettingImageFlag) {
//                gettingImageFlag = true;
//                final Component cc = c;
//                getImageThread = new Thread(new Runnable() {
//                    @Override
//                    public void run () {
//                        imageIcon = new ImageIcon(imageUrl);
//                        cc.repaint();
//                    }
//                });
//                getImageThread.start();
//            }
//        } else {
//            imageIcon.paintIcon(c, g, x, y);
//        }
//    }
//
//    @Override
//    public int getIconWidth () {
//        if (imageIcon == null) {
//            return 300;
//        } else {
//            return imageIcon.getIconWidth();
//        }
//    }
//
//    @Override
//    public int getIconHeight () {
//        if (imageIcon == null) {
//            return 300;
//        } else {
//            return imageIcon.getIconHeight();
//        }
//    }
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) { imageURL = url; }

    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    public void paintIcon(final Component c, Graphics  g, int x,  int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("正在加载中...", x+300, y+190);
            if (!retrieving) {
                retrieving = true;

                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(600);
                            imageIcon = new ImageIcon(imageURL, "CD Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

}
