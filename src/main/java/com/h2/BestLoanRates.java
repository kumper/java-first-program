package com.h2;

import java.util.Map;
import java.util.Scanner;

import static java.lang.String.format;

/**
 * Add your description here.
 *
 * @author PZK8WZ
 * @since 02/kwi/2021
 */
public class BestLoanRates {
    public static final Map<Integer, Float> bestRates = Map.of(
            1, 5.50f,
            2, 3.45F,
            3, 2.67f
    );

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println(format("Hello %s", name));
        System.out.println("Enter the loan term (in years)");
        final var loanTermInYears = scanner.nextInt();
        final float bestRate = getRates(loanTermInYears);
        if (bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        } else {
            System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%");
        }
    }

    public static float getRates(int loanTermInYears) {
        if (bestRates.containsKey(loanTermInYears)) {
            return bestRates.get(loanTermInYears);
        }
        return 0.0f;
    }
}
