/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettingmoredatafromafile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
class person{

    String name;
    int age;
    
}

public class GettingMoreDataFromAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        
        Scanner keyboard = new Scanner(System.in);
        
        person[] info = new person[5];
  
        System.out.print("Which file to open: ");
        String input = keyboard.next();
        System.out.println();
        
        Scanner file = new Scanner(new File(input) );
        
        
        
        
        for(int i=0; i<5; i++){
        
            
            info[i] = new person();
            info[i].name = file.next();
            info[i].age = file.nextInt();
        }
        file.close();
        
        for(int j=0; j<5; j++){
        
            System.out.println(info[j].name + " is " + info[j].age + " years old.");
        }
    
        
    
    }
    
}
