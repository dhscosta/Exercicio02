

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		
		Professor professor = new Professor(11, "Pablo", "Matematica",'M');
		if(dao.inserirProfessor(professor) == true) {
			System.out.println("Inserção com sucesso -> " + professor.toString());
		}
		
			
		System.out.println("==== Mostrar usuários do sexo masculino === ");
		Professor[] professors = dao.getProfessorsMasculinos();
		for(int i = 0; i < professors.length; i++) {
			System.out.println(professors[i].toString());
		}

	
		professor.setNome("Nome");
		dao.atualizarProfessor(professor);

		
		System.out.println("==== Mostrar usuários === ");
		professors = dao.getProfessors();
		for(int i = 0; i < professors.length; i++) {
			System.out.println(professors[i].toString());
		}
		
		
		dao.excluirProfessor(professor.getCodigo());
		
		
		professors = dao.getProfessors();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < professors.length; i++) {
			System.out.println(professors[i].toString());
		}
		
		dao.close();
	}
}