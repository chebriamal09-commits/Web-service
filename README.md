# BanqueWS - TP SOAP Web Service

## Réalisé par
Amal Chebri

## Description
Ce projet implémente un Web Service SOAP avec JAX-WS permettant de :

- Convertir un montant Euro en DH.
- Consulter un compte bancaire.
- Consulter la liste des comptes.

Le projet contient deux modules :

- banque-ws-server
- banque-soap-client

## Technologies

- Java
- Maven
- JAX-WS
- SOAP
- WSDL
- SoapUI

## Exécution

### Démarrer le serveur

```bash
cd banque-ws-server
mvn exec:java
```

Le WSDL est disponible sur :

```
http://localhost:8085/?wsdl
```

### Tester avec SoapUI

Importer le WSDL :

```
http://localhost:8085/?wsdl
```

Tester les opérations :

- ConversionEuroToDH
- GetCompte
- ListComptes

### Exécuter le client

```bash
cd banque-soap-client
mvn jaxws:wsimport
mvn clean compile
mvn exec:java
```

## Auteur

Amal Chebri
Master IIBDCC - ENSET Mohammedia
