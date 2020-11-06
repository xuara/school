/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.lists;

/**
 *
 * @author M. Kester
 */
public class ArraySortedListTest {

    public static void main(String[] args) {
        ArraySortedList tList1 = new ArraySortedList(5);
        tList1.add(10);
        tList1.add(8);
        tList1.add(55);
        tList1.add(24);
        tList1.add(44);
        System.out.println("Original List 1: \n" + tList1);

        ArraySortedList tList2 = new ArraySortedList(5);
        tList2.add(13);
        tList2.add(5);
        tList2.add(66);
        tList2.add(22);
        tList2.add(42);
        System.out.println("Original List 2: \n" + tList2);

        tList1.merge(tList2);

        System.out.print("Merged List (1 has been merged with 2): \n"
                + tList1);
    }
}
