// Sailesh Sai Sirigineedi
// DrivePanel class
// 9/27/19
import javax.swing.*;
import java.awt.Graphics;
public class DrivePanel extends JPanel {
    private double[][] list;
    private int[][] coordinates;
    private Auto auto;
    public DrivePanel(double[][] list, Auto auto){
        super();
        this.list = list;
        this.auto = auto;
        this.coordinates = this.getCoordinates();
    }
    public int[][] getCoordinates(){
        int[][] coordinates = new int[list.length][2];
        for(int i =0; i<list.length;i++){
            auto.drive((int)list[i][0],list[i][1],list[i][2]);
            coordinates[i][0] = auto.getX();
            coordinates[i][1] = auto.getY();
        }
        return coordinates;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int height = getHeight();
        for(int i = 0; i < coordinates.length; i++){
            if(i==0){
                g.drawLine(0,height,coordinates[i][0],height - coordinates[i][1]);
                g.drawString("(" + coordinates[i][0] + ", " + coordinates[i][1] + ")",coordinates[i][0] + 10, height-coordinates[i][1]);
            }
            else{
                g.drawLine(coordinates[i-1][0],height - coordinates[i-1][1],coordinates[i][0],height - coordinates[i][1]);
                g.drawString("(" + coordinates[i][0] + ", " + coordinates[i][1] + ")",coordinates[i][0] + 10, height-coordinates[i][1]);
            }
        }
    }
}

