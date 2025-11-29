# mini-calculadora

Este programa es una mini calculadora que ayuda a los alumnos a saber la media de sus asignaturas, si han suspendido algún módulo y si han aprobado el curso, usando solo sus notas.


Proceso:
Al empezar a crear la mini calculadora, decidí usar Java, ya que es un lenguaje que recién comencé a aprender este año, en septiembre de 2025. Aunque tengo más experiencia con Python, quise aprovechar esta oportunidad como un reto personal para mejorar en Java.
Programé tanto en NetBeans como en Visual Studio Code.

Una vez que había decidido cómo estructurar el programa en papel, comencé creando las variables.
Las variables de tipo int "asignaturas" y "suspendidas" son enteros porque sus valores siempre serán números enteros. 

La variable k servirá como contador en un bucle for. Aunque el nombre no sea el más descriptivo, para contadores prefiero letras como "k" o "x", que son fáciles de distinguir entre líneas de código.

Luego creé variables double para guardar valores con decimales, como las notas de cada asignatura, la suma de las notas y la media. 

Para guardar las notas, de momento la única forma que conozco es concatenarlas en un String, en este caso llamé a la variable "secuenciaDeNotas". 

Por último, los booleanos los usaré para confirmar si se ha aprobado el curso o si las notas son válidas, es decir, que estén dentro del rango de 0 a 10.

Las variables siempre se deben inicializar, por lo tanto fué lo que hice.

Lo primero que hace el programa es preguntar al usuario cuántas asignaturas tiene y guardar ese dato. El usuario debe introducir un valor entre 1 y 10. Si no se cumple esta condición, el programa vuelve a preguntar. Como la pregunta se debe hacer al menos una vez, lo ideal es usar un do while, ya que este tipo de bucle se ejecuta una o más veces. 

Dentro del bucle incluí un if para mostrar un mensaje de error si el usuario introduce un número que no es válido.

A continuación, se pedirán las notas, que deben tener al menos un decimal (aunque también se pueden introducir enteros, pero como las notas no siempre son exactas, es mejor incluir el decimal). Estas deben estar entre 0.0 y 10.0, si no, se mostrará un mensaje de error y se volverá a pedir la nota.
(En el output de NetBeans es necesario usar la "," , pero en visual se ha de utilizar el ".")

Como ya sabemos el número exacto de asignaturas, también sabemos cuántas notas debe introducir el usuario, así que lo más lógico es usar un for para pedirlas, ya que el bucle tiene un límite o tope fijo. Dentro del bucle, se guardarán las notas en la variable "secuenciaDeNotas" y estas se sumarán en la variable suma. Además, dentro del for incluí un do while y un if que preguntan por la calificaión y muestran un mensaje de error si se introduce una nota no válida. 

Sí, es verdad que la condición se repite, pero lo consideré necesario, porque, de otra manera, no se me ocurrió por mí misma cómo hacerlo. Si esto me hubiera pasado en otras circunstancias, habría preguntado a alguien con más experiencia y habría intentado hacerlo de nuevo aplicando lo aprendido, pues uno siempre está aprendiendo algo nuevo para mejorar.

Después de pedir las notas, se usará un contador para registrar las suspendidas y, al finalizar el bucle, el programa calculará la media de las notas. Con un if se confirmará que aprobará únicamente quien tenga una media mayor o igual a cinco y no más de una asignatura suspendida.

Para la última parte del programa, donde se deben mostrar las notas, la media, las asignaturas suspendidas y si se ha aprobado o no, escribí un System.out.println que comienza con una nueva línea para separar la salida de la introducción de notas anterior. 

Luego usé un printf para formatear la media, mostrando un solo decimal con coma española. 

Después, otro println muestra las asignaturas suspendidas, nuevamente con una nueva línea al inicio para separar la información en el output.

Finalmente, incluí un if que muestra el mensaje "HA APROBADO" si el alumno cumple los criterios, y "HA SUSPENDIDO" en caso contrario.


Lo más fácil:
------------
Lo más fácil fue estructurar el programa, se me hizo sencillo identificar los diferentes bloques para cada parte del proceso. Esto debido a que antes de programar hice un esquema en papel de cada parte del proceso, lo que me ayudó a organizar mejor el código.

También me resultó fácil decidir qué variables necesitaba y qué tipo de dato usar para cada una, lo que agilizó luego la programación.

En cuanto la lógica de operaciones, calcular la media y sumar las notas fue muy, pero muy fácil.

Lo más difícil:
----------------
Lo más difícil fue poner las condiciones adecuadas en algunos de los bucles para que se mostrara el mensaje de error. Probé varias formas de hacerlo, pero al final decidí que esta era la mejor solución que podía dar en este momento.

Otro pequeño desafío fue que no supe utilizar las funciones/métodos en Java, ya que aún no los hemos visto en clase. Sin embargo, estoy familiarizada con ellos gracias a mi conocimiento en Python (def), por lo que estoy segura de que los aprendería bastante rápido.

Información adicional y agradecimiento:
--------------------------------------
Quería agradecerles por haberme seleccionado para la siguiente fase. Les envié un correo el día 26 de noviembre de 2025, pero no estoy segura de si lo recibieron, por lo que aprovecho este mensaje para reiterar mi agradecimiento. También quisiera confirmar mi interés en las dos prácticas mencionadas. Me sentiría muy satisfecha participando en cualquiera de ellas, ya que me apasiona con la misma intensidad tanto la programación como la ciberseguridad.

