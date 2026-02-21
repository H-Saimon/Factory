# FabricaPessoaProject

## Descrição

O **FabricaPessoaProject** é um projeto Java que exemplifica a aplicação do padrão de projeto Factory para criação de objetos relacionados a pessoas. Através de uma estrutura organizada e modular, o sistema facilita a instância de diferentes tipos de objetos "Pessoa" sem expor a lógica de criação diretamente ao cliente, promovendo flexibilidade e manutenibilidade no código.

## Funcionalidades principais

- Implementação do padrão Factory para criação de objetos Pessoa.
- Modularização clara entre criação e uso dos objetos.
- Testes unitários utilizando JUnit para garantir a qualidade e estabilidade das classes.
- Código fonte organizado para fácil manutenção e extensão.

## Tecnologias utilizadas

- Java (JDK 8 ou superior)
- Maven (para gerenciamento de dependências e build)
- JUnit 3.8.1 (para testes unitários)

## Como instalar e executar

1. **Pré-requisitos:**
   - Java JDK 8 ou superior instalado.
   - Maven instalado e configurado no PATH.

2. **Clonar o repositório:**

```bash
git clone <URL_DO_REPOSITORIO>
cd FabricaPessoaProject
```

3. **Compilar o projeto e rodar os testes:**

```bash
mvn clean install
```

4. **Executar a aplicação:**

Como o projeto gera um `.jar` (arquivo JAR) na pasta `target`, você pode executar a aplicação (caso possua classe main) com:

```bash
java -jar target/FabricaPessoaProject-1.0-SNAPSHOT.jar
```

*Obs.: Caso exista uma classe principal específica, substitua o comando conforme a necessidade.*

## Estrutura do projeto

```
FabricaPessoaProject/
│
├── pom.xml                     # Arquivo de configuração do Maven
├── src/
│   ├── main/
│   │   └── java/               # Código fonte principal
│   └── test/
│       └── java/               # Código dos testes unitários
├── target/
│   ├── classes/                # Classes compiladas
│   └── FabricaPessoaProject-1.0-SNAPSHOT.jar  # Artefato gerado pelo build
```

---

Este projeto serve como base para estudos e implementação do padrão Factory em sistemas orientados a objetos escritos em Java.