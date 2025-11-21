ACTIVIDAD – Sistema de Registro de Juegos Indicaciones Generales
Desarrolle un programa en Java que permita registrar información sobre juegos de Mario Bros y juegos de Carreras de Vehículos.
El objetivo es aplicar herencia, polimorfismo, excepciones personalizadas y manejo de listas (ArrayList) mediante un menú interactivo.
Requerimientos
1.	Crear una clase abstracta llamada Juego con atributos base y un método abstracto.
2.	Crear las clases hijas MarioBros y CarreraVehiculos que hereden de Juego.
3.	Implementar una excepción personalizada para validar datos incorrectos.
4.	Gestionar los juegos dentro de un ArrayList<Juego>.
5.	Implementar un menú en consola que permita registrar y consultar juegos.
6.	Aplicar polimorfismo al mostrar los detalles de cada juego.
7.	Validar datos ingresados por el usuario (números positivos, texto no vacío, etc.).
8.	Probar el sistema ingresando al menos cinco juegos de ambos tipos.
<img width="366" height="653" alt="image" src="https://github.com/user-attachments/assets/667fef0f-f0d2-4531-ac7f-f957472f9b3c" />
<img width="363" height="514" alt="image" src="https://github.com/user-attachments/assets/4eb26245-b561-4b3e-a588-04d94be3ec4b" />
<img width="362" height="750" alt="image" src="https://github.com/user-attachments/assets/2b789f30-9f47-41c5-b171-64916890168b" />
<img width="360" height="264" alt="image" src="https://github.com/user-attachments/assets/80ddf3e1-808b-4f20-b365-3c3732ed477d" />
ENUNCIADO:
Desarrollar un programa en Java que simule el registro y funcionamiento de diferentes dispositivos electrónicos.
Debe aplicarse: encapsulamiento, herencia, polimorfismo, sobrescritura, manejo de listas y excepciones personalizadas.
Requerimientos del programa
1.	Crear una clase padre llamada Dispositivo con atributos privados (marca, modelo, precio).
2.	Implementar getters y setters para aplicar encapsulamiento, validando datos incorrectos.
3.	Crear dos clases hijas:
o	Laptop
o	Telefono
Ambas deben heredar de Dispositivo.
4.	La clase padre debe incluir un método mostrarInfo() que luego será sobrescrito en cada clase hija para demostrar polimorfismo.
5.	Crear una excepción personalizada llamada DatoInvalidoException, la cual debe lanzarse cuando se ingrese un precio negativo o una marca vacía.
6.	En el método main, crear un ArrayList de tipo Dispositivo, registrar objetos de tipo Laptop y Telefono, y mostrar la información usando polimorfismo.
7.	Capturar excepciones con try–catch cuando se creen dispositivos con datos inválido
<img width="360" height="655" alt="image" src="https://github.com/user-attachments/assets/79a4b27e-b66c-4e4d-9ef4-1c0a7a851213" />
<img width="364" height="514" alt="image" src="https://github.com/user-attachments/assets/9a13ab79-d3c9-4a9b-b958-7d2811712639" />
<img width="321" height="203" alt="image" src="https://github.com/user-attachments/assets/d688acf7-efb1-413f-af7c-def9347794c2" />
<img width="312" height="289" alt="image" src="https://github.com/user-attachments/assets/b7baf2e4-4fad-4123-ace8-8a2ed75d325a" />
