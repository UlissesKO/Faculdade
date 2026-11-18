namespace Aula03
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
            menuStrip1 = new MenuStrip();
            cadastrarToolStripMenuItem = new ToolStripMenuItem();
            relatóriosToolStripMenuItem = new ToolStripMenuItem();
            produtosToolStripMenuItem = new ToolStripMenuItem();
            this.menuCadClient = new ToolStripMenuItem();
            this.menuCadFunc = new ToolStripMenuItem();
            menuCadSair = new ToolStripMenuItem();
            novoToolStripMenuItem = new ToolStripMenuItem();
            entradaToolStripMenuItem = new ToolStripMenuItem();
            saídaToolStripMenuItem = new ToolStripMenuItem();
            vendasToolStripMenuItem = new ToolStripMenuItem();
            clientesToolStripMenuItem1 = new ToolStripMenuItem();
            funcionáriosToolStripMenuItem1 = new ToolStripMenuItem();
            toolStripSeparator1 = new ToolStripSeparator();
            menuStrip1.SuspendLayout();
            SuspendLayout();
            // 
            // menuStrip1
            // 
            menuStrip1.Items.AddRange(new ToolStripItem[] { cadastrarToolStripMenuItem, relatóriosToolStripMenuItem });
            menuStrip1.Location = new Point(0, 0);
            menuStrip1.Name = "menuStrip1";
            menuStrip1.Size = new Size(800, 24);
            menuStrip1.TabIndex = 0;
            menuStrip1.Text = "menuStrip1";
            // 
            // cadastrarToolStripMenuItem
            // 
            cadastrarToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { produtosToolStripMenuItem, this.menuCadClient, this.menuCadFunc, toolStripSeparator1, menuCadSair });
            cadastrarToolStripMenuItem.Name = "cadastrarToolStripMenuItem";
            cadastrarToolStripMenuItem.Size = new Size(69, 20);
            cadastrarToolStripMenuItem.Text = "Cadastrar";
            // 
            // relatóriosToolStripMenuItem
            // 
            relatóriosToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { vendasToolStripMenuItem, clientesToolStripMenuItem1, funcionáriosToolStripMenuItem1 });
            relatóriosToolStripMenuItem.Name = "relatóriosToolStripMenuItem";
            relatóriosToolStripMenuItem.Size = new Size(71, 20);
            relatóriosToolStripMenuItem.Text = "Relatórios";
            // 
            // produtosToolStripMenuItem
            // 
            produtosToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { novoToolStripMenuItem, entradaToolStripMenuItem, saídaToolStripMenuItem });
            produtosToolStripMenuItem.Name = "produtosToolStripMenuItem";
            produtosToolStripMenuItem.Size = new Size(180, 22);
            produtosToolStripMenuItem.Text = "Produtos";
            // 
            // menuCadClient
            // 
            this.menuCadClient.Image = Properties.Resources.icon_employee;
            this.menuCadClient.Name = "menuCadClient";
            this.menuCadClient.Size = new Size(180, 22);
            this.menuCadClient.Text = "Clientes";
            // 
            // menuCadFunc
            // 
            this.menuCadFunc.Image = Properties.Resources.icon_employee;
            this.menuCadFunc.Name = "menuCadFunc";
            this.menuCadFunc.Size = new Size(180, 22);
            this.menuCadFunc.Text = "Funcionários";
            // 
            // menuCadSair
            // 
            menuCadSair.Image = Properties.Resources.icon_exit;
            menuCadSair.Name = "menuCadSair";
            menuCadSair.Size = new Size(180, 22);
            menuCadSair.Text = "Sair";
            menuCadSair.Click += menuCadSair_Click;
            // 
            // novoToolStripMenuItem
            // 
            novoToolStripMenuItem.Image = Properties.Resources.icon_add;
            novoToolStripMenuItem.Name = "novoToolStripMenuItem";
            novoToolStripMenuItem.Size = new Size(180, 22);
            novoToolStripMenuItem.Text = "Novo";
            // 
            // entradaToolStripMenuItem
            // 
            entradaToolStripMenuItem.Name = "entradaToolStripMenuItem";
            entradaToolStripMenuItem.Size = new Size(180, 22);
            entradaToolStripMenuItem.Text = "Entrada";
            // 
            // saídaToolStripMenuItem
            // 
            saídaToolStripMenuItem.Image = Properties.Resources.icon_minus;
            saídaToolStripMenuItem.Name = "saídaToolStripMenuItem";
            saídaToolStripMenuItem.Size = new Size(180, 22);
            saídaToolStripMenuItem.Text = "Saída";
            // 
            // vendasToolStripMenuItem
            // 
            vendasToolStripMenuItem.Name = "vendasToolStripMenuItem";
            vendasToolStripMenuItem.Size = new Size(180, 22);
            vendasToolStripMenuItem.Text = "Vendas";
            // 
            // clientesToolStripMenuItem1
            // 
            clientesToolStripMenuItem1.Name = "clientesToolStripMenuItem1";
            clientesToolStripMenuItem1.Size = new Size(180, 22);
            clientesToolStripMenuItem1.Text = "Clientes";
            // 
            // funcionáriosToolStripMenuItem1
            // 
            funcionáriosToolStripMenuItem1.Name = "funcionáriosToolStripMenuItem1";
            funcionáriosToolStripMenuItem1.Size = new Size(180, 22);
            funcionáriosToolStripMenuItem1.Text = "Funcionários";
            // 
            // toolStripSeparator1
            // 
            toolStripSeparator1.Name = "toolStripSeparator1";
            toolStripSeparator1.Size = new Size(177, 6);
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(menuStrip1);
            MainMenuStrip = menuStrip1;
            Name = "Form1";
            Text = "Form1";
            menuStrip1.ResumeLayout(false);
            menuStrip1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip menuStrip1;
        private ToolStripMenuItem cadastrarToolStripMenuItem;
        private ToolStripMenuItem produtosToolStripMenuItem;
        private ToolStripMenuItem novoToolStripMenuItem;
        private ToolStripMenuItem entradaToolStripMenuItem;
        private ToolStripMenuItem saídaToolStripMenuItem;
        private ToolStripMenuItem clientesToolStripMenuItem;
        private ToolStripMenuItem funcionáriosToolStripMenuItem;
        private ToolStripMenuItem menuCadSair;
        private ToolStripMenuItem relatóriosToolStripMenuItem;
        private ToolStripSeparator toolStripSeparator1;
        private ToolStripMenuItem vendasToolStripMenuItem;
        private ToolStripMenuItem clientesToolStripMenuItem1;
        private ToolStripMenuItem funcionáriosToolStripMenuItem1;
    }
}
