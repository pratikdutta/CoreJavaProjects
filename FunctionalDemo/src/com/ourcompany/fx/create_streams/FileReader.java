package com.ourcompany.fx.create_streams;

import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileReader {

	public static void main(String[] args) throws Exception{
		long uniqueWords = java.nio.file.Files
            .lines(Paths.get("sample.txt"),
                    Charset.defaultCharset())
            .flatMap(line -> Arrays.stream(line.split(" ."))).distinct()
	            .count();
		System.out.println("unique Words = " + uniqueWords);
	}

}
