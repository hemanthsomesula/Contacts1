package com.contacts.DAO;

import java.util.List;

import com.contacts.DTO.Contact;

public interface ContactDAO {

	public boolean insert(Contact contact);

	public Contact get(int id);
	
	public List<Contact> get();
	
	public boolean update();
	
	
	
	

}
