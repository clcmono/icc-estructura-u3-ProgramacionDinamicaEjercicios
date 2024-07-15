package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
public class EjercicioUno {

    public List<List<Integer>> subsets (List<Integer> set) {
        //crear el arreglo org. q
        List<List<Integer>> arreglo = new ArrayList<>();
        arreglo.add(new ArrayList<>()); //agrega el conjunto vacio (los que dividen los subconjuntos)  
        for (Integer num : set){ //for que recorre los numeros para crear los subconjuntos
            List<List<Integer>> subconjuntos = new ArrayList<>();
            for(List<Integer> subconjunto : arreglo){ // recorre de nuevo los subconjuntos
                List<Integer> nuevoSub = new ArrayList<>(subconjunto);
                //agrega el numero y el nuevo subconjunto
                nuevoSub.add(num);
                subconjuntos.add(nuevoSub);
            }
            //se agregan todo los subconjuntos al arreglo org.
            arreglo.addAll(subconjuntos);
        }
        return arreglo;
    }
}
