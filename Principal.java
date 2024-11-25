package sistemapoliciaarmas_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        int opcion;
        boolean continuar_1 = true;
        boolean continuar_2 = true;

        List<ArmaCorta> array_arma_corta = new ArrayList<>();
        List<ArmaLarga> array_arma_larga = new ArrayList<>();
        List<Policia> array_policia = new ArrayList<>();
        

        try (Scanner teclado = new Scanner(System.in)) {
            while (continuar_1) {
                
                System.out.println("1: Agregar ARMA");
                System.out.println("2: Agregar POLICIA");
                System.out.println("3: Listar ARMAS");
                System.out.println("4: Listar POLICIAS");
                System.out.println("5: SALIR");
                opcion = Integer.parseInt(teclado.next());
                
                switch (opcion) {
                    
                    
                    case 1:
                        
                        while (continuar_2) {
                            
                            System.out.println("1: Arma corta");
                            System.out.println("2: Arma larga");
                            System.out.println("3: SALIR");
                            opcion = Integer.parseInt(teclado.next());
                            
                            switch (opcion){
                                case 1:
                                    System.out.println("Nombre arma: ");
                                    String nombre_ac = teclado.next();
                                    System.out.println("Cantidad de municiones: ");
                                    int cant_muni = teclado.nextInt();
                                    System.out.println("Alcance (metros): ");
                                    double alcance = teclado.nextDouble();
                                    System.out.println("Marca: ");
                                    String marca = teclado.next();
                                    System.out.println("Calibre: ");
                                    int calibre = teclado.nextInt();
                                    System.out.println("Estado (1: NUEVA; 2: EN MANTENIMIENTO; 3: EN USO): ");
                                    int estado = teclado.nextInt();
                                    System.out.println("Automática (1: si - 2: no): ");
                                    int esAutomatica = teclado.nextInt();

                                    array_arma_corta.add(new ArmaCorta(nombre_ac, cant_muni,alcance,marca, calibre,estado,esAutomatica));
                                    break;
                                    
                                case 2:
                                    System.out.println("Nombre arma: ");
                                    String nombre_al = teclado.next();
                                    System.out.println("Cantidad de municiones: ");
                                    cant_muni = teclado.nextInt();
                                    System.out.println("Alcance (metros): ");
                                    alcance = teclado.nextInt();
                                    System.out.println("Marca: ");
                                    marca = teclado.next();
                                    System.out.println("Calibre: ");
                                    calibre = teclado.nextInt();
                                    System.out.println("Estado (1: NUEVA; 2: EN MANTENIMIENTO; 3: EN USO): ");
                                    estado = teclado.nextInt();
                                    System.out.println("Justificacion del uso: ");
                                    String justif_uso = teclado.next();
                                    System.out.println("Tiene sello del RENAR ? (1:si - 2:no): ");
                                    int selloRenar = teclado.nextInt();
                                    System.out.println("Nivel (1-5): ");
                                    int nivel = teclado.nextInt();

                                    array_arma_larga.add(new ArmaLarga(nombre_al,cant_muni,alcance,marca,calibre,estado,justif_uso,selloRenar,nivel));
                                    break;
                                    
                                case 3:
                                    continuar_2 = false;
                                    break;

                                default:
                                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                    break;
                                    
                            }

                        }
                        break;

                    case 2:
                        //AGREGAR POLICIA
                        System.out.println("Nombre del policia: ");
                        String nombre = teclado.next();
                        System.out.println("Apellido del policia: ");
                        String apellido = teclado.next();
                        System.out.println("Legajo: ");
                        int legajo = teclado.nextInt();
                        System.out.println("Nombre arma: ");
                        String nombre_arma = teclado.next();

                        array_policia.add(new Policia(nombre,apellido,legajo, nombre_arma));
                        break;


                        // LISTAR ARMAS CORTAS Y LARGAS
                    case 3:
                        for (ArmaCorta ac: array_arma_corta)
                        {
                            //System.out.println(ac.toString());
                            System.out.println("Nombre arma: " + ac.getNombre());
                            System.out.println("calibre: "     + ac.getCalibre());
                            System.out.println("Estado: "      + ac.getEstado());
                            System.out.println("Condición: "  + ac.enCondiciones(ac.getEstado(),ac.getCalibre()));
                            System.out.println("Alcence mayor a 200 mts?: " + ac.alcanceMayor200(ac.getAlcance()));
                            System.out.println(" ");
                        };
                        
                        for (ArmaLarga al: array_arma_larga)
                        {
                            System.out.println("Nombre arma: "+ al.getNombre());
                            System.out.println("calibre: "    + al.getCalibre());
                            System.out.println("Estado: "     + al.getEstado());
                            System.out.println("Condición: "  + al.enCondiciones(al.getEstado(),al.getCalibre()));
                            System.out.println(" ");
                        };
                        
                        break;
                        
                        // LISTAR POLICIAS
                    case 4:
                        for (Policia pol: array_policia)
                        {
                            System.out.println("POLICIA: ");
                            System.out.println("Nombre: "  + pol.getNombre());
                            System.out.println("Apellido: "+ pol.getApellido());
                            System.out.println("Legajo: "  + pol.getLegajo());
                            System.out.println("Arma: "  + pol.getNombre_arma());
                            System.out.println(" ");
                        };
                        break;
                        
                    case 5:
                        System.out.println("Saliendo..");
                        continuar_1 = false;
                        break;
                        
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        break;
                }
                
            } 
            

        }


    }
}