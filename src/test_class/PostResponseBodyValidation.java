package test_class;

import org.testng.Assert;

import common_method.common_method_utilities;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import request_repository.RequestRepository;

public class PostResponseBodyValidation {
	public static String PostResponsebody() throws IOException {
		RestAssured.baseURI="https://reqres.in/";
	String PostResponseBody = given().log().all().header("Content-Type","application/json").body(RequestRepository.postbody()).when().post("api/users").then().extract().response().asString();
	
	JsonPath jsp =new JsonPath(PostResponseBody);
	System.out.println(PostResponseBody);
	String respId=jsp.getString("id");
	Assert.assertNotNull(respId);
	String requestbody = RequestRepository.postbody();
	common_method_utilities.evidenceFileCreator("Post_tc2", requestbody, PostResponseBody);

	return PostResponsebody();
}}
