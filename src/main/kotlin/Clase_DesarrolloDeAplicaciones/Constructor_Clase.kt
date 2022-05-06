package Clase_DesarrolloDeAplicaciones

fun main(){
    val empleado=Empleado(1,"Christian",2400.0,3)
    empleado.datos()
}
//example: se tiene un empleado con ID,Nombre,Sueldo,nmr de hijos.
//Se pide mostrar sus datos, bonificacion y el sueldo neto
//Bonificacion es el 20% del sueldo del empleado si
//Su numero de hijos de mayor o igual a 3

class Empleado(val empleadId:Int
                ,val nombre:String
                ,val sueldo:Double
                ,val hijos:Int){
    fun datos(){
        println("Nombre: ${nombre}")
        println("Sueldo: ${sueldo}")
        println("Nmr de Hijos: ${hijos}")
        if(hijos>=3){
            println("Bonificacion: ${bonificacion()}")
        }
        println("Sueldo Neto: ${sueldototal()}")
    }

    fun bonificacion():Double{
        var bono:Double=0.0

        if(hijos>=3){
            bono=0.20*sueldo
        }
        return bono
    }

    fun sueldototal():Double{
        return bonificacion()+sueldo
    }

}