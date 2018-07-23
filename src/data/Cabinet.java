/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.*;
import thuc.util.MyToys;

public class Cabinet {

    private List<String> document = new ArrayList();
    private Map<String, Pet> listPet = new TreeMap();

    public void addFuction(String function) {
        document.add(function);
    }

    public void addPet() {
        String id, name;
        int yob;
        double weight;
        boolean idExistance; // lưu trạng thái tồn tại của id
        int choice = 0;
            System.out.println("Input the type of pet");
            System.out.println("1 . Dog");
            System.out.println("2 . Cat");
            try {
                choice = MyToys.getAnIntegerInRange(1, 2);
                switch (choice) {
                    case 1:
                        System.out.println("Input Dog's details");
                        do {
                            id = MyToys.getID("Input an ID");
                            idExistance = listPet.containsKey(id);
                            if (idExistance) {
                                System.out.println("Sorry, Dupplicate ID, Input another ID");
                            }
                        } while (idExistance);
                        name = MyToys.getName("Input a Dog's name : ");
                        yob = MyToys.getYOB("Input a Dog's YOB : ");
                        weight = MyToys.getWeight("Input Dog's weight : ");
                        listPet.put(id, new Dog(name, yob, weight, id));
                        System.out.println("Add sucessfully");
                        break;
                    case 2:
                         System.out.println("Input Cat's details");
                        do {
                            id = MyToys.getID("Input an ID");
                            idExistance = listPet.containsKey(id);
                            if (idExistance) {
                                System.out.println("Sorry, Dupplicate ID, Input another ID");
                            }
                        } while (idExistance);
                        name = MyToys.getName("Input a Cat's name : ");
                        yob = MyToys.getYOB("Input a Cat's YOB : ");
                        weight = MyToys.getWeight("Input Cat's weight : ");
                        listPet.put(id, new Cat(name, yob, weight, id));
                        System.out.println("Add sucessfully");
                        break;

                }
            } catch (Exception e) {
                System.out.println("Your choice is invalid !! Choice in [1...2]");
            }

    }

    public void printFuction() {
        if (document.isEmpty()) {
            System.out.println("The function is empty . Nothing to choose");
            return;
        }
        for (String x : document) {
            System.out.println(x);
        }
    }

    public void showDetailed() {
        if (listPet.isEmpty()) {
            System.out.println("The document is empty . Nothing to show");
            return;
        }
        for (Pet x : listPet.values()) {
            x.showDetailed();
        }
    }

    public void search(String s) {
        Pet tempt = listPet.get(s);
        if (listPet.isEmpty()) {
            System.out.println("Ths list is empty");
        } else if (tempt == null) {
            System.out.println("Not found");
        } else {
            System.out.println("The Details of ID : " + s);
            listPet.get(s).showDetailed();
        }
    }

 

    public void upDate(String s) {
        Pet tempt = listPet.get(s);
        int choice;
        if (listPet.isEmpty()) {
            System.out.println("Ths list is empty");
        } else if (tempt == null) {
            System.out.println("Not found");
        } else {
            System.out.println("The Dog's ID details :");
            tempt.showDetailed();
            System.out.println("Which detail that you want to update ? ");
            do {
                System.out.println("1. Update name");
                System.out.println("2. Update YOB");
                System.out.println("3. Update weight");
                System.out.println("4. Finish update");
                System.out.println("");
                choice = MyToys.getAnIntegerInRange(1, 4);
                switch (choice) {
                    case 1:
                        String name;
                        name = MyToys.getName("Input a new Dog's name");
                        tempt.setName(name);
                        break;
                    case 2:
                        int yob;
                        yob = MyToys.getYOB("Input a new Dog's YOB");
                        tempt.setYob(yob);
                        break;
                    case 3:
                        double weight;
                        weight = MyToys.getWeight("Input new Dog's weight");
                        tempt.setWeight(weight);
                        break;
                    case 4:
                        System.out.println("Update Sucessfully");
                        break;
                    default:
                        System.out.println("You must choice in [1...4]");
                }
            } while (choice != 4);

        }
    }

    public void weightASC() {
        Comparator canWeight = new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        };
        List<Pet> temptList = new ArrayList(listPet.values());
        Collections.sort(temptList, canWeight);
        for (Pet x : temptList) {
            x.showDetailed();
        }
    }

    public void nameASC() {
        Comparator canName = new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        List<Pet> temptList = new ArrayList(listPet.values());
        Collections.sort(temptList, canName);
        for (Pet x : temptList) {
            x.showDetailed();
        }
    }

    public void searchByName(){
        String name;
        name = MyToys.getName("Input the name that you want to search");
        for (Pet x : listPet.values()) {
            if(x.getName().contains(name)){
                x.showDetailed();
            }
        }
    }

public void searchById(){
        String name;
        name = MyToys.getName("Input the name that you want to search");
        for (Pet x : listPet.values()) {
            if(x.getName().contains(name)){
                x.showDetailed();
            }
        }
    }
}
