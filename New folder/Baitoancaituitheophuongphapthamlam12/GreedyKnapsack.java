public class GreedyKnapsack {
    static class Item {
        int weight;
        int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

      
    }
    public static int greedyKnapsack(Item[] items, int maxWeight) {
        // Sap xep do vat theo khoi luong tang dan
        sapXep(items);

        int currentWeight = 0;
        int totalValue = 0;
        // Mỗi loại đồ vật chỉ được cho phép 1 vật 
        for(Item item: items){
            if(currentWeight + item.weight <= maxWeight){
                currentWeight += item.weight;
                totalValue += item.value;
            }
            else{
                break;
            }
            
        }
        return totalValue;
    }


    public static void sapXep(Item[] items) {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(items[i].weight > items[j].weight){
                    Item temp = items[i];
                    items[i] = items[j];
                    items[j] =temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Item[] items = {
            new Item(5, 21),
            new Item(7, 42),
            new Item(8, 20),
            new Item(3, 9)
        };
        int maxWeight = 20;
        int maxValue = greedyKnapsack(items, maxWeight);
        System.out.println(maxValue);

    }
}
