# senaapi
se carga el código fuente y dejamos el add readme
INFORME SOBRE DESARROLLO DE API REST CON SPRING BOOT

En el siguiente informe explicaremos como nuestra apirest que es de servicios de interacción de una tienda de comercio electrónico , que se comunica con entidades como producto y local , la intención es saber donde conseguir x producto en x tienda , esto quiere decir en pocas palabras , que la empresa le da una plataforma de comercio al cliente para que por medio de los servicios que presta esta api conecte la información de la  base de datos por medio de funcionalidades  , es el caso de saber donde esta el producto   "brand": "blackanddeker" que esta en la tienda primeratienda  del piso uno : 
 

Este sistema de servicios maneja solicitudes del cliente relacionadas con los productos y los locales. Este servicio ingresa primeramente por el controlador por medio de endpoints, luego se conecta a las clases local y producto a entity para continuar con la conexión a la bases de datos de estas entidades , luego interactúa con el repositorio de local y producto atravez de la interfas de springboot JpaRepository permitiendo que se pueda realizar cualquier tipo de solicitudes CRUD , es decir, crear información nueva , interpretar o leer datos , actualizar y/o eliminar datos , luego la interfas se comunica con los servicios que son los que definines los métodos para realizar operaciones relacionadas con las entidades Local y Product. Estas interfaces se implementan en las clases, donde se proporciona la lógica para ejecutar estas operaciones.


Esto permite que esta api por ejemplo, se pueden obtener listas de todos los locales y productos almacenados en el sistema, así como agregar, actualizar o eliminar locales y productos según sea necesario. Como la api es de prueba no esta finalizada pero vamos a conocer que se pudo realizar con ella a continuación:



CODIFICACIÓN EN SPRINGBOOT
Este proceso se realiza con el lenguaje java y se utiliza el framework Spring Boot donde se utilizara las bibliotecas y dependencias para la construcción de esta apirest. Esto es necesario porque necesitamos implementar los componentes de la api como controladores, servicios y entidades y los repositorios para que funciones las peticiones de los clientes, esto define en pocas palabras las rutas por donde viajan las solicitudes http para luego devolver las corespondientes salidas o respuesta del requerimiento , es necesario la codificación ya que esta contiene la lógica de la tienda o ecommerce y para que el sistema interactué con ella , esto permite la manipulación de la información en la web o aplicación dependiendo el proyecto. 

Se codifica el backend permitiendo que sea posible las operaciones de las aplicaciones de comercio electrónico CRUD Crear, Leer, Actualizar, Eliminar, y puedan ser consumidos por los clientes , al utilizar spring boot nos simplifica la configuración ya que ella en su biblioteca ya tiene una seudo configuaracion predeterminada que se puede ajustar a las necesidades que requeramos , ya que esta tiene una información organizada y estructurada que nos ayuda con el desarrollo , permite el manejo de las solicitudes HTTP  y poder interactuar con la base de datos.







Codificación de los controladores: la carpeta CONTROLLER que es definido como el controlador en Spring Boot utiliza la anotación @RestController. Los controladores manejan las solicitudes HTTP entrantes y definen las rutas de la API mediante la anotación @RequestMapping ejemplo;




Los métodos en los controladores, como findAll(), se encargan de manejar las solicitudes HTTP específicas, como las solicitudes GET para obtener todos los locales o productos. Se ha utilizado la inyección de dependencias mediante la anotación @Autowired para conectar los controladores con los servicios correspondientes, como LocalService y ProductService. 

Definición de Entidades (Entity): Se han definido entidades utilizando anotaciones como @Entity, @Table, @Column, y @Id. Estas entidades representan los objetos de dominio de la aplicación, como Local y Product.ejemplo : 








Implementación de Servicios (Services): Se han implementado interfaces y clases de servicio para encapsular la lógica de negocio relacionada con la gestión de locales y productos. Estos servicios interactúan con los repositorios para acceder a los datos.

 

Configuración del archivo pom: Se ha configurado el proyecto utilizando un archivo pom.xml de Maven para gestionar las dependencias y un archivo de clase principal (SenaapiApplication.java) para inicializar la aplicación Spring Boot
 




El uso de herramientas como Visual Studio Code, control de versiones en Git y un servidor local en XAMPP con MySQL, junto con el uso de Postman para probar los endpoints, contribuyen al proceso de desarrollo y pruebas de la aplicación del ecommerce por ejemplo : 

 

 

CONTROL DE VERSIONES 
Para rastrear el código fuente del proyecto que estamos desarrollando utilizaremos la herramienta de control de versiones GIThub para alojarlo y así poder utilizar a github como repositorio para el backend, gestionar cambios y trabajar coperativamente si se desea 


 

url: https://github.com/miusuario-steven/senaapi

GESTIÓN DE DEPENDENCIAS:
Estas dependencias son importantes para el backend porque administra las bibliotecas que ayudan al desarrollo y funcionamiento de la aplicación , este ayuda a identificar declarar y gestionar las bibliotecas externas o módulos que una aplicación necesita para funcionar correctamente. En nuestro caso el archivo que contiene las dependencias es el pom.xml garantizar que una aplicación pueda acceder a las funcionalidades y recursos externos que necesita para funcionar correctamente. Permite a los desarrolladores centrarse en el desarrollo de la lógica de negocio de la aplicación en lugar de tener que escribir código desde cero para cada funcionalidad requerida.

