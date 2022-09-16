(ns maps.exercicio
	(:require [maps.data :refer [cliente compras]]
			  [maps.operations :refer []]))


;; dado o mapa no namespace data.clj, escrever funcoes que:
;; altera a idade do cliente
(defn update-age
	"changes customer's age"
	[map new-age]

	(assoc map :idade new-age))

(update-age cliente 10)


;; remove o endereco do cliente
(defn delete-address
	"deletes customer's address"
	[map]

	(dissoc map :endereco))

(delete-address cliente)

;; atualiza o valor de um item de compra
(defn update-shopping-list-item
	"updates an item in the shopping list given its index"
	[map index new-value]

	(update compras index #(assoc % :valor new-value)))

(update-shopping-list-item compras 0 10)

;; adicionar o vetor de compras no mapa do cliente
(defn add-shopping-list--to-customer
	"adds shopping list to customer"
	[customer shopping-list]

	(assoc customer :shopping-list shopping-list))

(add-shopping-list--to-customer cliente compras)

;; adiciona um novo item de compra
(defn add-item-to-shopping-list
	"adds an item to the shopping list"
	[array item value]

	(conj array {:item item :valor value}))

(add-item-to-shopping-list compras "Carro" "Caro demais")

;; retorna o nome do cliente

(defn get-customer-name
	"gets the customer's name"
	[customer]

	(:nome customer))

(get-customer-name cliente)