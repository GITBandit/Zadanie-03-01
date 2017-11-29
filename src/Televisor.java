class Televisor {

    boolean isOn = false;

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }

    void showStatus(){
        System.out.println("Is the TV on?");
        System.out.println(isOn);
    }

}
