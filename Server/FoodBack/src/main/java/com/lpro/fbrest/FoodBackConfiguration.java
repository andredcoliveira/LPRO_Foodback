package com.lpro.fbrest;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class FoodBackConfiguration extends Configuration {
	
	
	private String mycustomconfig;
    
	@Valid
    @NotNull
    private DataSourceFactory database = new DataSourceFactory();
	
	
	
	@JsonProperty("mycustomconfig")
	public String getMycustomconfig() {
		return mycustomconfig;
	}
	
	@JsonProperty("mycustomconfig")
	public void setMycustomconfig(String mycustomconfig) {
		this.mycustomconfig = mycustomconfig;
	}
	
    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
    
    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory factory) {
        this.database = factory;
    }
}
