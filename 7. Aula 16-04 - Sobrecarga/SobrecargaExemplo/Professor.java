// Sobrecarga Construtor
public class Professor {

	//Atributos
	private int codigo;
	private String nome;
	private String disciplina;
	private String turno;
	
	// Construtor -> Sobrecarga
	public Professor() {
		
	}
	
	public Professor(int cod, String nom) {
		this.codigo = cod;
		this.nome = nom;
	}

	// Getters and Setters
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

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
}
