fun main(){
    val obrero=Obrero(800,"pantalon","A")

    obrero.datos()
}
class Obrero (val totalprendas:Int,val tipoprenda:String, val categoria:String){
    fun datos(){
        println("Bonificacion es: ${bonificacion()}")
        println("Impuestos es: ${impuestos()}")
        println("Seguro es: ${seguro()}")
        println("Solidaridad es: ${solidaridad()}")
        println("Sueldo neto es: ${sueldonetodescontado()}")

    }
    fun tarifa():Double{
        val polo:Double=0.50
        var camisa:Double=1.0
        var pantalon:Double=1.50
        var tarifatotal:Double=0.0

        if(tipoprenda=="camisa"){
            tarifatotal=polo
            return tarifatotal
        }
        else if (tipoprenda=="polo"){
            tarifatotal=camisa
            return tarifatotal
        }
        else if(tipoprenda=="pantalon"){
            tarifatotal=pantalon
            return tarifatotal
        }
        return tarifa()
    }
    fun bonificacion():Double{
        var bono:Double=0.0
        val A:Double=250.0
        val B:Double=150.0
        val C:Double=100.0
        val D:Double=50.0

        if (totalprendas>=700){
            bono=A
            return bono
        }
        else if (totalprendas>=700){
            bono=B
            return bono
        }
        else if (totalprendas>=700){
            bono=C
            return bono
        }
        else if(totalprendas>=700){
            bono=D
            return bono
        }

        return bono
    }
    fun sueldo():Double{
        return totalprendas*tarifa()
    }
    fun sueldoneto():Double{
        return bonificacion()+sueldo()

    }
    fun sueldonetodescontado():Double{
        return sueldoneto()-impuestos()-seguro()-solidaridad()
    }

    fun impuestos():Double{
        return sueldoneto()*0.09
    }
    fun seguro():Double{
        return sueldoneto()*0.02
    }
    fun solidaridad():Double{
        return sueldoneto()*0.01
    }
}