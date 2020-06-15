package com.apiframework.stepdefs;

import com.apiframework.swapi.BLogPostsHandler;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class SwapiStepdefs {
    BLogPostsHandler bLogPostsHandler = new BLogPostsHandler();

    @And("Send post request to create a blogpost and get {int}")
    public void sendPostRequestToCreateBlogPostInSwapiAndGetResponse(int responseStatus) {
        bLogPostsHandler.getBlogPostsList();
        int status = bLogPostsHandler.postBlogPost("I can post a post)");
        Assert.assertEquals(status, responseStatus);
    }

}
