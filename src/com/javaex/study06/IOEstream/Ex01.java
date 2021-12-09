package com.javaex.study06.IOEstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception{
		/*
		1.1 바이트 스트림 
		1과 0으로 구성된 데이터의 입력 처리를 위한 스트림.
		이미지나 사진을 입출력 할때 사용함.
		
		InputStream은 입력 outputStream은 출력
		각각의 자식 클래스인 FileInputStream과 FileOutputStream과 섞어쓰며, 
		Buffered라는 각각의 인스턴스를 만들어 출력속도를 높여준다.
		
		이름이 헷갈리니 잘 숙지하자.
		read(), write()
		
		맥북 자료 위치 : /Users/hs/JavaStudy/file/img.jpg
		깃허브 위치 :chapter05 - ex01, ex02, ex03
		*/
		
		//file폴더의 img.jpg를 bytemig.jpg로 복사하시오.
		InputStream in = new FileInputStream("/Users/hs/JavaStudy/file/img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		OutputStream out = new FileOutputStream("/Users/hs/JavaStudy/file/byteming.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
	
		while(true) {
			int data = bin.read(); // bin으로 데이터를 읽어 data라는 변수에 담는다.
			if(data==-1) { //바이트형식의 파일의 경우는 마지막에 -1이라는 코드로 끝이 나는데, -1이라는 코드가 담겨있으면 반복문을 탈출시킨다.
				System.out.println("복사가 완료 되었습니다.");
				break;
			}
			bout.write(data);//data에 담긴 코드를 써주는 메소드.
		}
		//임포트된 클래스를 닫아주자.
		bin.close();
		bout.close();
		
	}

}
