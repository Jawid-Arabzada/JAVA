package FINALPROJECT;

public class VIPDataBase {
	String name ;
	String user ;
	String password ;
	String NP;
    char type;
    
    
    VIPDataBase (String name , String user , String password , String NP ,char type) 
	 {
	 
	
			 this.name = name;
			 this.user = user ;
			 this.password = password ;
			 this.NP = NP;
		
		 
	 
	 
	 }
	 
    String getUser()
    {
    	return user;
    }
    String getPassword()
    {
    	return password ;
    }
    String getName()
    {
    	return name;
    }

}
