Supongamos que estás desarrollando un programa para gestionar una tienda de libros. Cada libro tiene un título, un autor, un precio, y ahora, también añadiremos el año de publicación como atributo adicional. El programa debe permitir realizar las siguientes operaciones:

Agregar un nuevo libro al inventario.
Eliminar un libro del inventario.
Mostrar todos los libros en el inventario.
Buscar un libro por su título.
Actualizar el precio de un libro.
Calcular el precio total de todos los libros en el inventario.
Contar el número total de libros en el inventario.
Encontrar el libro más caro y el más barato en el inventario.

Pensar que estructuras de datos vista (ArrayList, LinkedList, Stack o HashMap) nos conviene para implementar las operaciones anteriores. 

Consideraciones adicionales:
Crea una clase Libro que tenga atributos para el título, autor, precio y año de publicación.
Asegúrate de agregar validaciones de entrada para garantizar que los datos ingresados por el usuario sean válidos.


    *Lo implento con ArrayList, teniendo en cuenta que pueden existir libros con el mismo titulo y despues con un HashMap de ArrayList, en donde las claves del map contienen autores, doy por hecho que no hay libros con el mismo titulo.