package Lesson5;

import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
//        1. Create a method with an array list of days of the week from Sunday to Saturday.
//        The method can receive a number and return/print the day of the week.
        Assignment5 assignment5 = new Assignment5();
        System.out.println(assignment5.getDay(8));

//        2. The online Toys store has 5 different products – Batmobile (ID12), Light Saber(ID45), Wonder Woman (ID6),
//        Hello Kitty Bag(ID201), and Junior QA Analyst Doll (ID56). Each product has its own unique ID.
//        Please create a Method “public String getToyById(int id)” which will build the hashmap of ids/products described
//        above (Hashmap<Integer, String>) and return the name of the toy by ID.
//        - Additional requirement: If there is no product with an id specified in the call, return “No such Toy” String instead. For example,
//        calling getToyById(999) will return and print “No such Toy”.
//        - Optional task: Instead of providing the id, get the user output by using the Scanner.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the Toy ID: ");
//        int id = Integer.parseInt(scanner.next());
        System.out.println(assignment5.getToyById());

//        3. The program should receive an ArrayList of Strings and print all the words with no duplicates.
//      Option1:
        assignment5.printArrayList("Ann", "Odd", "Wee", "Ann", "Lot", "Li", "Oh", "Wee", "Ann", "Li");
//      Option2:
        ArrayList<String> buttons = new ArrayList<String>(Arrays.asList("Ok", "Cancel", "login", "Sign up", "Ok"));
        assignment5.printArrayList1(buttons);


    }

    public String getDay(int day){
        List<String> week = new ArrayList<String>();
        String result="";
        week.add("Sunday");
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        if(day>=1 && day<=7) {
            result = week.get(day - 1);
        }
        else{
            System.out.println("Error: the day value must be between 1 and 7");
        }
        return result;
    }

    public String getToyById(){

        HashMap<Integer,String> toysHashMap = new HashMap<Integer,String>();
        toysHashMap.put(12,"Batmobile");
        toysHashMap.put(45,"Light Saber");
        toysHashMap.put(6,"Wonder Woman");
        toysHashMap.put(201,"Hello Kitty Bag");
        toysHashMap.put(56,"Junior QA Analyst Doll");

        String toyName = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Toy ID: ");
        String enteredText = scanner.next();
        if(enteredText.matches("[0-9]*")){
            int id = Integer.parseInt(enteredText);
            if(toysHashMap.containsKey(id)){
            toyName = toysHashMap.get(id);
            }
            else{
            System.out.println("No such Toy");
            }
        }
        else{
            System.out.println("ID must be an integer");
        }
        return toyName;
    }

    public void printArrayList(String i1,String i2,String i3,String i4,String i5,String i6,String i7,String i8,String i9,String i10){
        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add(i1);
        arrayList.add(i2);
        arrayList.add(i3);
        arrayList.add(i4);
        arrayList.add(i5);
        arrayList.add(i6);
        arrayList.add(i7);
        arrayList.add(i8);
        arrayList.add(i9);
        arrayList.add(i10);

        for (String item: arrayList){
            System.out.print(item + " ");
        }
        System.out.println();
        HashSet<String> hashSet = new HashSet<String>(arrayList);

        System.out.print(hashSet);
        System.out.println();

    }
    public void printArrayList1(ArrayList<String> buttons){

        for (String item: buttons){
            System.out.print(item + " ");
        }
        System.out.println();
        HashSet<String> hashSet = new HashSet<String>(buttons);
        System.out.print(hashSet);
    }
}
