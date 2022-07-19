/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Controllers.Helpers.HelperLogin;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Windows 10
 */
public class ControllerLogin {

    private final Login view;
    private HelperLogin helper;

    public ControllerLogin(Login view) {
        this.view = view;
        this.helper = new HelperLogin(view);
    }
    
    
    public void entrarNoSistema(){
        
        //pegar um usuario da view
        Usuario usuario = helper.obterModelo();
        
        //pesquisar usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            MenuPrincipal telaMenu = new MenuPrincipal();
            telaMenu.setVisible(true);
        }else{
            view.exibeMensagem("Usuario ou senha invalidos");
        }
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
    
}
