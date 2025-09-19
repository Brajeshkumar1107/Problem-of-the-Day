import java.util.HashMap;
import java.util.Map;

public class DesignSpreadsheet {
    public static void main(String[] args) {
        
    }

    private Map<String, Integer> map = new HashMap<>();
    
    public void setCell(String cell, int value) {
        map.put(cell, value);
    }
    
    public void resetCell(String cell) {
        map.put(cell, 0);
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1);
        String[] arr = formula.split("\\+");
        int num1 = 0,
            num2 = 0;
        if (map.get(arr[0]) == null) {
            try{
                num1 = Integer.valueOf(arr[0]);
            }
            catch (NumberFormatException ex){
            }
        }
        else  num1 = map.get(arr[0]);

        if (map.get(arr[1]) == null) {
            try{
                num2 = Integer.valueOf(arr[1]);
            }
            catch (NumberFormatException ex){
            }
        } 
        else  num2 = map.get(arr[1]);

        return num1 + num2;
    }
}
