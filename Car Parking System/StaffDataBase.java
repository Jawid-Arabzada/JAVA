package FINALPROJECT;

public class StaffDataBase {
	
	private String name ;
	private String user ;
	private String password ;
	private String NP;
	private char type;
	private   int ID=0;
    
    
    StaffDataBase (String name , String user , String password , String NP ,char type) 
	 {
	 
	
			 this.name = name;
			 this.user = user ;
			 this.password = password ;
			 this.NP = NP;
			 ID++;
	 
	 }
    
    String getUser()
    {
    	return user;
    }
    String getPassword()
    {
    	return password;
    }
    String getName()
    {
    	return name;
    }
	 
	 

}
