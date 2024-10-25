import models.Carro;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Metodo de ordenamniento Burbuja mejorado de forma asendente
    public void sortBYearWithBubbleAvnAsendente(Carro[] car) {
        int n = car.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (car[j].getYear() > car[j + 1].getYear()) {
                    Carro temp = car[j];
                    car[j] = car[j + 1];
                    car[j + 1] = temp;
                }
            }
        }
    }

    public void sortBYearWithBubbleAvnDesendente(Carro[] car) {
        int n = car.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - i - 1; j++) {
                if (car[i].getYear() < car[j + 1].getYear()) {
                    Carro temp = car[j];
                    car[j] = car[i + 1];
                    car[j + 1] = temp;
                }
            }
        }
    }

    // Metodo de busqueda Binaria
    public int searchBinaryByYear(Carro[] car, int year) {
        int left = 0;
        int right = car.length - 1;

        while (left <= right) {
            int mitad = left + (right - left) / 2;
            if (car[mitad].getYear() == year) {
                return mitad;
            }

            if (car[mitad].getYear() < year) {
                left = mitad + 1;

            } else {
                right = mitad - 1;
            }
        }
        return -1;
    }

    // Metodo que imprime el listado de carros
    public void showCar(Carro[] car) {
        for (Carro cars : car) {
            System.out.println(cars);
        }
    }
}