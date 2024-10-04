package com.example.telainicial;

public class Perguntas {

    public static String[] perguntas = {
            "Qual é a sintaxe correta para printar 'Hello World' em Java?",
            "Qual método pode ser usado para encontrar o comprimento de uma string?",
            "Qual método pode ser usado para formatar uma string em caixa alta?",
            "Qual comando é utilizado para retornar um valor vindo de um método?",
            "Como criar um método em Java?"
    };

    public static String[][] respostas = {
            {"Console.WriteLine('Hello World');", "System.out.println('Hello World');", "Echo('Hello World');", "print('Hello World')"},
            {"length()", "getLength()",  "len()", "getSize()"},
            {"tuc()", "toUpperCase()", "upperCase()", "touppercase()"},
            {"return", "break", "get", "void"},
            {"metodoExemplo.", "(metodoExemplo)", "metodoExemplo[]", "metodoExemplo()"}
    };

    public static String[] respostasCertas = {
            "System.out.println('Hello World');",
            "length()",
            "toUpperCase()",
            "return",
            "metodoExemplo()"
    };
}
