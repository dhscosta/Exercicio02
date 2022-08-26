

public class Professor{
	private int codigo;
	private String nome;
	private String materia;
	private char sexo;
	
	public Professor() {
		this.codigo = -1;
		this.nome = "";
		this.materia = "";
		this.sexo = '*';
	}
	
	public Professor(int codigo, String nome, String materia, char sexo) {
		this.codigo = codigo;
		this.nome = nome;
		this.materia = materia;
		this.sexo = sexo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Professor [codigo=" + codigo + ", nome=" + nome + ", materia=" + materia + ", sexo=" + sexo + "]";
	}	
}
