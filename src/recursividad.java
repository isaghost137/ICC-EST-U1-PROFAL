
import java.io.File;

public class RenombrarDirectorios {

    public void renombrarDirectorios(String path, String nuevoNombre) {

        File directorio = new File(path);
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("La ruta especificada no es un directorio válido.");
            return;
        }

        renombrarDirectoriosInternos(directorio, nuevoNombre);
    }

    private void renombrarDirectoriosInternos(File directorio, String nuevoNombreUsr) {

        File[] archivosInternos = directorio.listFiles();
        if (archivosInternos == null)
            return;

        for (File archivo : archivosInternos) {
            if (archivo.isDirectory()) {

                String nombreOriginal = archivo.getName();
                String nuevoNombre = nuevoNombreUsr + nombreOriginal;

                File nuevoDirectorio = new File(archivo.getParent(), nuevoNombre);

                if (archivo.renameTo(nuevoDirectorio)) {
                    System.out.println("Directorio renombrado: " + nombreOriginal + " -> " + nuevoNombre);

                 
                    renombrarDirectoriosInternos(nuevoDirectorio, nuevoNombreUsr);
                } else {
                    System.out.println("Error al renombrar el directorio: " + nombreOriginal);
                }
            }
        }
    }
}