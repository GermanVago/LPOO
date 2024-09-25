#include <iostream>
#include <vector>
#include <string>

class Persona {
protected:
    std::string nombre;
    int edad;
    std::string direccion;

public:
    Persona(const std::string& nombre, int edad, const std::string& direccion) 
        : nombre(nombre), edad(edad), direccion(direccion) {}

    // Método para obtener el nombre
    std::string getNombre() const { return nombre; }
    // Método para obtener la edad
    int getEdad() const { return edad; }
    // Método para obtener la dirección
    std::string getDireccion() const { return direccion; }
};

class Alumno : public Persona {
private:
    std::string matricula;
    std::string carrera;

public:
    Alumno(const std::string& nombre, int edad, const std::string& direccion, 
           const std::string& matricula, const std::string& carrera) 
        : Persona(nombre, edad, direccion), matricula(matricula), carrera(carrera) {}

    void mostrarDatos() const {
        std::cout << "Nombre: " << getNombre() << std::endl;
        std::cout << "Edad: " << getEdad() << std::endl;
        std::cout << "Dirección: " << getDireccion() << std::endl;
        std::cout << "Matrícula: " << matricula << std::endl;
        std::cout << "Carrera: " << carrera << std::endl << std::endl;
    }
};

int main() {
    std::vector<Alumno> alumnos;
    for (int i = 0; i < 2; i++) {
        std::string nombre, direccion, matricula, carrera;
        int edad;

        std::cout << "Captura de datos del alumno " << (i + 1) << ":\n";
        std::cout << "Nombre: ";
        std::getline(std::cin, nombre);
        std::cout << "Edad: ";
        std::cin >> edad;
        std::cin.ignore(); // Limpiar el buffer
        std::cout << "Dirección: ";
        std::getline(std::cin, direccion);
        std::cout << "Matrícula: ";
        std::getline(std::cin, matricula);
        std::cout << "Carrera: ";
        std::getline(std::cin, carrera);

        alumnos.emplace_back(nombre, edad, direccion, matricula, carrera);
    }

    std::cout << "\nDatos de los alumnos:\n";
    for (const auto& alumno : alumnos) {
        alumno.mostrarDatos();
    }

    return 0;
}
