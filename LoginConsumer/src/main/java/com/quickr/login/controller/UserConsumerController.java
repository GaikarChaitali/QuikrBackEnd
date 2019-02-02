package com.quickr.login.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.quickr.login.model.UserLoginAccount;
import com.quickr.login.model.UserRegistrationAccount;

@CrossOrigin(origins="http://localhost:2323")
@RestController
public class UserConsumerController {
	@Autowired
	private EurekaClient client;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	//GETTING ALL USER DETAILS 
	
	/*@RequestMapping("/getallusers")
	public List<UserRegistrationAccount> callService() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo instanceInfo = client.getNextServerFromEureka("producer", false);
		String baseUrl = instanceInfo.getHomePageUrl();
		System.out.println(baseUrl);
		ResponseEntity<List<UserRegistrationAccount>> response =
				restTemplate.exchange(baseUrl+"/users", HttpMethod.GET, null,new ParameterizedTypeReference<List<UserRegistrationAccount>>() {});
		return response.getBody();
	}*/
	
	
	//VALIDATING USER DETAILS BY EMAILID AND PASSWORD USING PATHVARIABLE
	
	/*@RequestMapping("/validate/{email}/{password}")
	public boolean callService(@PathVariable String email,@PathVariable String password) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo instanceInfo = client.getNextServerFromEureka("producer", false);
		String baseUrl = instanceInfo.getHomePageUrl();
		System.out.println(baseUrl);
		ResponseEntity<List<UserRegistrationAccount>> response =
				restTemplate.exchange(baseUrl+"/users", HttpMethod.GET, null,new ParameterizedTypeReference<List<UserRegistrationAccount>>() {});
System.out.println(response.getBody());
		List<UserRegistrationAccount> users=response.getBody();
		for (UserRegistrationAccount user : users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}*/
	
	//VALIDATING USER DETAILS BY EMAILID AND PASSWORD USING POJO OBJECT
	
	@PostMapping("/quickr/users/login")
	public boolean callService(@RequestBody UserLoginAccount userLoginAccount) {
		System.out.println(userLoginAccount);
		RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo instanceInfo = client.getNextServerFromEureka("producer", false);
		String baseUrl = instanceInfo.getHomePageUrl();
		System.out.println(baseUrl);
		ResponseEntity<List<UserRegistrationAccount>> response =
				restTemplate.exchange(baseUrl+"/getusers", HttpMethod.GET, null,new ParameterizedTypeReference<List<UserRegistrationAccount>>() {});
System.out.println(response.getBody());
		List<UserRegistrationAccount> users=response.getBody();
		for (UserRegistrationAccount user : users) {
			if(user.getEmail().equals(userLoginAccount.getEmail()) && user.getPassword().equals(userLoginAccount.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	
	@PostMapping("/quickr/users/create")
	public UserRegistrationAccount addUser(@RequestBody UserRegistrationAccount account) {
		System.out.println(account);
		 HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<UserRegistrationAccount> entity = new HttpEntity<UserRegistrationAccount>(account,headers);
	      RestTemplate restTemplate = restTemplateBuilder.build();
			String baseUrl = getBaseUrl();
	       restTemplate.exchange(
	    		  baseUrl +"/create", HttpMethod.POST, entity, String.class).getBody();	
	       return account;
	}

	private String getBaseUrl() {
	
		InstanceInfo instanceInfo = client.getNextServerFromEureka("producer", false);
		String baseUrl = instanceInfo.getHomePageUrl();
		
		return baseUrl;
	} 
 
	
	
	
	/*public String unknown() {
		return "Service is not available";
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
}

	/*private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
	*/




/*@RestController
public class ClientApplication {
	
	@Autowired
	private EurekaClient client;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	
	@RequestMapping("/")
	public String callService() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo instanceInfo = client.getNextServerFromEureka("service", false);
		String baseUrl = instanceInfo.getHomePageUrl();
		ResponseEntity<String> response =
				restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class);
		return response.getBody();
	}
}
*/