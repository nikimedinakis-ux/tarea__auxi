class Auto:
    def __init__(self, color="Blanco", gasolina=0):
        self.color = color
        self.gasolina = gasolina
    def __iadd__(self, valor):
        if isinstance(valor, (int, float)):
            self.gasolina += valor
        return self
    def __add__(self, nuevo_color):
        if isinstance(nuevo_color, str):
            self.color = nuevo_color
        return self
    def __sub__(self, otro_auto):
        if isinstance(otro_auto, Auto):
            return self.gasolina + otro_auto.gasolina
        return 0
    def mostrar_datos(self, nombre_auto):
        print(f"[{nombre_auto}]")
        print(f"Color: {self.color}")
        print(f"Gasolina: {self.gasolina} litros")
        print("-" * 30) 

if __name__ == "__main__":
    print("===== PRUEBA EJERCICIO 7 =====")
    auto1 = Auto() 
    auto2 = Auto(color="Rojo", gasolina=20) 
    print("\n--- Estados Iniciales ---")
    auto1.mostrar_datos("Auto 1")
    auto2.mostrar_datos("Auto 2")
    auto1 += 5  
    print("--- Inciso c) Gasolina aumentada ---")
    auto1.mostrar_datos("Auto 1")
    auto1 = auto1 + "Azul"
    print("--- Inciso d) Color cambiado ---")
    auto1.mostrar_datos("Auto 1")
    gasolina_total = auto1 - auto2
    print("--- Inciso e) Suma total de gasolina ---")
    print(f"Total de gasolina acumulada: {gasolina_total} litros")
