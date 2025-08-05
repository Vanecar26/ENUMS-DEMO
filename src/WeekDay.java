public enum WeekDay {
    MONDAY(1, "lunes"), 
    TUESDAY(2, "Martes"), 
    WEDNESDAY(3, "Miercoles"), 
    THURSDAY(4, "Jueves"), 
    FRIDAY(5, "Viernes"), 
    SATURDAY(6, "Sabado"), 
    SUNDAY(7, "Domingo"),
    MYDAY;

    private Integer num;
    private String name;

    WeekDay(){
        this(0, "Sin asignar"); // default constructor
    }

    WeekDay(Integer num, String name) {
        this.num = num; // ordinal starts from 0
        this.name = name;
    }
    public Integer getNum() {
        return num;
    }
    public String getName() {
        return name;
    }
@Override
    public String toString() {
        return getName();
    }

}
