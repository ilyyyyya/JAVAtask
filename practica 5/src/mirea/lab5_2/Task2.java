package mirea.lab5_2;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;


public class Task2 extends JFrame {

    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String backgroundImage;
    String animationImage = "C:/Users/Илья/Desktop/джава/frames";
    int method;


    Task2()
    {
        super("Some shapes");
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setLocation(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;

        Button but = new Button("Start animation");
        but.setSize(150,90);
        but.setLocation(0,0);
        but.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        method = 1;
                        setTitle("Animation");
                        setSize(WINDOW_WIDTH+1,WINDOW_HEIGHT);
                        setSize(WINDOW_WIDTH-1,WINDOW_HEIGHT);
                    }
                }
        );
        add(but);
    }

    void setBackgroundImage(String path){
        this.backgroundImage = backgroundImage;
    }

    public void setAnimationImage(String animationImage) {
        this.animationImage = animationImage;
    }
    void randomShapes(int shapes,Graphics2D g){
        for(int i =0;i<shapes;i++)
        {
            int choise = (int)(Math.random()*7);

            switch(choise){
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;

                // Rect
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;

                // Line
                /*case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawLine(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * WINDOW_HEIGHT)
                    );
                    break;*/

                // Arc
                case 4:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawArc(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 360),
                            (int) (Math.random() * 360)
                    );
                    break;

                // Rounded rect
                case 5:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;

                // Circle
                case 6:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            100,
                            100
                    );
                    break;

                default:
                    break;
            }
        }
    }




    public void paint(Graphics g2){
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.backgroundImage);
        g.drawImage(img,0,0,WINDOW_WIDTH,WINDOW_HEIGHT,this);

        switch(this.method){
            case 0:
                randomShapes(20,g);
                break;
            case 1:
                animate(this.animationImage,g);
                break;
            default:
                break;
        }

    }
    void animate(String frames_path,Graphics2D g){
        File dir = new File(frames_path);
        for(File file : dir.listFiles()){
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }

    }

    public static void main(String[] args) {
        Task2 app = new Task2();
        if(args.length == 1){
            app.setBackgroundImage(args[0]);
        }
        else if (args.length ==2){
            app.setBackgroundImage(args[0]);
            app.setAnimationImage(args[1]);
        }
        else{
            System.out.println("[!]Background image path is empty");
        }
        //"C:/Users/Илья/Desktop/джава/background"
    }



}
