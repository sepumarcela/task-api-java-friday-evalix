
import login.models.Login;
import login.useCases.LoginUseCase;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LoginUseCase loginUseCase = new LoginUseCase();

        // Create

        System.out.println("Se procede a crear los logins...");
        String create1 = loginUseCase.create(new Login("cliente1", "cliente1@mail.com", "1234!" ));
        // System.out.println(create);

        String create2 = loginUseCase.create(new Login("cliente2", "cliente2@mail.com", "1234!" ));
        // System.out.println(create2);
        System.out.println("\n\n");

        System.out.println("Consultar todos los login...");

        // Read
        String read = loginUseCase.all();
        System.out.println(read);
        System.out.println("\n\n");

        System.out.println("Se ha consultado los login con el indice 1");


         // Read find by index
        String read2 = loginUseCase.findByIndex(1);
        System.out.println(read2);
        System.out.println("\n\n");

        // Update
        System.out.println("Actualizamos la tarea con indice 0.");

        String update = loginUseCase.update(0, new Login("Cliente1Mod", "nuevo1@mail.com", "9999"));
        System.out.println(update);
        
        System.out.println("\n\n");


        // Delete
        System.out.println("Eliminamos la tarea con indice 1.");

        String delete = loginUseCase.delete(1);
        System.out.println(delete);
    }
}