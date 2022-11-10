public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("World Champ Messi",100,1000,30,90);
        Fighter f2 = new Fighter("Best Substitute Ronaldo",30,1000,150,30);
        MatchUp matchUp = new MatchUp(f1,f2,10,500);
        matchUp.run();
    }
}