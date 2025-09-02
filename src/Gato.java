/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pawparadise1;

/**
 *
 * @author ESTUDIANTES
 */
public class Gato implements Animales {
    @Override
    public void adoptado() {
        System.out.println("El gatito ha sido adoptado, puedes ver nuestro catalogo y ayudar a otro peludito a tener un nuevo hogar");
    }
    @Override
    public void adoptar() {
        System.out.println("El gatito esta muy feliz por conocer su hogar, puedes continuar con el proceso de adopción");
    }
    
    @Override
    public void NecesitaAlimento() {
        System.out.println("El gatito come diariamente 5 libras de croquetas marca xxx, alimento humedo xxx, si quieres ayudarlo puedes donar directamente"
                + "al hogar de paso o economicamente, en donde se te enviaran las facturas de la compra");
    }
    
    @Override
    public void veterinario() {
        System.out.println("El gatito necesita un revision mensual en el veterinario, debido a xxx, si tienes experiencia en esta area y deseas ayudarnos,"
                + "o si quieres economicamente ayudar o con medicina, te estaremos muy agradecidos ");
    }
    
}
