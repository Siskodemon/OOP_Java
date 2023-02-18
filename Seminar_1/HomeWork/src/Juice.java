
import java.util.HashMap;
import java.util.Map;

public class Juice extends Product {
    private String percent;
    Map<Integer,String> type_product = new HashMap<>();
    
    /**
     * @param Index это индекс процента содержания сока в продукте
     * @return
     */
    private String Percent(Integer Index){
        type_product.put(1, "Сок");
        type_product.put(2, "Нектар");
        type_product.put(3, "Сокосодержащий продукт");
        if(type_product.containsKey(Index) == true){
            return type_product.get(Index);
        }
        else
        return "Продукт не является соком";
        }

    public Juice(Integer per, String name, double cost) {
        super(name, cost);
        this.percent = Percent(per);
        
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(", тип продукта - %s",percent));
        return localString.toString();
    }
}
