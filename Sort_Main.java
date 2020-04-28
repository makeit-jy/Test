//최종 //200420

package pack1;

public class Sort_Main {

   public static void main(String[] args) {
      
      Sort sort = new Sort(); // Sort의 객체 sort 선언
      FileManager fileManager = new FileManager(); 
      
      fileManager.fileReader(); // 파일 읽기
      sort.selection(fileManager.arr);			//매개변수로 넣지 않았다면 for문으로 fileManager.arr을 sort.arr에 넣고 // sort메서드 후에 다시 sort.arr값을 fileManager.arr에 넣어야함.
      fileManager.fileWriter();					//여기는 매개변수로 넣었으니 fileManager.arr을 받아서 sort하고 그대로 fileManager.arr을 반환한다.
      
//      long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
//      
//      sort.selection();				// 정렬 진행 (선택)
//      sort.insertion();				// 정렬 진행 (삽입)
////      sort.mergeSort(sort.arr);		// 정렬 진행 (합병)
////      sort.quickSort(sort.arr);		// 정렬 진행 (퀵)
//      
//      
//      long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//      long secDiffTime = (afterTime - beforeTime);// /1000; //두 시간에 차 계산
//      System.out.println("시간차이(m) : "+secDiffTime);
//
//      sort.fileWriter();      // 파일 저장
//      
//     
   
   }

}
