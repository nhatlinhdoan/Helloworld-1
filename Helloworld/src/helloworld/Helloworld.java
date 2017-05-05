

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author DungTran
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Helloworld");
        System.out.println("Test commit 1");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String tmp = "18/3/2017";
        Date date = sdf.parse(tmp);
        System.out.println(date);
        System.out.println(date);
    }
    
}
