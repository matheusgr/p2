package interfaces;
import java.util.Comparator;

public class OrdenaContasMaiorSaldo implements Comparator<Contabil> {

	@Override
	public int compare(Contabil o1, Contabil o2) {
		return o2.getSaldo() - o1.getSaldo();
	}

}
