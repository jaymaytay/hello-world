// Jamie Taylor
// CS 3345.003
// Project 3
// Implement binary search tree class with lazy deletion that has TreeNode as nested class in Java.


package Main;

import java.util.Scanner;

/**
 *
 * @author jamietaylor
 */
public class Project_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        BST tree = new BST();
        Scanner input = new Scanner(System.in);
        TreeNode root;
        
        while (true)// ENDLESS LOOP
        {

             // MENU
            System.out.println("\n***************************");
            System.out.println("* Operations on List:       *");
            
            // Inserts element
            System.out.println("* 1. Insert                 *");
            
            // Deletes element
            System.out.println("* 2. Delete                 *");
            
            // Finds max
            System.out.println("* 3. Find Max               *");
            
            // Finds min
            System.out.println("* 4. Find Min               *");
            
            // Returns true if certain element exists and is not "deleted"
            System.out.println("* 5. Contains               *");
            
            // Does inorder tree transversal
            System.out.println("* 6. Inorder Tree Traversal *");
            
            // Get height
            System.out.println("* 7. Height                 *");
            
            // Number of nodes and number of deleted nodes
            System.out.println("* 8. No Of Nodes            *");
            
            System.out.println("*****************************");

            System.out.print("Your Option: ");           
            int menuOp = input.nextInt();
             
            //if menu option is valid
            if(menuOp <= 8 && menuOp >= 1)
            {
                switch (menuOp)
                {
                    case 1:
                        System.out.print("Enter element: ");
                        int insertVal = input.nextInt();

                        tree.insert(insertVal);                                       

                        break;

                    case 2:
                        System.out.print("Enter element: ");
                        int deleteVal = input.nextInt();

                        tree.delete(deleteVal);

                        break;

                    case 3:
                        System.out.print("Max: " + tree.findMax(temp));

                        break;

                    case 4:
                        System.out.print("Min: " + tree.findMax(temp));

                        break;

                    case 5:
                        System.out.print("Enter element: ");
                        int containsVal = input.nextInt();

                        boolean result = tree.contains(containsVal);

                        if (result == true)
                        {
                            System.out.println("Element found");
                        }
                        else if (result == false)
                        {
                            System.out.println("Element not found" );
                        }
                        else
                        {
                            System.out.println("Result error" );
                        }
                        
                        break;

                    case 6:
                        System.out.println("In order tree traversal: ");

                        break;

                    case 7:
                        System.out.print("Height: " + tree.height(null));                           

                        break;

                    case 8:
                        System.out.print("No of nodes:        "  );
                        System.out.print("No of deleted node: " );
                        System.out.println();
                        System.exit(1);
                }
            }  
            
            // Error statment
            else
            {
                System.out.println(menuOp + " is not a valid menu option.");
                System.out.println("Please enter a valid option (1-7)");
            }
        }
    }     
}
