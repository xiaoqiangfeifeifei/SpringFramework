package com.gary.demo.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @ClassName: ResourceDemo
 * @Author garylovekira
 * @Date 2021/1/23
 * @Version 1.0
 */
public class ResourceDemo {
	public static void main(String[] args) throws IOException {
		FileSystemResource fileSystemResource = new FileSystemResource("E:\\learnProject\\spring-framework-5.2.0.RELEASE\\springdemo\\src\\main\\java\\com\\gary\\demo\\resource\\Test.txt");
		File file = fileSystemResource.getFile();

		System.out.println(file.length());

		OutputStream outputStream = fileSystemResource.getOutputStream();

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

		bufferedWriter.write("hello world");

		bufferedWriter.flush();

		outputStream.close();

		bufferedWriter.close();


	}
}
