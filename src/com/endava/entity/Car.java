package com.endava.entity;

/**
 * Created by Stas on 22.03.2017.
 */
public class Car {

    class Engine{
        private double volume;
        private double oilRemained;

        public Engine() {
        }

        public void check(){
            class Oil{
                private byte quality;

                public byte getQuality() {
                    return quality;
                }

                public void setQuality(byte quality) {
                    this.quality = quality;
                }
            }

            class Petrol{
                private byte quality;

                public byte getQuality() {
                    return quality;
                }

                public void setQuality(byte quality) {
                    this.quality = quality;
                }
            }

        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

        public double getOilRemained() {
            return oilRemained;
        }

        public void setOilRemained(double oilRemained) {
            this.oilRemained = oilRemained;
        }
    }

    class Wheel{
        private double diameter;
        private double flatness;

        public Wheel() {
        }

        public void check(){
            class State{
                private String state;

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }
            }

            class Pressure{
                private double amount;

                public double getAmount() {
                    return amount;
                }

                public void setAmount(double amount) {
                    this.amount = amount;
                }
            }
        }

        public double getDiameter() {
            return diameter;
        }

        public void setDiameter(double diameter) {
            this.diameter = diameter;
        }

        public double getFlatness() {
            return flatness;
        }

        public void setFlatness(double flatness) {
            this.flatness = flatness;
        }
    }

    class Body{
        private String type;
        private int doorsCount;

        public Body() {
        }

        public void check() {
            class Rust{
                private byte quality;

                public byte getQuality() {
                    return quality;
                }

                public void setQuality(byte quality) {
                    this.quality = quality;
                }
            }
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getDoorsCount() {
            return doorsCount;
        }

        public void setDoorsCount(int doorsCount) {
            this.doorsCount = doorsCount;
        }
    }

    class Transmission{
        private int gearsCount;

        public Transmission() {
        }

        public void check() {
            class Workability{
                private boolean workability;

                public boolean isWorkability() {
                    return workability;
                }

                public void setWorkability(boolean workability) {
                    this.workability = workability;
                }
            }
        }

        public int getGearsCount() {
            return gearsCount;
        }

        public void setGearsCount(int gearsCount) {
            this.gearsCount = gearsCount;
        }
    }

    {
        Car car = new Car();
        Car.Body body;

        body = new Car.Body();
        body.check();
    }
}
