package com.tempoedinheiro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.tempoedinheiro.connection.ConnectionFactory;
import com.tempoedinheiro.model.Admin;

public class AdminDAO implements AdminInterface {
	
	private static EntityManager manager;
	
	@Override
	public void insert(Admin admin) {
		if(admin != null && !admin.getAd_email().isEmpty() && !admin.getAd_nome().isEmpty() && !admin.getAd_senha().isEmpty()){
			try{
				manager = ConnectionFactory.getConnection();
				manager.getTransaction().begin();
				manager.persist(admin);
				manager.getTransaction().commit();
			}
			catch(Exception  ex){
				System.out.println(ex.getMessage());
			}
			finally {
				manager.close();
			}
		}

	}

	@Override
	public void remove(Admin admin) {
		if(admin !=  null){
			try{
				manager = ConnectionFactory.getConnection();
				manager.getTransaction().begin();
				manager.remove(admin);
				manager.getTransaction().commit();
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			finally {
				manager.close();
			}
		}

	}

	@Override
	public void update(Admin admin) {
		if(admin  !=  null && !admin.getAd_email().isEmpty() && !admin.getAd_nome().isEmpty() && !admin.getAd_senha().isEmpty()){
			try{
				manager = ConnectionFactory.getConnection();
				manager.getTransaction().begin();
				manager.merge(admin);
				manager.getTransaction().commit();
			}
			catch(Exception  ex){
				System.out.println(ex.getMessage());
			}
			finally {
				manager.close();
			}
		}

	}

	@Override
	public Admin admin(Long id) {
		if(id != null && id >0){
			try{
				manager =  ConnectionFactory.getConnection();
				return manager.find(Admin.class, id);
			}
			catch(Exception  ex){
				System.out.println(ex.getMessage());
				return null;
			}
			finally {
				manager.close();
			}
		}
		
		else
			return null;
	}

	@Override
	public Admin login(String usuario, String senha) {
		if(usuario != null && senha != null && !senha.isEmpty() && !usuario.isEmpty()){
			try{
				manager = ConnectionFactory.getConnection();
				
				Query  query = manager.createQuery("from Admin where ad_email=:email and ad_senha=:senha");
				
				query.setParameter("email", usuario);
				query.setParameter("senha", senha);
				
				return (Admin) query.getSingleResult();
			}
			catch(Exception  ex){
				System.out.println(ex.getMessage());
				return null;
			}
			finally {
				manager.close();
			}
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> admins() {
		try{
			manager = ConnectionFactory.getConnection();
			
			return manager.createQuery("from Admin").getResultList();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			return null;
		}
		finally {
			manager.close();
		}
	}

}
