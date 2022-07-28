public class App {
    public static void main(String[] args) throws Exception {
        
        Relogio r1 = new Relogio(8,9);

        r1.despertar();
        r1.setHoras(9);
        r1.despertar();
        
    }
}
