package api.test.main;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class base {
@Test
	public void  test() {
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	
	response.asString();
	String body = response.getBody().asString();
	System.out.println(body);
	
	response.statusCode();
	response.getSessionId();
	Assert.assertEquals(response.statusCode(), 200);
	Assert.assertEquals(response.statusLine(), "HTTP/1.1 200 OK");
	System.out.println(response.statusCode());
	System.out.println(response.getSessionId());
	System.out.println(response.getTime());
	System.out.println(response.statusLine());
	System.out.println(response.getHeader("Content-Type)"));
	Assert.assertEquals(response.getHeader("Content-Type"), "application/json; charset=utf-8");
	System.out.println(response.getHeader("Cache-Control"));
	Assert.assertEquals(response.getHeader("Cache-Control"), "max-age=14400");
	System.out.println(response.getHeader("CF-RAY"));
	//Assert.assertEquals(response.getHeader("CF-RAY"), "733180a07ff982e7-IAD");
	}
	

	
}
