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
public class Solid_Mensuration_OOP {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int shape = Integer.parseInt(JOptionPane.showInputDialog("Shapes available:\n"
            + "(1) cuboid\n"
            + "(2) cube\n"
            + "(3) right circular cylinder\n"
            + "(4) right circular cone\n"
            + "(5) sphere\n"
            + "Enter the number of your chosen shape"));
    switch (shape){
        case 1:
            cuboid A = new cuboid();
            A.cuboid_details();
        break;
        case 2:
            cube B = new cube();
            B.cube_details();
        break;
        case 3:
            right_circular_cylinder C = new right_circular_cylinder();
            C.right_circular_cylinder_details();
        break;
        case 4:
            right_circular_cone D = new right_circular_cone();
            D.right_circular_cone_details();
        break;
        case 5:
            sphere E = new sphere();
            E.sphere_details();
        break;
    }
    }
}
