/**
 *  Copyright (c)  2016 Ludovic Taffin, Olivier Martin
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

public class Correction {

    /*
     * @pre : -
     * @post : Détermine le siècle d'une année
     *
     */
    public static int century(int annee){
        int siecle = 0;
        
        int x = annee/100;
        if(x * 100 == annee)
            siecle = x;
        else
            siecle = x + 1;
        return siecle;
    }
}
