package tasks.controllers; // ruta de la case

import tasks.useCases.LoginUseCase; // Importacion de la clase TaskUseCase
import tasks.models.Login; // Importacion de la clase Task

// El contenedor del enrutador de las acciones.
public class TaskController {

    public LoginUseCase taskUseCase; // Declaracion de la clase TaskUseCase se convierte como tipo objecto

    // Constructor
    public TaskController() {
        this.taskUseCase = new LoginUseCase(); // Instancia de la clase TaskUseCase
    }

    // en ruta la accion de obtener todos
    public String all(){
        return this.taskUseCase.all(); // llamar todas las tareas.
    }

    // en ruta la accion de obtener por indice
    public String findByIndex(int index){
        return this.taskUseCase.findByIndex(index); // llamar la accion de buscar por indice.
    }

    // en ruta la accion de crear
    public String create(String name, String description, boolean status){
        return this.taskUseCase.create(new Login(name, description, status)); // llamar la accion de crear tarea.
    }

    // en ruta la accion de actualizar
    public String update(int index, String name, String description, boolean status){
        return this.taskUseCase.update(index, new Login (name, description, status)); // llamar la accion de actualizar tarea.
    }

    // en ruta la accion de eliminar
    public String delete (int index){
        return this.taskUseCase.delete(index);
    }
}