package logica;

public class GeneradorDeGmail {
    public static void main(String[] args) {
        System.out.println("---Generador de Gmail---");

        //Nombre completo del usuario
        var nombre= "jose Goku Soto Melano";
        System.out.println("nombre = " + nombre);

        //normalizr el nombre del usuario
        //limpiar espacios en blaco al inicio y final
        var nombreNormalizado = nombre.strip();

        // reemplazar los espacios en blancos por puntos
        nombreNormalizado= nombreNormalizado.replace(" ", ".");

        //convertir a minusculas
        nombreNormalizado= nombreNormalizado.toLowerCase();

        //datos empresas
        var nombreEmpresa = "Pepe peep";
        System.out.println("\nnombre empresa:"+nombreEmpresa);
        var extensionDominio = ".com.max";
        System.out.println("Extension del dominio:"+ extensionDominio);

        //quitar espacios en blanco y pasar a minusculas
        nombreNormalizado = nombreEmpresa.strip() .replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);
        
        //Gmail final
        var GmailFinal = nombreNormalizado+dominioEmailNormalizado;
        System.out.println("GmailFinal = " + GmailFinal);

    }
}
