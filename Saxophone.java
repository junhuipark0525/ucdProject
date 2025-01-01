/*
Junhui Park
December 9, 2024
AP CSA 7th 
Upcasting / Downcasting Project - Saxophone Child Class
*/

package ucdProject;

//extends the Woodwind parent class
public class Saxophone extends Woodwind {
    //overrides shortDescription() method in Woodwind parent class
    @Override
    void shortDescription() {
        System.out.println("------- Saxophone -------");
        System.out.println("Saxophone is prominent in jazz and contemporary music. It's a relatively young instrument, first invented in 1840s.\n");
    }

    //unique method of saxophone child class
    void saxDetails() {
        System.out.println("DETAILS:");
        System.out.println("• Material: Typically made of brass with a lacquer or silver plating");
        System.out.println("• Range: Soprano / Alto / Tenor / Bass - Each has unique places in ensembles. However, it's not a part of orchestra.");
        System.out.println("• Sound Production: Similar to clarinet, players hold it upright and blow through a single reed attached to the mouthpiece.");
        System.out.println("• Difficulty: Medium - relatively beginner-friendly due to its ergonomic design.\n");
    }
}
