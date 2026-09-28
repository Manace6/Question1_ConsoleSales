public class Main {

    public static void main(String[] args) {
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-18s%-10s%-10s%-10s%n", "", consoles[0], consoles[1], consoles[2]);

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-10d%-10d%-10d%n",
                    cities[i].toUpperCase(), sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-18s%d%n", cities[i].toUpperCase(), cityTotal);

            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.printf("CITY WITH THE MOST SALES: %s%n", topCity.toUpperCase());
        System.out.println("--------------------------------------------------");
        System.out.println();
    }
}