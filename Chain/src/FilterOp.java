
public abstract class FilterOp {
private FilterOp nextop;
	
	public FilterOp nextop(FilterOp o){
		nextop = o;
		return o;
	}
	public abstract op(Imagem i) throws FilterError {
		System.out.println("imagem");
	}
	
}
