# Taller POO: relaciones entre clases en Java

**Repositorio:** https://github.com/samueljcardenasmartinez2008-cmyk/Taller-poo-de-relaciones-entre-clases

Este proyecto contiene ejemplos separados por paquetes para estudiar los conceptos solicitados.

## Contenido
1. Herencia: `Animal`, `Perro` y `Gato`, con diagrama UML.
2. Clase abstracta e interfaz: comparación y ejemplo `Figura`.
3. Dependencia: `Impresora` utiliza `Documento` como parámetro.
4. Asociación muchos a muchos: `Estudiante` y `Curso`.
5. Interfaz: `Pagable`, implementada por `TarjetaCredito` y `Efectivo`.

## Diagrama de herencia
```text
              Animal
          ----------------
          - nombre: String
          - edad: int
          ----------------
          + comer(): void
          + hacerSonido(): void
                 △
                / \
               /   \
            Perro   Gato
```
`Perro` y `Gato` extienden `Animal` mediante `extends`.

## Clase abstracta vs interfaz
| Aspecto | Clase abstracta | Interfaz |
|---|---|---|
| Declaración | `abstract class` | `interface` |
| Métodos | Abstractos y concretos | Contrato; también puede tener `default` y `static` |
| Estado | Puede tener atributos de instancia | Campos constantes `public static final` |
| Constructor | Sí | No tiene constructor de instancia |
| Uso | Una superclase directa | Se pueden implementar varias interfaces |

## Dependencia
```text
Impresora - - - - - > Documento
             «usa»
```
`Impresora.imprimir(Documento)` usa el documento recibido como parámetro sin guardarlo como atributo.

## Asociación muchos a muchos
```text
Estudiante  * <------ inscribe ------> * Curso
- cursos: List<Curso>                   - estudiantes: List<Estudiante>
```
Cada estudiante puede inscribirse en varios cursos y cada curso puede tener varios estudiantes.

## Interfaz
```text
       <<interface>>
            Pagable
       + pagar(monto): boolean
             △
            ⋮ ⋮
     TarjetaCredito   Efectivo
       implements Pagable
```

## Cómo ejecutar
Abre el proyecto en NetBeans o en un IDE Java. Cada paquete contiene un archivo `Main` independiente:
- `herencia.MainHerencia`
- `abstracta.MainAbstracta`
- `interfaz.MainInterfaz`
- `dependencia.MainDependencia`
- `asociacion.MainAsociacion`

Para compilar, mantén cada clase pública en un archivo con el mismo nombre y respeta el nombre de su paquete.
