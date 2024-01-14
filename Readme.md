# poc-seleniumWebDriverCucumber-java

---

Esté é um projeto **Maven** utilizando as seguintes tecnológias

 - Mavem;
 - Java;
 - Selenium;
 - Cucumber(BDD);
 - Padrão PageObjects
 - Relatório
 - IDE Intelij

**Aviso**:

Esse projeto é por puro aprendizado ainda sou junior na liguagem java.
Para executar o projeto execute no terminal 

``mvn test``

Para visualizar os relátorios do testes:

> /target/cucumber/report-builder/index.html

Para alterar o modo de execução dos teste, substitua a linha 15 do arquivo BrowserFactory.

- CHROME 
- CHROME-HEADLESS

___

### Requisitos

Foi utilizado o site https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/ com os requisitos:

**Login**:
1. Acessar Site 
2. Preencha o username válido e senha válido
3. Valide se está na tela home


**Visualizar fatura**
1. Esteja na tela home
2. Visulize uma fatura
3. Valide os datelhe da fatura

Cenários criados no intuito de estudo e com base na execução do sistema (manualmente)

---

### Planejamento dos Testes
Baseado na execução do software manualmente e no retorno do mesmo, levanteui duas funcionalidade do software a serem.
testados.

```
Funcionalidade: Login
  Eu como ussário dá página de faturas
  Quero realizar o login na página
  Para poder visualizar todas as minhas faturas
```

```
  Funcionalidade: Detalhe Fatura
   Eu comno usuário da página de faturas 
   Quero visualizar os detalhe da fatura 
   Para validar as informações da minhas faturas 
```

**Mapeamento de Cenários de Teste**

Funcionalidade: Login

- Cenario: Login com sucesso - fluxo base
- Cenario: Login com username incorreto - fluxo exceção
- Cenario: Login com password incorreto - fluxo exceção


Funcionalidade: Detalhe Fatura

-  Cenario: Visualizar detalhe da Fatura

**Criação das features de teste**

Com base nos levantamento dos mapeamentos, a partir de agora será necessário criar os arquivos de feature
utilizando a sintaxe do **gherkin** com base do **BDD**

> /src/test/resources/features/Login.feature

> /src/test/resources/features/Invoice_Details.feature

---

### IDE

---
**Projeto utilizado usando a IDE Intelij**

- File > New Project > Maven

Instalar Pacote Maven no pom.xml

- cucumber-java 7.2.3
- selenium 3.141.59
- cucumber-junit 7.2.3
- report-builder 1.0.3
- webdrivermanager 5.6.2

```
<dependencies>
        <!--  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java  -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
        <!--  https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager  -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.6.2</version>
        </dependency>
        <!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-java  -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.2.3</version>
        </dependency>
        <!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-junit  -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.2.3</version>
        </dependency>
        <!--  https://mvnrepository.com/artifact/com.rajatthareja/reportbuilder  -->
        <dependency>
            <groupId>com.rajatthareja</groupId>
            <artifactId>reportbuilder</artifactId>
            <version>1.0.3</version>
        </dependency>
        <!--  https://mvnrepository.com/artifact/org.slf4j/slf4j-nop  -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-nop</artifactId>
            <version>2.0.9</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```


**Agradecimentos ao professor @mickhill-qa
aonde foi professor no projeto do It-Talent Trilha de QA que me incentivou a focar em liguagem consolidada.**