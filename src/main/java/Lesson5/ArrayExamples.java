package Lesson5;

import java.util.*;

public class ArrayExamples {

    public void stringArray() {
        String[] buttons = {"Ok", "Cancel", "login", "Sign up"};
        System.out.println(buttons[2]);
        System.out.println("buttons array length is " + buttons.length);
        buttons[0]="exit";
        System.out.println(buttons[0]);
    }

    public void arrayOpenSize(){
        String[] array = new String[7];
        array[0] = "ok";
        array[1] = "login";
        array[2] = "sign in";
        array[3] = "cancel";
        array[4] = "x";
        System.out.println("length " + array.length);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void intArray() {
        int[] ids = {2,55,1,3,5};
        System.out.println(ids[2]);
        int idsArrayLength = ids.length;
        System.out.println("ids array length is " + idsArrayLength);

        for (int id: ids){
            System.out.println(id);
        }
    }

    public void arrayList(){
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("menu");
        menuItems.add("cart");
        menuItems.add("checkout");
        menuItems.add("pay");

        for (String item: menuItems){
            System.out.println(item);
        }

        System.out.println(menuItems.size());
        System.out.println("item with index 3 is " + menuItems.get(3));

        menuItems.add("cancel"); /*add item at the end of the list*/
        for(int i=0; i<menuItems.size(); i++){
            System.out.println("new list with cancel: " + menuItems.get(i));
        }

        menuItems.remove("menu");
        menuItems.remove(0);
        for (String item: menuItems){
            System.out.println("New array is " + item);
        }

        menuItems.clear();
        System.out.println(menuItems.size());
    }

    public void arrayListSorting(){
        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(50);
        arrayList.add(10086);
        arrayList.add(38);

        Collections.sort(arrayList);
        for (Integer item: arrayList){
            System.out.println("New int array is " + item);
        }
    }

    public void hashMap(){
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("John", "Toronto");
        hashMap.put("Kate", "Vaughan");
        hashMap.put("Ann", "Montreal");

        System.out.println(hashMap);

        System.out.println(hashMap.get("John"));


        hashMap.remove("Ann");
        System.out.println(hashMap.size());
    }

    public void hashSet(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Cucumber");
        hashSet.add("Potato");
        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);
    }

    public void map() {
        Map<Integer, String> parkingLot = new HashMap<Integer, String>();
        for(int i=1; i<=10; i++){
            parkingLot.put(i, "small");
        }
        for(int i=11; i<=20; i++){
            parkingLot.put(i, "compact");
        }
        System.out.println(parkingLot);

        System.out.println(parkingLot.get(15));
        for(int i=1; i<=10; i++){
        parkingLot.remove(i);}
        System.out.println(parkingLot);










    }


}
