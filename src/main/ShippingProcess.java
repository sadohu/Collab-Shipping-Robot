package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShippingProcess {

	private static List<Integer> list = new ArrayList<Integer>();
	private static List<Integer> reversedList = null;

	public static void main(String[] args) {
		// Change the values here!!! - Cambia los valores aquí!!!
		list.addAll(Arrays.asList(3, 5, 10, 2));

		System.out.println("\n=======================");
		System.out.println("Inserted List: " + list);
		System.out.println("======================\n");

		// Invertir el array para lidear con las posiciones
		reversedList = list.stream().collect(Collectors.toList());
		Collections.reverse(reversedList);

		// Acumulador de la unidad de tiempo y cual mostrará el resultado
		int totalTime = 0;

		// Se asigna la cantidad total de paquetes existentes
		int totalPackages = getTotalPackages();

		try {
			while (totalPackages > 0) {
				int time = 0;

				System.out.println("Reversed List: " + reversedList);

				// Número totales se define por la cantidad de paquetes del contenedor más
				// lejano
				int packagesLastContainer = getPackagesLastContainer();

				// El valor se determina por la posición que se obtiene de la función anterior
				int positionLastContainer = getPositionLastContainer();

				for (int i = 0; i < packagesLastContainer; i++) {
					for (int j = 0; j <= positionLastContainer; j++) {
						// Se aumentar en 1t por el recorrido hasta el contenedor
						time++;

						// Si existe paquetes, se aumentará en 1t y disminuirá el valor de los paquetes
						// total y del respectivo contenedor
						if (reversedList.get(j) > 0) {
							time++;
							reversedList.set(j, reversedList.get(j) - 1);
							totalPackages -= 1;
						}
					}

					System.out.println("Bins: " + reversedList);
				}

				totalTime += time;
				System.out.println("Total Time: " + totalTime);
				System.out.println("=======================\n");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	private static int getTotalPackages() {
		return reversedList.stream().mapToInt(Integer::intValue).sum();
	}

	private static int getPackagesLastContainer() {
		int packages = 0;
		for (int i = reversedList.size(); i > 0; i--) {
			if (packages > 0) {
				break;
			}

			if (reversedList.get(i - 1) > 0) {
				packages = reversedList.get(i - 1);
			}
		}
		return packages;
	}

	private static int getPositionLastContainer() {
		int position = -1;
		for (int i = reversedList.size(); i > 0; i--) {
			if (position > -1) {
				break;
			}

			if (reversedList.get(i - 1) > 0) {
				position = i - 1;
			}
		}
		return position;
	}

}
