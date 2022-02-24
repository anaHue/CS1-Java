
/**
 *  Copyright (c)  2016 Ludovic Taffin, 2017 Brandon Naitali
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package src;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;
import java.text.MessageFormat;
import student.Translations.Translator;
import StudentCode.*;

public class Tests{
    public void testLetterH(){
        Random r = new Random();
        int hauteur = ((r.nextInt(4) + 1) * 2) + 1; // génerer un nombre impair pour la hauteur
        int largeur = r.nextInt(10) + 3;
        String result = Correction.lettreH(hauteur, largeur);
        String resultEtudiant = Etudiant.lettreH(hauteur, largeur);
        String form = Translator.translate("Le dessin de la lettre H de hauteur {0} et de largeur {1} donne \n\n{2}\n et votre programme donne\n\n{3}\n");
        
        String erreur = MessageFormat.format(form, hauteur, largeur, result, resultEtudiant);
        
        if(erreur.length() >= 500) fail(Translator.translate("Vous affichez trop de caractères ! ⛔"));
        if(!result.equals(resultEtudiant)) fail(erreur);
    }
    
    @Test
    public void testLauncher(){
        int nombreTests = 10;
        try{
            for(int i = 0; i < nombreTests; i++){
                testLetterH();
            }
        }catch (ArithmeticException e){
            fail(Translator.translate("Attention, il est interdit de diviser par zéro."));
        }catch(ClassCastException e){
            fail(Translator.translate("Attention, certaines variables ont été mal castées !"));
        }catch(StringIndexOutOfBoundsException e){
            fail(Translator.translate("Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)"));
        }catch(ArrayIndexOutOfBoundsException e){
            fail(Translator.translate("Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)"));
        }catch(NullPointerException e){
            fail(Translator.translate("Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas."));
        }catch(Exception e){
            fail(Translator.translate("Une erreur inattendue est survenue dans votre tâche : ") + e.toString());
        }
        
    }
}
