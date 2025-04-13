# Minha Implementação de ArrayList em Java

Este repositório contém uma implementação personalizada da estrutura de dados `ArrayList` em Java, utilizando vetores como estrutura de dados interna. Este projeto foi desenvolvido como um exercício para entender os conceitos fundamentais por trás da `ArrayList`.

## Funcionalidades Implementadas

Os seguintes métodos foram implementados nesta versão da `ArrayList`:

* `void add(String element)`: Adiciona um novo elemento do tipo `String` ao final da lista.
* `String get(int index)`: Recupera o elemento `String` localizado no índice especificado.
* `boolean remove(int index)`: Remove o elemento `String` presente no índice informado.
* `boolean remove(String nome)`: Remove a primeira ocorrência do elemento `String` que corresponda ao valor fornecido.
* `int size()`: Retorna o número total de elementos `String` contidos na lista.
* `String toString()`: Converte a lista em uma representação textual dos seus elementos.

## Estrutura Interna

Esta implementação utiliza um array (vetor) de `String` para armazenar os elementos da lista. O tamanho do vetor é definido no momento da criação da instância da `ArrayList`.

## Limitações

Esta versão da `ArrayList` possui as seguintes limitações por enquanto:

* **Sem Suporte a Tipos Genéricos:** A lista armazena apenas objetos do tipo `String`.
* **Tamanho Fixo:** O tamanho do vetor interno é definido na criação e não há redimensionamento dinâmico automático quando a lista fica cheia.

## Como Usar

1.  Clone este repositório para sua máquina local.
2.  Compile a classe da sua `ArrayList` (e qualquer outra classe necessária).
3.  Crie uma instância da sua classe `ArrayList`, especificando o tamanho inicial do vetor.
4.  Utilize os métodos implementados para adicionar, remover, acessar e verificar o tamanho dos elementos na lista.

```java
MyArrayList minhaLista = new MyArrayList();

minhaLista.add("Elemento 1");
minhaLista.add("Elemento 2");

System.out.println("Tamanho da lista: " + minhaLista.size()); // Saída: Tamanho da lista: 2
System.out.println("Elemento no índice 0: " + minhaLista.get(0)); // Saída: Elemento no índice 0: Elemento 1
System.out.println(minhaLista); // Saída: Uma representação textual da sua lista (depende da sua implementação do toString())

minhaLista.remove(1);
System.out.println("Tamanho da lista após remoção: " + minhaLista.size()); // Saída: Tamanho da lista após remoção: 1
