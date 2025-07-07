

# Projeto Imposto Contribuinte

Um programa Java para calcular e apresentar o imposto devido por contribuintes, sejam eles pessoas físicas ou jurídicas, e o total arrecadado.

-----

## 🚀 Funcionalidades

  * **Entrada de Dados Flexível**: Permite ao usuário informar o número de contribuintes a serem processados.
  * **Diferenciação de Contribuintes**: Suporte para dois tipos de contribuintes:
      * **Pessoa Física**: Coleta nome, renda anual e gastos com saúde.
      * **Pessoa Jurídica**: Coleta nome, renda anual e número de funcionários.
  * **Cálculo de Imposto Otimizado**: Implementa as regras de cálculo específicas para cada tipo de contribuinte:
      * **Pessoa Física**:
          * Renda abaixo de R$ 20.000,00: 15% de imposto.
          * Renda igual ou acima de R$ 20.000,00: 25% de imposto.
          * **Abatimento**: 50% dos gastos com saúde são abatidos do imposto total.
      * **Pessoa Jurídica**:
          * Até 10 funcionários: 16% de imposto.
          * Mais de 10 funcionários: 14% de imposto.
  * **Resumo Detalhado**: Exibe o valor do imposto pago por cada contribuinte individualmente.
  * **Totalização**: Apresenta o valor total de imposto arrecadado.

-----

## 💡 Conceitos de Programação Orientada a Objetos (POO)

Este projeto foi desenvolvido utilizando princípios fundamentais da POO para garantir um código mais organizado, reutilizável e de fácil manutenção:

  * **Classes Abstratas**: Uma **classe abstrata** (provavelmente `Contribuinte` ou similar) serve como um modelo genérico para tipos de contribuintes. Ela define características e comportamentos comuns (como `nome`, `rendaAnual` e um método abstrato `calcularImposto()`) que todas as subclasses devem ter, mas sem uma implementação completa para `calcularImposto()`. Isso força as subclasses a fornecerem sua própria lógica de cálculo.
  * **Herança**: A **herança** é utilizada pelas classes específicas (`PessoaFisica` e `PessoaJuridica`) para estender a classe abstrata `Contribuinte`. Isso permite que elas herdem os atributos e métodos comuns, ao mesmo tempo em que implementam os detalhes específicos de cálculo de imposto para seu tipo.
  * **Polimorfismo**: O **polimorfismo** é evidenciado no método `calcularImposto()`. Embora cada tipo de contribuinte tenha sua própria implementação desse método, o programa pode tratar todos os objetos `PessoaFisica` e `PessoaJuridica` de forma genérica como `Contribuinte` ao iterar sobre uma lista deles. Isso significa que podemos chamar `calcularImposto()` em qualquer objeto `Contribuinte`, e a implementação correta (seja da pessoa física ou jurídica) será executada automaticamente, sem a necessidade de verificações condicionais complexas (`if/else` para cada tipo).

-----

## 🛠️ Tecnologias Utilizadas

  * **Java**: Linguagem de programação principal.

-----

## ▶️ Como Rodar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone git@github.com:heliot98/projeto-imposto-contribuinte.git
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd projeto-imposto-contribuinte
    ```
3.  **Compile o código (se necessário, dependendo da sua IDE):**
      * Se você usa um IDE como IntelliJ IDEA ou Eclipse, ele geralmente compilará automaticamente.
      * Via terminal: `javac *.java` (assumindo que os arquivos `.java` estão na raiz)
4.  **Execute o programa:**
      * Via terminal: `java Main` (ou o nome da sua classe principal que contém o método `main`)

-----

## 🤝 Contribuição

Contribuições são bem-vindas\! Sinta-se à vontade para abrir *issues* para relatar bugs, sugerir melhorias ou enviar *pull requests* com novas funcionalidades.

-----

