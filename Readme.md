# Java 8 Course
`<repositorio>` : <https://github.com/miguel-armas-unmsm/course-java8>

`<autor>`: Miguel Rodrigo Armas Abt

## Programación funcional
La programación funcional es un paradigma en el cual un programa se considera una función matemática, la cual describe una relación entre una entrada y una salida.

### Funciones puras
> Las funciones puras generan el mismo resultado para el mismo parámetro. Sus resultados se pueden predecir, por ello son deterministas.

### Funciones de orden mayor (High order function)
> Las funciones de orden mayor toma otra función como parámetro o retorna una función.

### 1. Funciones lambda
> Las funciones lambda son anónimas porque no requieren un nombre y son de un solo uso (no se utiliza en otra parte del código).

```java
(x, y) -> x * y
```

### 2. SAM (Single Abstract Method)
> Una interfaz funcional contiene un solo método sin definir. En Java 8 se agregó la etiqueta @FunctionalInterface para indicar que nuestra interfaz se usará como función.

```java
public class Util {
	@FunctionalInterface
	interface TriFunction <T, U, V, R> {
		R apply(T t, U u, V v);
	}
}
```

#### 2.1. Interfaces funcionales de Java 8
Interface  | Descripción
------------- | -------------
`UnaryOperator<T>`  | Aplica una operación unaria a un objeto de tipo T y devuelve el resultado, que también es de tipo T. Su método se llama **apply()**.
`BinaryOperator<T>`   | Aplica una operación a dos objetos de tipo T y devuelve el resultado, que también es de tipo T. Su método se llama **apply()**.
`Consumer<T>`   | Aplica una operación sobre un objeto de tipo T. Su método se llama **accept()**.
`Supplier<T>`   | Devuelve un objeto de tipo T. Su método se llama **get()**.
`Function<T>`   | Aplica una operación a un objeto de tipo T y devuelve el resultado como un objeto de tipo R. Su método se llama **apply()**.
`Predicate<T>`   | Determinar si un objeto de tipo T cumple alguna restricción. Devuelve un valor booleano que indica el resultado. Su método se llama **test()**.

### 3. Operador de referencia
> Para poder hacer referencia a otro método es necesario que nuestra función reciba el mismo parámetro (tipo de dato) y gener el mismo resultado que el método al cual hace referencia.

```java
myList.forEach(System.out::println);
```

### 4. Chaining
> Chaining consiste en encadenar el resultado de una ejecución con respecto a otra ejución.

```java
stringBuilder.append("hello")
	.append("world")
	.append("!");
```

### 5. Composición de funciones
> Retomando el concepto de las **high order functions**, las cuales reciben como parámetro y/o devuelven una función. Tener este tipo de funciones nos permite generar composición de funciones, es decir, encadenar o asociar nuestras lambdas y funciones.

#### 5.1. compose
> El operador compose asocia una función a una lambda, en consecuencia la lambda se ejecuta primero y después la función.

```java
Function<Integer, Integer> multiplyByThree = x -> x * 3;

Function<Integer, Integer> addOne = multiplyByThree.compose(y -> y+1);
```

#### 5.6. andThen
> El operador andThen permite agregar pasos después de la ejecución de una función, en consecuencia, en consecuencia la función se ejecuta primero y después la lambda.

```java
Function<Integer, Integer> multiplyByThree = x -> x * 3;

Function<Integer, Integer> addOne = multiplyByThree.andThen(y -> y+1);
```
### 6. Optional
> Optional ofrece muchas formas de controlar los null.

### 7. Streams
> Stream es un flujo de información, similar a una colección, pero se diferencia de estas ya que Stream es autoiterable. El potencial de Java 8 está en los Streams.
