import java.util.*;
//import javafx.scene.chart.PieChart.Data;
public class SalesAggregator {
    public static void main(String[] args) {
        List<Data>sales22=new ArrayList<>();
        sales22.add(new Data("Tea",120));
        sales22.add(new Data("Coffee",110));
        sales22.add(new Data("Green Tea",100));

        List <Data>sales21 = new ArrayList<>();
        sales21.add(new Data("Tea",100));
        sales21.add(new Data("Coffee",100));
        sales21.add(new Data("Green Tea",75));

        for(int i=0;i<sales22.size();i++){
            System.out.println(sales22.get(i));
        }
    }    
}
