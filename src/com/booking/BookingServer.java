package com.booking;
import static spark.Spark.*;

public class BookingServer {

    public static void main(String[] args) {
	// write your code here
        get("/session/:sessionId",(req, res) -> "{Steven Shao}");

    }
}
