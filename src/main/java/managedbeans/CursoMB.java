package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Curso;
import service.CursoService;

@ManagedBean
@SessionScoped
public class CursoMB {

	private Curso curso = new Curso();
	private CursoService cursoService = new CursoService();
	private List<Curso> cursos;
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void salvar() {
		cursoService.save(curso);
		cursoService.closeEntityManager();
		curso = new Curso();
	}
	
	public List<Curso> getCursos(){
		cursos = cursoService.getAll(Curso.class);
		cursoService.closeEntityManager();
		return cursos;
	}
	
	public void consultar() {
		Curso obj = new Curso();
		obj = curso;
		curso = cursoService.getById((Class<Curso>) obj.getClass(), obj.getId());
	}
}
