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
public class cube {
    int side_length;
    String unit;
    public cube() {}
    public cube(int a) {
        this.side_length = a;
    }
    double total_surface_area() {
        double TSA = 6*(side_length*side_length);
        return TSA;
    }
    double volume() {
        double V = side_length*side_length*side_length;
        return V;
    }
    void cube_details(){
    System.out.println("Choosen shape: cube");
            int find2= Integer.parseInt(JOptionPane.showInputDialog("Find the:\n"
                + "(1)Total Surface Area\n"
                + "(2)Volume\nEnter the number of what you want to find: "));
            switch (find2){
                case 1:
                    System.out.println("Find the Total Surface Area");
                break;
                case 2:
                    System.out.println("Find the Volume");
                break;
            }
                    String unit2 = JOptionPane.showInputDialog("Enter units used: ");
                    JOptionPane.showMessageDialog(null,"Entered units is "+unit2);
                    int A2= Integer.parseInt(JOptionPane.showInputDialog("Enter side length value: "));
                    JOptionPane.showMessageDialog(null,"Entered sidelength value is "+A2+" "+unit2);
                    System.out.println("side length: "+A2+" "+unit2);
                    System.out.println("ANSWER:");
            switch (find2){
                case 1:
                    cube shape1 = new cube(A2);
                    shape1.unit = " sq. " + unit2;
                    shape1.total_surface_area();
                    System.out.print("the total surface area is ");
                    System.out.print(shape1.total_surface_area());
                    System.out.println(shape1.unit);
                    JOptionPane.showMessageDialog(null,"the total surface area is "+shape1.total_surface_area() + shape1.unit);
                break;
                case 2:
                    cube shape2 = new cube(A2);
                    shape2.unit = " cubic " + unit2;
                    shape2.volume();
                    System.out.print("the volume is ");
                    System.out.print(shape2.volume());
                    System.out.println(shape2.unit);
                    JOptionPane.showMessageDialog(null,"the volume is "+ shape2.volume() + shape2.unit);
                    
                    
            }
    }
}
