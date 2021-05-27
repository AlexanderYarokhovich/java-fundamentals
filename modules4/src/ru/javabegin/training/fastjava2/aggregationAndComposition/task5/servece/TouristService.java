package ru.javabegin.training.fastjava2.aggregationAndComposition.task5.servece;

import ru.javabegin.training.fastjava2.aggregationAndComposition.task4.model.Account;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task5.model.Client;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task5.model.TouristVouchers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TouristService {
    public static void main(String[] args) {
        Client igar = new Client();
        igar.setId(007);
        TouristVouchers voucher1 = new TouristVouchers("rest", "Bas", "normFood", 12);
        TouristVouchers voucher2 = new TouristVouchers("excursions", "air", "vegan", 7);
        TouristVouchers voucher3 = new TouristVouchers("treatment", "taxi", "normFood", 12);
        TouristVouchers voucher4 = new TouristVouchers("shopping", "Bas", "normFood", 14);
        TouristVouchers voucher5 = new TouristVouchers("cruise", "ship", "vegan", 10);
        TouristVouchers voucher6 = new TouristVouchers("rest", "air", "normFood", 9);
        igar.setVouchers(Arrays.asList(voucher1, voucher2, voucher3, voucher4, voucher5, voucher6));
        maxMinDay(igar);
        System.out.println(igar.getVouchers());
    }
        private static void maxMinDay(Client igar){
            VoucherComparator comp = new VoucherComparator();
            List<TouristVouchers> temp = igar.getVouchers();
            Collections.sort(temp, comp);
            System.out.println(temp.get(0));
        }
        private  static void typeVoucher(Client igar){
            List<TouristVouchers> temp = igar.getVouchers();
            String type = "rest";
            for (TouristVouchers vouch : temp) {
                if(type.equals(vouch.getTypeOfRest())){
                    System.out.println(vouch);
                }
            }

        }
    private  static void typeTransport(Client igar){
        List<TouristVouchers> temp = igar.getVouchers();
        String type = "air";
        for (TouristVouchers vouch : temp) {
            if(type.equals(vouch.getTransport())){
                System.out.println(vouch);
            }
        }
    }
}
