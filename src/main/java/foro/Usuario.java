/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foro;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Usuario {
    private String nombre;
    private String password;
    private String descripcion;
    private String genero;
    private String email;
    private String fechaNacimiento;
    private ArrayList<String> redesSociales;
    private ArrayList<String> comunidades;
    private int followers;
    private String usuario;
    private boolean estatus;

    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public void follow(Usuario usuario) {
        usuario.followers++;
    }

    public boolean login(String usuario, String password) {
        return this.usuario.equals(usuario) && this.password.equals(password);
    }

    public void bloquear(Usuario usuario) {
        System.out.println(this.usuario + " ha bloqueado a " + usuario.usuario);
    }

    public Usuario(String nombre, String usuario, String password, String email, String descripcion, String genero, String fechaNacimiento, ArrayList<String> redesSociales, ArrayList<String> comunidades) {
        if (!validarEmail(email) || existeEmail(email)) {
            System.out.println("Email inválido o ya en uso.");
            return;
        }
        if (!validarPassword(password)) {
            System.out.println("La contraseña debe tener al menos 8 caracteres, 2 dígitos y uno de los siguientes símbolos: @, $, #");
            return;
        }
        if (existeUsuario(usuario)) {
            System.out.println("El usuario ya existe.");
            return;
        }
        
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.email = email;
        this.descripcion = descripcion;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.redesSociales = redesSociales;
        this.comunidades = comunidades;
        this.followers = 0;
        this.estatus = true;
        listaUsuarios.add(this);
    }

    public void darBaja() {
        this.estatus = false;
    }

    public void editar(String nuevoNombre, String nuevaDescripcion, String nuevoGenero, String nuevaFechaNacimiento, ArrayList<String> nuevasRedes, ArrayList<String> nuevasComunidades) {
        this.nombre = nuevoNombre;
        this.descripcion = nuevaDescripcion;
        this.genero = nuevoGenero;
        this.fechaNacimiento = nuevaFechaNacimiento;
        this.redesSociales = nuevasRedes;
        this.comunidades = nuevasComunidades;
    }

    public static boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean existeUsuario(String usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).usuario.equals(usuario)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarPassword(String password) {
        String regex = "^(?=.*[0-9].*[0-9])(?=.*[@#$]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean existeEmail(String email) {
        for (Usuario u : listaUsuarios) {
            if (u.email.equals(email)) {
                return true;
            }
        }
        return false;
    }

    public void unfollow(Usuario usuario) {
        if (usuario.followers > 0) {
            usuario.followers--;
        }
    }
}
