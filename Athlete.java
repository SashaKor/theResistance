/*
 class Athlete -- 
- High​ ​ physical​ ​ health
- Low​ ​ intelligence
- High​ ​ friend​ ​ count
- Average​ ​ mental​ ​ health
- High​ ​ Social​ ​ Status
 */
public class Athlete extends Student{

    // instance variables inherited from Student
    
    //default constructor
    public Athlete(){
	    
	_socStat= 10;
    
	_intelligence= 2;
    
	_mentHealth= 5;
    
	_physHealth= 10;
    
	_friendCnt= 10;
    
        _popularity=0;

    }

    public Athlete(String name){
	_socStat= 10;
	_intelligence= 2;
	_mentHealth= 5;
	_physHealth= 10;
	_friendCnt= 10;
        _popularity=0;
	_name = name;

	//day 1
	sceneDay1[0]= "Today is the first basketball game of the season! Everyone’s extremely hyped to attend the sporting event. Do you want to: 1) play in the game 2) attend and support your friends 3) stay home in bed";

	sceneDay1[1]="It’s lunch time! You get to choose where you want to sit. Do you want to: 1) sit with the other athletes 2) eat your lunch in the bathroom alone 3) You don’t care where you sit";

	sceneDay1[2]="You have some extra time after school to do something. Do you want to: 1) study for your math test 2) work out at the gym 3) play videogames at your friend’s house";

	sceneDay1[3]= "You’re walking in the hallway and suddenly, the school’s resident bully locks eyes with you. Do you want to: 1) run away 2) keep looking at him 3) punch him";

	sceneDay1[4]= "You are wandering the halls and come across the school store. Do you 1) buy a protein shake 2) buy some school apparel 3) leave and save money ";
	//sceneDay1[5]= " athlete ";

	//day2
	sceneDay2[0]= " athlete ";
	sceneDay2[1]= " athlete ";
	sceneDay2[2]= " athlete ";
	sceneDay2[3]= " athlete ";
	sceneDay2[4]= " athlete ";

	//day3
	sceneDay3[0]= " athlete ";
	sceneDay3[1]= " athlete ";
	sceneDay3[2]= " athlete ";
	sceneDay3[3]= " athlete ";
	sceneDay3[4]= " athlete ";

	//day4
	sceneDay4[0]= " athlete ";
	sceneDay4[1]= " athlete ";
	sceneDay4[2]= " athlete ";
	sceneDay4[3]= " athlete ";
	sceneDay4[4]= " athlete ";

	//day5
	sceneDay5[0]= " athlete ";
	sceneDay5[1]= " athlete ";
	sceneDay5[2]= " athlete ";
	sceneDay5[3]= " athlete ";
	sceneDay5[4]= " athlete ";
	
    }
}
	



