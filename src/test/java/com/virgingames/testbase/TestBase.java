package com.virgingames.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {
    @BeforeClass
    public void inIt() {
        RestAssured.baseURI = "https://www.virgingames.com"; // RestAssured is a class use that function to set our base URI
        RestAssured.basePath = "/api/jackpots/bingo"; // basepath is a function
    }
}
