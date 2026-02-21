```markdown
# 🏭 Factory

---

## 📌 Descrição

O **Factory** é um projeto desenvolvido para exemplificar e implementar o padrão de projeto *Factory* de forma robusta e escalável em Java. O objetivo principal é fornecer uma estrutura modular que facilite a criação de objetos sem expor a lógica de instanciação ao cliente, promovendo assim um código mais limpo, manutenível e extensível.

Este repositório contém uma implementação abrangente, acompanhada de testes automatizados, que pode ser utilizada como base para projetos acadêmicos, profissionais ou como referência para quem deseja compreender e aplicar o padrão Factory em seus códigos.

---

## 🚀 Tecnologias

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)  
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)  
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white)

- Java 11+  
- Maven para gerenciamento de dependências e build  
- JUnit para testes automatizados  

---

## ✨ Funcionalidades Principais

- Implementação do padrão **Factory** para abstração da criação de objetos.  
- Estrutura modular que permite fácil extensão e manutenção.  
- Testes unitários para garantir a robustez e confiabilidade do código.  
- Exemplo prático de uso do padrão em diferentes contextos.  

---

## 📁 Estrutura de Pastas

```
Factory/
│
├── pom.xml              # Configurações do Maven e dependências
├── README.md            # Documentação do projeto
├── src/                 # Código-fonte do projeto
│   ├── main/            # Código principal
│   │   └── java/        # Pacotes e classes Java
│   └── test/            # Testes automatizados
│       └── java/        
└── target/              # Build e arquivos compilados
    └── classes/         # Classes compiladas
```

---

## ▶️ Como Executar o Projeto

### Pré-requisitos

- Java JDK 11 (ou superior) instalado e configurado no PATH  
- Maven instalado e configurado no PATH  

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/H-Saimon/Factory.git
   cd Factory
   ```

2. Compile o projeto com Maven:
   ```bash
   mvn clean compile
   ```

3. Execute os testes para verificar a integridade:
   ```bash
   mvn test
   ```

4. Para executar a aplicação (caso exista classe `Main`):
   ```bash
   mvn exec:java -Dexec.mainClass="com.seupacote.Main"
   ```

> **Nota:** Ajuste o path da classe principal conforme o pacote utilizado no projeto.

---

## 👤 Autor

[Hítalon Saimon](https://github.com/H-Saimon)  
Desenvolvedor Sênior | Entusiasta em padrões de projeto e software de alta qualidade.

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<p align="center">
  <em>Construa códigos limpos e reutilizáveis!</em> 🛠️
</p>
```