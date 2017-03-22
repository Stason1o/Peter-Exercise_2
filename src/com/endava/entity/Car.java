package com.endava.entity;

/**
 * Created by Stas on 22.03.2017.
 */
public class Car {

    class Engine{
        private double volume;
        private double oilRemained;

        public void check(){
            class Oil{

            }

            class Petrol{

            }

        }
    }

    class Wheel{
        private double diameter;
        private double flatness;

        public void check(){
            class State{

            }

            class Pressure{

            }
        }

    }

    class Body{
        private String type;
        private int doorsCount;

        public void check() {
            class Rust{

            }
        }
    }

    class Transmission{
        private int gearsCount;

        public void check() {
            class Workability{

            }
        }
    }


}
