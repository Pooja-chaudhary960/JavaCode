/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.util.LinkedList;

public class MyList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("1");
        list.addLast("2");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        
    }

}
