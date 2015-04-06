/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;
import java.io.*;
/**
 *
 * @author Kallie
 */
public class myPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File contacts = new File(File.separatorChar + "Temp" + File.separatorChar 
                        + "contacts.txt");
       
        
        BufferedReader reader = null;
        try{
                int lineCount = 0;
                reader = new BufferedReader(new FileReader(contacts));
                String line = reader.readLine();
                while(line != null){
                if (!"-".equals(line)){
                    lineCount ++;
                    if (lineCount == 1){
                        System.out.print(line + " ");
                        line = reader.readLine();
                    }
                    if (lineCount == 2){
                        System.out.println(line);
                        line = reader.readLine();
                    }
                    if (lineCount == 3){
                        System.out.println(line);
                        line = reader.readLine();
                    }
                    if (lineCount == 4){
                        System.out.print(line + ", ");
                        line = reader.readLine();
                    }
                    if (lineCount == 5){
                        System.out.print(line + " ");
                        line = reader.readLine();
                    }
                    if (lineCount == 6){
                        System.out.print(line + " ");
                        line = reader.readLine();
                    }
                    if (lineCount == 7){
                        System.out.print(line);
                        line = reader.readLine();
                    }
                }
                else{
                    System.out.println();
                    System.out.println();
                    line = reader.readLine();
                    lineCount = 0;
                }
        }
        
    }
        catch(IOException ioe){
            System.out.println("File no workie");
        }
        finally{
            try{
                reader.close();
            }
            catch(Exception e){
                
            }
        }
        
         PrintWriter writer = null;
        try{
        writer = new PrintWriter(new BufferedWriter(new FileWriter(contacts, true)));
        writer.println("-");
        writer.println("Xander");
        writer.println("Newgard");
        writer.println("225 Albert Street");
        writer.println("MoFalls");
        writer.println("WI");
        writer.println("53051");
        writer.close();
        }
        catch(Exception e){
            System.out.println("Well, shit");
        }
        finally{
            try{
                writer.close();
            }
            catch(Exception e2){
                System.out.println("Shit, not again!");
            }
        }
        
    }
    
}
