# 🎤 Sistema de Gestión de Shows - DF Entertainment

Este proyecto simula un sistema de gestión de shows y eventos, como los organizados por DF Entertainment, aplicando Programación Orientada a Objetos, HashMap y Streams en Java.

---

## 📌 Enunciado

Una productora de eventos necesita una aplicación para administrar los shows que organiza.

Los datos se encuentran en un archivo de texto llamado `shows.txt`, donde cada línea representa un show.

---

## 🧾 Tipos de shows

Existen dos tipos:

- Show Nacional (N)
- Show Internacional (I)

---

## 📄 Formato del archivo

### Show Nacional:
N;codigo;artista;cantidadEntradas;precioEntrada

### Show Internacional:
I;codigo;artista;cantidadEntradas;precioEntrada;categoria

---

## 📂 Ejemplo de archivo
I;3000;Twenty One Pilots;8000;21000;VIP
N;3001;Wos;5000;8000  
I;3002;Taylor Swift;10000;15000;VIP  
N;3003;Duki;6000;9000  
I;3004;Coldplay;12000;20000;CAMPO  
N;3005;Nicki Nicole;4000;7000  
I;3006;Drake;9000;18000;VIP  

---

## 🧱 Requisitos

- Utilizar un HashMap<Integer, Show>
- Clave → código del show
- Valor → objeto Show

---

## 🏗️ Modelo de clases

### Clase abstracta Show

Debe contener:

java
public abstract double calcularRecaudacion();
Clases hijas
ShowNacional
ShowInternacional

Se debe aplicar herencia y polimorfismo.

💰 Reglas de negocio
Show Nacional

recaudacion = cantidadEntradas * precioEntrada

Show Internacional

recaudacion = (cantidadEntradas * precioEntrada) + adicional

Adicional según categoría:

"VIP" → +500000
"CAMPO" → +200000
Otro → +100000

🧪 Funcionalidades a implementar

Leer el archivo y cargar los shows en el HashMap.

Mostrar todos los shows con su recaudación total.

Buscar un show por código.

Calcular la recaudación total de todos los shows utilizando Streams.

Obtener el show con mayor recaudación utilizando Streams.

Contar cuántos shows internacionales hay.

Mostrar shows con recaudación mayor a $10.000.000.

Calcular el promedio de recaudación de shows nacionales.

Obtener una lista con los nombres de artistas internacionales.

Mostrar los códigos de shows ordenados de mayor a menor según recaudación.

🚀 Conceptos a aplicar

Programación Orientada a Objetos
Clases abstractas
Herencia
Polimorfismo
HashMap
Streams (filter, map, mapToInt, average, sum, sorted)
Lectura de archivos

⚠️ Importante

No modificar la estructura del archivo
Usar Streams en los puntos indicados
Aplicar correctamente polimorfismo
Validar datos al leer el archivo
