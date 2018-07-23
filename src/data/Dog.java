/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author MY_PC
 */
public class Dog extends Pet {

    public Dog(String name, int yob, double weight, String id) {
        super(name, yob, weight, id);
    }

    @Override
    public void showDetailed() {
        String msg = String.format("|DOG |%5s|%-15s|%4d|%4.1f", id, name, yob, weight);

        System.out.println(msg);
    }

}
