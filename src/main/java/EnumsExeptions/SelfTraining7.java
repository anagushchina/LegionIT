package EnumsExeptions;

import java.util.ArrayList;
import java.util.Scanner;

public class SelfTraining7 {

    public ArrayList<String> correctStream(String[] typedWords, String[] correctedWords){
        ArrayList<String> result = new ArrayList<String>();
        try{
            for(int i=0; i<=correctedWords.length-1; i++){
                if (typedWords[i].equalsIgnoreCase(correctedWords[i])){
                result.add("1");
                }
                else {
                    result.add("-1");
                }
            }
        }
        catch (Exception err){
            System.out.println("correctStream: something went wrong");
        }
        return result;
    }


    public String nameShuffle(String name){
        String shuffledName = "";

        if(name==null || name.isBlank()){
            System.out.println("Name cannot be null, empty or blank");
        }
        else {
            Scanner scanner = new Scanner(name);
            for(int i=1; scanner.hasNext(); i++){
                String word = scanner.next();
                shuffledName = word + " " + shuffledName;
            }
        }
        return shuffledName;
    }


    public boolean doubleLetters(String word){
        boolean result = false;
        if(word==null || word.isBlank()){
            System.out.println("Word cannot be null, empty or blanc");
        }
        else{
            for(int i=0; i<word.length()-1; i++){
                String char1 = Character.toString(word.charAt(i));
                String char2 = Character.toString(word.charAt(i+1));
                if(char1.equalsIgnoreCase(char2)){
                    result=true;
                }
            }
        }
        return result;
    }

    public ArrayList<Integer> calculateScores(String points){
        ArrayList<Integer> score = new ArrayList<Integer>();
        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;

        try{
            for(int i=0; i<=points.length()-1; i++){
                if(points.charAt(i)=='A'){
                scoreA++;
                }
                else if(points.charAt(i)=='B'){
                scoreB++;
                }
                else if(points.charAt(i)=='C'){
                scoreC++;
                }
            }
        }
        catch (Exception err){
            System.out.println("Something went wrong");
        }
        score.add(scoreA);
        score.add(scoreB);
        score.add(scoreC);
        return score;
    }
}
