package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Aluno;
import service.AlunoService;

@ManagedBean
@SessionScoped
public class AlunoMB {

	private Aluno aluno = new Aluno();
	private AlunoService alunoService = new AlunoService();
	private List<Aluno> alunos;
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}	

	public void salvar() {
		System.out.println(aluno.getNome());
		alunoService.save(aluno);
		alunoService.closeEntityManager();
		aluno = new Aluno();
	}
	
	public List<Aluno> getAlunos(){
		alunos = alunoService.getAll(Aluno.class);
		alunoService.closeEntityManager();
		return alunos;
	}
	
	public void consultar() {
		Aluno obj= new Aluno();
		obj = aluno;
		aluno = alunoService.getById(Aluno.class, obj.getId());
		if (aluno == null) {
			aluno = new Aluno();
		}
	}
	
	public void remover() {
		alunoService.remove(aluno);
		alunoService.closeEntityManager();
		aluno = new Aluno();
	}
}
