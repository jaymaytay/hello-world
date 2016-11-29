/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author jamietaylor
 */
public class TreeNode 
{
    int key; // All keys are in the range 1 to 99
    TreeNode leftChild;
    TreeNode rightChild;
    boolean deleted;
    
    public TreeNode(int value)
    {
        key = value;
        leftChild = null;
        rightChild = null;
        deleted = false;
    }
}
