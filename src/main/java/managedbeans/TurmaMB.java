package managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Curso;
import entities.Turma;
import service.CursoService;
import service.TurmaService;


@ManagedBean
@SessionScoped
public class TurmaMB {

	private Turma turma = new Turma();
	private TurmaService turmaService = new TurmaService();
	private List<Turma> turmas;
	private Curso curso = new Curso();
	private List<Curso> cursos;
	private CursoService cursoService = new CursoService();
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}	

	public void salvar() {
		turmaService.save(turma);
		turmaService.closeEntityManager();
		turma = new Turma();
	}
	
	public List<Turma> getTurmas(){
		turmas = turmaService.getAll(Turma.class);
		turmaService.closeEntityManager();
		return turmas;
	}
		
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void consultar() {
		Turma obj= new Turma();
		obj = turma;
		turma = turmaService.getById(Turma.class, obj.getId());
		if (turma == null) {
			turma = new Turma();
		}
	}
	
	public void remover() {
		turmaService.remove(turma);
		turmaService.closeEntityManager();
		turma = new Turma();
	}
	
	public List<String> getCursos() {
		List<String> lista = new ArrayList<>();
		cursos = cursoService.getAll(Curso.class);
		cursoService.closeEntityManager();
		for (int i = 0; i < cursos.size(); i++) {
			curso = cursos.get(i);
			lista.add(curso.getSigla());
		}
		return lista;
	}

}
