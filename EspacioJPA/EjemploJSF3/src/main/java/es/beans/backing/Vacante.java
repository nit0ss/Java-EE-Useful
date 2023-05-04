package es.beans.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import es.beans.model.Candidato;

@ManagedBean
@RequestScoped
public class Vacante {

	@ManagedProperty(value = "#{candidato}")
	private Candidato candidato;

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public String enviar() {

		if (this.candidato.getNombre().equals("Pepito")) {
			return "exito";
		} else {
			return "fallo";
		}

	}

}
