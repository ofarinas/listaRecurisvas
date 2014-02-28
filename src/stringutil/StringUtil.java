/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringutil;

/**
 *
 * @author pcn03
 */
public class StringUtil {

    private static String vocal = "AEIOUaeiou";
    static int count;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(countVocals2("hola mundo oo", 'm'));
    }

    public static int countVocals(String cadena, char character) {
        count = 0;
        if (cadena.equals("")) {
            return 0;
        } else {
            if (cadena.charAt(0) == character) {
                count = 1;
            }
            count += countVocals(cadena.substring(1), character);
        }
        return count;
    }
    public static int countVocals2(String cadena, char character) {
       if(cadena.isEmpty())return 0;
        if (cadena.charAt(0)==character) return countVocals(cadena.substring(1), character)+1;
        else return countVocals(cadena.substring(1), character);
        }
       
}
