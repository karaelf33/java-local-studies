package generics;

public class GenericTest {

    public static void main(String[] args) {
        FootballPlayer yusuf = new FootballPlayer("yusuf");
        BaseballPlayer yusuf2=new BaseballPlayer("yusuf2");
        SoccerPlayer bestas=new SoccerPlayer("bestas");

        Team adelaideCrows=new Team("Adelaide Crows");
        adelaideCrows.addPlayer(yusuf);
        adelaideCrows.addPlayer(yusuf2);
        adelaideCrows.addPlayer(bestas);
        System.out.println(adelaideCrows.numPlayers());
    }
}
