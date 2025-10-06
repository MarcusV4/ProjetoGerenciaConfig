# RELATÓRIO DE PROJETO – Estratégias de Branching em Git

## Identificação
- **Integrantes da equipe**:
- Marcus Vinícius
- Lukas Araujo
- Cesar Augusto

- **Repositório GitHub**: [(https://github.com/MarcusV4/ProjetoGerenciaConfigGitFlow)]

## 1. Estrutura Inicial
- **Branch principal:** A branch `main` foi criada automaticamente pelo github. 
- **Branch develop:** Já a branch `develop` foi criada a partir da main, criei usando a interface do github mesmo, mas tambem pode ser criada usando `git checkout -b develop`.
- ![Screenshot_3](https://github.com/user-attachments/assets/5a79f077-9f38-46ee-b172-201892e48e9a)
- Na opção "source" a gente consegue definir de qual branch a nova branch vai se originar.

## 2. Fase 1 – Git Flow

### 2.1 Features
- Cada um fez cerca de duas features, o intuito era cada feature ser uma funcionalidade de uma calculadora.
- Feat: Interface Operacao = interface que todas as operações iriam implementar.
- Feat: Soma = funcionalidade de soma
- Feat: Multiplicação = funcionalidade de multiplicação
- Feat: Subtração = funcionalidade de subtração
- Feat: Contexto = classe que iria inicializar tudo e ter a regra de negocio.
- Feat: Client = classe main que iria executar o codigo.
- Prints dos commits:![Screenshot_5](https://github.com/user-attachments/assets/1b697484-1de2-4a20-a75f-325d4c57d715)


### 2.2 Conflitos
- Ocorreram conflitos na classe Client, pois na função print cada um botou uma String diferente.
- Decidimos qual texto utilizar.
- Inclua prints mostrando os marcadores (`<<<<<<<`, `=======`, `>>>>>>>`) e o
arquivo final após resolução.
- ![aee240f7-8a01-4b48-ac81-f720e8b3a348](https://github.com/user-attachments/assets/d170766b-e939-4318-9314-b59c27423d91)
- ![Screenshot_4](https://github.com/user-attachments/assets/bf41e131-0956-43f8-bb52-5db342d93719)


### 2.3 Release
- A branch `release/2.0` foi criada a partir da branch `develop`.
- As alterações preparatórias foram as mudanças do metodo para escolher a operação.
- Após as alterações, integramos com a branch `main` e geramos a tag `v2.0`

### 2.4 Hotfix
- O nosso hotfix foi uma operação que estava setada errada no código client.
- Depois de corrigir o erro, demos o commit e logo após utilizamos `git switch main` para trocar para a branch main e `git merge hotfix/2.0.1` para dar o merge, a mesma operação foi feita na branch `develop`.

### 2.5 Uso de Rebase
- Não utilizamos Rebase :(

## 3. Fase 2 – Trunk-Based Development
### 3.1 Branches Curtos
- a partir da `main` criamos 3 branchs, com 3 features novas, Quadrado para saber o quadrado de um numero; Divisão que antes não tinha e Potencia para saber a potencia de um numero A elevado a B.
- cada branch teve cerca de 1 commit.

### 3.2 Squash
- O ultimo merge foi feito usando o `--squash`.
- utilizamos o `--squash` no lugar de um merge para poder condensar todos os commits da branch em um único commit na `main`.

### 3.3 Tag Final
- Tag criada: `v3.0`.
- ![Screenshot_6](https://github.com/user-attachments/assets/98a47f1e-eb24-4520-9f27-c75d42bfbb1d)

## 4. Histórico de Commits
Inclua saída do comando:

```bash
git log --oneline --graph --all

git log --oneline --graph --all
* 40af59a (HEAD -> main, tag: v3.0, origin/main, origin/HEAD) push com squash
| * 8607ca9 (origin/Potencia, Potencia) feat: potencia
|/  
* 2c765ca criação da operação quadrada
*   b861843 Finalização do merge de Divisao com main
:...skipping...
* 40af59a (HEAD -> main, tag: v3.0, origin/main, origin/HEAD) push com squash
| * 8607ca9 (origin/Potencia, Potencia) feat: potencia
|/  
* 2c765ca criação da operação quadrada
*   b861843 Finalização do merge de Divisao com main
|\  
| * 207e1ac Adição da operação de divisão
|/  
* 73cb4ac (origin/hotfix/2.0.1, origin/develop, hotfix/2.0.1, develop) Corrigindo operação errada
* eca1d21 (tag: v2.0, release/2.0) preparando versão 2.0
*   942b97f (origin/release/2.0) Resolvendo conflito de Strings
|\  
| * 2f9df29 (origin/conflito3, conflito3) alteração de texto para conflito
* | dd542be (origin/Conflito2) alteração de texto para conflito
|/  
* bd7a96f (origin/conflito1, origin/Client, Client) feat: Função client
* 50aa3af (origin/Contexto, Contexto) feat: Contexto calculadora
*   8892468 Finalização do merge de Multiplicacao com develop
|\  
| * 25c65d6 (origin/Multiplicacao) Criação da operação de multiplicação
* |   c33c60a Finalização do merge de Subtracao e develop
|\ \  
| * | b811bb3 (origin/Subtracao) Criação da operação de subtração
| |/  
* | e919063 (origin/Soma) pull da develop
* |   0afa360 Merge branch 'develop' of https://github.com/MarcusV4/ProjetoGerenciaConfig into Soma
|\ \  
:...skipping...
* 40af59a (HEAD -> main, tag: v3.0, origin/main, origin/HEAD) push com squash
| * 8607ca9 (origin/Potencia, Potencia) feat: potencia
|/  
* 2c765ca criação da operação quadrada
*   b861843 Finalização do merge de Divisao com main
|\  
| * 207e1ac Adição da operação de divisão
|/  
* 73cb4ac (origin/hotfix/2.0.1, origin/develop, hotfix/2.0.1, develop) Corrigindo operação errada
* eca1d21 (tag: v2.0, release/2.0) preparando versão 2.0
*   942b97f (origin/release/2.0) Resolvendo conflito de Strings
|\  
| * 2f9df29 (origin/conflito3, conflito3) alteração de texto para conflito
* | dd542be (origin/Conflito2) alteração de texto para conflito
|/  
* bd7a96f (origin/conflito1, origin/Client, Client) feat: Função client
* 50aa3af (origin/Contexto, Contexto) feat: Contexto calculadora
*   8892468 Finalização do merge de Multiplicacao com develop
|\  
| * 25c65d6 (origin/Multiplicacao) Criação da operação de multiplicação
* |   c33c60a Finalização do merge de Subtracao e develop
|\ \  
| * | b811bb3 (origin/Subtracao) Criação da operação de subtração
| |/  
* | e919063 (origin/Soma) pull da develop
* |   0afa360 Merge branch 'develop' of https://github.com/MarcusV4/ProjetoGerenciaConfig into Soma
|\ \  
| * | bcf3224 (origin/Interface) feature interface Operacao
:...skipping...
* 40af59a (HEAD -> main, tag: v3.0, origin/main, origin/HEAD) push com squash
| * 8607ca9 (origin/Potencia, Potencia) feat: potencia
|/  
* 2c765ca criação da operação quadrada
*   b861843 Finalização do merge de Divisao com main
|\  
| * 207e1ac Adição da operação de divisão
|/  
* 73cb4ac (origin/hotfix/2.0.1, origin/develop, hotfix/2.0.1, develop) Corrigindo operação errada
* eca1d21 (tag: v2.0, release/2.0) preparando versão 2.0
*   942b97f (origin/release/2.0) Resolvendo conflito de Strings
|\  
| * 2f9df29 (origin/conflito3, conflito3) alteração de texto para conflito
* | dd542be (origin/Conflito2) alteração de texto para conflito
|/  
* bd7a96f (origin/conflito1, origin/Client, Client) feat: Função client
* 50aa3af (origin/Contexto, Contexto) feat: Contexto calculadora
*   8892468 Finalização do merge de Multiplicacao com develop
|\  
| * 25c65d6 (origin/Multiplicacao) Criação da operação de multiplicação
* |   c33c60a Finalização do merge de Subtracao e develop
|\ \  
| * | b811bb3 (origin/Subtracao) Criação da operação de subtração
| |/  
* | e919063 (origin/Soma) pull da develop
* |   0afa360 Merge branch 'develop' of https://github.com/MarcusV4/ProjetoGerenciaConfig into Soma
|\ \  
| * | bcf3224 (origin/Interface) feature interface Operacao
| * | 1c854e6 criação branch Interface
| * | 46747c2 feature Interface operacao
| * | b1a1a9d feature Interface operacao
| |/  
* | 701d95a feature Soma
* | 42e0329 criacao da feature soma
|/  
* 3051562 commit inicial
(END)
| * 207e1ac Adição da operação de divisão
|/  
* 73cb4ac (origin/hotfix/2.0.1, origin/develop, hotfix/2.0.1, develop) Corrigindo operação errada
* eca1d21 (tag: v2.0, release/2.0) preparando versão 2.0
*   942b97f (origin/release/2.0) Resolvendo conflito de Strings
|\  
| * 2f9df29 (origin/conflito3, conflito3) alteração de texto para conflito
* | dd542be (origin/Conflito2) alteração de texto para conflito
|/  
* bd7a96f (origin/conflito1, origin/Client, Client) feat: Função client
* 50aa3af (origin/Contexto, Contexto) feat: Contexto calculadora
*   8892468 Finalização do merge de Multiplicacao com develop
|\  
| * 25c65d6 (origin/Multiplicacao) Criação da operação de multiplicação
* |   c33c60a Finalização do merge de Subtracao e develop
|\ \  
| * | b811bb3 (origin/Subtracao) Criação da operação de subtração
| |/  
* | e919063 (origin/Soma) pull da develop
* |   0afa360 Merge branch 'develop' of https://github.com/MarcusV4/ProjetoGerenciaConfig into Soma
|\ \  
| * | bcf3224 (origin/Interface) feature interface Operacao
| * | 1c854e6 criação branch Interface
| * | 46747c2 feature Interface operacao
| * | b1a1a9d feature Interface operacao
| |/  
* | 701d95a feature Soma
* | 42e0329 criacao da feature soma
|/  
* 3051562 commit inicial
~
(END)

````
## 4. Reflexão Final
- No final de tudo, preferimos a estratégia do GitFlow porquê achamos mais organizada, até mais fácil de manusear pq fica facil de saber onde está o erro, mas nosso projeto era um pouco pequeno para o GitFlow.
- Então o Trunk também não foi tão ruim, ja que tínhamos poucas funcionalidades. Ainda acho um pouco estranho integrar o código direto na `main` então não gostamos tanto assim da Trunk-Based.
- Então no nosso projeto preferimos usar o GitFlow mais pela organização mesmo, apesar do processo ser bem mais demorado que o Trunk.
