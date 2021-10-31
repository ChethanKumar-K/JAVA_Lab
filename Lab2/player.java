class Player{
    int id;
    String name;
    int matches;
    int[] scores;
    Player(int i,String nam,int match,int[] score){
        id=i;
        name=nam;
        matches=match;
        scores=score;
    }
    float getAvg(){
        int sum=0;
        float avg;
        for(int i=0;i<matches;i++){
            sum+=scores[i];
        }
        avg=(float)sum/matches;
        return avg;
    }
    void getDetails(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Number of matches played:"+matches);
        for(int i=0;i<matches;i++){
            System.out.print(scores[i]+"\t");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    int[] s1 = {1,2,3,4};
	    int[] s2 = {4,5,2,0};
		Player p1=new Player(12,"Chethan",4,s1);
		Player p2=new Player(14,"Yuva",4,s2);
		float  p1_avg=p1.getAvg();
		float p2_avg=p2.getAvg();
		if(p1_avg>p2_avg) p1.getDetails();
		else if(p2_avg>p1_avg) p2.getDetails();
		else System.out.println("Both the players have the same average.");
	}
}
