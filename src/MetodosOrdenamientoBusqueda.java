import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        // TODO: Implement selection sort by age
        int tamanio = people.length;

        for (int i = 0; i < tamanio - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < tamanio; j++) {
                if (people[j].getAge() < people[min_idx].getAge()) {
                    min_idx = j;
                }
            }

            Person temp = people[min_idx];
            people[min_idx] = people[i];
            people[i] = temp;
        }
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        // TODO: Implement selection sort by height
        int tamanio = people.length;

        for (int i = 0; i < tamanio - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < tamanio; j++) {
                if (people[j].getHeight() < people[min_idx].getHeight()) {
                    min_idx = j;
                }
            }

            Person temp = people[min_idx];
            people[min_idx] = people[i];
            people[i] = temp;
        }
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by age
        int tamanio = people.length;
        for (int i = 1; i < tamanio; i++) {
            Person peopleAux = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > peopleAux.getAge()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = peopleAux;
        }
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by height
        int tamanio = people.length;
        for (int i = 1; i < tamanio; i++) {
            Person peopleAux = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getHeight() > peopleAux.getHeight()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = peopleAux;
        }
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        // TODO: Implement binary search by age
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            int mitad = left + (right - left) / 2;
            if (people[mitad].getAge() == age) {
                return mitad;
            }

            if (people[mitad].getAge() < age) {
                left = mitad + 1;

            } else {
                right = mitad - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        // TODO: Implement binary search by height
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            int mitad = left + (right - left) / 2;
            if (people[mitad].getHeight() == height) {
                return mitad;
            }

            if (people[mitad].getHeight() < height) {
                left = mitad+1;

            } else {
                right = mitad - 1;
            }
        }
        return -1;
    }

    // Metodo que imprime el listado de people
    public void showPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}