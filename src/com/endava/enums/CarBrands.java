package com.endava.enums;

/**
 * Created by sbogdanschi on 22/03/2017.
 */
public enum CarBrands {
    AUDI, BMW, MITSUBISI, OPEL,
    VOLKSWAGEN, NISSAN, MERCEDES,
    TOYOTA, SKODA, DACIA, FERRARI,
    LAMBORGINI, BUGGATI, MAZDA;

    private static CarBrands carBrands[] = values();

    public CarBrands next(){
        return carBrands[(this.ordinal() + 1) % carBrands.length ];
    }

    public CarBrands previous(){
        return carBrands[(this.ordinal() - 1) % carBrands.length ];
    }
    public void showAll(){
        for(CarBrands iterator: carBrands){
            System.out.println(iterator);
        }
    }
}
