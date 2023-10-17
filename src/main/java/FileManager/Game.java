package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game){
        switch (game){
            case SOCCER:
                String fileName1="Soccer";
                createFile(fileName1);
                writeInFile(fileName1, "11");
                break;
            case HOCKEY:
                String fileName2="Hockey";
                createFile(fileName2);
                writeInFile(fileName2, "6");
                break;
            case RUGBY:
                String fileName3="Rugby";
                createFile(fileName3);
                writeInFile(fileName3, "15");
                break;
        }
    }

    public static void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeInFile(String fileName, String text){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
