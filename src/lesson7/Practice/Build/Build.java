package lesson7.Practice.Build;

public class Build {
   /* Создать класс Build с одним полем type. Создать 2-х наследников этого класса– House
    и Garage, в которых при создании в конструкторе будет присваиваться в поле type
    значения “House” и “Garage” соответственно. В методе main другого класса создать
    объекты House и Garage классов. Продемонстрировать значения полей этих классов
    используя геттеры.*/
    private String type;

    public Build() {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
