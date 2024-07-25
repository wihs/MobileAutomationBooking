#language: es
Característica: Features de booking

  Antecedentes:
  Como asdf
  Quiero asdf
  Para asd

  Esquema del escenario:

    Dado que "<actor>" quiere usar la app de booking
    Cuando realiza el registro de la "<ciudad>" destino a buscar
    Y realiza el registro de las fechas a buscar
    Y realiza el registro de las habitaciones y personas
    Y seleccionar la segunda opcion de los resultados
    Y llenar el formulario de reserva
    Entonces verificar los datos de reserva
    Y llena los datos de la tarjeta
    Entonces verifica y realiza reserva

    Ejemplos:
      | actor   | ciudad | fecInicio | fecFin | room | adult | child | ageChild |
      | Willy   | Cuzco  | v2        |        |      |       |       |          |