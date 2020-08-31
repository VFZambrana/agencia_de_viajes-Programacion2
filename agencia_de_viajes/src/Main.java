
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //cliente
        Cliente carlos = new Cliente(1,"Carlos","Perez","Vargas");
        //ciudad
        Ciudad cbba = new Ciudad(1,"cochabamba");
        Ciudad sCruz = new Ciudad(1,"Santa Cruz");
        Ciudad tarija = new Ciudad(3,"TARIJA");

        //Categoria
        Categoria turista = new Categoria(1,"turista");

        //aeropuertos
        Aeropuerto jorgeWilsterman = new Aeropuerto("JW", "Jorge Wilsterman Camacho",cbba);
        Aeropuerto viruViru = new Aeropuerto("VV","Viru Viru",sCruz);
        Aeropuerto orielLea = new Aeropuerto("OL","Oriel Lea Plaza",tarija);
        //vuelos
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cbbaScruz = new Vuelo("BOA-158", Calendar.getInstance().getTime(),jorgeWilsterman,viruViru);
        vuelos.add(cbbaScruz);
        Vuelo scruzTarija = new Vuelo("BOA-159",Calendar.getInstance().getTime(),viruViru,orielLea);
        vuelos.add(scruzTarija);
        //Billete
        Billete billete = new Billete(1,Calendar.getInstance().getTime(),650.5,carlos,cbba,tarija,turista,vuelos);

        System.out.println("BILLETE");
        System.out.println("=======");
        System.out.println("id "+billete.getIdBillete());
        System.out.println("fecha"+billete.getFechaEmision());
        System.out.println("precio"+ billete.getPrecioTotal());
        System.out.println("cliente"+ billete.getCliente().getNombre());
        System.out.println("origen"+billete.getOrigen().getNombre());
        System.out.println("destino"+billete.getDestino().getNombre());
        System.out.println("categoria"+billete.getCategoria().getNombre());
        System.out.println("vuelos : ");
        for (Vuelo vuelo:billete.getVuelos()){
        System.out.println("codigo vuelo:"+ vuelo.getCodigoVuelo()+" / salida: " +vuelo.getSalida()+" / origen"+vuelo.getOrigen().getNombre()+" / destino: "+vuelo.getDestino().getNombre());

            
        }
        

    }
}
