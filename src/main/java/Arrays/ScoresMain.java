package Arrays;

public class ScoresMain {
    public static void main(String[] args) {
        ScoresMain scoresMain = new ScoresMain();
        int[] result = scoresMain.calculateScores("BBCACCBB");

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }



    public int[] calculateScores(String initials){
        int[] score = new int[3];
        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;

        if(initials == null || initials.isBlank()){
            throw new IllegalArgumentException("Initials cannot be empty");
        }else{
            for(int i=0; i<=initials.length()-1; i++){
                if(initials.toUpperCase().charAt(i)=='A'){
                    scoreA++;
                }
                else if(initials.toUpperCase().charAt(i)=='B'){
                    scoreB++;
                }
                else if(initials.toUpperCase().charAt(i)=='C'){
                    scoreC++;
                }
                else {
                    throw new IllegalArgumentException("Initials must be A, B or C");
                }
            }
        }
        score[0] = scoreA;
        score[1] = scoreB;
        score[2] = scoreC;
        return score;
    }


}
