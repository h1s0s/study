package com.javaex.study06.IOEstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		/*
		 1.2 문자스트림
		 
		바이트스트림에서는 input, output <-> 문자스트림에서는 Reader, Writer이라는 차이가 있다.
		헷갈림
		문자스트림도 Buffered라는 접시에 담아 사용하면 빠르다.
		
		메소드:
		nextLine() '
		readLine() : 한줄씩 읽어옴.
		
		
		맥북 자료 위치 /Users/hs/JavaStudy/file/Song.txt
		깃허브 위치 :chapter05 - ex01, ex02, ex03
		 */
		
		//Song.txt를 Song2.txt로 만들고, 내 이름을 적기
		Reader fr = new FileReader("/Users/hs/JavaStudy/file/Song.txt");
		BufferedReader br = new BufferedReader(fr);
		Writer fw = new FileWriter("/Users/hs/JavaStudy/file/Song2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		List<String> sList = new ArrayList<String>(); //(2)에서 텍스트를 옮겨 담기 위한 배열.
		//(1) 텍스트를 자바로 읽기
		while(true) {
			String str = br.readLine();
			if(str==null) { // null값이 있으면 다 읽은거임.
				break;
			}
			System.out.println(str);
			sList.add(str);
		}
		//(2) 텍스트를 별도의 파일로 저장
		for(String s:sList) {
			bw.write(s);
			bw.newLine();//한줄엔터
		}
			bw.write("한상선");
			
		br.close();
		bw.close();
	}

}
