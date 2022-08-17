//import libraria principala polyglot din graalvm
import org.graalvm.polyglot.*;

//clasa principala - aplicatie JAVA
class Polyglot {

     //   Value result = polyglot.eval("R", "toupper(\""+token+"\");");
        //utilizam metoda asString() din variabila incarcata cu output-ul executiei pentru a mapa valoarea generica la un String
       // String resultString = result.asString();

private static int input(){
        Context polyglot = Context.newBuilder().allowAllAccess(true).build() ;

        Value valoarePol = polyglot.eval("python", "int(input());") ;

        int result=valoarePol.asInt() ;
        polyglot.close() ;
        return result ;
}

private static double pBinom(int x, int size, double prob){    // P(X<=x)
        Context polyglot = Context.newBuilder().allowAllAccess(true).build() ;

        Value valoarePol = polyglot.eval("R", "pbinom("+x+","+ size+","+ prob+");") ;

        Double result=valoarePol.asDouble() ;

        polyglot.close() ;
        return result ;
}
    private static double DBinom(int x, int size, double prob){    // P(X<=x)
        Context polyglot = Context.newBuilder().allowAllAccess(true).build() ;

        Value valoarePol = polyglot.eval("R", "dbinom("+x+","+ size+","+ prob+");") ;

        Double result=valoarePol.asDouble() ;

        polyglot.close() ;
        return result ;
    }
        //folosim o variabila generica care va captura rezultatul excutiei functiei PYTHON, sum()
        //avem voie sa inlocuim anumite elemente din scriptul pe care il construim spre evaluare, aici token provine din JAVA, dar va fi interpretat de PYTHON
    // Value result = polyglot.eval("python", "sum(ord(ch) for ch in '" + token + "')");

    //functia MAIN
    public static void main(String[] args) {
        //construim un context pentru evaluare elemente JS
       // Context polyglot = Context.create();
        //construim un array de string-uri, folosind cuvinte din pagina web:  https://chrisseaton.com/truffleruby/tenthings/
        //Value array = polyglot.eval("js", "[\"If\",\"we\",\"large\",\"fi\",\"there\",\"The\",\"gelar\",\"file\",\"is\",\"150\",\"MB\"];");

         //   int i = 0;
         //   String element = array.getArrayElement(i).asString();
          //  String upper = RToUpper(element);
           // int crc = SumCRC(upper);
        System.out.println("Nr de aruncari");
        int nr=input() ;
        System.out.println("x=");
        int x=input() ;

        double p= 0.5;
        double result=pBinom(x,nr,p );
        double resultd=DBinom(x,nr,p);
        System.out.println("P(X<="+ x +") =" +result);
        System.out.print("P(X="+ x +") =" +resultd);

        // inchidem contextul Polyglot
       // polyglot.close();
    }
}

