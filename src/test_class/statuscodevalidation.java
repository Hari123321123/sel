package test_class;
import org.testng.Assert;
import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import request_repository.RequestRepository;
public class statuscodevalidation {
	public static void statuscodeext() throws IOException{
		
		RestAssured.baseURI="https://reqres.in/";
	int PostStatusCode = given().header("Content-Type","application/json").body(RequestRepository.postbody()).when().post("api/users").then().extract().statusCode();
	Assert.assertEquals(PostStatusCode, 201);
	System.out.println(PostStatusCode);
	}
}