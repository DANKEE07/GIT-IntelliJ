public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        System.out.println("La fecha actual es: "+java.time.LocalDate.now());
        System.out.println("La hora actual es: "+java.time.LocalTime.now());
        System.out.println("La fecha y hora actual son: "+java.time.LocalDateTime.now());
    }
}
