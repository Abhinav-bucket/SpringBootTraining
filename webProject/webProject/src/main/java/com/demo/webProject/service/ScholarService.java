package com.demo.webProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.webProject.model.ScholarModel;
import com.demo.webProject.repository.ScholarRepository;


@Service 
public class ScholarService {
	
	private ScholarRepository sR;
	@Autowired
	public ScholarService(ScholarRepository sR) {
		this.sR=sR;
	}
	
	public List<ScholarModel> getAllScholars() {	//Return All Scholar details
		return sR.getAllScholars();
		}
	
	public String getScholar(String id) { //Return scholar details based on ID
		return sR.getScholar(id);
		}
	
	public String postAddScholar(ScholarModel sch) { //Add new scholar details
		return sR.postAddScholar(sch);
		}
	
	public String postUpdateScholar(ScholarModel sch) {
		return sR.postUpdateScholar(sch);
	}
	
	public String deleteScholar(String id) { //Delete a scholar 
		return sR.deleteScholar(id);
	}
}