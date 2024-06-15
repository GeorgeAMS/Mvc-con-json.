package modelo;

public class mdCliente {
    private int ID;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    private String Email;
    private String nivelUsuario;


   public mdCliente(int ID, String Nombre, String Apellido, String Direccion, String Telefono, String Email, String nivelUsuario) {
    this.ID = ID;
    this.Nombre = Nombre;
    this.Apellido = Apellido;
    this.Direccion = Direccion;
    this.Telefono = Telefono;
    this.Email = Email;
    this.nivelUsuario = nivelUsuario;
}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getNivelUsuario() {
    return nivelUsuario;
}
    public void setNivelUsuario(String nivelUsuario) {
    this.nivelUsuario = nivelUsuario;
}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
