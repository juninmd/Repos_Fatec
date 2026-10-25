# AGENTS.md - Repos Fatec

## Tech Stack
- **Languages:** Java, C, JavaScript/Node.js, Dart/Flutter, Ionic
- **Databases:** SQL, MongoDB
- **Platform:** Web, Mobile (Android/iOS)

## Project Structure
33 subdirectories covering:
- **C:** Data structures (linked lists, circular, doubly linked)
- **Java:** 8 exercise lists + final project
- **Mobile:** Ionic apps, Flutter apps
- **Web:** Node.js APIs, hospital management system
- **TG (Graduation Thesis):** Final project
- **Database:** Sync tools, table generators

## Notes
- Collection of academic projects from Fatec Franca
- Covers multiple semesters and disciplines
- Includes individual assignments, group projects, and thesis work

<!-- base-actions-main-policy -->
## GitHub Actions — padrão obrigatório (@main)

- Referencie as actions internas sempre pelo branch, nunca por SHA:
  - `uses: juninmd/base-actions/<action>@main`
  - `uses: juninmd/base-actions/.github/workflows/<arquivo>.yml@main`
- Não fixe `@<sha>` em `juninmd/base-actions`: a atualização é centralizada no
  `main` e passa a valer no próximo run.
- PRs cujos checks não iniciam por billing/spending limit são mesclados pelo bot central
  `juninmd/base-actions/.github/workflows/auto-merge-billing-blocked.yml`.
  Para impedir o merge automático de um PR, aplique a label `do-not-merge`.