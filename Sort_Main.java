//���� //200420

package pack1;

public class Sort_Main {

   public static void main(String[] args) {
      
      Sort sort = new Sort(); // Sort�� ��ü sort ����
      FileManager fileManager = new FileManager(); 
      
      fileManager.fileReader(); // ���� �б�
      sort.selection(fileManager.arr);			//�Ű������� ���� �ʾҴٸ� for������ fileManager.arr�� sort.arr�� �ְ� // sort�޼��� �Ŀ� �ٽ� sort.arr���� fileManager.arr�� �־����.
      fileManager.fileWriter();					//����� �Ű������� �־����� fileManager.arr�� �޾Ƽ� sort�ϰ� �״�� fileManager.arr�� ��ȯ�Ѵ�.
      
//      long beforeTime = System.currentTimeMillis(); //�ڵ� ���� ���� �ð� �޾ƿ���
//      
//      sort.selection();				// ���� ���� (����)
//      sort.insertion();				// ���� ���� (����)
////      sort.mergeSort(sort.arr);		// ���� ���� (�պ�)
////      sort.quickSort(sort.arr);		// ���� ���� (��)
//      
//      
//      long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
//      long secDiffTime = (afterTime - beforeTime);// /1000; //�� �ð��� �� ���
//      System.out.println("�ð�����(m) : "+secDiffTime);
//
//      sort.fileWriter();      // ���� ����
//      
//     
   
   }

}
