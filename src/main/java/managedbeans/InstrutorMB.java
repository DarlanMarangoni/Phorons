package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Instrutor;
import service.InstrutorService;

@ManagedBean
@SessionScoped
public class InstrutorMB {

	private Instrutor instrutor = new Instrutor();
	private InstrutorService instrutorService = new InstrutorService();
	private List<Instrutor> instrutores;
	
	public Instrutor getInstrutor() {
		return instrutor;
	}
	
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}	

	public void salvar() {
		System.out.println(instrutor.getNome());
		instrutorService.save(instrutor);
		instrutorService.closeEntityManager();
		instrutor = new Instrutor();
	}
	
	public List<Instrutor> getInstrutores(){
		instrutores = instrutorService.getAll(Instrutor.class);
		instrutorService.closeEntityManager();
		return instrutores;
	}
	
	public void consultar() {
		Instrutor obj= new Instrutor();
		obj = instrutor;
		instrutor = instrutorService.getById(Instrutor.class, obj.getId());
		if (instrutor == null) {
			instrutor = new Instrutor();
		}
	}
	
	public void remover() {
		instrutorService.remove(instrutor);
		instrutorService.closeEntityManager();
		instrutor = new Instrutor();
	}
}
