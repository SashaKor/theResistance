/*
 class Goth --

 */
public class Goth extends Student{

    // instance variables inherited from Student
    String[][] sceneDay = new String[5][4];

    //default constructor
    public Goth(){

	_socStat= 10;

	_intelligence= 10;

	_mentHealth= 20;

	_physHealth= 20;

	_friendCnt= 2;

        _popularity=0;

    }
    public Goth(String name){
		_socStat= 10;

	_intelligence= 10;

	_mentHealth= 20;

	_physHealth= 20;

	_friendCnt= 2;

        _popularity=0;

	_name = name;
    }

}
