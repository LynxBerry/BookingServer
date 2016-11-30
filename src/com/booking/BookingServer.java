package com.booking;
import static spark.Spark.*;

public class BookingServer {

    public static void main(String[] args) {
	// write your code here
        get("/session/:sessionId",(req, res) -> {

            res.type("application/json; charset=utf-8");
            res.header("Access-Control-Allow-Origin","*");
            return "{\"username\":\"Steven Shao\", \"gender\":\"male\"}";

        });

    }
}
