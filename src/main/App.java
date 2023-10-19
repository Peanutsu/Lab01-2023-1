package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        int a = 0; 
        for(int i = 0; i < arrayOrdenado.length; i++){
            if (arrayOrdenado[i] == num) {
                a=num;
            }
        }
        if (a == num){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static int maior(int[] arrayDesordenado){
        int a = arrayDesordenado[0];
        for (int i = 0; i < arrayDesordenado.length; i++){
            if (a < arrayDesordenado[i]){
                a = arrayDesordenado[i];
            }
        }
        return a;
    }

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
