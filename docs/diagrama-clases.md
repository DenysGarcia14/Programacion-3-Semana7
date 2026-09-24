# Diagrama de Clases - Semana 7
``` mermaid 
classDiagram
    class Persona {
        <<abstract>>
        #String nombre
        #String dui
        +presentarse() String
        +calcularBeneficioAnual()* double
    }

    class Empleado {
        -double salario
        +calcularBeneficioAnual() double
    }

    class Docente {
        -String especialidad
        -int aniosExperiencia
        +calcularBeneficioAnual() double
    }

    class Cliente {
        -String telefono
        -double comprasAnuales
    }

    class Estudiante {
        -String carnet
        -String carrera
    }

    class Voluntario {
        -double horasServicio
    }

    class Gerente {
        -int tamanoEquipo
        +calcularBeneficioAnual() double
    }

    class DocenteInvestigador {
        -int numeroPublicaciones
        +calcularBeneficioAnual() double
    }

    Persona <|-- Empleado
    Persona <|-- Docente
    Persona <|-- Cliente
    Persona <|-- Estudiante
    Persona <|-- Voluntario

    Empleado <|-- Gerente
    Docente <|-- DocenteInvestigador
````