class Persona:
    def __init__(self, nombre, edad, direccion):
        self.nombre = nombre
        self.edad = edad
        self.direccion = direccion

class Alumno(Persona):
    def __init__(self, nombre, edad, direccion, matricula, carrera):
        super().__init__(nombre, edad, direccion)
        self.matricula = matricula
        self.carrera = carrera

    def mostrar_datos(self):
        print(f"Nombre: {self.nombre}")
        print(f"Edad: {self.edad}")
        print(f"Dirección: {self.direccion}")
        print(f"Matrícula: {self.matricula}")
        print(f"Carrera: {self.carrera}\n")

def main():
    alumnos = []
    for i in range(2):
        print(f"Captura de datos del alumno {i + 1}:")
        nombre = input("Nombre: ")
        edad = int(input("Edad: "))
        direccion = input("Dirección: ")
        matricula = input("Matrícula: ")
        carrera = input("Carrera: ")
        
        alumno = Alumno(nombre, edad, direccion, matricula, carrera)
        alumnos.append(alumno)

    print("\nDatos de los alumnos:")
    for alumno in alumnos:
        alumno.mostrar_datos()

if __name__ == "__main__":
    main()
