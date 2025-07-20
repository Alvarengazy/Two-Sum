# 🎯 Two Sum - Solução em Java

## 📋 Descrição

Este programa resolve o clássico problema **Two Sum**:

> Dado um array de números inteiros e um valor alvo (`target`), encontrar dois números no array cuja soma seja igual ao `target`.

Ele retorna os **índices** desses números no array.

---

## ⚙️ Como funciona?

- Recebe do usuário:
  - Tamanho do array
  - Valores do array (números inteiros)
  - Valor alvo (`target`)

- Utiliza um `HashMap` para armazenar números já visitados e seus índices.
- Para cada número, calcula o complemento que falta para chegar ao target.
- Se o complemento já estiver no mapa, retorna os índices.
- Caso contrário, adiciona o número atual ao mapa e segue o loop.

---

## 📝 Estrutura do código

```text
twosum.java
├── main()        # Entrada e saída de dados
└── twoSum()      # Lógica para encontrar os índices
```
---
# 🎯 Exemplo de uso
```text
Digite o tamanho da sua Array: 5
Digite os valores da Array: 2 7 11 15 3
Digite o valor de Target: 9
Índices dos números que somam ao target: [0, 1]
```
---
# 👨‍💻 Autor
Feito por Alvarengazy
