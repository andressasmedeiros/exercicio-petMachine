﻿#Pet Machine
# 🐶 PetMachine - Simulador de Máquina de Banho Pet

Projeto Java que simula o funcionamento de uma máquina de banho para pets via console.  
O sistema permite adicionar um pet, dar banho, abastecer água/shampoo e gerenciar o estado da máquina.

---

## 🚀 Funcionalidades

- ✅ Adicionar pet à máquina
- 🧼 Dar banho no pet
- 💧 Abastecer máquina com água
- 🧴 Abastecer máquina com shampoo
- 🔍 Verificar quantidade de água e shampoo
- 🧹 Limpar a máquina
- ❌ Retirar pet da máquina
- ⛔ Impede adicionar pet com máquina suja

---

## 🧾 Menu de Opções

Ao executar o programa, o seguinte menu será exibido:

```
===Escolha uma das opções===
1 - Dar banho no pet
2 - Abastecer a máquina com água
3 - Abastecer a máquina com shampoo
4 - Verificar água da máquina
5 - Verificar shampoo da máquina
6 - Verificar se tem pet no banho
7 - Colocar pet na máquina
8 - Retirar pet da máquina
9 - Limpar máquina
0 - Sair
```

---

## 🛠️ Requisitos

- Java 17 ou superior
- IntelliJ IDEA (ou qualquer IDE compatível)

---

## ▶️ Como executar

1. Clone o repositório ou copie os arquivos `.java`
2. Compile e execute a classe `Main.java`
3. Interaja pelo terminal seguindo o menu exibido

---

## 📂 Estrutura

- `Main.java`: Interface via terminal (menu e ações)
- `Pet.java`: Representa o pet (nome, estado de limpeza)
- `PetMachine.java`: Simula a máquina de banho (água, shampoo, pet, limpeza)

---

## 📌 Observações

- A máquina precisa estar limpa para aceitar um novo pet
- É necessário ter shampoo e água suficiente para realizar o banho
- A retirada do pet limpa a referência interna

---

## 📸 Exemplo de uso

```
Informe o nome do pet:
Bolt
O pet Bolt foi colocado na máquina
O pet Bolt está limpo
```

---

## 🧑‍💻 Exercício proposto no curso da DIO, desenvolvido para fins didáticos e práticos de estudos em Java.

