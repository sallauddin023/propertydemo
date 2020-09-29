package com.guru.property.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.guru.property.bean.FakeDataSource;
import com.guru.property.bean.GmsDataSource;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:gms.properties"})
@PropertySources({
	@PropertySource("classpaht:datasource.properties"),
	@PropertySource("clsspath:gms.properties")
	
})
public class PropertyConfig {
	
	@Value("${guru.username}")
	String userName;

	
	@Value("${guru.password}")
	String password;
	
	@Value("${guru.dburl}")
	String url;
	
	@Value("${guru.username.gms}")
	String gmsuserName;

	
	@Value("${guru.password.gms}")
	String gmspassword;
	
	@Value("${guru.dburl.gms}")
	String gmsurl;
	
	@Bean
	public GmsDataSource gmsDataSource() {
		GmsDataSource gms = new GmsDataSource();
		gms.setUserName(gmsuserName);
		gms.setPassword(gmspassword);
		gms.setUrl(gmsurl);
		return gms;
	}
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource dataSource = new FakeDataSource();
		dataSource.setUserName(userName);
		
		dataSource.setPassword(password);
		dataSource.setPassword(url);
		return dataSource;
	}
	@Bean 
	public PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
		return properties;
	}

}
