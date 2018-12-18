package com.it.academy.task2;

import java.util.ArrayList;
import java.util.List;

public class Vasia {

    private List<CASH> list_25 = new ArrayList<>();
    private List<CASH> list_50 = new ArrayList<>();

    public boolean selTickets(List<Buyer> list) {
        boolean res = true;
        for (Buyer currentBuyer : list) {
            switch (currentBuyer.getCash()) {
                case _25:
                    list_25.add(CASH._25);
                    break;
                case _50:
                    if (list_25.size() > 0) {
                        list_25.remove(list_25.size() - 1);
                        list_50.add(CASH._50);
                    } else {
                        res = false;
                    }
                    break;
                case _100:
                    if (list_25.size() > 0 && list_50.size() > 0) {
                        list_25.remove(list_25.size() - 1);
                        list_50.remove(list_50.size() - 1);
                    }
                    else {
                        res = false;
                    }
                    break;
            }
            if (!res) {
                return false;
            }
        }
        return res;
    }

}
