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
public class right_circular_cylinder {
    int height;
    int radius;
    String unit;
    public right_circular_cylinder() {}
    public right_circular_cylinder(int h,int r) {
        this.height = h;
        this.radius = r;
    }
    double total_surface_area() {
        double TSA = 2*Math.PI*radius*(radius+height);
        return TSA;
    }
    double volume() {
        double V = Math.PI*radius*radius*height;
        return V;
    }
    void right_circular_cylinder_details(){
    System.out.println("Choosen shape: right circular cone");
            int find3= Integer.parseInt(JOptionPane.showInputDialog("Find the:\n"
                + "(1)Total Surface Area\n"
                + "(2)Volume\nEnter the number of what you want to find: "));
            switch (find3){
                case 1:
                    System.out.println("Find the Total Surface Area");
                break;
                case 2:
                    System.out.println("Find the Volume");
                break;
            }
                    
                    
                    String unit3 = JOptionPane.showInputDialog("Enter units used: ");
                    JOptionPane.showMessageDialog(null,"Entered units is "+unit3);
                    int A3= Integer.parseInt(JOptionPane.showInputDialog("Enter height value: "));
                    JOptionPane.showMessageDialog(null,"Entered height value is "+A3+" "+unit3);
                    System.out.println("height: "+A3+" "+unit3);
                    int B3= Integer.parseInt(JOptionPane.showInputDialog("Enter radius value: "));
                    JOptionPane.showMessageDialog(null,"Entered radius value is "+B3+" "+unit3);
                    System.out.println("radius: "+B3+" "+unit3);
                    System.out.println("ANSWER:");
            switch (find3){
                case 1:
                    right_circular_cylinder shape1 = new right_circular_cylinder(A3,B3);
                    shape1.unit = " sq. " + unit3;
                    shape1.total_surface_area();
                    System.out.print("the total surface area is ");
                    System.out.print(shape1.total_surface_area());
                    System.out.println(shape1.unit);
                    JOptionPane.showMessageDialog(null,"the total surface area is "+shape1.total_surface_area() + shape1.unit);
                break;
                case 2:
                    right_circular_cylinder shape2 = new right_circular_cylinder(A3,B3);
                    shape2.unit = " cubic " + unit3;
                    shape2.volume();
                    System.out.print("the volume is ");
                    System.out.print(shape2.volume());
                    System.out.println(shape2.unit);
                    JOptionPane.showMessageDialog(null,"the volume is "+ shape2.volume() + shape2.unit);
            }
    }
}
