package com.bank.sys;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Account {
    protected int agency;
    protected int number;
    protected double balance;

    Random random = new Random();

    public Account() {
        this.agency = 1;
        this.number = random.nextInt(1001, 9999);
        this.balance = 0;
    }

    public Account(int agency, int number) {
        this.agency = agency;
        this.number = number;
    }

    boolean stop = false;

    public void run(HttpServletResponse response) throws IOException {
        try {
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();

            switch (input) {
                case 1:
                    this.withdraw(response);
                    break;
                case 2:
                    this.deposit(response);
                    break;
                case 3:
                    this.transfer(response);
                    break;
                case 4:
                    stop = true;
                    break;
                default:
                    response.getWriter().println("Please enter a valid number");
                    break;
            }
        } catch (InputMismatchException e) {
            response.getWriter().println("Please insert a valid number");
        }
    }

    public void withdraw(HttpServletResponse response) throws IOException {
        stop = false;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                response.getWriter().printf("Insert the value of the withdrawal");
                double value = scan.nextDouble();
                if (value > this.balance) {
                    response.getWriter().printf("Insufficient balance.");
                } else {
                    this.balance -= value;
                    stop = true;
                    response.getWriter().printf("New balance on account %d: US$%.2f %n", this.number, this.balance);
                }

            } catch (InputMismatchException e) {
                response.getWriter().printf("Please insert a valid number");
            }
        } while (!stop);
    }


    public void withdraw(double value) {
        this.balance -= value;
    }

    public void deposit(HttpServletResponse response) throws IOException {
        stop = false;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                response.getWriter().println("Insert the value of the deposit");
                double value = scan.nextDouble();
                this.balance += value;
                stop = true;
                response.getWriter().printf("New balance on this %d: US$%.2f %n", this.number, this.balance);
            } catch (InputMismatchException e) {
                response.getWriter().println("Please insert a valid number");
            }
        } while (!stop);
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void transfer(HttpServletResponse response) throws IOException {
        stop = false;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                response.getWriter().println("Insert the agency and number of the destination account");
                int destinationAccountAgency = scan.nextInt();
                int destinationAccountNumber = scan.nextInt();

                Account account1 = new Account(destinationAccountAgency, destinationAccountNumber);

                response.getWriter().println("Insert the value of the transfer");
                double value = scan.nextDouble();

                if (value > this.balance) {
                    response.getWriter().println("Insufficient balance.");
                } else {
                    this.withdraw(value);
                    account1.deposit(value);
                    stop = true;
                    response.getWriter().println("Transfer successful.");
                    response.getWriter().printf("New balance on account %s: US$%.2f %n", this.number, this.balance);
                    response.getWriter().printf("New balance on account %s: US$%.2f %n", account1.number, account1.balance);
                }
            } catch(InputMismatchException e) {
                response.getWriter().println("Please insert a valid number");
            }
        } while (!stop);
    }

}


