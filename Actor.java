public abstract class Actor implements ActorBehaviour{
    abstract String GetName();
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
}
