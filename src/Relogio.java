public class Relogio {
    //Atributos
    private boolean working;
    private float horas;
    private float despertador;
    private boolean barulho;

    
    // Métodos
    Relogio(float horas, float despertador){
        this.setWorking(true);
        this.setBarulho(false);
        this.setHoras(horas);
        this.setDespertador(despertador);
    }

    void despertar(){
        if (this.horas == this.despertador) {
            System.out.println("ACORDA CAMBADA!");
            this.setBarulho(true);
        } else {
            System.out.println("Horas diferentes");
        }
    }

    void trocarPilhas(){
        if (this.working){
            System.out.println("Está funcionando");
        } else {
            System.out.println("Pilhas trocadas");
        }
    }
    // Métodos especiais

    public boolean getWorking(){
        return this.working;
    }
    void setWorking(boolean working){
        this.working = working;
    }
    public float getHoras(){
        return this.horas;
    }
    void setHoras(float horas){
        this.horas = horas;
    }
    public float getDespertador(){
        return this.despertador;
    }
    void setDespertador(float despertador){
        this.despertador = despertador;
    }
    public boolean getBarulho(){
        return this.barulho;
    }
    void setBarulho (boolean barulho){
        this.barulho = barulho;
    }
}
