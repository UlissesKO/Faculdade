using MySqlConnector;
using Projeto.Banco;
using System.CodeDom;
using System.Runtime.CompilerServices;

namespace Projeto
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void btCalcular_Click(object sender, EventArgs e)
        {
            float precoCusto = 0;

            // TryParse valida se o input do usuário colocou os dados corretamente sem fuder tudo
            if (float.TryParse(txtPrecoCusto.Text, out precoCusto)) 
            // TryParse tenta atribuir o Text à var precoCusto, se falhar sai do loop
            {
                float margem = 0;
                if (cbxCategoria.Text == "Make" || cbxCategoria.Text == "Perfumes")
                {
                    margem = 0.50f; //50% de Lucro
                        // f deixa explicito que é float. C# tenta salvar como double sempre que tem .
                }
                else if (cbxCategoria.Text == "Cabelo" || cbxCategoria.Text == "Skin Care")
                {
                    margem = 0.30f; //50% de Lucro
                                    // f deixa explicito que é float. C# tenta salvar como double sempre que tem .
                }
                else if (cbxCategoria.Text == "Unha")
                {
                    margem = 0.60f; //50% de Lucro
                                    // f deixa explicito que é float. C# tenta salvar como double sempre que tem .
                }
                float precoFinal = 0;

                //Calculo precoFinal
                precoFinal = precoCusto + (precoCusto * margem);

                //Mostra o resultado
                txtPrecoVenda.Text = precoFinal.ToString("C");// Acrescenta automaticamente o R$
            }
            else
            {                  // Mensagem                         , Title , Botão               ,   Ícone
                MessageBox.Show("Digite um valor válido seu cabaço", "Erro", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
        //Método de limpar a tela
        private void LimparTela()
        {
            txtCodigo.Clear();
            txtDescricao.Clear();
            txtNomeProd.Clear();
            txtPrecoCusto.Clear();
            txtPrecoVenda.Clear();

            cbxCategoria.SelectedIndex = -1;

            txtNomeProd.Focus();
        }

        private void btLimpar_Click(object sender, EventArgs e)
        {
            LimparTela();
        }

        private  void btSalvar_Click(object sender, EventArgs e)
        {
            //Validacao dos inputs
            if (string.IsNullOrEmpty(txtNomeProd.Text))
            {
                MessageBox.Show("Coloca o nome caraio", "Atenção", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return;
            }
            try
            {
                Conexao db = new Conexao();

                using (MySqlConnection conexaoAberta = db.ObterConexao())
                {
                    string sqlQuery = @"INSERT INTO produtos(nome, categoria, preco_custo, preco_venda, descricao)
                                        VALUES(@nome, @cat, @custo, @venda, @desc)"; //@ Serve para adicionar variavel na string
                    using(MySqlCommand comando = new MySqlCommand(sqlQuery, conexaoAberta))
                    {
                        comando.Parameters.AddWithValue("@nome", txtNomeProd.Text);
                        comando.Parameters.AddWithValue("@cat", cbxCategoria.Text);
                        comando.Parameters.AddWithValue("@desc", txtDescricao.Text);

                        float custo = float.Parse(txtPrecoCusto.Text.Replace("R$", "").Trim());
                        float venda = float.Parse(txtPrecoVenda.Text.Replace("R$", "").Trim());

                        comando.Parameters.AddWithValue("@custo", custo);
                        comando.Parameters.AddWithValue("@venda", venda);

                        //Envia o Insert
                        comando.ExecuteNonQuery();

                        long idBanco = comando.LastInsertedId;
                        txtCodigo.Text = idBanco.ToString();

                        MessageBox.Show($"Produto salvo com sucesso!\nO ID é {idBanco}", "Sucesso", MessageBoxButtons.OK, MessageBoxIcon.Information);

                        LimparTela();
                    }
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "Erro no sistema", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
        private void cbxCategoria_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
