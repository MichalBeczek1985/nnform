package com.example.nnform.dao;

import java.util.List;

import com.example.nnform.model.ContactForm;

public interface ContactFormDAO {
	public void saveOrUpdate(ContactForm contact);
    
    public void delete(int contactId);
     
    public ContactForm get(int contactId);
     
    public List<ContactForm> list();
}
