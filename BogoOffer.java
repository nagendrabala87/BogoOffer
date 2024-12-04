import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BogoOffer {

    public static void main(String[] args) {

        int[] p1 = {10, 20, 30, 40, 50, 60};
        int[] p2 = {10, 20, 30, 40, 50, 50, 60};

        process(p1);

        process(p2);
    }

    private static void process(int[] prices) {
        List<Integer> pl = new ArrayList<>();
        for (int price : prices) {
            pl.add(price);
        }
        Collections.sort(pl, Collections.reverseOrder());

        List<Integer> dis = new ArrayList<>();
        List<Integer> pay = new ArrayList<>();

        for (int i = 0; i < pl.size(); i++) {
            pay.add(pl.get(i));
            if (i + 1 < pl.size()) {
                dis.add(pl.get(i + 1));
                i++;
            }
        }
        System.out.println("discount things" + dis);
        System.out.println("payable things"+ pay);
    }
}
