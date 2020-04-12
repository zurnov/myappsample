package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
	System.out.println("Test");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int TreeSize = Integer.parseInt(reader.readLine());
	for (int i = 0; i <= TreeSize ; i++){

	    for(int k = 0; k <= TreeSize; k++ ){
            if(k<=i)
	        System.out.print("*");
        };
        System.out.println();
    }
    }
}
