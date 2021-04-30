/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_mensuration_oop;

import javax.swing.JOptionPane;

/**
 *
 * @author Faith
 */
public class sphere {
    int radius;
    String unit;
    public sphere() {}
    public sphere(int r) {
        this.radius = r;
    }
    double total_surface_area() {
        double TSA = 4*Math.PI*radius*radius;
        return TSA;
    }
    double volume() {
        double V = (4/3)*Math.PI*radius*radius*radius;
        return V;
    }
    void sphere_details(){
    System.out.println("Choosen shape: cube");
            int find5= Integer.parseInt(JOptionPane.showInputDialog("Find the:\n"
                + "(1)Total Surface Area\n"
                + "(2)Volume\nEnter the number of what you want to find: "));
            switch (find5){
                case 1:
                    System.out.println("Find the Total Surface Area");
                break;
                case 2:
                    System.out.println("Find the Volume");
                break;
            }
                    String unit5 = JOptionPane.showInputDialog("Enter units used: ");
                    JOptionPane.showMessageDialog(null,"Entered units is "+unit5);
                    int A5= Integer.parseInt(JOptionPane.showInputDialog("Enter radius value: "));
                    JOptionPane.showMessageDialog(null,"Entered radius value is "+A5+" "+unit5);
                    System.out.println("radius: "+A5+" "+unit5);
                    System.out.println("ANSWER:");
            switch (find5){
                case 1:
                    sphere shape1 = new sphere(A5);
                    shape1.unit = " sq. " + unit5;
                    shape1.total_surface_area();
                    System.out.print("the total surface area is ");
                    System.out.print(shape1.total_surface_area());
                    System.out.println(shape1.unit);
                    JOptionPane.showMessageDialog(null,"the total surface area is "+shape1.total_surface_area() + shape1.unit);
                break;
                case 2:
                    sphere shape2 = new sphere(A5);
                    shape2.unit = " cubic " + unit5;
                    shape2.volume();
                    System.out.print("the volume is ");
                    System.out.print(shape2.volume());
                    System.out.println(shape2.unit);
                    JOptionPane.showMessageDialog(null,"the volume is "+ shape2.volume() + shape2.unit);
            }
    }
}
