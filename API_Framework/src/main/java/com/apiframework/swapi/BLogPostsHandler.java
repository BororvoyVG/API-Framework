package com.apiframework.swapi;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;


import static java.lang.String.format;

@Slf4j
public class BLogPostsHandler {
    private static final String URL = "http://localhost:3000/%s";

    public void getBlogPostsList() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = format(URL, "blogposts");
        RequestSpecification request = RestAssured.given();

        Response response = request.get();

        log.info(format("Get a Blog Post List: %s \nwith response: %s", RestAssured.baseURI, response.then().log().body()));

    }

    public int postBlogPost(String postText) {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = format(URL, "blogposts");
        RequestSpecification request = RestAssured.given();

        String body = format("{\n" +
                "    \"title\": %s,\n" +
                "    \"author\": \"Janice Jones\"\n" +
                "  }", postText);
        Response response = request.body(body).post();
        log.info(format("Post a Blog Post: %s \nwith body: %s \nAnd response code is %s",
                RestAssured.baseURI, response.getBody(), response.getStatusCode()));
        return response.getStatusCode();
    }
}
