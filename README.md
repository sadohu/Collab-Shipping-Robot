# Shipping Robot

### Problem Description

An e-commerce website uses a robot for its shipping process.
There is a row of bins, where each bin contains a certain number of packages, and a robot stands at the end of the row.
The robot can move to any bin and back again, picking up a maximum of 1 package from each bin alog the way, which are then shipped. Moving the distance of 1 bin and back requires 1 unit of time.
Also, the process of loading and unloading 1 package requires 1 unit of time. 
Given the number of bins and how many packages are in each one, what is the minimim amount of time the robot needs to remove all the packages form the bins?

### Example

For example, let's say there are `n = 3` bins with packages `[1, 2, 3]`. This means that the frist bin has 1 package in it, the second has 2, and the thrid has 3, with the robot standing near the last bin. The optimal movement for the robot is a follows:

  1. Move to the thrid bin, retrieve 1 package, then move back to its position. This requires 2 unit of time (1 to move to the bin and back, and 1 to load and unload the 1 package).
	
  2. Move the second bin, retrieving 1 package from the third bin and 1 package from the second bin, then move back to its position. This requires 4 units of time (2 to move to the bin and back since it's 2 bins away, and 2 to load and unload the 2 packages).
	
  3. Move to the frist bin, retriving 1 package each from each of the three bins, the move back to its position. this requieres 6 units of the (3 to move to the bin and back since it's 3 bins away, and 3 to load and unload the 3 packages).
	
Following this procedure, the robot would successfully remove all the packages from all the bins in a minimum time of 2 + 4 + 6 = 12. Therefore, the answer is 12.

<br/>

### Solution proposal #1

1. We will obtain the number of packages found in the farthest bin (it must contain at least one package, otherwise it is considered the last one found). The analysis is carried out from the position closest to the robot.

2. In addition to finding the number of packages, the position of the farthest bin is also obtained.

3. The robot will move to the found position. The number of times the shift is determined by the number of packets in that bin. Then we could say that the route is carried out until all the packages from the furthest bin are downloaded.

4. The process is repeated from step one, having an accumulator for the total number of time units. The process ends when the total number of packages in the bins is 0.

<br/>

Spanish - Español
=================

### Descripción del problema

Un sitio web de comercio electrónico utiliza un robot para su proceso de envío.
Hay una fila de contenedores, donde cada contenedor contiene una cierta cantidad de paquetes, y un robot se encuentra al final de la fila.
El robot puede moverse a cualquier contenedor y regresar, recogiendo un máximo de 1 paquete de cada contenedor a lo largo del camino, que luego se envía. Mover la distancia de 1 contenedor y viceversa requiere 1 unidad de tiempo.
Además, el proceso de carga y descarga de 1 paquete requiere 1 unidad de tiempo.
Dado el número de contenedores y cuántos paquetes hay en cada uno, ¿cuál es el tiempo mínimo que necesita el robot para retirar todos los paquetes de los contenedores?

### Ejemplo

Por ejemplo, digamos que hay `n = 3` contenedores con paquetes `[1, 2, 3]`. Esto significa que el primer contenedor tiene 1 paquete, el segundo tiene 2 y el tercero tiene 3, con el robot parado cerca del último contenedor. El movimiento óptimo para el robot es el siguiente:

   1. Muévase al tercer contenedor, recupere 1 paquete y luego regrese a su posición. Esto requiere 2 unidades de tiempo (1 para ir al contenedor y regresar, y 1 para cargar y descargar el paquete).

   2. Mueva el segundo contenedor, recuperando 1 paquete del tercer contenedor y 1 paquete del segundo contenedor, luego regrese a su posición. Esto requiere 4 unidades de tiempo (2 para ir al contenedor y regresar, ya que está a 2 contenedores de distancia, y 2 para cargar y descargar los 2 paquetes).

   3. Vaya al primer contenedor, saque 1 paquete de cada uno de los tres contenedores y luego regrese a su posición. esto requiere 6 unidades del (3 para mover al contenedor y regresar ya que está a 3 contenedores de distancia, y 3 para cargar y descargar los 3 paquetes).

Siguiendo este procedimiento, el robot retiraría con éxito todos los paquetes de todos los contenedores en un tiempo mínimo de 2 + 4 + 6 = 12. Por tanto, la respuesta es 12.

<br/>

### Propuesta de solución #1

1. Obtendremos el número de paquetes encontrados en el contenedor más alejado (debe contener al menos un paquete, en caso contrario se considera el último encontrado). El análisis se realiza desde la posición más cercana al robot.

2. Además de encontrar el número de paquetes, también se obtiene la posición del contenedor más alejado.

3. El robot se moverá a la posición encontrada. La cantidad de veces que se realiza el turno está determinada por la cantidad de paquetes en ese contenedor. Entonces podríamos decir que la ruta se realiza hasta descargar todos los paquetes del bin más lejano.

4. Se repite el proceso desde el paso uno, teniendo un acumulador para el total de unidades de tiempo. El proceso finaliza cuando el número total de paquetes en los contenedores es 0.
