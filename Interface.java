/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
interface AB{
    void show();
    void output();
}
class CD implements AB{
    public void show(){
        System.out.println("Show method");
    }
    public void output()
    {
         System.out.println("Output method");
    }
}
public class Interface {
    public static void main(String[] args)
    {
        CD obj = new CD();
        obj.show();
        obj.output();
    
    }
}
