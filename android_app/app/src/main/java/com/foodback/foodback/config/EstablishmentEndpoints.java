package com.foodback.foodback.config;

import com.foodback.foodback.logic.Category;
import com.foodback.foodback.logic.Establishment;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by FoodBack.
 */

public interface EstablishmentEndpoints {

//    GET     /establishments (com.lpro.fbrest.resources.EstablishmentsResource)  -check
//    POST    /establishments (com.lpro.fbrest.resources.EstablishmentsResource)  -check
//    PUT     /establishments (com.lpro.fbrest.resources.EstablishmentsResource)  -check
//    GET     /establishments/categories (com.lpro.fbrest.resources.EstablishmentsResource)  -check
//    GET     /establishments/{name} (com.lpro.fbrest.resources.EstablishmentsResource)


    @POST("/establishments")
    Call<ResponseBody> createEstablishment(@Body Establishment establishment);

    @GET("/establishments/categories")
    Call<List<Category>> getAllCategories();

    @PUT("/establishments")
    Call<ResponseBody> editEstablishment(@Body Establishment establishment);

    @GET("/establishments")
    Call<List<Establishment>> getAllEstablishments();
}