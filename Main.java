//Junhui Park
//December 9, 2024
//AP CSA 7th 
//Upcasting / Downcasting Project - Woodwind Family Introduction Main

package ucdProject;

public class Main {
    public static void main(String[] args) {
        //array of 10
        Woodwind[] woodwinds = new Woodwind[10];

        //title
        System.out.println("******************************");
        System.out.println("WOODWIND FAMILY INTRODUCTION");
        System.out.println("******************************\n");
        
        //Upcasting - assigning child objects to parent class
        //10 of them in woodwinds array
        woodwinds[0] = new Flute();
        woodwinds[1] = new Clarinet();
        woodwinds[2] = new Oboe();
        woodwinds[3] = new Saxophone();
        woodwinds[4] = new Bassoon();  
        woodwinds[5] = new Flute();
        woodwinds[6] = new Clarinet();
        woodwinds[7] = new Oboe();
        woodwinds[8] = new Saxophone();
        woodwinds[9] = new Bassoon();     

        //Downcasting - access child methods
        for (Woodwind woodwind : woodwinds) {
            //method in all child classes
            woodwind.shortDescription();
            
            //downcast as needed 
            if (woodwind instanceof Flute) {
                //instanceof = asking is child on the right a descendant of what's on the left
                //instanceof = downcasting keyword
                Flute flute = (Flute) woodwind; //downcast to flute
                flute.fluteDetails(); //method unique to flute
            } 

            if( woodwind instanceof Clarinet) {
                Clarinet clarinet = (Clarinet) woodwind; //downcast to clarinet
                clarinet.clarinetDetails(); //method unique to clarinet
            } 
            
            if (woodwind instanceof Oboe) {
                Oboe oboe = (Oboe) woodwind; //downcast to oboe
                oboe.oboeDetails(); //method unique to oboe
            } 
            
            if (woodwind instanceof Saxophone) {
                Saxophone saxophone = (Saxophone) woodwind; //downcast to saxophone
                saxophone.saxDetails(); //method unique to saxophone
            } 
            
            if (woodwind instanceof Bassoon) {
                Bassoon bassoon = (Bassoon) woodwind; //downcast to bassoon
                bassoon.bassoonDetails(); //method unique to bassoon
            }
        }
    }
}
