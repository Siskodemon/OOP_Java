import java.util.HashMap;
import java.util.Map;

public class Meat extends Product{
    private String in;
    private Integer weight;
    Map<Integer, String> type_product = new HashMap<>();


    public Meat(String name, Integer w, double cost) {
      super(name,cost);
      this.weight = w;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(", масса куска - %d грамм",weight));
        return localString.toString();
    }
}