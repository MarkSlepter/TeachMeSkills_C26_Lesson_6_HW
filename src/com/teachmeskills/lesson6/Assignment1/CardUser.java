package com.teachmeskills.lesson6.Assignment1;

public class CardUser {
    public static void main(String[] args) {

        CreditCard myCart1 = new CreditCard(1, 283.2);
        CreditCard myCart2 = new CreditCard(2, 1999);
        CreditCard myCart3 = new CreditCard(3, 3246.254);

        myCart1.addAmount(5777);
        myCart2.addAmount(980);
        myCart3.withdraw(333777);

        myCart1.balanceInfo();
        myCart2.balanceInfo();
        myCart3.balanceInfo();
    }
}
