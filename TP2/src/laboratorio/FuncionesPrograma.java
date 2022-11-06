package laboratorio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FuncionesPrograma {
    public static String getFechaString(Date fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String nuevaFecha = sdf.format(fecha);
        return nuevaFecha;
    }
    public static Date getFechaDate(int dia, int mes, int anio){
        Date fechaDate = new Date(anio-1900, mes-1, dia);
        return fechaDate;
    }
}
