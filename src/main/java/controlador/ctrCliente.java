package controlador;

import modelo.clienteCRUD;
import modelo.mdCliente;
import javax.swing.JOptionPane;

public class ctrCliente {

    public clienteCRUD crud;

    public ctrCliente() {
        this.crud = new clienteCRUD();
    }

    public boolean agregarCliente(int id, String nombre, String apellidos, String direccion, String telefono, String email, String nivelUsuario) {
        String mensajeError = "";

        if (!Validaciones.validarId(id)) {
            mensajeError = "ID inválido. Debe tener 5 dígitos.";
        } else if (!Validaciones.validarNombre(nombre)) {
            mensajeError = "Nombre inválido. Debe tener entre 3 y 20 caracteres alfabéticos.";
        } else if (!Validaciones.validarTelefono(telefono)) {
            mensajeError = "Número de teléfono inválido. Debe tener el formato (+XX) XXXXXXXXXX.";
        } else if (!Validaciones.validarCorreo(email)) {
            mensajeError = "Correo electrónico inválido. Debe ser un correo de Gmail válido.";
        } else if (!Validaciones.validarNivelUsuario(nivelUsuario)) {
            mensajeError = "Nivel de usuario inválido. Debe ser 'Nivel Cliente' o 'Nivel Administrador'.";
        } else {
            mdCliente nuevoCliente = new mdCliente(id, nombre, apellidos, direccion, telefono, email, nivelUsuario);
            crud.agregarCliente(nuevoCliente);
            JOptionPane.showMessageDialog(null, "Cliente agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }

        // Mostrar el mensaje de error específico
        JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public mdCliente consultarCliente(int id) {
        return crud.consultarCliente(id);
    }

    public boolean actualizarCliente(int id, String nombre, String apellidos, String direccion, String telefono, String email, String nivelUsuario) {
    if (Validaciones.validarId(id) && Validaciones.validarNombre(nombre) && Validaciones.validarTelefono(telefono) && Validaciones.validarCorreo(email) && Validaciones.validarNivelUsuario(nivelUsuario)) {
        crud.actualizarCliente(id, nombre, apellidos, direccion, telefono, email, nivelUsuario);
        return true;
    }
    return false;
}

    public boolean guardarCliente(int id, String nombre, String apellidos, String direccion, String telefono, String email, String nivelUsuario) {
    mdCliente cliente = consultarCliente(id);
    if (cliente != null) {
        // El cliente ya existe, actualizar sus datos
        return actualizarCliente(id, nombre, apellidos, direccion, telefono, email, nivelUsuario);
    } else {
        // Es un nuevo cliente, agregarlo
        return agregarCliente(id, nombre, apellidos, direccion, telefono, email, nivelUsuario);
    }
}

    static class Validaciones {
        public static boolean validarId(int id) {
            String idStr = String.valueOf(id);
            return idStr.matches("\\d{5}");
        }

        public static boolean validarNivelUsuario(String nivelUsuario) {
            return nivelUsuario.equals("Nivel Cliente") || nivelUsuario.equals("Nivel Administrador");
        }

        public static boolean validarNombre(String nombres) {
            return nombres.matches("[a-zA-Z ]{3,20}") && !nombres.matches(".*\\d.*");
        }

        public static boolean validarTelefono(String tel) {
            return tel.matches("\\(\\+\\d{2}\\) \\d{1,15}");
        }

        public static boolean validarCorreo(String correo) {
            return correo.matches("^[\\w._%+-]+@gmail\\.com$");
        }
    }
}