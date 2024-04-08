public class TestarAnimais {
    public static void main(String[] args){
        Mamifero camelo = new Mamifero( "camelo", 150, 4, "amarelo", "terra", 2.0);
                camelo.dados();
        Peixe tubarao = new Peixe("tubarao", 300, 0, "cinzento", "mar", 1.5, "barbatanas e cauda");
		tubarao.dados();
	Mamifero ursocanada = new Mamifero("ursocanada", 180, 4, "vermelho", "terra", 0.5, "mel");
		tubarao.dados();
    }	
}
