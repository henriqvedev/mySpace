# mySpace - API de Armário dos Jogadores

## Descrição

API RESTful simples que simula jogadores com seus armários e itens guardados, com foco em praticar conceitos de JPA, relacionamento de entidades e mapeamento ORM com Spring Boot.

---

## O que faz o app?

- Cadastro de jogadores
- Associação de armários a jogadores (1:1)
- Associação de itens aos jogadores (muitos itens para 1 jogador)
- Consulta por ID e cadastro para todos os recursos
- Banco em memória (H2) com dados pré-carregados via `import.sql` pra começar o projeto

---

## Com o que foi construído?

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (in memory)
- Maven
- Postman para testes dos endpoints

---

## Pra que foi construído?

- Estudo prático de relações entre entidades JPA (OneToOne, ManyToOne)
- Treino de CRUD com Spring Boot
- Simular um mini ambiente de gestão de objetos

---

## Instruções de instalação

### Pré-requisitos

- [Git](https://git-scm.com/)
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/)

---

### 🧩 Etapas para rodar

```bash
git clone <https://github.com/henriqvedev/mySpace.git>
cd mySpace
./mvnw spring-boot:run

```

---

<h2 id="routes">Endpoints</h2>
Aqui você encontra todas as rotas da API MySpace, o que elas fazem e exemplos de respostas. Temos Armario, Itens, e Players

## Armarios

| Rota | Descrição |
| --- | --- |
| `GET /armarios` | Lista todos os armarios |
| `GET /armarios/1` | Retorna um armario por ID |
| `POST /armarios` | Cria um novo armario |

<h3 id="get-auth-detail">GET /armarios</h3>

**RESPONSE**

```json
 {
        "id": 1,
        "name": "Neymar"
    },
    {
        "id": 2,
        "name": "Endrick"
    },
    {
        "id": 3,
        "name": "Antony"
    }

```

<h3 id="get-auth-detail">GET /armarios/1 </h3>

**RESPONSE**

```json
 {
    "id": 1,
    "name": "Neymar"
}

```

<h3 id="get-auth-detail">POST /armarios </h3>

**REQUEST**

```json
  {

        "name": "Armario novo"
}

```

**RESPONSE**

```json
{
    "id": 4,
    "name": "Armario novo"
}

```

## Players

| Rota | Descrição |
| --- | --- |
| `GET /players` | Lista todos os jogadores |
| `GET /players/2` | Retorna o jogador por ID |
| `POST /players` | Cria um novo jogador |

<h3 id="get-auth-detail">GET /players</h3>

**RESPONSE**

```json
{
        "id": 1,
        "name": "Neymar",
        "armarios": {
            "id": 1,
            "name": "Neymar"
        }
    },
    {
        "id": 2,
        "name": "Endrick",
        "armarios": {
            "id": 2,
            "name": "Endrick"
        }
    },
    {
        "id": 3,
        "name": "Antony",
        "armarios": {
            "id": 3,
            "name": "Antony"
        }

```

<h3 id="get-auth-detail">GET /players/2 </h3>

**RESPONSE**

```json
{
    "id": 2,
    "name": "Endrick",
    "armarios": {
        "id": 2,
        "name": "Endrick"
    }
}

```

<h3 id="get-auth-detail">POST /players </h3>

**REQUEST**

```json
{
  "name": "Ribamar"
}

```

**RESPONSE**

```json
{
    "id": 11,
    "name": "Ribamar",
    "armarios": null
}

```

## Itens

| Rota | Descrição |
| --- | --- |
| `GET /itens` | Lista todos os Itens |
| `GET /itens/2` | Retorna o Item por ID |
| `POST /itens` | Cria um novo item |

<h3 id="get-auth-detail">GET /itens</h3>

**RESPONSE**

```json
{
        "id": 1,
        "name": "Fone, Camisa",
        "players": {
            "id": 1,
            "name": "Neymar",
            "armarios": {
                "id": 1,
                "name": "Neymar"
            }
        }
    },
    {
        "id": 2,
        "name": "Garrafa, Meia",
        "players": {
            "id": 2,
            "name": "Endrick",
            "armarios": {
                "id": 2,
                "name": "Endrick"
            }
        }
    },
    {
        "id": 3,
        "name": "Cordão, Camisa, Óculos",
        "players": {
            "id": 3,
            "name": "Antony",
            "armarios": {
                "id": 3,
                "name": "Antony"
            }
        }
    }

```

<h3 id="get-auth-detail">GET /itens/3 </h3>

**RESPONSE**

```json
{
    "id": 3,
    "name": "Cordão, Camisa, Óculos",
    "players": {
        "id": 3,
        "name": "Antony",
        "armarios": {
            "id": 3,
            "name": "Antony"
        }
    }
}

```

<h3 id="get-auth-detail">POST /item </h3>

**REQUEST**

```json
  {

        "name": "Caneta",
        "players": {
            "id": 3
        }
}

```

**RESPONSE**

```json
{
    "id": 4,
    "name": "Caneta",
    "players": {
        "id": 3,
        "name": null,
        "armarios": null
    }
}

```
