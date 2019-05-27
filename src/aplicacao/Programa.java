package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.print.attribute.standard.Finishings;

import dominio.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		
		/*Pessoa p1 = new Pessoa(null, "Carlos","carlos@gmail.com"); //null - Incrementacao automatica de Id pelo BD 
		Pessoa p2 = new Pessoa(null, "Joaquim Silva","joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria","ana@gmail.com");
		*/
		
		//Passa o nome da persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); 
		//Conecxao com o BD
		EntityManager em = emf.createEntityManager();
		
		//Iniciando transacao com o BD
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		//Encerrando transacao
		em.getTransaction().commit();
		*/
		
		/*
		//Encontrando e removendo ID 2
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		*/
		
		System.out.println("Feito!");
		
		em.close();
		emf.close(); //Fecha o BD
		
	}
}
