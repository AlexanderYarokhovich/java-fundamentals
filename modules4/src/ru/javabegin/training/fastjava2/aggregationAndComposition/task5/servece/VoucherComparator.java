package ru.javabegin.training.fastjava2.aggregationAndComposition.task5.servece;

import ru.javabegin.training.fastjava2.aggregationAndComposition.task5.model.TouristVouchers;

import java.util.Comparator;

public class VoucherComparator implements Comparator<TouristVouchers> {
    @Override
    public int compare(TouristVouchers t1, TouristVouchers t2) {
        return t2.getNumberOfDays()-t1.getNumberOfDays();
    }

    @Override
    public Comparator<TouristVouchers> reversed() {
        return null;
    }
}
