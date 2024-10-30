import java.io.File;

public class RenombrarDirectorios {
    //path == ruta o ubicacion de un archivo 
    public void renombrarDirectorios(String path){
        //validemos que el path sea un directorio
        File directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path no es un directoio valido ");
            return;
        }
        /// Aca vamos a cambiar los nombres 
        System.out.println("La ruta path es Valida ");
        renombrarDirectoriosInternos(directorio);


    }

    private void renombrarDirectoriosInternos(File directorio) {
        //Listar todos los archivos y/o carpetas hijas
        File[] directoriosArchivosInternos = directorio.listFiles();
        if(directoriosArchivosInternos == null){
            return;
        }
        for(File directorioArchivo : directoriosArchivosInternos){
            if(directorioArchivo.isDirectory()){ ///si es carpeta cambio el nombre
                String nombreOriginal = directorioArchivo.getName();
                String nuevoNombre = "Nuevo-"+nombreOriginal;
                File nuevoDirectorio = new File(directorioArchivo.getParent(), nuevoNombre);
                if (directorioArchivo.renameTo(nuevoDirectorio)){
                    renombrarDirectoriosInternos(nuevoDirectorio);
                }
            }
        }
    }
    
}
