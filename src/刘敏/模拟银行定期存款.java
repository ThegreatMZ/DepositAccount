	/**
	 * 
	 */
	package 刘敏;

	/**
	 * @author 刘敏
	 *@file:模拟银行定期存款.java
	*@package:刘敏
	*@project:刘敏
	*@date time:2017年10月14日下午5:32:10
	*@location:https://github.com/ThegreatMZ/DepositAccount.git
	 */
	public class 模拟银行定期存款 { 	 	
		public static void main(String args[]) { 		 		
			DepositAccount saver = new DepositAccount("ZhangSan","1234567890",5000); 		
			DepositAccount.setannualInterestRate(0.023); //设置年利率 	
			System.out.println("accountnumber:"+saver.getaccountnumber()); // 查询账号 	
			System.out.println("username:"+saver.getname());//查询用户名 			
			System.out.println("old balance:"+saver.getbalance()); //查询余额 		
			System.out.println("年利息是：" + saver. canculate_yea()); 
			System.out.println("月利息是：" + saver. canculate_yea()/12); 	
			saver.save(2000); 		
			saver.withdraw(200); 	
			} 
		} 
	class DepositAccount{ 	
		private String username; //储户姓名 	
		private String accountnumber; //账号 	
		private int password; //密码 	
		private float balance; //存款余额 	
		static double annualInterestRate; //年利率，类成员变量 	
		DepositAccount(String name,String number,float ba)//初始化开户，构造方法 	
		{ 		 		
			this.accountnumber = number; 		
			this.username = name; 		
			this.balance = ba; 	
			} 	 	
		public void save(float m){ //存款 		
			System.out.println("old balance：" + balance); 		
			System.out.println("save：" + m); 		
			balance += m; 		
			System.out.println("new balance：" + balance); 	
			} 	 	
		public boolean withdraw(float m){ //取款 		
			if(m <= balance){ 			
				balance -=m; 			
				System.out.println("取款成功!new balance:" + balance); 			
				return true; 		
				} 		
			else { 			
				System.out.println("余额不足!" );
				return false;
				} 	
			} 	 	
		public String getname(){ //查询储户姓名 		
			return username; 	
			} 	 	
		public String getaccountnumber(){ //查询账号 		
			return accountnumber; 	
			} 	 	
		public float getbalance(){ //查询余额 		
			return balance; 	
			} 	 	
		public void setpassword(int pass){ //设置密码 		
			password=pass; 	
			} 
		
		public static void setannualInterestRate(double newannualInterestRate) { //设置年利率 		
			annualInterestRate =newannualInterestRate; 		
			}
		public double canculate_yea() { //计算年利息 		
			return balance*annualInterestRate; 		
			} 	
		public double canculate_mon() { //计算月利息 		
			return balance*annualInterestRate/12; 		
		    }
		
		
		} 	 

