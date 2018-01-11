/*
 class Weirdo -- 

 */
public class Weirdo extends Student{

    // instance variables inherited from Student

    //default constructor
    public Weirdo(){
	    
	_socStat= 10;
    
	_intelligence= 10;
    
	_mentHealth= 20;
    
	_physHealth= 20;
    
	_friendCnt= 2;
    
        _popularity=0;

    }

    public Weirdo(String name){
		_socStat= 10;
    
	_intelligence= 10;
    
	_mentHealth= 20;
    
	_physHealth= 20;
    
	_friendCnt= 2;
    
        _popularity=0;

	_name = name;
    }
}
