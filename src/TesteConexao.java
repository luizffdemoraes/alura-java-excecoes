public class TesteConexao {
    public static void main(String[] args) {

        //Conexao con = null;

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (Exception ex) {
            System.out.println("Deu erro na conexao");
        }


        // ---------------------------

        /*
        try {
            con = new Conexao();
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally {
            con.fecha();
        }
         */
    }
}