package modelo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class clienteCRUD {

    private List<mdCliente> clientes;
    private final String archivoJSON = "clientes.json";

    public clienteCRUD() {

        this.clientes = cargarClientesDesdeJSON();

    }

    private List<mdCliente> cargarClientesDesdeJSON() {
        List<mdCliente> clientes = new ArrayList<>();
        try (Reader reader = new FileReader(archivoJSON)) {
            Gson gson = new Gson();
            clientes = gson.fromJson(reader, new TypeToken<List<mdCliente>>() {
            }.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public void agregarCliente(mdCliente cliente) {
        clientes.add(cliente);
        guardarClienteEnJSON();
    }

    private void guardarClienteEnJSON() {
        try (Writer writer = new FileWriter(archivoJSON)) {
            Gson gson = new Gson();
            gson.toJson(clientes, writer);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public mdCliente consultarCliente(int id) {
        for (mdCliente cliente : clientes) {
            if (cliente.getID() == id) {
                return cliente;
            }
        }
        return null;
    }

    public void actualizarCliente(int id, String Nombres, String Apellidos, String Direccion, String telefono, String Email, String nivelUsuario) {
        for (mdCliente cliente : clientes) {
            if (cliente.getID() == id) {
                cliente.setNombre(Nombres);
                cliente.setApellido(Apellidos);
                cliente.setDireccion(Direccion);
                cliente.setEmail(Email);
                cliente.setTelefono(telefono);
                cliente.setID(id);
                cliente.setNivelUsuario(nivelUsuario); // Actualizar el nivel de usuario
                guardarClienteEnJSON();
                return;
            }
        }
    }

    public void eliminarCliente(int id) {
        clientes.removeIf(cliente -> cliente.getID() == id);
        guardarClienteEnJSON();
    }
}
