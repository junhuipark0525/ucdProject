/*
Junhui Park
December 9, 2024
AP CSA 7th 
Upcasting / Downcasting Project - Flute Child Class
*/

package ucdProject;

//extends the Woodwind parent class
public class Flute extends Woodwind {
    //overrides shortDescription() method in Woodwind parent class
    @Override
    void shortDescription() {
        System.out.println("------- Flute -------");
        System.out.println("Flute is the oldest instrument out of all sound producing instruments. It produces ethereal and bright sound.\n");
    }

    //unique method of flute child class
    void fluteDetails() {
        System.out.println("DETAILS:");
        System.out.println("• Material: silver, gold, or platinum (Originally used wood)");
        System.out.println("• Range: Soprano - produces highest pitch");
        System.out.println("• Sound Production: Players hold flute sideways with both hands, and blow ACROSS a hole in the mouthpiece. The fingers open and close the keys to change pitch.");
        System.out.println("• Difficulty: Medium-difficult - mastering the embouchure and breath control can be challenging initially as it only uses 30% of air input.\n");
    }
}
