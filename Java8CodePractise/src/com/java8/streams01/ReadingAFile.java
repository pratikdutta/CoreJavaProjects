package com.java8.streams01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class ReadingAFile {
	
	public static void main(String[] args) {
		try {
			readStreamOfLinesUsingFilesWithTryBlock();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void readStreamOfLinesUsingFilesWithTryBlock() throws IOException 
	{
	    Path path = Paths.get("d:/", "data.txt");
	    //The stream hence file will also be closed here
	    try(Stream<String> lines = Files.lines(path)){
	        Optional<String> hasPassword = lines.filter(s -> s.contains("password")).findFirst();
	        if(hasPassword.isPresent()){
	            System.out.println(hasPassword.get());
	        }
	    }
	}
}
