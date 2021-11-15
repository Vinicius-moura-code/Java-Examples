package views.zoologico;

import models.zoologico.Cachorro;
import models.zoologico.Gato;
import models.zoologico.Mamifero;
import models.zoologico.Vaca;

public class Menu {


    public Menu(){


        var mami = new Mamifero();
        var dog = new Cachorro();
        var cat = new Gato();
        var cow = new Vaca();

        System.out.println(mami);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(cow);

    }


}
