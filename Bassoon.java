/*
Junhui Park
December 9, 2024
AP CSA 7th 
Upcasting / Downcasting Project - Bassoon Child Class
*/

package ucdProject;

//extends the Woodwind parent class
public class Bassoon extends Woodwind{
    //overrides shortDescription() method in Woodwind parent class
    @Override
    void shortDescription() {
        System.out.println("------- Bassoon -------");
        System.out.println("The bassoon is a large double-reed instrument with a rich, deep tone and remarkable versatility.\n");
    }

    //unique method of bassoon child class
    void bassoonDetails() {
        System.out.println("DETAILS:");
        System.out.println("• Material: Traditionally crafted from maple wood, with keywork made of nickel or silver.");
        System.out.println("• Range: Tenor / Bass - depends on the part and music.");
        System.out.println("• Sound Production: Players blow into a double reed attached to a metal crook (bocal). Sound is controlled by pressing keys and adjusting embouchure.");
        System.out.println("• Difficulty: High - requires mastery of finger technique, breath control, and reed-making. Its size can also be challenging for beginners.\n");
    }
}
