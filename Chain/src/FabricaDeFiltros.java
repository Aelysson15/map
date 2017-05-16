
public class FabricaDeFiltros {
	public FilterOp gotham(){
		FilterOp o = new Modulate(120, 10, 100);
		o.nextop(new Gama());
	return o;
	}
}
