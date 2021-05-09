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
public class cuboid {
    int length;
    int base;
    int height;
    String unit;
    public cuboid() {}
    public cuboid(int l, int b, int h) {
        this.length = l;
        this.base = b;
        this.height = h;
    }
    double total_surface_area() {
        double TSA = 2*((length*base)+(base*height)+(height*length));
        return TSA;
    }
    double volume() {
        double V = length*base*height;
        return V;
    }
    void cuboid_details(){
    System.out.println("Choosen shape: cuboid");
            int find1= Integer.parseInt(JOptionPane.showInputDialog("Find the:\n"
                + "(1)Total Surface Area\n"
                + "(2)Volume\nEnter the number of what you want to find: "));
            switch (find1){
                case 1:
                    System.out.println("Find the Total Surface Area");
                break;
                case 2:
                    System.out.println("Find the Volume");
                break;
            }
                    String unit1 = JOptionPane.showInputDialog("Enter units used: ");
                    JOptionPane.showMessageDialog(null,"Entered units is "+unit1);
                    
                    int A1= Integer.parseInt(JOptionPane.showInputDialog("Enter length value: "));
                    JOptionPane.showMessageDialog(null,"Entered length value is "+A1+" "+unit1);
                    System.out.println("length: "+A1+" "+unit1);
                    
                    int B1= Integer.parseInt(JOptionPane.showInputDialog("Enter base value: "));
                    JOptionPane.showMessageDialog(null,"Entered base value is "+B1+" "+unit1);
                    System.out.println("base: "+B1+" "+unit1);
                    
                    int C1= Integer.parseInt(JOptionPane.showInputDialog("Enter height value: "));
                    JOptionPane.showMessageDialog(null,"Entered height value is "+C1+" "+unit1);
                    System.out.println("height: "+C1+" "+unit1);
                    
                    System.out.println("ANSWER:");
            switch (find1){
                case 1:
                    cuboid shape1 = new cuboid(A1,B1,C1);
                    shape1.unit = " sq. " + unit1;
                    shape1.total_surface_area();
                    System.out.print("the total surface area is ");
                    System.out.print(shape1.total_surface_area());
                    System.out.println(shape1.unit);
                    JOptionPane.showMessageDialog(null,"the total surface area is "+shape1.total_surface_area() + shape1.unit);
                break;
                case 2:
                    cuboid shape2 = new cuboid(A1,B1,C1);
                    shape2.unit = " cubic " + unit1;
                    shape2.volume();
                    System.out.print("the volume is ");
                    System.out.print(shape2.volume());
                    System.out.println(shape2.unit);
                    JOptionPane.showMessageDialog(null,"the volume is "+ shape2.volume() + shape2.unit);
            }
    }
}
