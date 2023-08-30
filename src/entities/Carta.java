package entities;

public class Carta {
    private String naipe;
    private String valor;
    private int peso;

    public Carta(String naipe, String valor, int peso){
        this.naipe = naipe;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNaipe(){
        return this.naipe;
    }
    public void setNaipe(String naipe){
        this.naipe = naipe;
    }
    
    public String getValor(){
        return this.valor;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    
    public int getPeso(){
        return this.peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
}
