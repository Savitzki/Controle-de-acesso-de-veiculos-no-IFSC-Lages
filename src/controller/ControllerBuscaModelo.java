
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Modelo;
import view.Tela_pesquisa_modelo;

/**
 *
 * @author Aluno
 */
public class ControllerBuscaModelo implements ActionListener{
    
    private final Tela_pesquisa_modelo telaPesqModelo;
    
    public ControllerBuscaModelo(Tela_pesquisa_modelo tela){
        this.telaPesqModelo = tela;
        
        this.telaPesqModelo.getjB_carregar().addActionListener(this);
        this.telaPesqModelo.getjB_sair().addActionListener(this);
        
        this.telaPesqModelo.setLocationRelativeTo(tela);
        this.telaPesqModelo.setIcon();
        
        DefaultTableModel tabModelo = (DefaultTableModel) this.telaPesqModelo.getjT_listaModelo().getModel();
        for(Modelo modeloAtualLista : service.ServiceModelo.Buscar()){
            tabModelo.addRow(new Object[]{modeloAtualLista.getID(),
                                          modeloAtualLista.getNome_modelo(),
                                          modeloAtualLista.getCategoria(),
                                          modeloAtualLista.getTipo(),
                                          modeloAtualLista.getMarca(),                                          
                                          });
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.telaPesqModelo.getjB_carregar()){
            
        }else if(e.getSource()==this.telaPesqModelo.getjB_sair()){
            this.telaPesqModelo.dispose();
        }
    }
    
}
