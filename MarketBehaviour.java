public interface MarketBehaviour {
    void acceptOrder(String order);
    String fulfillOrder();
}
