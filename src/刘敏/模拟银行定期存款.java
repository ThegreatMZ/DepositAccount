	/**
	 * 
	 */
	package ����;

	/**
	 * @author ����
	 *@file:ģ�����ж��ڴ��.java
	*@package:����
	*@project:����
	*@date time:2017��10��14������5:32:10
	*@location:https://github.com/ThegreatMZ/DepositAccount.git
	 */
	public class ģ�����ж��ڴ�� { 	 	
		public static void main(String args[]) { 		 		
			DepositAccount saver = new DepositAccount("ZhangSan","1234567890",5000); 		
			DepositAccount.setannualInterestRate(0.023); //���������� 	
			System.out.println("accountnumber:"+saver.getaccountnumber()); // ��ѯ�˺� 	
			System.out.println("username:"+saver.getname());//��ѯ�û��� 			
			System.out.println("old balance:"+saver.getbalance()); //��ѯ��� 		
			System.out.println("����Ϣ�ǣ�" + saver. canculate_yea()); 
			System.out.println("����Ϣ�ǣ�" + saver. canculate_yea()/12); 	
			saver.save(2000); 		
			saver.withdraw(200); 	
			} 
		} 
	class DepositAccount{ 	
		private String username; //�������� 	
		private String accountnumber; //�˺� 	
		private int password; //���� 	
		private float balance; //������ 	
		static double annualInterestRate; //�����ʣ����Ա���� 	
		DepositAccount(String name,String number,float ba)//��ʼ�����������췽�� 	
		{ 		 		
			this.accountnumber = number; 		
			this.username = name; 		
			this.balance = ba; 	
			} 	 	
		public void save(float m){ //��� 		
			System.out.println("old balance��" + balance); 		
			System.out.println("save��" + m); 		
			balance += m; 		
			System.out.println("new balance��" + balance); 	
			} 	 	
		public boolean withdraw(float m){ //ȡ�� 		
			if(m <= balance){ 			
				balance -=m; 			
				System.out.println("ȡ��ɹ�!new balance:" + balance); 			
				return true; 		
				} 		
			else { 			
				System.out.println("����!" );
				return false;
				} 	
			} 	 	
		public String getname(){ //��ѯ�������� 		
			return username; 	
			} 	 	
		public String getaccountnumber(){ //��ѯ�˺� 		
			return accountnumber; 	
			} 	 	
		public float getbalance(){ //��ѯ��� 		
			return balance; 	
			} 	 	
		public void setpassword(int pass){ //�������� 		
			password=pass; 	
			} 
		
		public static void setannualInterestRate(double newannualInterestRate) { //���������� 		
			annualInterestRate =newannualInterestRate; 		
			}
		public double canculate_yea() { //��������Ϣ 		
			return balance*annualInterestRate; 		
			} 	
		public double canculate_mon() { //��������Ϣ 		
			return balance*annualInterestRate/12; 		
		    }
		
		
		} 	 

