
public class Review01 {

    public static void main(String[] args) {
        int price   = 1443; //商品価格を代入
        int taxRate = 10;   //税率を代入
        int VAT;
        VAT = tax(price, taxRate);
        System.out.println(price + "円の商品の税込価格は" + (price + VAT) + "円（消費税は" + (VAT) + "円）です。");
    }

    public static int tax(int price, int taxRate) {
        int VAT = price * taxRate/100; //消費税額を計算
        return VAT;

    }

}