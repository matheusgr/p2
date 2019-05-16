package bb;

import java.util.Comparator;

public class ComparadorDeContasPorToString implements Comparator<ContaInterface>{

	@Override
	public int compare(ContaInterface o1, ContaInterface o2) {
		return o1.toString().compareTo(o2.toString());
	}

}
