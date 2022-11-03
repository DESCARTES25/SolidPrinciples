package DependencyInversion;

public class Playmobil {

        private final Gorro gorroPirata;
        private final Espada espadaPirata;

        public Playmobil(Gorro gorro, Espada espada) {
            this.espadaPirata = espada;
            this.gorroPirata = gorro;
        }

 }

