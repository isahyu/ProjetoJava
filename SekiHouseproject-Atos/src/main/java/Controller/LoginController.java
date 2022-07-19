/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.TelaLogin;

/**
 *
 * @author Windows 10
 */
public class LoginController {

    private final TelaLogin view;

    /**
     *
     * @param view
     */
    public LoginController(TelaLogin view) {
        this.view = view;
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
