/*
 class Thespian -- 

 */
public class Thespian extends Student{

    // instance variables inherited from Student

    //default constructor
    public Thespian(){
	    
	_socStat= 10;
    
	_intelligence= 10;
    
	_mentHealth= 20;
    
	_physHealth= 20;
    
	_friendCnt= 2;
    
        _popularity=0;

    }

    public Thespian( String name){
		_socStat= 10;
    
	_intelligence= 10;
    
	_mentHealth= 20;
    
	_physHealth= 20;
    
	_friendCnt= 2;
    
        _popularity=0;

	_name = name;

	//day 1
	sceneDay1[0]= "Today is the first audition of the season! All of your friends are extremely hyped to participate in the play. Do you want to: \n1) prep and audition \n2) attend and support your friends \n3) stay home in bed";

	sceneDay1[1]="It’s lunch time! You get to choose where you want to sit. Do you want to: \n1) sit with the other thespians \n2) eat your lunch in the bathroom alone \n3) You don’t care where you sit";

	sceneDay1[2]="You have some extra time after school to do something. Do you want to: \n1) practice your lines for drama class \n2) go to a spin class \n3) gossip with your other Thespians";

	sceneDay1[3]= "You’re walking in the hallway and suddenly, the school’s resident bully locks eyes with you. Do you want to: \n1) run away \n2) keep looking at him \n3) punch him";

	sceneDay1[4]= "You are wandering the halls and come across the school store. Do you \n1) buy a copy of the Hamlet \n2) buy some school apparel \n3) leave and save money";

	//day2
	sceneDay2[0]= "Someone brought some Long Island iced tea to health class and are pressuring you to have some. Do you \n1) graciously accept a sip \n2) drink water instead \n3)start a tea chugging competition (and win!)";
	sceneDay2[1]= "You are flipping through your actor autographs in math class when a fellow thespian asks if he could keep one. Do you \n1) give up all your autographs as offering to the thespians \n2) decline (and get yelled at), \n3) reluctantly give one away";
	sceneDay2[2]= "You have a free period in the middle of the day. What do you choose to do: \n1) study silently in the corner \n2) practice tongue twisters \n3) hang out with other thespians and talk about books";
	sceneDay2[3]= "One of your nerd friends keeps getting picked on by your thespian squad. Do you \n1) tell her to stop \n2) pretend you do not know the nerd friend \n3) kick the abusive thespian friend";
	sceneDay2[4]= "Today is career day! There are a lot of professionals eager to talk to you. Do you \n1) talk to the lawyer and the doctor \n2) decide to skip the career day and practice dancing \n3) talk to a professional actor and get his/her number";

	//day3
	sceneDay3[0]= "You have a play in an hour and your advisor wants to talk about proper audience behavior. Do you: \n1) decide to go home and skip the talk  \n2) go to the talk and joke around with your friends \n3) go to the talk and pay attention to what your advisor has to say";
	sceneDay3[1]= "It’s time for yoga class. You will get to chance to find nirvana. Do you \n1) go to the yoga class and relax your mind and body \n2) play video games \n3) you decline to go with your friend to the yoga class, but you end up going with another friend instead";
	sceneDay3[2]= "One of your teachers is absent. Do you \n1) do the work the teacher left you \n2) cut class and do ballet \n3) cut class with a group of people and spend time talking with them";
	sceneDay3[3]= "The person next to you in CS class offers you weed. Do you \n1) take a small amount of weed \n2) not accept and have the person make fun of you for the rest of the semester \n3) take weed from the person every single day";
	sceneDay3[4]= "There is time for silent reading in your English class. Do you \n1) do the reading and search up words you don’t know \n2) suggest an essay writing assignment to your teacher and her assistant instead 3 )pretend to read but actually sit on facebook for a period.";

	//day4
	sceneDay4[0]= "Today is the pep rally! Do you: \n1) decide to attend \n2) spend time alone and think about your future as a thespian \n3) decide to ignore everyone at the pep rally and bike around";
	sceneDay4[1]= "You finished your homework early today. Do you: \n1) spend the rest of your night reading your favorite play \n2) you decide to sleep \n3) hang out at your friend’s house";
	sceneDay4[2]= "It’s time for P.E. class! Do you: \n1) decide to cut the class and do something else \n2) make fun of all of the people who can’t run a lap \n3) you take the time to do yoga and find your inner self";
	sceneDay4[3]= "It’s the school’s weekly roast session. It’s your turn to make a roast. Do you:\n1) make fun of your nerd friends for being study nuts \n2) make the best roasts of the week \n3) pretend to trip and fall in order to make everyone laugh";
	sceneDay4[4]= "It’s party time! Your friends are throwing the biggest party of the week! Do you want to: \n1) do your overdue book report \n2) you go, end up drunk and be the most annoying person at the party \n3) create your own party at your house and invite all your thespian friends and a couple of new people";

    }

}
