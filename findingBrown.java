public class findingBrown{
    static int[][] rooms = new int[4][4];
    int _r;
    int _c;

    //default construct
    public void findingBrown(){
	//rooms= new int[4][4];

	//populate:

	// for (int x =0; x< 5; x++){
	//     rooms[0][x]= x;
	// }
	// for (int x =0; x< 5; x++){
	//     rooms[x][0]= x;}

	//for (int x =0; x< 5; x++){
	// rooms[x][0]= x;}


	//setting correct room value
	_r= (int) (Math.random()*4 +1);
	_c= (int) (Math.random()*4 +1);

    }

    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOREACH loop
    public static void print2()
    {

	for( int[] row : rooms) {
	    String result="";
	    for( int i : row ){
		result+= i+" ";}
	    System.out.println(result);
	}


    }

    //


    public static void main(String[] args){

	findingBrown find= new findingBrown();
  for (int x =0; x< 4; x++){
	    rooms[0][x]= x;
	}
	for (int x =0; x< 4; x++){
	    rooms[x][0]= x;}
	print2();

    }

}
