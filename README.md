# PracticaFinal2019

Práctica Final de Programación 1º K 2018/2019

Alumno: MARTÍNEZ SERRANO, MANUEL

El objetivo de la práctica es desarrollar una aplicación en java para el manejo de listas de poetas.
Se dispondrá de diferentes usuarios en la aplicación. Cada usuario tendrá el control de una lista de poetas.

Descripción del funcionamiento de la aplicación

Al iniciar la aplicación, se pedirá una identificación al usuario (un número de 10 dígitos).

Si el usuario no se había identificado anteriormente, se le pedirá una serie de datos (nombre, apellidos, correo electrónico, fecha de nacimiento, etc) y se le dará de alta en el sistema de modo que no será necesario volver a pedir esos datos.

Una vez se han introducido esos datos o si el usuario ya estaba dado de alta en el sistema, se accede a la pantalla de gestión de poetas.

En esta pantalla se podrá ver la lista de poetas y se podrá añadir y eliminar poetas individualmente. Cada uno de los poetas se podrá modificar. Se podrá obtener un listado de los poetas ordenado según diversos criterios.

Se intentará que la experiencia del usuario sea lo más cómodo y estándar posible.

Especificaciones de la implementación:

Usuario de la aplicación:
•	Se deben guardar los usuarios de la aplicación en uno o varios ficheros de texto. De este modo, un usuario avanzado podría crear usuarios o modificar datos de los usuarios.
•	Uno de los datos a guardar de los usuarios es la fecha y la hora en la que se dieron de alta en la aplicación.
•	Como ampliación se puede implementar un sistema de usuario/contraseña

Lista de poetas
•	Es obligatorio implementar herencia en los poetas. De este modo tendremos:
•	cantantes extiende a poeta y guarda discos vendidos
•	dramaturgos extiende a poeta y guarda obra cumbre
•	La lista no se guardará en ficheros de texto, se elegirá otro tipo de archivo de los tratados en clase (lo más sencillo es guardar cada lista como un objeto).

Exportar base de datos:
•	Permitirá que el usuario elija un directorio. En ese directorio, creará un fichero index.html con enlaces a ficheros html creados para cada uno de los poetas.
