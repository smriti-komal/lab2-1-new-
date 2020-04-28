package com.cg.lab2.trainee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lab2.trainee.entity.Trainee1;
import com.cg.lab2.trainee.interfaces.TraineeServiceInterface;
import com.cg.lab2.trainee.interfaces.TraineeDaoInterafce;


@Service
@Transactional
public class TraineeService implements TraineeServiceInterface {

	@Autowired
	private TraineeDaoInterafce td;
	
//	@Override
//	public Trainee findById(int traineeid) {
//		
//		return td.findbyid(traineeid);
//	}
	@Override
	public Trainee1 addtrainee(Trainee1 t) {
		
		boolean result=td.addtrainee(t);
		
		if(result)
		{
			return t;
		}
		else
			return null;
	}
	
	@Override
	public List<Trainee1> retrieve() {
		
		return td.retrieve();
	}
	
	@Override
	public void delete(int traineeid) {
		
		td.deletetrainee(traineeid);
	}

}
