
public class Cliente {
	public static void main(String[] args) {
		
	    ImagemTarget imagem = new ImagemAdapter();
	    
	    imagem.carregarImagem("teste.png");
	    imagem.desenharImagem(0, 0, 10, 10);

	    imagem.carregarImagem("teste.jpg");
	    imagem.desenharImagem(0, 0, 10, 10);
	    
	    imagem = new ImagemAdapter();
	    
	    imagem.carregarImagem("teste.bmp");
	    imagem.desenharImagem(0, 0, 10, 10);
	 

	}
}
