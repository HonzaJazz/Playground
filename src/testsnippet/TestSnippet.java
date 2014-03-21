/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsnippet;

/**
 *
 * @author ja004302
 */
public class TestSnippet {

    /**
     * @param args the command line arguments
     */
    
    private int i = 2;
    public int getI(){
        return TestSnippet.this.i;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        byte aNumber = 3;
        if (aNumber >= 0){
            if (aNumber == 0){ 
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
        }
        System.out.println("third string");
    }
}
