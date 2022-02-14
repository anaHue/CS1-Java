
/**
 * Exercices pour la mission 4
 * 
 * @author O. Bonaventure
 * @version 2016
 */

/*
 * vérificateur de mot de passe, un mot de passe doit au moins contenir 8 caractères, un chiffre, une lettre majuscule, une lettre minuscule, cfr classe Character pour les méthodes permettant de détecter si un caractère est d’un type donné
 */
package src;

public class Correction
{
    /*
     * @pre s!=null
     * @post retourne true uniquement si la chaine de caractères
     *       s est un mot de passe valide, c-a-d qu'elle 
     *       contient au moins 8 caractères, au moins une lettre
     *       minuscule, un chiffre et une lettre majuscule
     *       
     */
    // Il y a des méthodes dans la classe Character 
    // qui devraient vous aider à vérifier qu'un caractère est ...
    // https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
    public static boolean motDePasseValide(String s) {
     boolean chiffre=false;
     boolean min=false;
     boolean maj=false;
     if(s.length()<8) {
         return false;
     }
     for(int i=0; i< s.length(); i++) {
      if(Character.isDigit(s.charAt(i))) {
          chiffre=true;
      }
      if(Character.isLowerCase(s.charAt(i))) {
          min=true;
      }
      if(Character.isUpperCase(s.charAt(i))) {
          maj=true;
      }
     }
     return (chiffre && min && maj);
    }
    
}
