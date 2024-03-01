Prueba principios SOLID Pedro Alonso Tapia Lobo TÉCNICAS DE PROGRAMACIÓN
### Link a mi repositorio de GitHub: https://github.com/Tapiiaa/PruebaSOLID_Tapia_Pedro_2023-2024.git
### Esta práctica busca la capacidad de aplicación de los principios SOLID sobre un proyecto.

#### Este proyecto consta de dos ejercicios:
- Ejercicio 1:
#### Enunciado:
Creación de una matriz: La clase debe poder ser instanciada con una matriz de enteros bidimensional (un arreglo de arreglos de enteros) que represente los elementos de la matriz.

Impresión de la matriz: Implementa un método para imprimir la matriz en una forma legible en la consola. Cada fila de la matriz debe imprimirse en una nueva línea y los elementos deben estar separados por espacios.

Cálculo de la transpuesta: Implementa un método que retorne una nueva instancia de la clase Matriz, representando la transpuesta de la matriz original.
#### Pseudocódigo:
Matriz m = new Matriz(new int[][]{{1, 2}, {3, 4}});
m.imprimir();
// Debería imprimir:
// 1 2
// 3 4

Matriz mTranspuesta = m.transpuesta();
mTranspuesta.imprimir();
// Debería imprimir:
// 1 3
// 2 4
#### Explicación:
Para implementar los principios SOLID, he creado una clase Matriz que se encarga de la creación de la matriz simple. 
Para crear su traspuesta, he creado otra clase llamada MatrizTraspuesta que implementa de forma única sus métodos. 
Luego,la clase calculadora, es la encargada de realizar las operaciones de la matriz y la traspuesta, donde posteriormente, se imprimen.

#### Se ha implementado un Diagrama de clases.
- Ejercicio 2:
#### Enunciado:
Estás desarrollando un sistema de gestión de pedidos de pizza en línea utilizando Java. Este sistema consta de varios componentes que interactúan entre sí. Los componentes principales son:

DataBaseManager: Clase responsable de manejar la conexión con la base de datos y realizar operaciones CRUD.

Authenticator: Clase utilizada para manejar la autenticación de usuarios.

OrderManager: Clase encargada de la gestión de los pedidos, incluyendo la creación, actualización y eliminación de pedidos de los usuarios.

PaymentProcessor: Clase responsable de manejar las transacciones de pago.

Estos componentes no deben crearse ni gestionarse dentro de cada clase que los utiliza. En su lugar, deben ser creados en algún lugar centralizado y "inyectados" en las clases que los necesitan a través de los constructores

#### Pseudocódigo:
No proporcionado.
#### Explicación:
Para implementar los principios SOLID, se han creado cuatro clases con responsabilidad única. 
La clase Authenticator es la encargada de la autenticación del usuario, donde se le pide un nombre(usuario) y una contraseña. 
La clase OrderManager se encarga de la gestión de los pedidos, incluyendo la creación, actualización y eliminación de pedidos de los usuarios.(CRUD)
La clase PaymentProcessor está enfocada hacia el pago del cliente en el pedido
Finalmente, la clase DataBaseManager es la encargada de manejar la conexión con la base de datos y realizar operaciones CRUD, donde se imprime un menú para que el usuario elija la operación que desea realizar. 

Las clases PizzaJamonYork, PizzaMargarita y PizzaCarbonara son clases que heredan de la clase Pizza.
#### Se ha implementado un Diagrama de clases.



