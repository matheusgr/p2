package r.b1.colecoes.alunos;

public class IdAluno implements Comparable<IdAluno> {

	private int codigo;
	
	private String curso;
	
	public IdAluno(int codigo, String curso) {
		this.codigo = codigo;
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdAluno other = (IdAluno) obj;
		if (codigo != other.codigo)
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IdAluno [codigo=" + codigo + ", curso=" + curso + "]";
	}

	@Override
	public int compareTo(IdAluno o) {
		int diff = this.curso.compareTo(o.curso);
		if (diff == 0) {
			return this.codigo - o.codigo;
		}
		return diff;
	}

	

}
