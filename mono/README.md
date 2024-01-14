# Componente Spring Boot Monolitíco para Microserviço

## 1 - Estutura do componente monolitíco modularizado 
Este repositório contém um componente Spring Boot modularizado, seguindo uma arquitetura hexagonal, para as funcionalidades de voo (flight), hotel e pedido (order).

## Estrutura do Projeto

<p align="center">
    <img width="200" src="https://github.com/murilohenzo/mono-to-micro/assets/28688721/4a7fabb2-349b-466b-99b4-b1aa27e97ea8" alt="monolitico_modular">
</p>

```
├── modules
│   ├── travel-application
│   │   └── adapters
│   ├── flight
│   │   ├── domain
│   │   └── infrastructure
│   ├── hotel
│   │   ├── domain
│   │   └── infrastructure
│   └── order
│       ├── domain
│       └── infrastructure
```

## Detalhes da Arquitetura Hexagonal

O padrão arquitetônico hexagonal (ou porta e adaptador) é utilizado para desacoplar a lógica de negócios da infraestrutura externa. A ideia é que o núcleo da aplicação (domínio) não dependa de detalhes externos, permitindo a fácil substituição de adaptadores e a reutilização de lógica de negócios.

### Componentes:

- **Adapters**: Camada responsável por adaptar os detalhes externos para o núcleo da aplicação e vice-versa. Aqui, você encontrará implementações específicas, como controladores REST, clientes HTTP, etc.

- **Domain**: Camada central que contém a lógica de negócios e as entidades de domínio.

- **Infrastructure**: Camada responsável por implementar os detalhes técnicos, como conexões com banco de dados, serviços externos, configurações e adaptações.
### Vantagens

A utilização de uma abordagem monolítica modularizada, especialmente quando combinada com a arquitetura hexagonal, oferece várias vantagens. Aqui estão algumas das principais vantagens desse modelo:

1. **Desacoplamento**: A arquitetura hexagonal permite um forte desacoplamento entre a lógica de negócios (domínio) e as preocupações externas, como interfaces de usuário, bancos de dados e serviços externos. Isso facilita a manutenção e a evolução do sistema.

2. **Reutilização de Código**: Com a separação clara entre domínio e infraestrutura, partes da lógica de negócios podem ser reutilizadas sem modificações, mesmo que a infraestrutura mude (por exemplo, mudando de um banco de dados relacional para um NoSQL).

3. **Escalabilidade Modular**: Como cada módulo (como "flight", "hotel" e "order") é independente, é mais fácil escalar partes específicas do sistema conforme necessário, sem afetar o restante da aplicação.

4. **Manutenção Simplificada**: A estrutura modular facilita a manutenção, pois as alterações em um módulo específico têm menos probabilidade de afetar outros módulos. Isso também simplifica os testes, pois é mais fácil isolar e testar um módulo de cada vez.

5. **Desenvolvimento Colaborativo**: A separação clara entre as responsabilidades facilita o desenvolvimento paralelo. Equipes podem trabalhar em diferentes módulos simultaneamente com menos chances de conflitos ou dependências.

6. **Facilidade de Integração**: Com a lógica de negócios bem definida em seu núcleo (domínio), é mais fácil integrar com outros sistemas, já que os adaptadores são responsáveis por lidar com detalhes de integração específicos.

7. **Flexibilidade Tecnológica**: A infraestrutura é mantida separada da lógica de negócios. Isso permite que as equipes adotem e experimentem com novas tecnologias na camada de infraestrutura sem alterar a lógica de domínio.

8. **Melhorias Incrementais**: Devido à modularidade, é possível introduzir melhorias incrementais ou novos recursos em um módulo específico sem afetar o sistema como um todo.

9. **Documentação Clara**: A estrutura modular e a arquitetura hexagonal promovem uma organização clara do código, o que facilita a compreensão e a manutenção. Cada módulo tem responsabilidades bem definidas, tornando a documentação e o treinamento mais diretos.

Em resumo, a combinação de um monólito modularizado com a arquitetura hexagonal oferece uma solução robusta, escalável e manutenível, adequada para sistemas de médio a grande porte.

## Como Executar

1. Clone o repositório:
2. Navegue até o diretório clonado:
3. Construa e execute o projeto usando o Maven:

   ```bash
   mvn spring-boot:run
   ```
   
## Referência
1. [Modular Monolith](https://www.kamilgrzybek.com/blog/series/modular-monolith)
