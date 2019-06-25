package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import model.bo.Proprietario;
import view.Tela_cadastro_proprietario;
import view.Tela_pesquisa_proprietario;

public class ControllerCadastroProprietario implements ActionListener {
    
    private final Tela_cadastro_proprietario telaCadProp;
    
    public ControllerCadastroProprietario(Tela_cadastro_proprietario tela) {
        this.telaCadProp = tela;
        
        this.telaCadProp.getjB_novo().addActionListener(this);
        this.telaCadProp.getjB_gravar().addActionListener(this);
        this.telaCadProp.getjB_cancelar().addActionListener(this);
        this.telaCadProp.getjB_pesquisar().addActionListener(this);
        this.telaCadProp.getjB_sair().addActionListener(this);
        
        this.telaCadProp.setLocationRelativeTo(tela);
        ativa(true);
        ligaDesligaCampos(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.telaCadProp.getjB_novo()) {
            ativa(false);
            ligaDesligaCampos(true);
        } else if (e.getSource() == this.telaCadProp.getjB_gravar()) {
            
            Proprietario prop = new Proprietario();
            
            int tamanhoLista = 0;
            tamanhoLista = service.ServiceProprietario.Buscar().size();
            if (tamanhoLista != 0) {
                prop.setID(service.ServiceProprietario.Buscar().get(tamanhoLista - 1).getID() + 1);
            } else {
                prop.setID(1);
            }
            
            prop.setTipo((String) this.telaCadProp.getjCb_tipo().getSelectedItem());
            prop.setNome(this.telaCadProp.getjTf_nome().getText());
            prop.setCpf(this.telaCadProp.getjFTf_cpf().getText());
            prop.setRg(this.telaCadProp.getjTf_rg().getText());
            prop.setCnh(this.telaCadProp.getjTf_cnh().getText());
            prop.setEndereco(this.telaCadProp.getjTf_endereco().getText());
            prop.setBairro(this.telaCadProp.getjTf_bairro().getText());
            prop.setComplemento(this.telaCadProp.getjTf_complemento().getText());
            prop.setFone1(this.telaCadProp.getjTf_fone1().getText());
            prop.setFone2(this.telaCadProp.getjTf_fone2().getText());
            prop.setEmail(this.telaCadProp.getjTf_email().getText());
            if (this.telaCadProp.getjRb_masculino().isSelected()) {
                prop.setSexo("m");
            } else {
                prop.setSexo("f");
            }
            service.ServiceProprietario.Incluir(prop);
            ativa(true);
            ligaDesligaCampos(true);
            
        } else if (e.getSource() == this.telaCadProp.getjB_cancelar()) {
            ativa(true);
            ligaDesligaCampos(false);
        } else if (e.getSource() == this.telaCadProp.getjB_pesquisar()) {
            Tela_pesquisa_proprietario telaPesquisa = new Tela_pesquisa_proprietario(null, true);
            ControllerBuscaProprietario controler = new ControllerBuscaProprietario(telaPesquisa);
            telaPesquisa.setVisible(true);
            
        } else if (e.getSource() == this.telaCadProp.getjB_sair()) {
            this.telaCadProp.dispose();
        }
    }
    
    public final void ativa(boolean estadoBotao) {
        this.telaCadProp.getjB_novo().setEnabled(estadoBotao);
        this.telaCadProp.getjB_gravar().setEnabled(!estadoBotao);
        this.telaCadProp.getjB_cancelar().setEnabled(!estadoBotao);
        this.telaCadProp.getjB_pesquisar().setEnabled(estadoBotao);
        this.telaCadProp.getjB_sair().setEnabled(estadoBotao);
    }
    
    public final void ligaDesligaCampos(boolean estadoCampos) {
        Component[] componentes = this.telaCadProp.getPainelDados().getComponents();
        for (Component componenteAtual : componentes) {
            if (componenteAtual instanceof JTextField) {
                componenteAtual.setEnabled(estadoCampos);
            }
            if (componenteAtual instanceof JFormattedTextField) {
                componenteAtual.setEnabled(estadoCampos);
            }
            if (componenteAtual instanceof JComboBox) {
                componenteAtual.setEnabled(estadoCampos);
            }           
        }
    }
}
