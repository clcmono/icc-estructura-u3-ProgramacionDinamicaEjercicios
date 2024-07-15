package Ejercicio;
import java.util.ArrayList;
import java.util.List;

/*
 * Dados n pares de paréntesis, implementa un algoritmo para generar todas las combinaciones
 * válidas de paréntesis.
 *
 * Ejemplo 1:
 *  Input:
 *    n: 1
 *  Output:
 *    ["()"]
 *
 * Ejemplo 2:
 *  Input:
 *    n: 3
 *  Output:
 *    ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 * Se debe usar StringBuilder
 */
public class EjercicioDos {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();   // almacenar los resultados
        generateAll(new StringBuilder(), 0, 0, n, result);  // llamar al método e indicar parámetros iniciales
        return result;
    }

    // método para generar las combinaciones
    public void generateAll(StringBuilder current, int open, int close, int max, List<String> result) {
        if (current.length() == max * 2) {  // Caso base: si la longitud actual es igual al doble de max (número de pares * 2)
            result.add(current.toString());  // Añadir la combinación actual a la lista de resultados
            return;
        }
        if (open < max) {   // Si el número de paréntesis abiertos es menor que max, añadir un paréntesis abierto
            current.append('('); // Añadir '(' a la combinación actual
            generateAll(current, open + 1, close, max, result); // Llamada recursiva incrementando el conteo de paréntesis abiertos
            current.deleteCharAt(current.length() - 1); // Retroceso (backtrack): eliminar el último carácter añadido
        }
        if (close < open) {  // Si el número de paréntesis cerrados es menor que el número de paréntesis abiertos
            current.append(')'); // Añadir ')' a la combinación actual
            generateAll(current, open, close + 1, max, result); // Llamada recursiva incrementando el conteo de paréntesis cerrados
            current.deleteCharAt(current.length() - 1); // Retroceso (backtrack): eliminar el último carácter añadido
        }
    }
         

        

     }
