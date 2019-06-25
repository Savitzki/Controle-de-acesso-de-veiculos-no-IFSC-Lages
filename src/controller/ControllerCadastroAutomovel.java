package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.bo.Automovel;
import view.Tela_cadastro_automovel;
import view.Tela_pesquisa_automovel;

public class ControllerCadastroAutomovel implements ActionListener {

    private final view.Tela_cadastro_automovel tela_cadastro_automovel;

    public ControllerCadastroAutomovel(Tela_cadastro_automovel telaAuto) {
        this.tela_cadastro_automovel = telaAuto;

        //Ouvindo os botoes.
        this.tela_cadastro_automovel.getjB_novo().addActionListener(this);
        this.tela_cadastro_automovel.getjB_salvar().addActionListener(this);
        this.tela_cadastro_automovel.getjB_sair().addActionListener(this);
        this.tela_cadastro_automovel.getjB_cancelar().addActionListener(this);
        this.tela_cadastro_automovel.getjB_pesquisar().addActionListener(this);
        
        ligaDesligaCampos(false);
        ativa(true);
        
        this.tela_cadastro_automovel.setIcon();
        this.tela_cadastro_automovel.setLocationRelativeTo(telaAuto);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.tela_cadastro_automovel.getjB_novo()) {
            ativa(false);
            ligaDesligaCampos(true);
            limpaCampos(true);
        } else if (e.getSource() == this.tela_cadastro_automovel.getjB_sair()) {
            this.tela_cadastro_automovel.dispose();
        } else if (e.getSource() == this.tela_cadastro_automovel.getjB_cancelar()) {
            ativa(true);
            limpaCampos(true);
            ligaDesligaCampos(false);
        } else if (e.getSource() == this.tela_cadastro_automovel.getjB_salvar()) {            
            boolean verVazio;           
            verVazio = verificaCamposVazios(true);
            if(verVazio==false){
                Automovel automovel =  new Automovel();
                int tamanhoLista = 0;
                tamanhoLista = service.ServiceAutomovel.Buscar().size();
                if(tamanhoLista!=0){
                    automovel.setID(service.ServiceAutomovel.Buscar().get(tamanhoLista-1).getID()+1);
                }else{
                    automovel.setID(1);
                }

                automovel.setPlaca(this.tela_cadastro_automovel.getjTf_placa().getText());
                automovel.setAno((String) this.tela_cadastro_automovel.getjCb_ano().getSelectedItem());

                service.ServiceAutomovel.Incluir(automovel);

                ativa(true);
                limpaCampos(true);
                ligaDesligaCampos(false);
            }else{
                JOptionPane.showMessageDialog(tela_cadastro_automovel, "Campos vazios, por favor preencha-os");
            }                        
        }else if(e.getSource()==this.tela_cadastro_automovel.getjB_pesquisar()){
            Tela_pesquisa_automovel telaPesqAuto = new Tela_pesquisa_automovel(null, true);
            ControllerBuscaAutomovel controlerBuscaAuto = new  ControllerBuscaAutomovel(telaPesqAuto);
            telaPesqAuto.setVisible(true);
        }

    }

    public final void ativa(boolean estadoBotao) {
        this.tela_cadastro_automovel.getjB_novo().setEnabled(estadoBotao);
        this.tela_cadastro_automovel.getjB_sair().setEnabled(estadoBotao);
        this.tela_cadastro_automovel.getjB_cancelar().setEnabled(!estadoBotao);
        this.tela_cadastro_automovel.getjB_salvar().setEnabled(!estadoBotao);
        this.tela_cadastro_automovel.getjB_pesquisar().setEnabled(estadoBotao);

    }

    public final void ligaDesligaCampos(boolean estadoCampos){
        Component[] componentes = this.tela_cadastro_automovel.getPainelDados().getComponents();
        for(Component componenteAtual : componentes){
            if(componenteAtual instanceof JTextField)
                componenteAtual.setEnabled(estadoCampos);
            else if(componenteAtual instanceof JComboBox)
                ((JComboBox) componenteAtual).setEnabled(estadoCampos);
            }      
    }
    
    public void limpaCampos(boolean limpa){
        Component[] componentes =  this.tela_cadastro_automovel.getPainelDados().getComponents();
        for(Component componenteAtual : componentes){
            if(componenteAtual instanceof JTextField){
                ((JTextField) componenteAtual).setText("");
            }else if(componenteAtual instanceof JComboBox){
                ((JComboBox) componenteAtual).setSelectedItem(null);
            }            
        }
    }
    
    public boolean verificaCamposVazios(boolean estado){
       Component[] componente = this.tela_cadastro_automovel.getPainelDados().getComponents();
       int vazio = 0;
        for(Component componenteAtual : componente){            
            if(this.tela_cadastro_automovel.getjTf_placa().getText() == null){
                vazio++;
                }                
            }if(this.tela_cadastro_automovel.getjCb_ano().getSelectedItem() == null){
                vazio++;
                }
        return vazio!=0;        
    } 
}
