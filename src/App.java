import java.util.ArrayList;
public class  App {
    public static void main(String[] args) throws Exception  {
        System.out.println("Hello, World!");
        ArrayList<Integer>valoresInt  = new ArrayList<Integer>();
        ArrayList<Integer>dobro  = new ArrayList<Integer>();
        ArrayList<Integer>par  = new ArrayList<Integer>();
        ArrayList<Integer>impar  = new ArrayList<Integer>();

        valoresInt.add(1);
        valoresInt.add(2);
        valoresInt.add(3);
        valoresInt.add(4);
        valoresInt.add(5);
        valoresInt.add(6);

        valoresInt.forEach(v->dobro.add(v*2));
        valoresInt.forEach(v-> {if(v % 2 == 0){par.add(v);}else{impar.add(v);}});

        System.out.println(valoresInt);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }
}
