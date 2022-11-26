package display;

import javax.swing.*;
import function.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class search extends JFrame {
    private JButton homeButton;
    private JButton userHomeButton;
    private JButton searchButton;
    private JButton reelsButton;
    private JButton shopButton;
    private JPanel bottom;
    private JButton searching;

//    private JButton homeButton;
//    private JButton searchButton;
//    private JButton reelsButton;
//    private JButton shopButton;


    public search(int session) {
        ImgSetSize home = new ImgSetSize("src/IMG/home.png", 50, 50);
        homeButton.setIcon(home.getImg());

        ImgSetSize search = new ImgSetSize("src/IMG/search.png", 50, 50);
        searchButton.setIcon(search.getImg());

        ImgSetSize reels = new ImgSetSize("src/IMG/reels.png", 50, 50);
        reelsButton.setIcon(reels.getImg());

        ImgSetSize shop = new ImgSetSize("src/IMG/shop.png", 50, 50);
        shopButton.setIcon(shop.getImg());

        ImgSetSize userhome = new ImgSetSize("src/IMG/.png", 50, 50);
        userHomeButton.setIcon(home.getImg());


        //setContentPane(main);
        setSize(850, 1000);
        bottom.setSize(850, 50);
        setBounds(0, 0, 850, 1000);
        setVisible(true);
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFeed a = new mainFeed(session);
                setVisible(false);
                a.setVisible(true);

            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        reelsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reels a = new reels(session);
                setVisible(false);
                a.setVisible(true);

            }
        });
        shopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shop a = new shop(session);
                setVisible(false);
                a.setVisible(true);
            }
        });
        userHomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userFeed a = new userFeed(session);
                setVisible(false);
                a.setVisible(true);
            }
        });
        searching.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchTag a = new searchTag(session);
                setVisible(false);
                a.setVisible(true);
            }
        });

    }
}