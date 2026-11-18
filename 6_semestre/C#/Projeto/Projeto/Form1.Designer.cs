namespace Projeto
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            txtCodigo = new TextBox();
            label4 = new Label();
            txtNomeProd = new TextBox();
            label5 = new Label();
            cbxCategoria = new ComboBox();
            label6 = new Label();
            txtPrecoCusto = new TextBox();
            txtPrecoVenda = new TextBox();
            label7 = new Label();
            label8 = new Label();
            txtDescricao = new TextBox();
            btCalcular = new Button();
            btLimpar = new Button();
            btSalvar = new Button();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Segoe UI", 15.75F, FontStyle.Regular, GraphicsUnit.Point, 0);
            label1.ForeColor = SystemColors.ActiveCaption;
            label1.Location = new Point(12, 9);
            label1.Name = "label1";
            label1.Size = new Size(213, 30);
            label1.TabIndex = 0;
            label1.Text = "Cadastro de Produtos";
            label1.Click += label1_Click;
            // 
            // label2
            // 
            label2.Font = new Font("Segoe UI", 9F, FontStyle.Regular, GraphicsUnit.Point, 0);
            label2.ForeColor = Color.Yellow;
            label2.Image = Properties.Resources.warning;
            label2.ImageAlign = ContentAlignment.MiddleLeft;
            label2.Location = new Point(12, 39);
            label2.Name = "label2";
            label2.Size = new Size(377, 37);
            label2.TabIndex = 1;
            label2.Text = "Atenção: A margem de lucro depende da categoria selecionada";
            label2.TextAlign = ContentAlignment.MiddleRight;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(21, 120);
            label3.Name = "label3";
            label3.RightToLeft = RightToLeft.No;
            label3.Size = new Size(94, 20);
            label3.TabIndex = 2;
            label3.Text = "Código / ID: ";
            // 
            // txtCodigo
            // 
            txtCodigo.BackColor = SystemColors.ControlDark;
            txtCodigo.Location = new Point(194, 117);
            txtCodigo.Name = "txtCodigo";
            txtCodigo.ReadOnly = true;
            txtCodigo.Size = new Size(507, 27);
            txtCodigo.TabIndex = 3;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(21, 170);
            label4.Name = "label4";
            label4.Size = new Size(136, 20);
            label4.TabIndex = 4;
            label4.Text = "Nome do Produto: ";
            // 
            // txtNomeProd
            // 
            txtNomeProd.Location = new Point(194, 167);
            txtNomeProd.Name = "txtNomeProd";
            txtNomeProd.Size = new Size(507, 27);
            txtNomeProd.TabIndex = 5;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(21, 224);
            label5.Name = "label5";
            label5.Size = new Size(81, 20);
            label5.TabIndex = 6;
            label5.Text = "Categoria: ";
            // 
            // cbxCategoria
            // 
            cbxCategoria.DropDownHeight = 100;
            cbxCategoria.DropDownStyle = ComboBoxStyle.DropDownList;
            cbxCategoria.FormattingEnabled = true;
            cbxCategoria.IntegralHeight = false;
            cbxCategoria.Items.AddRange(new object[] { "Make", "Perfumes", "Cabelo", "Skin Care", "Unha" });
            cbxCategoria.Location = new Point(194, 221);
            cbxCategoria.Name = "cbxCategoria";
            cbxCategoria.Size = new Size(507, 28);
            cbxCategoria.TabIndex = 7;
            cbxCategoria.SelectedIndexChanged += cbxCategoria_SelectedIndexChanged;
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(21, 275);
            label6.Name = "label6";
            label6.Size = new Size(142, 20);
            label6.TabIndex = 8;
            label6.Text = "Preço de Custo: (R$)";
            // 
            // txtPrecoCusto
            // 
            txtPrecoCusto.Location = new Point(194, 272);
            txtPrecoCusto.Name = "txtPrecoCusto";
            txtPrecoCusto.Size = new Size(507, 27);
            txtPrecoCusto.TabIndex = 9;
            // 
            // txtPrecoVenda
            // 
            txtPrecoVenda.BackColor = SystemColors.ControlDark;
            txtPrecoVenda.Location = new Point(194, 323);
            txtPrecoVenda.Name = "txtPrecoVenda";
            txtPrecoVenda.ReadOnly = true;
            txtPrecoVenda.Size = new Size(507, 27);
            txtPrecoVenda.TabIndex = 10;
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(21, 326);
            label7.Name = "label7";
            label7.Size = new Size(146, 20);
            label7.TabIndex = 11;
            label7.Text = "Preço de Venda: (R$)";
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Location = new Point(21, 373);
            label8.Name = "label8";
            label8.Size = new Size(156, 20);
            label8.TabIndex = 12;
            label8.Text = "Descrição do Produto:";
            // 
            // txtDescricao
            // 
            txtDescricao.Location = new Point(194, 370);
            txtDescricao.Multiline = true;
            txtDescricao.Name = "txtDescricao";
            txtDescricao.ScrollBars = ScrollBars.Vertical;
            txtDescricao.Size = new Size(507, 139);
            txtDescricao.TabIndex = 13;
            // 
            // btCalcular
            // 
            btCalcular.BackColor = Color.DeepSkyBlue;
            btCalcular.Location = new Point(194, 536);
            btCalcular.Name = "btCalcular";
            btCalcular.Size = new Size(99, 42);
            btCalcular.TabIndex = 14;
            btCalcular.Text = "Calcular";
            btCalcular.UseVisualStyleBackColor = false;
            btCalcular.Click += btCalcular_Click;
            // 
            // btLimpar
            // 
            btLimpar.BackColor = Color.LightCoral;
            btLimpar.Location = new Point(602, 536);
            btLimpar.Name = "btLimpar";
            btLimpar.Size = new Size(99, 42);
            btLimpar.TabIndex = 15;
            btLimpar.Text = "Limpar";
            btLimpar.UseVisualStyleBackColor = false;
            // 
            // btSalvar
            // 
            btSalvar.BackColor = Color.GreenYellow;
            btSalvar.Location = new Point(407, 536);
            btSalvar.Name = "btSalvar";
            btSalvar.Size = new Size(99, 42);
            btSalvar.TabIndex = 16;
            btSalvar.Text = "Salvar";
            btSalvar.UseVisualStyleBackColor = false;
            btSalvar.Click += btSalvar_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = SystemColors.ControlDarkDark;
            ClientSize = new Size(914, 600);
            Controls.Add(btSalvar);
            Controls.Add(btLimpar);
            Controls.Add(btCalcular);
            Controls.Add(txtDescricao);
            Controls.Add(label8);
            Controls.Add(label7);
            Controls.Add(txtPrecoVenda);
            Controls.Add(txtPrecoCusto);
            Controls.Add(label6);
            Controls.Add(cbxCategoria);
            Controls.Add(label5);
            Controls.Add(txtNomeProd);
            Controls.Add(label4);
            Controls.Add(txtCodigo);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Font = new Font("Segoe UI", 11.25F, FontStyle.Regular, GraphicsUnit.Point, 0);
            ForeColor = SystemColors.ControlText;
            Margin = new Padding(3, 4, 3, 4);
            Name = "Form1";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "Cadastro de Produtos";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
        private TextBox txtCodigo;
        private Label label4;
        private TextBox txtNomeProd;
        private Label label5;
        private ComboBox cbxCategoria;
        private Label label6;
        private TextBox txtPrecoCusto;
        private TextBox txtPrecoVenda;
        private Label label7;
        private Label label8;
        private TextBox txtDescricao;
        private Button btCalcular;
        private Button btLimpar;
        private Button btSalvar;
    }
}
