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
public class right_circular_cone {
    int height;
    int radius;
    int length;
    String unit;
    public right_circular_cone() {}
    public right_circular_cone(int h,int r,int l) {
        this.height = h;
        this.radius = r;
        this.length = l;
    }
    double total_surface_area() {
        double TSA = Math.PI*radius*(radius+length);
        return TSA;
    }
    double volume() {
        double V = (1/3)*Math.PI*radius*radius*height;
        return V;
    }
    void right_circular_cone_details(){
    
            System.out.println("Choosen shape: right circular cylinder");
            int find4= Integer.parseInt(JOptionPane.showInputDialog("Find the:\n"
                + "(1)Total Surface Area\n"
                + "(2)Volume\nEnter the number of what you want to find: "));
            switch (find4){
                case 1:
                    System.out.println("Find the Total Surface Area");
                break;
                case 2:
                    System.out.println("Find the Volume");
                break;
            }
                    String unit4 = JOptionPane.showInputDialog("Enter units used: ");
                    JOptionPane.showMessageDialog(null,"Entered units is "+unit4);
                    int A4= Integer.parseInt(JOptionPane.showInputDialog("Enter height value: "));
                    JOptionPane.showMessageDialog(null,"Entered height value is "+A4+" "+unit4);
                    System.out.println("height: "+A4+" "+unit4);
                    int B4= Integer.parseInt(JOptionPane.showInputDialog("Enter radius value: "));
                    JOptionPane.showMessageDialog(null,"Entered radius value is "+B4+" "+unit4);
                    System.out.println("radius: "+B4+" "+unit4);
                    int C4= Integer.parseInt(JOptionPane.showInputDialog("Enter length value: "));
                    JOptionPane.showMessageDialog(null,"Entered length value is "+C4+" "+unit4);
                    System.out.println("length: "+C4+" "+unit4);
                    System.out.println("ANSWER:");
            switch (find4){
                case 1:
                    right_circular_cone shape1 = new right_circular_cone(A4,B4,C4);
                    shape1.unit = " sq. " + unit4;
                    shape1.total_surface_area();
                    System.out.print("the total surface area is ");
                    System.out.print(shape1.total_surface_area());
                    System.out.println(shape1.unit);
                    JOptionPane.showMessageDialog(null,"the total surface area is "+shape1.total_surface_area() + shape1.unit);
                break;
                case 2:
                    right_circular_cone shape2 = new right_circular_cone(A4,B4,C4);
                    shape2.unit = " cubic " + unit4;
                    shape2.volume();
                    System.out.print("the volume is ");
                    System.out.print(shape2.volume());
                    System.out.println(shape2.unit);
                    JOptionPane.showMessageDialog(null,"the volume is "+ shape2.volume() + shape2.unit);
                    
            }
    }
}
