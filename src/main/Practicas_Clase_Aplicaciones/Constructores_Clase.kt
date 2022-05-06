fun main{
    val empleado1=Empleado(1001,"Christian", 2400.0,5)

    println("Nombre: ${nombre}")
    println("Sueldo: ${sueldo}")
    println("Nmr de Hijos: ${hijos}")
    println("Bonificacion: ${bono}")
    println("Sueldo en Neto: ${sueldoneto}")
}
//example: se tiene un empleado con ID,Nombre,Sueldo,nmr de hijos.
//Se pide mostrar sus datos, bonificacion y el sueldo neto
//Bonificacion es el 20% del sueldo del empleado si
//Su numero de hijos de mayor o igual a 3
class Empleado constructor(val empleadoId:Int,val nombre:String,val sueldo:Double, val hijos:Int){
    fun bonificacion():Double{
        var bono:Double=0.0

        if(hijos>=3){
            bono=0.20*sueldo
        }
        return bono
    }

    fun sueldoneto():Double{
        return sueldo + bono
    }

}

