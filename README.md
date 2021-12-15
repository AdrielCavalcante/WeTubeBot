<h1 align="center">☭ WeTubeBot ☭</h1>


<p align="center">
<a href="https://github.com/AdrielCavalcante/WeTubeBot/edit/main/LICENSE"><img src="https://img.shields.io/badge/License-MIT-FF0000"></a>
<a href="#"><img src="https://img.shields.io/badge/Website-WeTubeBot-dea300.svg"></a>
</p>

<hr>

O Youtube encerrou com a vida de diversos bots de música, mas esse momento da história não seria o fim.

O WeTubeBot é a vontade de todos os bots encerrados em 1 só bot.

Escute músicas do Youtube com ele e aproveite tudo que ele pode oferecer

Seu Prefixo é `we!`

Linguagem de programaçao usada: ![Java](https://img.shields.io/badge/-Java-%23FF0000?style=flat-square&logo=Java&logoColor=ffffff)

IDEA usada: ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ-000000.svg?style=flat-square&logo=intellij-idea&logoColor=white)

## 🔗 Gostaria de me adicionar?

Para adicionar o WeTubeBot ao seu server, é simples, apenas clique aqui: <a href="https://discord.com/api/oauth2/authorize?client_id=919248269836714055&permissions=2150648832&scope=bot" target="_blank">➕ Add Bot</a>

## 👨‍💻 Compilando o WeTubeBot


* PowerShell (Windows) ou Terminal (Linux).
> ⚠️ Embora o prompt de comando do Windows possa funcionar, é melhor usar o PowerShell!
* Você irá precisar ter [Java Development Kit](https://adoptopenjdk.net/) instalado em sua máquina. A versão mínima necessária para compilar e executar o WeTubeBot é o JDK 11.
* Você precisa ter o Git instalado em sua máquina.
* Verifique se sua máquina tem a propriedade `JAVA_HOME` configurada corretamente, versões mais recentes do JDK baixadas de AdoptOpenJDK podem já ter a variável configurada corretamente. Você pode verificar se a variável está definida usando `echo $ env: JAVA_HOME` no PowerShell.
* Se você quiser ajudar a desenvolver no WeTubeBot, ou se quiser apenas um bom IDE para Java, faça o download do [JetBrains IntelliJ IDEA] (https://www.jetbrains.com/pt-br/idea/)

### `1.` ⚒ Preparando o ambiente
* Clone esse repositório com o git:
```bash
git clone https://github.com/AdrielCavalcante/WeTubeBot.git
```

### `2.` ⚙️ Alterando o Token
* Entre em Bot.java e altere o código do Token
```java
Config.get("token")
``` 
> 🔩 Não se esqueça de criar um .env com seu id de usuário e seu token!

### `3.` 💻 Compilando
* Vá para dentro da pasta do código-fonte e abra o PowerShell ou o terminal dentro dela.
* Construa o WeTubeBot com Maven:
```bash
 ./mvn build
```
> 💡 Se você tiver o Maven instalado em seu computador, pode usar `mvn build` em vez de` ./mvn build`

> 🛠 Caso não funcione, procure entrar em pom.xml e executar atráves da IDEA, o Maven.

Pronto, você deve estar rodando já. 😄
