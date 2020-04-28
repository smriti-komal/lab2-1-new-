package com.cg.lab2.trainee.interfaces;

import java.util.List;
import com.cg.lab2.trainee.entity.Trainee1;

public interface TraineeDaoInterafce {
	
	public boolean addtrainee (Trainee1 t);
	public void deletetrainee (int traineeid);
//	public void modifytrainee (int traineeid);
//	public Trainee findbyid (int traineeid);
	public List<Trainee1> retrieve();

}
