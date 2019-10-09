// Sailesh Sai Sirigineedi
// Assignment 3 class
// 9/27/19

import javax.swing.*;

public class Assignment3 {
    public static void main(String[] args){
        double[][] list;
        Auto auto;
        Engine engine;
        String description = JOptionPane.showInputDialog(null,"Please enter auto's description");
        int fuelTankCapacity = 0;
        int milespergallon = 0;
        int maxSpeed = 0;
        int legsOfTrip =0;
        try{
            while(fuelTankCapacity==0 || fuelTankCapacity < 0){
                fuelTankCapacity = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the fuel tank capacity"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid data entered. Exiting");
            System.exit(0);
        }
        String engineDescription = JOptionPane.showInputDialog(null,"Please enter the engine's description");
        try{
            while(milespergallon==0 || milespergallon < 0){
                milespergallon = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the miles per gallon"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid data entered. Exiting");
            System.exit(0);
        }
        try{
            while(maxSpeed==0 || maxSpeed < 0){
                maxSpeed = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the max speed"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid data entered. Exiting");
            System.exit(0);
        }
        engine = new Engine(engineDescription,milespergallon,maxSpeed);
        auto = new Auto(description,fuelTankCapacity,engine);
        JOptionPane.showMessageDialog(null,auto.getDescription());
        while(legsOfTrip==0 || legsOfTrip < 0){
            legsOfTrip = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of legs of the trip"));
        }
        list = new double[legsOfTrip][3];
        for(int i=0;i<legsOfTrip;i++){
            for(int j=0;j<3;j++){
                switch(j){
                    case 0:
                        try{
                            while(list[i][j]==0 || list[i][j] < 0){
                                list[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the distance for leg " + (i+1) + ":"));
                            }
                            break;
                        }catch (Exception e){
                            JOptionPane.showMessageDialog(null,"Invalid data entered. Exiting");
                            System.exit(0);
                        }
                    case 1:
                        try{
                            list[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the x ratio for leg " + (i+1) + ":"));
                            break;
                        }catch (Exception e){
                            JOptionPane.showMessageDialog(null,"Invalid data entered. Exiting");
                            System.exit(0);
                        }
                    case 2:
                        try{
                            list[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the y ratio for leg " + (i+1) + ":"));
                            break;
                        }catch (Exception e){
                            JOptionPane.showMessageDialog(null,"Invalid data entered. Exiting");
                            System.exit(0);
                        }
                }
            }
        }
        auto.fillUp();
        DrivePanel panel = new DrivePanel(list,auto);
        JFrame application = new JFrame();
        application.add(panel);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(600,600);
        application.setVisible(true);
    }
}

