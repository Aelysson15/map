
public class ImagemBMP implements Imagem {
	
	@Override
	public void CarregarBmp(String arquivo) {
        System.out.println("Imagem " + arquivo + " carregada");
    }
	@Override
    public void DesenharBmp(int largura, int altura, int posicaoX, int posicaoY) {
        System.out.println("BMP desenhada");
    }
}
