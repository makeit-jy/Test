//200427 Sort클래스 내부에 있던 fileReader와 fileWriter를 FileManager클래스로 분류했음.

package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {
   
   /*************   Sort 클래스가 가지는 변수들   *************/
   int[] arr;      // 숫자들 저장할 정수 배열
   String data;    // 파일입출력을 위해 arr배열의 숫자들을 변환해서 저장할 String형 변수 data    
   int size;       // 배열의 크기
   /* * * * * * * * * * * * * * * * * * * * * * * * * */
   
   
   /* Sort 클래스가 가지는 함수들 */
   /* fileReader,fileWriter,selection,insertion,merge,quick,print */
   
   void fileReader() {/* arr 배열에 numbers.txt에 쓰여있는 정보를 저장 */
      String fileName = "numbers.txt";
      File file = new File(fileName);      //연결 준비
      data = "";
      
      if(file.exists()) {
         FileReader fr = null;         //전체 읽는거 연결 준비
         BufferedReader br = null;      //1줄 씩 읽는거 연결 준비
         try {
            fr = new FileReader(file);      //file을 읽는 통로 연결
            br = new BufferedReader(fr);   //fr을 1줄 씩 읽는 통로 연결
            while(true) {
               String line = br.readLine();   //1줄 씩 읽어
               if(line == null) {            //읽었는데 읽을 게 없으면
                  break;                  //빠져나와 (while(true)반복문)
               }
               data += line;
               data += "\n";
            }
            data = data.substring(0, data.length()-1);  //[0~data의 마지막 인덱스 미만!까지]
            											// 마지막 글자 하나 빼기(마지막"\n"삭제)
            String[] temp = data.split("\n");           //엔터(줄바꿈)기준으로 잘라서 temp[]에 넣기
            size = temp.length;                       //temp의 개수
            arr = new int[size];
            for(int i=0; i<size; i++) {
               arr[i] = Integer.parseInt(temp[i]);
            }
            fr.close();
            br.close();
         }
         catch(Exception e) { e.printStackTrace(); }   
      }
      System.out.println("(1)로드완료.");
   }
   
   void fileWriter() {/* number2.txt에  arr의 정보를 저장(저장을 위해 String data를 매개로 한다) */  
      String fileName = "numbers2.txt";   
      data = "";
      for(int i=0; i<size; i++) {
         data += arr[i];
         data += "\n";
      }                  
      FileWriter fw = null;
      try {
         fw = new FileWriter(fileName);
         fw.write(data);
         fw.close();
      }catch(Exception e) { e.printStackTrace(); }
      System.out.println("(3)저장완료.");
   }  



}
