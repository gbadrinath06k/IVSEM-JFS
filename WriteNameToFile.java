package Sem04;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class WriteNameToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        try{
            FileWriter writer=new FileWriter("studentName.txt");
            writer.write(name);
            writer.close();
            System.out.println("Name written successfully");
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
