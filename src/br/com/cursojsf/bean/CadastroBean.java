package br.com.cursojsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;


@ManagedBean
@RequestScoped
public class CadastroBean implements Serializable{

	private static final long serialVersionUID = -147189259517942696L;

	private String nome;
	private String email;
//	private String bairro;
	private ArrayList listaBairros;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getBairro() {
//		return bairro;
//	}
//	public void setBairro(String bairro) {
//		this.bairro = bairro;
//	}
	
	public ArrayList getListaBairros() {
		ArrayList <SelectItem> retorno = new ArrayList<SelectItem>();
		SelectItem item = new SelectItem();
		
		item.setValue(0);
		item.setLabel("Botafogo");
		item.setValue(1);
		item.setLabel("Copacabana");
		
		return listaBairros;
	}
	
	public void setListaBairros(ArrayList listaBairros) {
		this.listaBairros = listaBairros;
	}
	
	
}
