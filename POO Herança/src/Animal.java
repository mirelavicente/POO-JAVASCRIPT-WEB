public class Animal {
    private String nome;
    private float comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    public Animal(){
    }
    Animal(

    ){
        this.nome = nome;
        this.comprimento = comprimento;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }
    public String getNome(){
        return nome;
    }
    public float getComprimento(){
        return comprimento;
    }
    public int getNumeroPatas(){
        return numeroPatas;
    }
    public String getCor(){
        return cor;
    }
    public String getAmbiente(){
        return ambiente;
    }
    public float getVelocidadeMedia(){
        return velocidadeMedia;
    }
   public void setNome(String nome){
        this.nome = nome;
   }
   public void setComprimento(float comprimento){
        this. comprimento = comprimento;
   }
   public void setNumeroPatas(int numeroPatas){
        this.numeroPatas = numeroPatas;
   }
   public void setcor(String cor){
        this.cor = cor;
    }
    public void setAmbiente(String ambiente){
        this.ambiente = ambiente;
    }
    public void setVelocidadeMedia(float velocidadeMedia){
        this.velocidadeMedia = velocidadeMedia;
    }
    public void dados(){
        System.out.println("nome:" + nome);
        System.out.println("comprimento:" + comprimento + " metros");
        System.out.println("numeroPatas:" + numeroPatas);
        System.out.println("cor:" + cor);
        System.out.println("ambiente:" + ambiente);
        System.out.println("velocidadeMedia:" + velocidadeMedia + "km/h";}
    }





}
