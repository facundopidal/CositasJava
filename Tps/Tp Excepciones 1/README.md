1-Escribe un programa que pida al usuario dos números enteros y muestre el resultado de la división del primer número por el segundo. Si el segundo número es cero, el programa debe lanzar una excepción de tipo ArithmeticException.

2-Escribe un programa que pida al usuario que introduzca una cadena de texto y muestre su longitud. Si el usuario introduce un número en lugar de una cadena, el programa debe lanzar una excepción de tipo NumberFormatException.

3-Escribe un programa que pida al usuario un número y muestre el elemento correspondiente en un array. Si el usuario introduce un índice fuera de los límites del array, el programa debe lanzar una excepción de tipo ArrayIndexOutOfBoundsException.

4-Escribe un programa que pida al usuario el radio de un círculo y muestre su área. Si el usuario introduce un valor negativo, el programa debe lanzar una excepción de tipo IllegalArgumentException.

5-Escribe una clase que represente una cuenta bancaria, con un saldo y un número de cuenta. La clase debe tener un método para retirar que reciba una cantidad de dinero y lance una excepción de tipo SaldoInsuficienteException si el saldo es menor que la cantidad a retirar. La excepción SaldoInsuficienteException debe ser una clase personalizada que herede de Exception y tenga un constructor que reciba un mensaje de error.

6-Escribe una función recursiva que calcule el factorial de un número entero no negativo. Si se intenta calcular el factorial de un número negativo, la función debe lanzar una excepción de tipo IllegalArgumentException.

7-Escribe un programa que pida al usuario su fecha de nacimiento en formato dd/mm/aaaa y muestre su edad. Si el usuario introduce una fecha inválida, como por ejemplo 31/02/2000, el programa debe lanzar una excepción de tipo DateTimeParseException.

8-Escribe un programa que calcule el impuesto a pagar por la compra de un producto en un país determinado. El programa debe tener en cuenta las diferentes tasas de impuestos según la categoría del producto. Si el usuario introduce una categoría inválida, el programa debe lanzar una excepción de tipo InvalidCategoryException.

9-Escribe un programa que pida al usuario que introduzca una contraseña y la valide según ciertos criterios, como por ejemplo que tenga al menos 8 caracteres y contenga al menos una letra mayúscula y un número. Si la contraseña no cumple con los criterios, el programa debe lanzar una excepción de tipo InvalidPasswordException.