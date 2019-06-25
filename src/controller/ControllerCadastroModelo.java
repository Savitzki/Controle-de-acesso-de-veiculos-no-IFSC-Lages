package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.bo.Marca;
import model.bo.Modelo;
import view.Tela_cadastro_modelo;
import view.Tela_pesquisa_modelo;

public class ControllerCadastroModelo implements ActionListener {

    private final Tela_cadastro_modelo telaCadastroModelo;

    public ControllerCadastroModelo(Tela_cadastro_modelo telaCadastroModelo) {
        this.telaCadastroModelo = telaCadastroModelo;

        this.telaCadastroModelo.setLocationRelativeTo(null);
        this.telaCadastroModelo.setIcon();

        this.telaCadastroModelo.getjB_novo().addActionListener(this);
        this.telaCadastroModelo.getjB_gravar().addActionListener(this);
        this.telaCadastroModelo.getjB_cancelar().addActionListener(this);
        this.telaCadastroModelo.getjB_pesquisar().addActionListener(this);
        this.telaCadastroModelo.getjB_sair().addActionListener(this);

        ativa(true);
        ligaDesligaCampos(false);

        for (Marca marcaAtualDaLista : service.ServiceMarcas.Buscar()) {
            this.telaCadastroModelo.getjCb_marca().addItem(marcaAtualDaLista.getDescricao());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroModelo.getjB_novo()) {
            ativa(false);
            ligaDesligaCampos(true);

        } else if (e.getSource() == this.telaCadastroModelo.getjB_gravar()) {
            /*if(this.telaCadastroModelo.getjCb_marca().getSize().equals(null)){
                JOptionPane.showMessageDialog(telaCadastroModelo, "Por favor, cadastre uma marca primeiro");
            }else{*/
            ativa(false);
            Modelo modelo = new Modelo();
            int tamanhoLista = 0;
            tamanhoLista = service.ServiceModelo.Buscar().size();
            if (tamanhoLista != 0) {
                modelo.setID(service.ServiceModelo.Buscar().get(tamanhoLista - 1).getID() + 1);
            } else {
                modelo.setID(1);
            }
            modelo.setNome_modelo(this.telaCadastroModelo.getjTf_modelo().getText());
            modelo.setCategoria(this.telaCadastroModelo.getjTf_categoria().getText());
            Marca marcaAtual = new Marca();
            marcaAtual = service.ServiceMarcas.Buscar(tamanhoLista);
            modelo.setMarca(marcaAtual);
            modelo.setTipo(this.telaCadastroModelo.getjTf_tipo().getText());

            service.ServiceModelo.Incluir(modelo);
            ativa(true);

        } else if (e.getSource() == this.telaCadastroModelo.getjB_cancelar()) {
            ativa(true);
            ligaDesligaCampos(false);

        } else if (e.getSource() == this.telaCadastroModelo.getjB_pesquisar()) {
            Tela_pesquisa_modelo telaPesqModelo = new Tela_pesquisa_modelo(null, true);
            ControllerBuscaModelo controlerPesqModelo = new ControllerBuscaModelo(telaPesqModelo);
            telaPesqModelo.setVisible(true);

        } else if (e.getSource() == this.telaCadastroModelo.getjB_sair()) {
            this.telaCadastroModelo.dispose();
        }
    }

    public final void ativa(boolean estadoBotao) {
        this.telaCadastroModelo.getjB_novo().setEnabled(estadoBotao);
        this.telaCadastroModelo.getjB_gravar().setEnabled(!estadoBotao);
        this.telaCadastroModelo.getjB_cancelar().setEnabled(!estadoBotao);
        this.telaCadastroModelo.getjB_pesquisar().setEnabled(estadoBotao);
        this.telaCadastroModelo.getjB_sair().setEnabled(estadoBotao);
    }

    public final void ligaDesligaCampos(boolean estadoCampos) {
        Component[] componentes = this.telaCadastroModelo.getPainelDados().getComponents();
        for (Component componenteAtual : componentes) {
            if (componenteAtual instanceof JTextField) {
                componenteAtual.setEnabled(estadoCampos);
            }
            if (componenteAtual instanceof JComboBox) {
                componenteAtual.setEnabled(estadoCampos);
            }
        }
    }
}
