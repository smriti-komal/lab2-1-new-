package com.cg.lab2.trainee.interfaces;

import java.util.List;

import com.cg.lab2.trainee.entity.Trainee1;

public interface TraineeServiceInterface {
	
//	public Trainee findById(int traineeid);

	public Trainee1 addtrainee(Trainee1 t);

	public List<Trainee1> retrieve();
	
	public void delete(int traineeid);
	
}
