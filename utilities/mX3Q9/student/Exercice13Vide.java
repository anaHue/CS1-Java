/**
 *  Copyright (c)  2016 Ludovic Taffin
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
package student;

public class Exercice13Stu {
    
   @    @q1@@

   @    @q2@@

   public static int eqsecdeg2(int a, int b, int c) {
        int delta = ((b*b) - (4*a*c));
        if (delta==0) return 1;
        if (delta < 0 ) return 0;
        if (delta > 0 ) return 2;

        return -1;
    }
}
