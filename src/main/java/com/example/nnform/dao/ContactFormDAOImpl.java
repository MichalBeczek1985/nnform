package com.example.nnform.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.nnform.model.ContactForm;

@Repository
public class ContactFormDAOImpl implements ContactFormDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	 
	

	@Override
	public void saveOrUpdate(ContactForm contact) {
		 if (contact.getId() > 0) {
		        // update
		        String sql = "UPDATE contacts SET name=?, email=?, address=?, "
		                    + "telephone=? WHERE contact_id=?";
		        jdbcTemplate.update(sql, contact.getName(), contact.getMail(),
		                contact.getAddress(), contact.getPhone(), contact.getId());
		    } else {
		        // insert
		        String sql = "INSERT INTO contacts (name, surname, mail, phone, address, contactReason)"
		                    + " VALUES (?, ?,?,?,?,?)";
		        jdbcTemplate.update(sql, contact.getName(), contact.getSurname(),contact.getMail(),
		        		contact.getPhone(), contact.getAddress(), contact.getContactReason());
		    }
		
	}

	@Override
	public void delete(int contactId) {
		
	}

	@Override
	public ContactForm get(int contactId) {
		return null;
	}

	@Override
	public List<ContactForm> list() {
		return null;
	}
	public int saveOrUpdateTest(ContactForm contact) {
		 if (contact.getId() > 0) {
		        // update
		        String sql = "UPDATE contacts SET name=?, email=?, address=?, "
		                    + "telephone=? WHERE contact_id=?";
		        jdbcTemplate.update(sql, contact.getName(), contact.getMail(),
		                contact.getAddress(), contact.getPhone(), contact.getId());
		    } else {
		        // insert
		        String sql = "INSERT INTO contacts (name, surname, mail, phone, address, contactReason)"
		                    + " VALUES (?, ?,?,?,?,?)";
		        return jdbcTemplate.update(sql, contact.getName(), contact.getSurname(),contact.getMail(),
		        		contact.getPhone(), contact.getAddress(), contact.getContactReason());
		    }
		return 0;
	}
}
