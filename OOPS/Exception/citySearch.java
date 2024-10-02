package OOPS.Exception;

import java.util.Scanner;

public class citySearch {
    void citySearching(String[] cities, String searchCity) throws NoMatchFoundError {
        boolean found = false;
        for (String city : cities) {
            if (city.equals(searchCity)) {
                found = true;
                break;
            }
        }
        if (!found) {
            throw new NoMatchFoundError("City not found");
        }
        else {
            System.out.println("City found");
        }
    }
    public static void main(String[] args) {
        citySearch obj = new citySearch();
        Scanner sc = new Scanner(System.in);
        String[] cities ;
        System.out.println("Enter the number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();
        cities = new String[n];
        System.out.println("Enter the cities: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter city " + (i + 1) + ": ");
            cities[i] = sc.nextLine();
        }
        System.out.println("Enter the city to search: ");
        String city = sc.nextLine();
        try {
            obj.citySearching(cities, city);
        } catch (NoMatchFoundError e) {
            System.out.println(e.getMessage());
        }
    }
}
