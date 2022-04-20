package exam5;

public interface Sellable {

    double getPrice();

    default String symbol() {
        return "$";
    }

}
