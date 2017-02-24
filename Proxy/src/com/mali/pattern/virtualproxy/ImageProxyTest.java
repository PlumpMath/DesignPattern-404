package com.mali.pattern.virtualproxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-24
 *  Time:    下午4:30
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ImageProxyTest {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws Exception {
        ImageProxyTest test = new ImageProxyTest();
    }

    public ImageProxyTest() throws Exception {
        cds.put("amb1","http://imgstbox.voole.com/img/new_img/2016/11/11/2016111118012957351.jpg");
        cds.put("amb2","http://imgstbox.voole.com/img/new_img/2016/11/11/2016111118012957351.jpg");
        cds.put("amb3","http://imgstbox.voole.com/img/new_img/2016/11/11/2016111118012957351.jpg");
        URL initURL = new URL((String) cds.get("amb1"));
        menuBar = new JMenuBar();
        menu = new JMenu("favo");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements();) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent event) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                    System.out.println(getCDUrl(event.getActionCommand()));
                    frame.repaint();
                }
            });
        }
        //

        Icon icon = new ImageProxy(initURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.repaint();

    }

    URL getCDUrl (String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
