package com.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mvc.model.Activity;

@Service("ExerciseService")
public class ExerciseServiceImpl implements ExerciseService {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mvc.service.ExerciseService#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<>();

		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);

		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);

		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);

		return activities;
	}
}
