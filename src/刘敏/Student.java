/**
 * 
 */
package ����;

/**
 * @author ����
 *@package_name:����
*@file_name:Student.java
*@date-time:2017��10��15������4:10:27
*@location:https://github.com/ThegreatMZ/DepositAccount.git
 */
public class Student{//Student��
	String name;//����
	int age;//����
	static String education;//ѧ��
	public Student(String name,int age,String education){//���췽��
		this.name=name;
		this.age=age;
		this.education=education;
	}
	public void show(){
      System.out.println( name + "," + age + "," + education );
   }
   public void setName( String name ){ this.name = name ; }
   public String getName( ){ return this.name ;}

}
class Undergraduate extends Student{//�������࣬��ѧ����̳�
    private String specialty;
    public Undergraduate( String name , int age , String education , String spe ){
       super( name ,age , education );
       this.specialty = spe;
    }
    public void show(){//���Ǹ����ͬ��show()����
         System.out.println("������" + name);
         System.out.println("���䣺" + age );
         System.out.println("ѧλ��" +education);
         System.out.println("רҵ��" + specialty);
    }
}
class Graduate extends Student{//�о����࣬��ѧ����̳�
    private String direction;//�о�����
    public Graduate( String name , int age , String degree , String stu){
      super( name ,age , education );
       this.direction = stu;
    }
    public void show(){//���Ǹ����ͬ��show()����
         System.out.println("������" + name);
         System.out.println("���䣺" + age );
         System.out.println("ѧλ��" + education);
         System.out.println("�о�����" + direction);
    }
}
