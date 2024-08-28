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

Neste repositório, os arquivos 'Lexer' e 'Parser' já estão gerados no diretório `src/antlr4`. Caso queira gerá-los novamente, apenas garanta que estejam dentro do pacote 'antlr4'. Para garantir que os arquivos sejam gerados no pacote correto, use o comando abaixo estando dentro do diretório src:

```bash
antlr4 -Dlanguage=Java Gramatica.g4 -o antlr4 
```

## 🎯 Passo 3: Compilar e Executar o Projeto

### Compilar o Código

Para compilar o código-fonte, use o comando `javac`:

```bash
javac -d bin -cp C:\antlr\antlr-4.13.2-complete.jar src\main\*.java src\antlr4\*.java
```

### Linha de Comando

Após compilar, execute a classe `CalcMain` com:

```bash
java -cp bin;C:\antlr\antlr-4.13.2-complete.jar main.CalcMain
```

### No Eclipse

1. Certifique-se de que o JAR do ANTLR está incluído no build path do projeto:
   - Clique com o botão direito no projeto no Eclipse.
   - Selecione `Build Path` > `Configure Build Path`.
   - Na aba `Libraries`, adicione o JAR do ANTLR (se ainda não estiver adicionado).

2. Clique com o botão direito na classe `CalcMain.java` dentro do Eclipse.
3. Selecione `Run As` > `Java Application`.

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