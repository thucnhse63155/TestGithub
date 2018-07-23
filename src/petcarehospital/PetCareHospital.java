/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petcarehospital;

import data.Cabinet;
import thuc.util.MyToys;

/**
 *
 * @author MY_PC
 */
public class PetCareHospital {

    public static void main(String[] args) {
        Cabinet c1 = new Cabinet();
        String tID;
        int choice;
        c1.addFuction("1. Add new document");
        c1.addFuction("2. Search document by Pet's ID");
        c1.addFuction("3. Update a document by Pet's ID");
        c1.addFuction("4. Remove a pet");
        c1.addFuction("5. Print by ID asc");
        c1.addFuction("6. Print by name asc");
        c1.addFuction("7. Print by weight asc");
        c1.addFuction("8. Quit");
        do {
            System.out.println("");
            c1.printFuction();
            System.out.println("");
            choice = MyToys.getAnIntegerInRange(1, 8);
            switch (choice) {
                case 1:
                    c1.addPet();
                    System.out.println("Pet details ");
                    break;
                case 2:
                    tID = MyToys.getID("Input the Dog's ID that you want to search");
                    c1.search(tID);
                    break;
                case 3:
                    tID = MyToys.getID("Input the Dog's ID that you want to update");
                    c1.upDate(tID);
                    System.out.println("Pet details after update ");
                    c1.showDetailed();
                    break;
                case 4:
                    String idRemove = MyToys.getID("Input a Dog's ID that you want to remove");
                    c1.remove(idRemove);
                    System.out.println("Pet details after remove ");
                    c1.showDetailed();
                    break;
                case 5:
                    System.out.println("Pet list");
                    System.out.println("|TYPE| ID  |    Name       | YOB| Weight");
                    c1.showDetailed();
                    break;
                case 6:
                    System.out.println("Pet list ");
                    System.out.println("|TYPE   |ID    |Name            |YOB    |Weight");
                    c1.nameASC();
                    break;
                case 7:
                    System.out.println("Pet list ");
                    System.out.println("|TYPE   |ID    |Name            |YOB    |Weight");
                    c1.weightASC();
                    break;
                case 8:
                    c1.searchByName();
                    break;
                case 9:
                    System.out.println("Good Bye !!");
                    break;
                default:
                    System.out.println("You must choice in [1...8]");
                    break;
            }

        } while (choice != 9);

    }

}
