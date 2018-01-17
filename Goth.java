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

	//day 1
	sceneDay1[0]= "Today is the first cemetery ritual of the season! All of your friends are extremely hyped to attend the event. Do you want to: \n1) lead the ritual \n2) attend and support your friends \n3) stay home in bed";

	sceneDay1[1]="It's lunch time! You get to choose where you want to sit. Do you want to: \n1) sit with the other goths \n2) eat your lunch in the bathroom alone \n3) You don't care where you sit";

	sceneDay1[2]="You have some extra time after school to do something. Do you want to: \n1) study for your philosophy test \n2) go to the graveyard and walk around \n3) talk about the meaning of life with your goth friends";

	sceneDay1[3]= "You're walking in the hallway and suddenly, the school's resident bully locks eyes with you. Do you want to: \n1) run away \n2) give him the ~evil eye~ \n3) attempt to punch him";

	sceneDay1[4]= "You are wandering the halls and come across the school store. Do you \n1) buy a vial of blood \n2) buy some school apparel \n3) leave and save money.";

	//day2
	sceneDay2[0]= "Someone brought a vial of blood to health class and are pressuring you to have some. Do you \n1) graciously accept a sip  \n2) drink water instead  \n3)start a blood chugging competition (and win!)";
	sceneDay2[1]= "You are browsing through your collection of rat teeth in math class when a fellow goth asks if he could keep one. Do you \n1) give up all your teeth as offering to the goths \n2) decline (and get yelled at), \n3) reluctantly give one away";
	sceneDay2[2]= "You have a free period in the middle of the day. What do you choose to do: \n1) study silently in the corner \n2) sharpen your blades \n3) hang out with other goths and talk about death";
	sceneDay2[3]= "One of your nerd friends keeps getting picked on by your goth squad. Do you \n1) tell her to stop \n2) pretend you do not know the nerd friend \n3) bite the abusive goth friend";
	sceneDay2[4]= "Today is career day! There are a lot of professionals eager to talk to you. Do you \n1) talk to the lawyer and the doctor \n2) decide to skip the career day and skinning animals \n3) talk to a professional butcher and get his/her number";

	//day3
	sceneDay3[0]= "You have to attend a sacrifice in an hour and your leader wants to talk about safety and the rules. Do you: \n1) decide to go home and skip the lecture \n2) go to the talk and joke around with your friends \n3) go to the talk and pay attention to what your leader has to say";
	sceneDay3[1]= "It's time for yoga class. You will get to chance to find nirvana. Do you \n1) go to the yoga class and relax your mind and body \n2) play video games \n3) you decline to go with your friend to the yoga class, but you end up going with another friend instead";
	sceneDay3[2]= "One of your teachers is absent. Do you \n1) do the work the teacher left you \n2) cut class and climb walls \n3) cut class with a group of people and spend time talking with them";
	sceneDay3[3]= "The person next to you in CS class offers you weed. Do you \n1) take a small amount of weed \n2) not accept and have the person make fun of you for the rest of the semester \n3) take weed from the person every single day";
	sceneDay3[4]= "There is time for silent reading in your English class. Do you \n1) do the reading and search up words you don't know \n2) suggest an essay writing assignment to your teacher and her assistant instead 3 )pretend to read but actually sit on facebook for a period.";

	//day4
	sceneDay4[0]= "Today is the pep rally! Do you: \n1) decide to attend \n2) spend time alone and think about your future as a goth \n3) decide to ignore everyone at the pep rally and do ballroom";
	sceneDay4[1]= "You finished your homework early today. Do you: \n1) spend the rest of your night reading a good book about torture through the ages \n2) you decide to sleep \n3) hang out at your friend's house";
	sceneDay4[2]= "It's time for P.E. class! Do you: \n1) decide to cut the class and do something else \n2) make fun of all of the people who can't run a lap \n3) you take the time to do yoga and find your inner self";
	sceneDay4[3]= "It's the school's weekly roast session. It's your turn to make a roast. Do you:\n1) make fun of your nerd friends for being study nuts \n2) make the best roasts of the week \n3) pretend to trip and fall in order to make everyone laugh";
	sceneDay4[4]= "It's party time! Your friends are throwing the biggest party of the week! Do you want to: \n1) do your overdue book report \n2) you go, end up drunk and be the most annoying person at the party \n3) create your own party at your house and invite all your goth friends and a couple of new people";

    }

}