La configuración del archivo pom.xml en el proyecto Spring Boot proporcionado muestra cómo se declaran y gestionan las dependencias en un proyecto Maven.
•	spring-boot-starter-data-jdbc: Esta dependencia proporciona el inicio automático de Spring Boot para trabajar con JDBC (Java Database Connectivity). Se utiliza para acceder a bases de datos relacionales de manera eficiente y simplificar la configuración de la capa de acceso a datos.
•	spring-boot-starter-data-jpa: Esta dependencia proporciona el inicio automático de Spring Boot para trabajar con JPA (Java Persistence API). JPA es una API estándar de Java para mapear objetos Java a tablas en bases de datos relacionales. Se utiliza para la capa de persistencia de la aplicación y facilita las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos.
•	spring-boot-starter-web: Esta dependencia proporciona el inicio automático de Spring Boot para desarrollar aplicaciones web. Incluye todas las bibliotecas necesarias para crear aplicaciones web, como Spring MVC (Model-View-Controller), que es un marco para construir aplicaciones web y API RESTful.
•	mysql-connector-j: Esta dependencia proporciona el controlador JDBC para MySQL, permitiendo que la aplicación se comunique con una base de datos MySQL. Es esencial para la conexión y la interacción con la base de datos MySQL utilizada en la aplicación.
•	lombok: Esta dependencia habilita la funcionalidad de Lombok para la generación automática de código en Java. Lombok reduce la verbosidad del código al generar automáticamente métodos getter, setter, constructores y otros métodos comunes, lo que hace que el código sea más conciso y legible.
•	spring-boot-starter-test: Esta dependencia proporciona el inicio automático de Spring Boot para las pruebas unitarias y de integración. Incluye todas las bibliotecas necesarias para escribir y ejecutar pruebas automatizadas en la aplicación.

Frameworks  en el backend : se utiliza Spring Boot para facilitar ya que esta  biblioteca nos ayuda a tener una configuración automática basados en las dependencias y componentes que necesita nuestra apirest  , reduce la complejidad, también incluye un servidor web embebido, lo que significa que no es necesario desplegar la aplicación en un servidor externo














COMPONENTES REUTILIZABLES 

Se utilizan los componentes en la apirest ya que ayudan al backend a que sea mas limpio y que pueda reutilizar la información que ya tiene en las librerías para que se automaticen los procesos de manera más eficiente, estos se utilizan para utilizarlos en las operaciones para evitar la duplicación de código , en este caso tenemos los siguiente componentes :

•	Controladores (Controllers):
Los controladores, como LocalController y ProductController, gestionan las solicitudes HTTP entrantes y proporcionan las respuestas correspondientes.
Estos controladores exponen puntos finales para obtener una lista de todos los locales y productos, respectivamente.
Siguen una estructura similar y pueden considerarse componentes reutilizables, ya que pueden ser utilizados en diferentes partes de la aplicación para manejar operaciones similares.

•	Servicios (Services):

Los servicios, como LocalService y ProductService, encapsulan la lógica de negocio de la aplicación y coordinan las operaciones entre los controladores y los repositorios.
En este caso, estos servicios definen métodos para obtener todas las localidades y todos los productos, respectivamente.
Los servicios son componentes reutilizables ya que pueden ser invocados desde diferentes controladores para realizar operaciones similares en distintas partes de la aplicación
.




•	Entidades (Entities):

Las entidades, como Local y Product, representan objetos del dominio de la aplicación y se utilizan para mapear los datos de la base de datos.

Estas entidades son componentes reutilizables en el sentido de que pueden ser utilizadas en diferentes partes de la aplicación para representar objetos similares del dominio.


•	Repositorios (Repositories):

Los repositorios, como LocalRepository y ProductRepository, proporcionan métodos para acceder y manipular los datos en la base de datos.

Estos repositorios ofrecen operaciones CRUD en las tablas de locales y productos, respectivamente, lo que los hace componentes reutilizables ya que pueden ser utilizados en diferentes partes de la aplicación para manipular datos de manera consistente.


Buenas practicas de codificación:

La apirest que estamos trabajando es una api en desarrollo, por lo que podemos tener algunas sugerencias de mejora para que el código sea mas lejible por los motores y los id y que ayuden al mejoramiento de la apirest. Adicional podemos utilizar inyección de dependencias en lugar de crear instancias manualmente de las clases que necesita el api. Otra buena practica es agregar comentarios sobre qué hace cada controlador y servicio en la api , con estas sugerencia podemos mejorar nuestro código y crear mejoras para sus funcionalidades y que sea mas eficiente en el tiempo o vida del mismo.





Patrones de diseño 

