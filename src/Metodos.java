public class Metodos {

    public void hiloPares() {
        Thread hiloPares = new Thread(() -> {
            int sumaPares = 0;
            for (int i = 1; i <= 2500; i++) {
                if (Thread.interrupted()) {
                    System.out.println("Hilo de pares interrumpido.");
                    return;
                }
                if (i % 2 == 0) {
                    sumaPares += i;
                }
            }
            System.out.println("Suma de pares: " + sumaPares);
        });
        hiloPares.start();
    }

    public void hiloImpares() {
        Thread hiloImpares = new Thread(() -> {
            int sumaImpares = 0;
            for (int i = 1; i <= 2500; i++) {
                if (Thread.interrupted()) {
                    System.out.println("Hilo de impares interrumpido.");
                    return;
                }
                if (i % 2 != 0) {
                    sumaImpares += i;
                }
            }
            System.out.println("Suma de impares: " + sumaImpares);
        });
        hiloImpares.start();
    }

    public void hiloTresCuatro() {
        Thread hiloTresCuatro = new Thread(() -> {
            int sumaTresCuatro = 0;
            for (int i = 1; i <= 2500; i++) {
                if (Thread.interrupted()) {
                    System.out.println("Hilo de tres/cuatro interrumpido.");
                    return;
                }
                int lastDigit = i % 10;
                if (lastDigit == 3 || lastDigit == 4) {
                    sumaTresCuatro += i;
                }
            }
            System.out.println("Suma de números que terminan en 3 o 4: " + sumaTresCuatro);
        });
        hiloTresCuatro.start();
    }
}