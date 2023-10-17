package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SelfTraining5 {
    public static void main(String[] args) {
        SelfTraining5 selfTraining5 = new SelfTraining5();

//        1. Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
        int[] intArray1 = {9,2,55,1,3,52,2,2};
        System.out.println(selfTraining5.has22(intArray1));

//        2. Given an array of ints, return true if the array contains no 1's and no 3's.
        int[] intArray2 = {9,2,55,52,2};
        System.out.println(selfTraining5.lucky13(intArray2));

//        3. Given an array of ints of odd length, look at the first, last, and middle values in the array
//        and return the largest. The array length will be at least 1.
        int[] intArray3 = {1,199,5,7,0,44,333};
        int[] newArray = selfTraining5.maxTriple(intArray3);
//        Option1
        int maxNumber = Arrays.stream(newArray).max().getAsInt();
        System.out.println(maxNumber);
//        Option2
        Arrays.sort(newArray);
        int maxNumber1 = newArray[newArray.length-1];
        System.out.println(maxNumber1);

//        4. Given an array of ints, return true if one of the first 4 elements in the array is a 9.
//        The array length may be less than 4.
        int[] intArray4 = {1, 7, 8, 9};
        System.out.println(selfTraining5.arrayFront9(intArray4));

//        5. Given a list of integers, return a list where each integer is multiplied with itself
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,3,-2,8,0,4));
        System.out.println(selfTraining5.square(arrayList));

    }

    public boolean has22(int[] intArray1) {
        boolean result = false;
        for (int i=0; i<intArray1.length-1; i++){
            if(intArray1[i]==2 && intArray1[i+1]==2){
                result = true;
            }
        }
        return result;
    }

    public boolean lucky13(int[] intArray2) {
        boolean result = true;
        boolean isThereDigit1 = false;
        boolean isThereDigit3 = false;
        for (int i=0; i<=intArray2.length-1; i++){
            if(intArray2[i]==1){
                isThereDigit1 = true;
            }
            if(intArray2[i]==3){
                isThereDigit3 = true;
            }
        }
        if(isThereDigit1==true || isThereDigit3==true){
            result = false;
        }
        return result;
    }

    public int[] maxTriple(int[] intArray3){
        int[] newArray = new int[3];
        int number1 = intArray3[0];
        int number2 = intArray3[(intArray3.length-1)/2];
        int number3 = intArray3[intArray3.length-1];
        newArray[0]=number1;
        newArray[1]=number2;
        newArray[2]=number3;
        return newArray;
    }

    public boolean arrayFront9(int[] intArray4){
        boolean result = false;
        if(intArray4.length-1>=4){
            for(int i=0; i<=4; i++){
                if(intArray4[i]==9){
                    result = true;
                }
            }
        }
        else{
            for(int i=0; i<=intArray4.length-1; i++){
                if(intArray4[i]==9){
                    result = true;
                }
            }
        }
        return result;
    }

    public ArrayList<Integer> square(ArrayList<Integer> arrayList){
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        for(int i=0; i<=arrayList.size()-1; i++){
            newArrayList.add(arrayList.get(i)*arrayList.get(i));
        }
        return newArrayList;
    }


}
