package model;

public class Tutor {

	private int id;
	private String nome;
	private String telefone;
	private String endereco;
	
	// Construtor
    public Tutor(String nome, String telefone, String endereco) {
    	super();
    	this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public Tutor() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
