public class Main {
    public static void main(String[] args) {
        /*
        For each

         */
        String[] nombres = {"Samuel", "Maria", "Alejandra", "Luisa"};

        for(int i=0;i< nombres.length;i++){
            System.out.println(nombres[i]);
        }

        for(String i:nombres){
            System.out.println(i);
        }
    }
}