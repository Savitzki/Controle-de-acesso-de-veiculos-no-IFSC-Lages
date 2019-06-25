package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Marca;
import view.Tela_cadastro_marca;
import view.Tela_pesquisa_marca;

public class ControllerCadastroMarca implements ActionListener {

    private final Tela_cadastro_marca telaCadMarca;//objeto

    public ControllerCadastroMarca(Tela_cadastro_marca tela) {
        this.telaCadMarca = tela;
        //ouvintes
        this.telaCadMarca.getjB_sair().addActionListener(this);//ouvindo o botao sair da tela de cadastro marca.
        this.telaCadMarca.getjB_novo().addActionListener(this);
        this.telaCadMarca.getjB_gravar().addActionListener(this);
        this.telaCadMarca.getjB_cancelar().addActionListener(this);
        this.telaCadMarca.getjB_pesquisar().addActionListener(this);

        ativa(true);
        travaCamposDetexto(true);
        this.telaCadMarca.setLocationRelativeTo(tela);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
// o controler esta ouvindo a tela, e aqui o actionEvent vai pegar o sinal do clique dos botoes
//cada verficação cuida de um botao
//cada botao realiza uma ação

        if (e.getSource() == this.telaCadMarca.getjB_sair())//se o codigo de e.getSource for igual ao do botao.
        {
            this.telaCadMarca.dispose();//fecha a tela ao inves do controler
        } else if (e.getSource() == this.telaCadMarca.getjB_novo()) {
            ativa(false);
            limpaCampos(true);
        } else if (e.getSource() == this.telaCadMarca.getjB_sair()) {
            this.telaCadMarca.dispose();
        } else if (e.getSource() == this.telaCadMarca.getjB_cancelar()) {
            ativa(true);
            travaCamposDetexto(true);
            limpaCampos(true);
        } else if (e.getSource() == this.telaCadMarca.getjB_gravar()) {
            boolean verVazio;
            verVazio = verificaCamposVazios(true);
            if (verVazio == false) {
                Marca marca = new Marca();
                int tamanhoLista = 0;
                tamanhoLista = service.ServiceMarcas.Buscar().size();
                if (tamanhoLista != 0) {
                    marca.setID(service.ServiceMarcas.Buscar().get(tamanhoLista - 1).getID() + 1);
                } else {
                    marca.setID(1);
                }
                marca.setDescricao(this.telaCadMarca.getjTf_descricao().getText());
                //Invocando o serviço de persistencia de dados(service)
                service.ServiceMarcas.Incluir(marca);
                ativa(true);
                JOptionPane.showMessageDialog(telaCadMarca, "Dados salvos com sucesso!");
            } else {
                JOptionPane.showMessageDialog(telaCadMarca, "Campos vazios, por favor preencha-os");
            }

        } else if (e.getSource() == this.telaCadMarca.getjB_pesquisar()) {
            Tela_pesquisa_marca telaPesquisa = new Tela_pesquisa_marca(null, true);
            ControllerBuscaMarca controlerBuscaMarca = new ControllerBuscaMarca(telaPesquisa);
            telaPesquisa.setVisible(true);
        }
    }

    public final void ativa(boolean estadoBotao) {
        this.telaCadMarca.getjB_novo().setEnabled(estadoBotao);
        this.telaCadMarca.getjB_gravar().setEnabled(!estadoBotao);
        this.telaCadMarca.getjB_cancelar().setEnabled(!estadoBotao);
        this.telaCadMarca.getjB_pesquisar().setEnabled(estadoBotao);
        this.telaCadMarca.getjB_sair().setEnabled(estadoBotao);
        this.telaCadMarca.getjTf_descricao().setEnabled(!estadoBotao);
    }

    public final void travaCamposDetexto(boolean travaCampos) {
        this.telaCadMarca.getjTf_descricao().setEnabled(!travaCampos);
        this.telaCadMarca.getjTf_id().setEnabled(!travaCampos);

    }

    public void limpaCampos(boolean limpo) {
        this.telaCadMarca.getjTf_descricao().setText("");
        this.telaCadMarca.getjTf_id().setText("");
    }

    public boolean verificaCamposVazios(boolean estado) {
        Component[] componente = this.telaCadMarca.getPainelDados().getComponents();
        int vazio = 0;
        for (Component componenteAtual : componente) {
            if (this.telaCadMarca.getjTf_descricao().getText().equals("")) {
                vazio++;
            }
        }
        return vazio != 0;
    }
}
