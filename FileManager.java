//200427 SortŬ���� ���ο� �ִ� fileReader�� fileWriter�� FileManagerŬ������ �з�����.

package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {
   
   /*************   Sort Ŭ������ ������ ������   *************/
   int[] arr;      // ���ڵ� ������ ���� �迭
   String data;    // ����������� ���� arr�迭�� ���ڵ��� ��ȯ�ؼ� ������ String�� ���� data    
   int size;       // �迭�� ũ��
   /* * * * * * * * * * * * * * * * * * * * * * * * * */
   
   
   /* Sort Ŭ������ ������ �Լ��� */
   /* fileReader,fileWriter,selection,insertion,merge,quick,print */
   
   void fileReader() {/* arr �迭�� numbers.txt�� �����ִ� ������ ���� */
      String fileName = "numbers.txt";
      File file = new File(fileName);      //���� �غ�
      data = "";
      
      if(file.exists()) {
         FileReader fr = null;         //��ü �д°� ���� �غ�
         BufferedReader br = null;      //1�� �� �д°� ���� �غ�
         try {
            fr = new FileReader(file);      //file�� �д� ��� ����
            br = new BufferedReader(fr);   //fr�� 1�� �� �д� ��� ����
            while(true) {
               String line = br.readLine();   //1�� �� �о�
               if(line == null) {            //�о��µ� ���� �� ������
                  break;                  //�������� (while(true)�ݺ���)
               }
               data += line;
               data += "\n";
            }
            data = data.substring(0, data.length()-1);  //[0~data�� ������ �ε��� �̸�!����]
            											// ������ ���� �ϳ� ����(������"\n"����)
            String[] temp = data.split("\n");           //����(�ٹٲ�)�������� �߶� temp[]�� �ֱ�
            size = temp.length;                       //temp�� ����
            arr = new int[size];
            for(int i=0; i<size; i++) {
               arr[i] = Integer.parseInt(temp[i]);
            }
            fr.close();
            br.close();
         }
         catch(Exception e) { e.printStackTrace(); }   
      }
      System.out.println("(1)�ε�Ϸ�.");
   }
   
   void fileWriter() {/* number2.txt��  arr�� ������ ����(������ ���� String data�� �Ű��� �Ѵ�) */  
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
      System.out.println("(3)����Ϸ�.");
   }  



}
