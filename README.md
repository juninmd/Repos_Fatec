# Repositórios Fatec

![Collection](https://img.shields.io/badge/Collection-Fatec-blue.svg) ![Fatec](https://img.shields.io/badge/Fatec-Franca-red.svg)

> Coleção de projetos desenvolvidos durante a graduação na **Fatec Franca**.

## Sobre

Este repositório agrupa todos os projetos acadêmicos desenvolvidos ao longo do curso na Fatec Franca, incluindo trabalhos de disciplinas, projetos integradores e o Trabalho de Graduação (TG).

## Repositórios Inclusos

| Repositório | Descrição |
|-------------|-----------|
| `fatec-api/` | API Fatec |
| `fatec-app-temp/` | App Temporário |
| `fatec-apresentacao-agi/` | Apresentação AGI |
| `fatec-c-*/` | Algoritmos em C (listas encadeadas, etc.) |
| `fatec-compare-c/` | Comparativo em C |
| `fatec-estatistica/` | Estatística |
| `fatec-franca-api/` | API Fatec Franca |
| `fatec-franca-app/` | App Fatec Franca |
| `fatec-franca-core-api/` | Core API Fatec Franca |
| `fatec-gerador-arquivo/` | Gerador de Arquivos |
| `fatec-gerador-tabela-trabalho-les/` | Gerador de Tabelas LES |
| `fatec-hospital-*/` | Sistema Hospitalar |
| `fatec-ionic-lojinha/` | Lojinha Ionic |
| `fatec-java-lista-1..8/` | Listas de Java (1 a 8) |
| `fatec-java-projeto-final/` | Projeto Final Java |
| `fatec-mobile/` | Desenvolvimento Mobile |
| `fatec-my-mind-*/` | My Mind App |
| `fatec-node-lojinha/` | Lojinha Node.js |
| `fatec-projeto-scripts-neto/` | Projeto Scripts |
| `fatec-sync-database/` | Sincronização BD |
| `fatec-tg/` | Trabalho de Graduação |

## Como usar

Não há build nem script único na raiz: cada pasta é um projeto independente, com seus próprios arquivos de dependência.

- **Node.js / Ionic / Angular** (`package.json`): entre na pasta, rode `npm install` (ou `yarn`, quando houver `yarn.lock`) e depois o script definido em `package.json` (ex.: `npm start` ou `npm test`).
- **.NET Framework** (`packages.config` + `.csproj`): restaure os pacotes com NuGet (`nuget restore` ou pelo Visual Studio) e abra o arquivo `.csproj` correspondente.
- **Java** (`fatec-java-*`) e **C** (`fatec-c-*`, `fatec-compare-c`): cada lista/exercício é independente; compile com o JDK ou o compilador C disponível e execute o arquivo principal de cada pasta.
- **Trabalho de Graduação** (`fatec-tg/`): documentos do TG, sem código de execução.

Atualizações de dependências são acompanhadas pelo Dependabot (`.github/dependabot.yml`), que abre PRs semanais por subprojeto. Diretrizes gerais estão em [AGENTS.md](AGENTS.md) e o resumo de saúde do repositório em [docs/PROJECT_HEALTH.md](docs/PROJECT_HEALTH.md).

## Licença

MIT
