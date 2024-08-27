# 🚀 CalculadoraSimples com ANTLR 4

Este projeto é uma calculadora simples desenvolvida em Java utilizando o ANTLR 4.13.2 para análise e interpretação de expressões aritméticas, variáveis e comandos de entrada e saída.

## 🛠️ Passo 1: Instalar o ANTLR 4.13.2

Siga as instruções de instalação de acordo com seu sistema operacional:

### Linux

```bash
cd /usr/local/lib
sudo curl -O https://www.antlr.org/download/antlr-4.13.2-complete.jar

export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.13.2-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```

### Windows

1. Baixe o arquivo JAR do ANTLR [aqui](https://www.antlr.org/download/antlr-4.13.2-complete.jar) e coloque-o em um diretório, por exemplo `C:\antlr`.
2. Configure a variável de ambiente `CLASSPATH`:

   ```cmd
   set CLASSPATH=%CLASSPATH%;C:\antlr\antlr-4.13.2-complete.jar
   ```

3. Configure o alias `antlr4` no seu prompt de comando:

   ```cmd
   doskey antlr4=java -jar C:\antlr\antlr-4.13.2-complete.jar $*
   ```

### macOS

```bash
cd /usr/local/lib
curl -O https://www.antlr.org/download/antlr-4.13.2-complete.jar

export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.13.2-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```

## 🧱 Passo 2: Gerar Lexer e Parser a partir da gramática `.g4`

No seu projeto, o arquivo Lexer e Parser já está gerado no diretório `src/antlr4`. Garanta que os arquivos estejam no pacote `antlr4`. Para garantir que os arquivos sejam gerados no pacote correto, use o comando:

```bash
antlr4 -Dlanguage=Java Gramatica.g4 -o src/antlr4
```

## 📋 Passo 3: Configurar o Eclipse (ou IDE de sua escolha)

1. Importe o projeto para o Eclipse ou configure manualmente o classpath com o JAR do ANTLR.
2. Garanta que os arquivos gerados do ANTLR (Lexer e Parser) estejam acessíveis no classpath do projeto.
3. Adicione o diretório `src/antlr4` às **source folders** do projeto.

## 🎯 Passo 4: Executar o projeto

### Linha de Comando

Com o projeto configurado e o código Lexer e Parser gerado, execute a classe `CalcMain.java` com:

```bash
java -cp .:/usr/local/lib/antlr-4.13.2-complete.jar main.CalcMain
```

### No Eclipse

1. Clique com o botão direito na classe `CalcMain.java` dentro do Eclipse.
2. Selecione `Run As` > `Java Application`.

Se o projeto estiver configurado corretamente, você verá a execução da calculadora diretamente no terminal ou na interface do Eclipse.

---

## 📝 Exemplo de Uso

A calculadora aceita expressões como:

```
a = 5;
b = a + 3;
print(b);
```

Ela irá interpretar a atribuição e imprimir o resultado corretamente.

---

## 🔗 Links úteis

- [ANTLR](https://www.antlr.org/)
- [ANTLR GitHub](https://github.com/antlr/antlr4)