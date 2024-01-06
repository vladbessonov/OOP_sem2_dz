public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Иван");
        Human human2= new Human("Алексей");
        Human human3 = new Human("Александр");
        Human human4 = new Human("Валерия");
        Human human5 = new Human("Ирина");
        Market market = new Market();
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.acceptToMarket(human5);
        market.update();

    }
}