En nuestro código tenemos algunos patrones de diseño como la inyecion de dependencias través de la anotación @Autowired ayudando a la modularidad de las dependencias del framework de springboot, en tanto al modelo vista controlador MVC Los controladores (LocalController y ProductController) actúan como controladores, las entidades (Local y Product) actúan como modelos y las vistas serían la representación de los datos en el frontend, pero como por ahora no tenemos frontend este será replazado por endpoind de postma, también vemos que clases proporcionan una abstracción sobre el almacenamiento de datos y ofrecen métodos para realizar operaciones CRUD (crear, leer, actualizar, eliminar) en la base de datos, Cada uno de estos patrones ayuda a estructurar y organizar el código de manera que sea más modular, mantenible y fácil de entender. 
A continuación dejare una lista de los patrones de diseño mas utilizados en la apirest:

•	Inyección de Dependencias (DI)
•	Patrón Repositorio
•	Patrón Servicio
•	Patrón DTO = Objeto de Transferencia de Datos
•	Patrón MVC = Modelo-Vista-Controlador

Además podemos identificar el patrón de diseño MVC (Modelo-Vista-Controlador) adaptado a la arquitectura de software en el backend de la siguiente manera:

Model:
Las clases Local y Product en el paquete com.sena.senaapi.entity representa los modelos de datos o entidades del sistema. Estas clases definen la estructura de los datos y sus relaciones.
En una aplicación RESTful como esta, la vista se representa típicamente como la representación de los recursos en formato JSON o XML. No los vemos pero Aunque no se muestra explícitamente en el código proporcionado, los recursos devueltos por los controladores pueden considerarse como la vista en el contexto de una aplicación RESTful.


Controlador.
Los controladores en los paquetes com.sena.senaapi.controller manejan las solicitudes HTTP y controlan el flujo de la aplicación. En este caso, los controladores LocalController y ProductController manejan las solicitudes relacionadas con los locales y los productos, respectivamente. Estos controladores son responsables de interactuar con los servicios para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los modelos de datos.
Por lo tanto, el patrón MVC se refleja en la separación de responsabilidades entre los modelos de datos, los controladores que manejan las solicitudes y las vistas que representan la salida de la aplicación (en este caso, los recursos RESTful). Este enfoque facilita la modularidad, el mantenimiento y la escalabilidad del sistema


PRUEBAS UNITARIAS 
Se realiza pruebas del backend para ver la funcionalidad y la integridad de las operaciones con Postman, en este caso realizamos la petición get en postman  para traer datos de la siguiente manera dándonos como resultado un 200 : 

 



 

Como el entorno ya esta configurado y funcionando correctamente pordemos andar en el visual estudio para correr la app y luego realizar las pruebas como vemos en las imágenes con postman tanto en el modulo local como en el producto de la api y esto es posible a que esta conectado la base de datos con el id visual studio code por el puerto 8090, 
 

En este caso solo desarrollamos la solicitud HTTP get en postman sin envargo a medida de que el código valla evolucionando podremos implementar otro tipo de solicitudes CRUD como por ejemplo : post , delete put, patch etc:
Estas pruebas nos dan información valiosa ya que las respuestas recibidas desde postman nos ayudan a saber como esta funcionando el backent y poder abordar los problemas que se presenten en los módulos de forma mas efectiva y precisa , Si es posible, considera la posibilidad de automatizar las pruebas unitarias utilizando la colección de Postman en un sistema de integración continua (CI). Esto te permitirá ejecutar las pruebas automáticamente cada vez que se realice un cambio en el backend, garantizando que las nuevas implementaciones no rompan la funcionalidad existente.


Configuración del servidor :
Se ha elegido utilizar un servidor local llamado XAMPP ya que utiliza apache y se complementa con la empaquetadura de la aplicación spring boot con archivo tipo jar ya que este ayuda a que se pueda implementar Maven de la mejor forma. 
 
 

 

Documentación del ambiente 
Se crean las condiciones para el desarrollo de una api rest que se al usuario información de productos y locales, se desarrolla , se  genera el ambiente y comprende los sistemas y herramientas necesarios para desarrollar y probar las funcionalidades del backend, asegurando su correcto funcionamiento antes de la implementación en producción

Requisitos del Sistema:

•	Sistema operativo: Windows.
•	Versión de Java: 17 
•	Memoria RAM mínima: 4 GB.
•	Espacio de almacenamiento: 5GB




Herramientas y Tecnologías Utilizadas:

•	Spring Boot
•	Maven/Gradle
•	MySQL
•	IDE visual studio code 
•	Servidor local XAMPP
•	Herramientas de pruebas POSTMAN 

Configuraciones del Ambiente de Desarrollo:

La Configuración del ID con las dependencias y plugins necesarios para el desarrollo de aplicaciones con Spring Boot.fueron con visual studio code y Lombok, spring web, spring JPA, My SQL,
Como Configuración de un servidor local como XAMPP para ejecutar la aplicación en el ambiente de desarrollo.
Configuración de una base de datos local como MySQL para el desarrollo y prueba de la capa de persistencia.

Configuraciones del Ambiente de Pruebas:

Configuración de un servidor de pruebas para desplegar y probar la aplicación antes de su implementación en producción.Luego se usa la Configuración de una base de datos de pruebas para realizar pruebas unitarias e integradas con postman por medio de endpoins 

 


