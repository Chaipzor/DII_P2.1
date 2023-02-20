# DII_P2.1
Desarrollo de Interfaces 2 curso Tarea 2.1

## Enunciado
Basándote en la Práctica 1.1 del login, realiza las modificaciones necesarias para que
haga uso de sesiones y siga el patrón MVC (peticiones a través de los controladores,
nunca directamente a la vista ni al modelo).
Al iniciar la aplicación a través de la url base, se mostrará una página principal con una
cabecera, desde el cual se podrá acceder a un formulario de login y a un formulario de
alta.
De la misma forma que se hacía en la Práctica 1.2 para los contactos, almacena los
usuarios en una lista en memoria, asignando un id entero autoincremental a cada uno de
ellos. Deberán almacenarse su nombre, apellidos, email, teléfono y contraseña de
acceso. Además de esto, cada usuario tendrá un campo que determinará su rol: normal o
administrador.
Si el usuario intenta logarse (usando su email y contraseña como datos de acceso) y no
está dado de alta previamente en el listado de usuarios (debes cargar usuarios de prueba
al iniciar la aplicación), se redireccionará al formulario de alta.
Si el usuario intenta logarse pero la contraseña no es correcta, deberá informarse de ello
en la misma vista del formulario de login.
Así mismo, desde el formulario de login, se mostrará un enlace para que el usuario pueda
acceder al formulario de alta directamente, si no lo está ya, pudiendo logarse a
continuación.
Si el usuario intenta darse de alta con un email que ya existe, el sistema no realizará el
alta y se informará de ello al usuario en la misma vista del formulario de alta. El
formulario de alta contará con una doble validación de contraseña.
Si el usuario se loga correctamente, se mantendrá su nombre a través de la sesión y se
mostrará en la cabecera en la página de inicio junto a un enlace para poder cerrar la
sesión. Dicho cabecera estará disponible en todas las vistas de la aplicación, pudiendo
cerrar la sesión en todo momento.
Una vez logado, los enlaces de alta y login no deben mostrarse en la cabecera hasta
cerrar la sesión.

Si el usuario cierra la sesión, se deberá volver a la página de inicio con los enlaces de alta
y de login disponibles en la cabecera.
Al loguearse correctamente el usuario (normal o administrador), el nombre de usuario
mostrado en la cabecera, y almacenado en sesión, será un enlace que conducirá a la
vista de perfil del usuario, mostrando en la pantalla los datos registrados para el propio
usuario. Así mismo se mostrará un menú superior (debajo de la cabecera) con las
operaciones disponibles: una opción para cambiar los datos registrados en su perfil
(salvo la contraseña), pudiéndose modificar el propio email (siempre y cuando no exista
ya otro igual en el sistema), y otra opción para cambiar la contraseña de acceso
(introduciendo la actual y con doble introducción de la nueva como validaciones).
Si el usuario logado en el sistema tiene el rol de administrador, en la página principal se
mostrará un listado con los usuarios dados de alta en el sistema con rol normal (no
pudiendo visualizar al resto de usuarios con rol administrador). Para cada uno de los
usuarios de la lista, el usuario administrador podrá realizar las operaciones de borrado o
edición de los datos del usuario (salvo la contraseña). Antes de eliminar un usuario,
deberá confirmarse dicha eliminación.
De la misma forma que un usuario sin permisos de administrador (rol normal), el usuario
con rol administrador tendrá disponible la visualización de su perfil a través del enlace en
su nombre de usuario y del menú superior con las mismas operaciones: edición de datos
y modificación de su propia contraseña.
Utiliza includes para proveer a la aplicación de la cabecera, donde se incluirá el css
utilizado, y de un footer con el nombre del alumno. De esta forma todas las vistas
tendrán la misma apariencia. Puedes utilizar un include para el menú superior con las
operaciones disponibles de edición del perfil.
Incluye en el fichero README.txt los usuarios de prueba cargados y sus respectivas
contraseñas para poder probar la aplicación.
Como ampliación, desarrolla un buscador de usuarios disponible sobre el propio listado
de la página principal (rol administrador), filtrando así los usuarios mostrados en el
listado a través de los criterios que consideres.

## Usuarios pre-registrados
| Usuario | Contraseña | Tipo |
| --------- | --------- | --------- |
| chaip@gmail.com | 1234 | Admin|
| MJ@gmail.com | 1234 | usuario|
| PH@gmail.com | 1234 | usuario|
| A@gmail.com | 1234 | usuario |
| B@gmail.com | 1234 | Admin |
| C@gmail.com | 1234 | usuario|

## Puntos realizados
He conseguido realizar la práctica en su totalidad, excepto la ampliación del filtro.
Por la parte del modelo MVC se puede mejorar bastante, pero creo que no debo invertir más tiempo en esta práctica, y he de pasar a la siguiente.
Para la parte del formulario de confirmación de borrado he utilizado un pequeño script de javascript.
