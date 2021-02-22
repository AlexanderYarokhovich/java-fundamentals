package ru.javabegin.training.fastjava2.decompositionUsingMethods;
//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import ru.javabegin.training.fastjava2.decompositionUsingMethods.utils.ArrUtils;

class Task6 {
    int x = ArrUtils.generateInt(20);
    int y = ArrUtils.generateInt(20);
//    int z = utils.generateInt(20);

    public int gcd(int first, int second) {

        if (first > second) {
            return gcd(second, first);
        }
        if (first == 0) {
            return second;
        }
        return gcd(first, second % first);
    }

    public boolean isVprime() {
        return (gcd(y, x) == 1);
    }
}
