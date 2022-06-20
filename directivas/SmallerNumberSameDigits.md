## Número más pequeño con los mismos digitos
Escribe una función que tome un entero positivo y devuelva el siguiente entero positivo más pequeño que contenga los mismos dígitos.

Ejemplos:

`
nextSmaller(21) == 12`

`
nextSmaller(531) == 513
`

`nextSmaller(2071) == 2017`

Devuelve -1, cuando no hay un número más pequeño que contenga los mismos dígitos. También devuelva -1 cuando el siguiente número más pequeño con los mismos dígitos requiera que el dígito inicial sea cero.

`nextSmaller(9) == -1
`

`
nextSmaller(111) == -1
`

`nextSmaller(135) == -1`

`nextSmaller(1027) == -1 // 0721 no escribimos numeros con un 0 inicial`

* algunas pruebas incluirán números muy grandes.
* los datos de prueba solo emplean números enteros positivos