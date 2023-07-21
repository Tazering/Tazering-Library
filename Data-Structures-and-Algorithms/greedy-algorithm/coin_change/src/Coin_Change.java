public class Coin_Change {

    public static void main(String[] args) {
        double change = 0.63;
        double[] coins = new double[4];
        coins[0] = .25;
        coins[1] = .10;
        coins[2] = .05;
        coins[3] = .01;

        CoinChangeGreedy(change, coins);
    }

    public static void CoinChangeGreedy(double change, double[] coins) {

        while(change > 0) {
            for(int i = 0; i < coins.length; i++) {
                if(coins[i] <= change) {

                    change = change - coins[i];
                    print(i);
                    break;
                }
            }

            if(change < 0.01) {
                System.out.println("Penny");
                change = 0;
            }
        }
    }

    public static void print(int i) {
        switch(i) {
            case 0:
                System.out.println("Quarter");
                break;
            case 1:
                System.out.println("Dime");
                break;
            case 2:
                System.out.println("Nickel");
                break;
            case 3:
                System.out.println("Penny");
                break;
            default:
                break;
        }
    }


}
