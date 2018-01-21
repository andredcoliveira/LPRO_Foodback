package com.lpro.fbrest.service;

import java.util.List;

import javax.ws.rs.WebApplicationException;

import org.skife.jdbi.v2.sqlobject.CreateSqlObject;

import com.lpro.fbrest.api.Meal;
import com.lpro.fbrest.db.MealDAO;

public abstract class MealService {
	
	private static final String SUCCESS = "Success...";

	/**
	 * @return Response if request was successful
	 */
	@CreateSqlObject
	abstract MealDAO mealdao();
	
	public String newMeal(Meal meal) {
		try {
			mealdao().insertMeal(meal.getMeal(), meal.getPrice(), meal.getEstablishment_id());
		} catch(Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(500);
		}
		
		return SUCCESS;
		
	}
	
	//Lista de todos os pratos de um estabelecimento
	/**
	 * @param establishment_id
	 * @return
	 */
	public List<Meal> getAllMeals(long establishment_id) {
		return mealdao().getAllMeals(establishment_id);
	}

	/**
	 * @param establishment_id
	 * @param meal
	 * @return
	 */
	public Meal getMealbyName(long establishment_id, String meal) {
		Meal x = mealdao().getMealbyName(establishment_id, meal);
		if(x == null) {
			throw new WebApplicationException(404);
		}
		return x;
	}
	


}
