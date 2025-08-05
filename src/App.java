public class App {
    public static void main(String[] args) throws Exception {
        demoUser();
        }
    private static void demoUser() {
        var cesar = new User("Cesae", "cesar@gmail.com", "123456", null, UserRole.ADMIN);
        var jose = new User("Jose", "jose@email.com", "1234566")x;
        var userArray = new User[] {cesar, jose};

        for (int i = 0; i < userArray.length; i++) {
            var user = userArray[i];
           switch (user.getRole()) {
            case ADMIN:
                System.out.printf("%s es el superusuario", user);
                break;
            case CLIENT:
                System.out.printf("%s es el cliente preferido", user);
                break;
            case PROVIDER:
                System.out.printf("%s es mi proveedor por defec", user);
                break;
            case EMPLOYEE:
                System.out.printf("%s es un empleado", user);
                break;
            case USER:
                System.out.printf("%s es un usuario", user);
                break; 
            }
        }
    }
        
    private static void demoWeekDay() {
        WeekDay day = null;
        day = WeekDay.SUNDAY;
        day= WeekDay.MYDAY; 
        System.out.println();
        System.out.println();
        System.out.println(day);
        System.out.println(day.getNum());

        var appountmentDay = WeekDay.FRIDAY;
        System.out.println(appountmentDay);
    }
}