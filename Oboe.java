/*
Junhui Park
December 9, 2024
AP CSA 7th 
Upcasting / Downcasting Project - Oboe Child Class
*/

package ucdProject;

//extends the Woodwind parent class
public class Oboe extends Woodwind {
    //overrides shortDescription() method in Woodwind parent class
    @Override
    void shortDescription() {
        System.out.println("------- Oboe -------");
        System.out.println("The oboe is a double-reed instrument known for its clear, expressive, and unique tone, often used to tune orchestras.\n");
    }

    //unique method of oboe child class
    void oboeDetails() {
        System.out.println("DETAILS:");
        System.out.println("• Material: Traditionally made of grenadilla or rosewood");
        System.out.println("• Range: Soprano");
        System.out.println("• Sound Production: Players use a double reed to create sound by blowing air through the small gap between the reeds while holding it upright.");
        System.out.println("• Difficulty: High - requires precision in embouchure and reed-making.\n");
    }
}
