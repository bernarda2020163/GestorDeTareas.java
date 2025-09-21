package latinasincloud;

public class Tarea {  //crearla clase
    // declarar atributos a utilizar
    private static int contenedorId = 1; // declarar un atributo contendor autonumerico por cada tarea id unico a nuestra tarea
    private int id ;
    private String nombre;
    private String prioridad;

    //Constructores
    // definir metodos con el constructor con el mismo nombre de la clase sin parametros de entrada
    // permite inicializar el objeto
    public Tarea(){}  //primera forma sin parámetros

    public Tarea(String nombre, String prioridad) {
        this.id = contenedorId++; // contador le va a sumar 1
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    // métodos getters y setters
    // métodos getters  : metodos publicos para obtener información de mis atributos get mas nombre del atributos
    // metodos setters: por el verbo set en ingles cambiar el valor set mas el nombre del atributo


    // metodos generados por InteligeID
    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}
