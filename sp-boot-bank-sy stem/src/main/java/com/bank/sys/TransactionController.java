package com.bank.sys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

@RestController
public class TransactionController extends Account {

    @GetMapping("/")
    public void localRedirect(HttpServletResponse response) throws IOException {
        Account account = new Account();
        RedirectView redirect = new RedirectView();
        Scanner scan = new Scanner(System.in);

        redirect.setUrl("/a");
        response.getWriter().println("1 to Withdraw, 2 to deposit, 3 to transfer, 4 to stop");
        int input = scan.nextInt();
        String output = switch(input) {
            case 1:
                account.deposit(response);
                yield "a";
            default:
                yield "b";
        };
        response.getWriter().println(output);
        int a = scan.nextInt();

        //return redirect;
        //account.run(response);
    }

}
