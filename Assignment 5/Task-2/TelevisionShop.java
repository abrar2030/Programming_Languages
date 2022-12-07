package homework;

public enum TelevisionShop {
    SAMSUNG (67,56,11),
    LG (89,65,22),
    SKYWORTH (76,41,453),
    SONY (44,91,71),
    SHARP (60,42,69);

    private final int stock,minimal,maximal;

     TelevisionShop(int stock,int minimal,int maximal){
        this.stock=stock;
        this.minimal=minimal;
        this.maximal=maximal;
     }

     public static String mmax(){
        StringBuilder sb = new StringBuilder();
        for(TelevisionShop tv : TelevisionShop.values()){
            sb.append(" Min: ").append(tv.minimal);
            sb.append(" Max: ").append(tv.maximal);
            sb.append(System.lineSeparator()); 
        }
        return sb.toString();
    }
    public static String specific(TelevisionShop tv){
        StringBuilder sb = new StringBuilder();
        sb.append(" Min: ").append(tv.minimal);
        sb.append(" Max: ").append(tv.maximal);
        sb.append(System.lineSeparator()); 
        return sb.toString();
    }
public static String everyinfo(){
    StringBuilder sb = new StringBuilder();
    for(TelevisionShop tv : TelevisionShop.values()){
        sb.append(tv.ordinal()).append(":");
        sb.append(tv.name());
        sb.append(" Min: ").append(tv.minimal);
        sb.append(" Max: ").append(tv.maximal);
        sb.append(System.lineSeparator()); 
    }
    return sb.toString();
}
public String toString(){
    return " "+ this.name() + "Min" + this.minimal + "Max"+this.maximal;
}
}
