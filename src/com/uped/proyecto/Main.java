package com.uped.proyecto;

import com.uped.proyecto.modelo.Gerente;
import com.uped.proyecto.modelo.DocenteInvestigador;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA GERENTE ===");
        Gerente g = new Gerente("Marta Díaz", "05123456-7", 1200.0, 5);
        System.out.println(g);
        System.out.println("Beneficio: " + g.calcularBeneficioAnual());

        System.out.println("\n=== PRUEBA DOCENTE INVESTIGADOR ===");
        DocenteInvestigador di = new DocenteInvestigador(
                "Dr. Iván Reyes",
                "07321456-9",
                "Ingeniería de Software",
                8,
                4
        );
        System.out.println(di);
        System.out.println("Beneficio: " + di.calcularBeneficioAnual());
    }
}