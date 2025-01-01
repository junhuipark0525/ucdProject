/*
Junhui Park
December 9, 2024
AP CSA 7th 
Upcasting / Downcasting Project - Clarinet Child Class
*/

package ucdProject;

//extends the Woodwind parent class
public class Clarinet extends Woodwind{
    //overrides shortDescription() method in Woodwind parent class
    @Override
    void shortDescription() {
        System.out.println("------- Clarinet -------");
        System.out.println("Clarinet is a versatile instrument known for its warm and rich tone.\n");
    }

    //unique method of clarinet child class
    void clarinetDetails() {
        System.out.println("DETAILS:");
        System.out.println("• Material: Primarily made of grenadilla wood");
        System.out.println("• Range: Soprano / Alto - Range covers from soprano to alto, depends on part assignment and by music. Has wide range.");
        System.out.println("• Sound Production: Players hold it upright and blow through a single reed attached to the mouthpiece. The fingers cover holes or press keys to change pitch.");
        System.out.println("• Difficulty: Medium - requires skill to master breath control and finger technique.\n");
    }
}
