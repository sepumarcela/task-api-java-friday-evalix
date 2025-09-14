
import login.models.Login;
import login.useCases.LoginUseCase;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LoginUseCase loginUseCase = new LoginUseCase();

        // Create

        System.out.println("Se procede a crear las tareas...");
        String create = loginUseCase.create("Leer la documentacion.", "Revisar la guia de conceptos de POO" );
        // System.out.println(create);

        String create2 = loginUseCase.create("Evaluar la documentacion.", "Se procede a evualuar los conceptos aprendidos." );
        // System.out.println(create2);
        System.out.println("\n\n");

        System.out.println("Consultar todas las tareas...");
        // Read
        String read = loginUseCase.all();
        System.out.println(read);
        System.out.println("\n\n");

        System.out.println("Se ha consultado la tarea con el indice 1");
         // Read find by index
        String read2 = loginUseCase.findByIndex(1);
        System.out.println(read2);
        System.out.println("\n\n");


        System.out.println("Actualizamos la tarea con indice 0.");
        // Update
        String update = loginUseCase.update(0, "Re-Leer documentacion", "Se ha leido la documentacion varias veces.", true);
        System.out.println(update);

        System.out.println("\n\n");


        System.out.println("Eliminamos la tarea con indice 1.");
        // Delete
        String delete = loginUseCase.delete(1);
        System.out.println(delete);
    }
}