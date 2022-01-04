import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class flowerGarden 
{
    public static void main(String[] args)
    {
        System.out.println("Time to plan your garden!");
        
        //creates scanners to process terminal input
        Scanner sc = new Scanner(System.in);
 
        //asks user for choice 1:flower type input
        System.out.println("What flowers do you want to plant? tulips, calla lilies, or hydrangeas?");
        //scans for flower input
        String choiceOneInput = sc.nextLine();
        
        //if for choices - tulips
        if (choiceOneInput.equals("tulips"))
            {
            //asks for the first tulip path option
            System.out.println("Would you like to put deer spray on your plants? Type yes or no");
            //scans for deer spray input
            String tOneInput = sc.nextLine();
            //if for deer spray
                if (tOneInput.equals("yes"))
                {
                System.out.println("Your flowers live a long, healthy, but stinky life.");
                System.out.println("This is the end of your garden planning, congratulations!");
                }
                else if (tOneInput.equals("no"))
                {
                System.out.println("Your flowers are all eaten by the deer.");
                System.out.println("This is the end of your garden planning, please try again.");
                }
                // if yes or no not entered
                else 
                {
                System.out.println("That is an invalid response, start over");
                }
            }
            
            

            
        // if for choices - calla lilies
        if (choiceOneInput.equals("calla lilies"))
            {
                //asks for the first calla lilies path option
                System.out.println("Do you want to plant seeds or bulbs? Type bulbs or seeds");
                //scans for seeds/bulbs input
                String cLOneInput = sc.nextLine();
                    //if for seeds & bulbs
                    if (cLOneInput.equals("bulbs"))
                    {
                    System.out.println("Your plants grow and are beautiful.");
                    System.out.println("This is the end of your garden planning, congratulations!");
                    }
                    else if (cLOneInput.equals("seeds"))
                    {
                    System.out.println("Your plants don't grow the first year.");
                    //new choice to try to grow sucessfully
                    System.out.println("Would you like to leave the seeds or plant bulbs? Type seeds or bulbs");
                    //scan for seed pathway input
                    String cLTwoInput = sc.nextLine();
                        if (cLTwoInput.equals("seeds"))
                        {
                        System.out.println("Your calla lilies still don't grow.");
                        System.out.println("This is the end of your garden planning, please try again.");
                        }
                        else if (cLTwoInput.equals("bulbs"))
                        {
                        System.out.println("Your plants grow and are beautiful.");
                        System.out.println("This is the end of your garden planning, congratulations!");
                        }
                        // if seeds or bulbs not typed
                        else
                        {
                        System.out.println("That is an invalid response, start over");
                        }
                    }      
            }
        // if for choices - hydrangeas
        if (choiceOneInput.equals("hydrangeas"))
            {
                //asks for the first hydrangea path option
                System.out.println("Do you want to dry the flowers? Type yes or no");
                //scans for dry/don't input
                String hOneInput = sc.nextLine();
                if (hOneInput.equals("yes"))
                {
                System.out.println("After growing successfully, your flowers are immmortalized in a vase inside your house, you recieve many compliments.");
                System.out.println("This is the end of your garden planning, congratulations!");
                }
                else if (hOneInput.equals("no"))
                {
                System.out.println("After growing successfully, your flowers live a short life and die.");
                System.out.println("This is the end of your garden planning, congratulations!");
                }
                // if yes/no not entered
                else 
                {
                System.out.println("That is an invalid response, start over");
                }
            }
    } 
}
