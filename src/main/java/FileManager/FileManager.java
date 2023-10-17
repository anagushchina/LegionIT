package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        String file = "LegionQA.txt";
        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "the initial text");
        fileManager.readFromFilewithWhile(file);
        fileManager.readFromFileWithFor(file);
        fileManager.deleteFile(file);

        Game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
    }

    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(String fileName, String text){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.append("\ntext2");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error: cannot write to file");
            throw new RuntimeException(e);
        }
    }

    public void readFromFilewithWhile(String fileName){
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFromFileWithFor(String fileName){
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            for(int i = 0; scanner.hasNextLine(); i++){
                String row = scanner.nextLine();
                System.out.println(i);
                System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteFile(String fileName){
        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }
    }





}
