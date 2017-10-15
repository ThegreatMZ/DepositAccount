/**
 * 
 */
package 刘敏;

/**
 * @author 刘敏
 *@package_name:刘敏
*@file_name:Student.java
*@date-time:2017年10月15日下午4:10:27
*@location:https://github.com/ThegreatMZ/DepositAccount.git
 */
public class Student{//Student类
	String name;//姓名
	int age;//年龄
	static String education;//学历
	public Student(String name,int age,String education){//构造方法
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
class Undergraduate extends Student{//本科生类，从学生类继承
    private String specialty;
    public Undergraduate( String name , int age , String education , String spe ){
       super( name ,age , education );
       this.specialty = spe;
    }
    public void show(){//覆盖父类的同名show()方法
         System.out.println("姓名：" + name);
         System.out.println("年龄：" + age );
         System.out.println("学位：" +education);
         System.out.println("专业：" + specialty);
    }
}
class Graduate extends Student{//研究生类，从学生类继承
    private String direction;//研究方向
    public Graduate( String name , int age , String degree , String stu){
      super( name ,age , education );
       this.direction = stu;
    }
    public void show(){//覆盖父类的同名show()方法
         System.out.println("姓名：" + name);
         System.out.println("年龄：" + age );
         System.out.println("学位：" + education);
         System.out.println("研究方向：" + direction);
    }
}
