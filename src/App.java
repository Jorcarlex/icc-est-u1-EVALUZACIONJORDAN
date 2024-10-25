
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        /*CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();

        System.out.println("Listado de carros generadas:");

        MetodosOrdenamientoBusquedaGrupoB mobb = new MetodosOrdenamientoBusquedaGrupoB();
        mobb.sortBYearWithBubbleAvnAsendente(carros);
        //mobb.sortBYearWithBubbleAvnDesendente(carros);
        mobb.showCar(carros);

        

        int result = mobb.searchBinaryByYear(carros, 2018);
        if (result == -1) {
            System.out.println("NO SE ENCONTRO EL CARRO EN ESE YEAR");
        } else {
            System.out.println("Se encontro el carro en la posicion "+result);
        }*/

        ///////////////////////////////////////////////

        PersonasGenerator generator2 = new PersonasGenerator();

        Person[] person = generator2.generarPersonas();

        System.out.println("Listado de personas generadas:");

        MetodosOrdenamientoBusqueda mobb2 = new MetodosOrdenamientoBusqueda();
        mobb2.sortByAgeWithInsertion(person);
        //mobb2.sortByAgeWithSelection(person);
        //mobb2.sortByHeightWithInsertion(person);
        //mobb2.sortByHeightWithSelection(person);
        mobb2.showPeople(person);

        int result2 = mobb2.searchBinaryByAge(person, 27);
        
        if (result2 == -1) {
            System.out.println("NO SE ENCONTRO LA PERSONA CON ESA EDAD");
        } else {
            System.out.println("Se encontro la persona en la posicion "+result2);
        }

        /*int result2 = mobb2.searchBinaryByHeight(person, 163);

        if (result2 == -1) {
            System.out.println("NO SE ENCONTRO LA PERSONA CON ESA ALTURA");
        } else {
            System.out.println("Se encontro la persona en la posicion "+result2);
        }*/
    }
}
