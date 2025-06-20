package observerpattern;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStockPrice(100.0);
        market.setStockPrice(105.5);

        market.removeObserver(web);

        market.setStockPrice(110.2);
    }
}
