/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.proyectoinicial2209;

/**
 *
 * @author Antonio Olvera
 */
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1=new Empleado(1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Juan Antonio");
        emp1.setApPaterno("Olvera");
        emp1.setApMaterno("Perez");
        emp1.setEdad(56);
        emp1.setCurp("OEPJ021204HMCLRNA7");
        System.out.println("info:"+emp1);
    }
    
}
