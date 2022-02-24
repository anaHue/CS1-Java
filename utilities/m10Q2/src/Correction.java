package src;


/**
 * Une implémentation de Mission9Corr
 *
 * @author Ludovic Taffin
 * @version Novembre 2016
 */

public class Correction{
  /**
   * Une classe représentant une fraction
   *
   * @author O. Bonaventure
   * @version Oct. 2016
   */
  public class Fraction implements Comparable<Fraction>
  {
      private int num; // numerateur
      private int den; // denominateur

      /**
       * @pre den>0
       * @post construit la fraction num/den
       */
      public Fraction(int num, int den)
      {
          this.num=num;
          this.den=den;
      }

      /*
       * @pre -
       * @post construit une fraction sur base d'une chaine caractère de la
       *       forme num/den  où num est un entier et den un entier non nul
       *       lance une exception lorsque la chaîne de caractères passée
       *       en argument ne respecte pas ce format ou que le dénominateur est nul
       */
      public Fraction(String s) throws NumberFormatException
      {
          if (s==null)
              throw new NumberFormatException();
          String[] tab=s.split("/");
          if(tab.length!=2)
              throw new NumberFormatException();
          int num=Integer.parseInt(tab[0]);
          int den=Integer.parseInt(tab[1]);
          if (den==0)
              throw new NumberFormatException();
          this.num=num;
          this.den=den;


      }

      /*
       * @pre -
       * @post retourne le dénominateur de la fraction
       */
      public int getDen()
      {
          return this.den;
      }


      /*
       * @pre -
       * @post retourne le numérateur de la fraction
       */
      public int getNum()
      {

          return this.num;
      }

      // la méthode qui manque
      public int compareTo(Fraction f) {

          double f1,f2;
          f2=(double) this.num/(double) this.den;
          f1=(double) f.num/(double) f.den;
          if(f1==f2)
              return 0;
          if(f2<f1)
              return 1;
          else
              return -1;

      }



      // ne pas montrer aux étudiants, utilisé pour les tests
      public boolean equals(Object o)
      {
          if (o instanceof Fraction){
              Fraction f=(Fraction) o;
              return ( (f.getNum()==this.getNum()) &&
                  (f.getDen()==this.getDen()) );

          }
          return false;


      }


  }

}
