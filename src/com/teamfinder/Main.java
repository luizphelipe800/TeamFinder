package com.teamfinder;

import com.teamfinder.utils.ConexaoDB;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Connection conn = new ConexaoDB.getConnection();
    }
}
