using MySqlConnector;
using System;
using System.Collections.Generic;
using System.Text;

namespace Projeto.Banco
{
    internal class Conexao
    {
        private string stringConexao = "SERVER=localhost; PORT=3306; DATABASE=cad20262n2; UID=root; PWD=;";

        public MySqlConnection ObterConexao()
        {
            try
            {
                //Iniciar a conexão ao banco
                MySqlConnection conn = new MySqlConnection(stringConexao);
                conn.Open();
                return conn;
            }
            catch (MySqlException ex)
            {
                throw new Exception("Falha ao conectar no banco.\n\n" + ex.Message);
            }
        }
    }
}
