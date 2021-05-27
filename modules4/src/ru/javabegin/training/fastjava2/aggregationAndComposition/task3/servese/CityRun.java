package ru.javabegin.training.fastjava2.aggregationAndComposition.task3.servese;

import ru.javabegin.training.fastjava2.aggregationAndComposition.task3.model.City;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task3.model.District;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task3.model.Region;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task3.model.Country;

import java.util.Arrays;
import java.util.List;

public class CityRun {
    public static void main(String[] args) {
        District district1 = new District();
        district1.setCities(Arrays.asList(new City("Borisov"), new City("Smolevichi"), new City("Godino"), new City("Kotovo")));
        district1.setDistrictCenter("Borisov");
        District district2 = new District();
        district2.setCities(Arrays.asList(new City("Минск"), new City("Радошковичски"), new City("Красное"), new City("Глубокое")));
        district2.setDistrictCenter("Минск");
        District district3 = new District();
        district3.setCities(Arrays.asList(new City("Орша"), new City("Лида"), new City("Новополоцк"), new City("Солигорск")));
        district3.setDistrictCenter("Орша");
        District district4 = new District();
        district4.setCities(Arrays.asList(new City("Витебск"), new City("Пинск"), new City("Барановичи"), new City("Бобруйск")));
        district4.setDistrictCenter("Витебск");
        District district5 = new District();
        district5.setCities(Arrays.asList(new City("Дрисса"), new City("Добруш"), new City("Дзержинск"), new City("Городок")));
        district5.setDistrictCenter("Городок");
        District district6 = new District();
        district6.setCities(Arrays.asList(new City("Горки"), new City("Ветка"), new City("Быхов"), new City("Слуцк")));
        district6.setDistrictCenter("Речица");
        Region region1 = new Region();
        Region region2 = new Region();
        region1.setDistricts(Arrays.asList(district1, district2, district3));
        region1.setRegionalCenter("Минск");
        region2.setDistricts(Arrays.asList(district4, district5, district6));
        region2.setRegionalCenter("Витебск");
        Country belarus = new Country();
        belarus.setCapital("Минск");
        belarus.setSquare("207 600");
        belarus.setRegions(Arrays.asList(region1, region2));
        printCapital(belarus);
        printAmountRegion(belarus);
        printSquare(belarus);
        printRegionalCenter(belarus);
    }
    private static void printCapital(Country belarus){
        System.out.println(belarus.getCapital());
    }
    private static void printAmountRegion(Country belarus){
        System.out.println(belarus.getRegions().size());
    }
    private static void printSquare(Country belarus){
        System.out.println(belarus.getSquare());
    }
    private static void printRegionalCenter(Country belarus){
        List<Region> temp = belarus.getRegions();
        for (Region reg : temp) {
            System.out.println("центры областей: " + reg.getRegionalCenter());
        }
    }
}
