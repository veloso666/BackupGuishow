package gui;

import java.io.BufferedReader;
import java.io.File;//biblioteca para manipulação de arquivos
import java.io.FileReader;
import java.io.FileWriter;//instancia o escritor 
import java.io.IOException;

public class Cliente {   //atributos da classe cliente
    private String nome;
    private String email;
    private int idade;
    private String curso;
    private String senha;
    
    public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCurso() {//retorna o curso escolhido
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;

    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public int getIdade(){
    	return idade;
    }
    
    public void setIdade(int idade) {
    	this.idade = idade;
    }
    

    public String salvar(){ //metodo para salvar no arquivo as informações capturadas na tela
        //mudar o diretório
        File f1 = new File("C:\\Users\\joao.lucas\\Desktop\\TUDO\\cliente.txt");//instanciando um arquivo e passando o diretorio como parametro

        if (!f1.exists()) {
            
            try {//tentei
                f1.createNewFile();//cria um novo arquivo
                FileWriter writer = new FileWriter(f1);
                writer.write("Nome: "+this.nome + "\nEmail: "+ this.email+ "\nIdade: " + this.idade+"\nCurso: "+this.curso+"\nSenha: "+this.senha);//escrevendo no arquivo
                writer.flush();//limpando o escritor
                writer.close();//fechando o arquivo
            } catch (Exception ex) {//capturei um erro
                return "erro no sistema. msg" + ex.getMessage();//mostra o erro no console
            }
        }

        return "sucesso ao cadastrar";//retorna uma mensagem 
    }
    public boolean Leitura(String email) {
        String caminhoArquivo = "C:\\Users\\joao.lucas\\Desktop\\TUDO\\cliente.txt";
        String dadoComparacao = email;
        boolean x = false;

        try (FileReader fileReader = new FileReader(caminhoArquivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                String lin;
            	lin=linha.substring(7);
                if (lin.equals(dadoComparacao)) {
                    x = true;
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
		//return dadoComparacao;
		return x;
    }
    public boolean Leitura2(String senha) {
        String caminhoArquivo = "C:\\Users\\joao.lucas\\Desktop\\TUDO\\cliente.txt";
        String dadoComparacao = senha;
        boolean x = false;

        try (FileReader fileReader = new FileReader(caminhoArquivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                String lin;
            	lin=linha.substring(7);
                if (lin.equals(dadoComparacao)) {
                    x = true;
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
		//return dadoComparacao;
		return x;
    }
}