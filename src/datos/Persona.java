package datos;

import static datos.AlphaNumericStringGenerator.getRandomString;

public class Persona {
    // Atributos de la clase
    private String nombre = "";
    private int edad = 0;
    private String nss = "";
    private char sexo;
    private double peso = 0;
    private double altura = 0;
    
    //Constructor
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        char genero = Character.toUpperCase(sexo);
        this.nombre = nombre;
        this.edad = edad;
        this.nss = getRandomString();
        this.sexo = genero;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos SET y GET
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
   
    //Métodos
    public String toString(){
        return  "[Nombre: " + this.nombre +
                ", Edad: " + this.edad +
                ", NSS: " + this.nss +
                ", Sexo: " + this.sexo +
                ", Peso: " + this.peso +
                ", Altura: " + this.altura + "]";
    }

    public int calcularIMC(int peso, int altura){
        double alt = (double)altura*altura/10000;
        double pes = (double)peso/10;
        double imc;
        int x = 0;
        int aux = gen();

        imc = pes / alt;

        if(aux == 1){ // Valor de 1 es hombre
            //System.out.println("IMC PARA HOMBRE.");
            if(imc < 20){
                //System.out.println("Segun tu IMC estas por  debajo de tu peso.");
                return -1;
            }
                
            else if(imc >= 20 && imc <= 25){
                //System.out.println("Segun tu IMC estas en tu peso ideal.");
                return 0;
                }
            
            else if(imc > 25){
                //System.out.println("Segun tu IMC tienes sobrepeso.");
                return 1;
                }
        }

        if(aux == 2){ // Valor de 2 es mujer
            //System.out.println("IMC PARA MUJER.");
            if(imc < 19){
                //System.out.println("Segun tu IMC estas por debajo de tu peso.");
                x = -1;
            }
                
            else if(imc >= 19 && imc <= 24){
                //System.out.println("Segun tu IMC estas en tu peso ideal.");
                x = 0;
                }
            
            else if(imc > 24){
                //System.out.println("Segun tu IMC tienes sobrepeso.");
                x = 1;
                }
        }
        return x;
    }

    public boolean esMayorDeEdad(int edad){
        if(edad >= 18){
            //System.out.println("Eres mayor de edad.");
            return true;   
        }
        else{
            //System.out.println("Eres menor de edad.");
            return false;
        }
    }

    public boolean isSexo(){
        char genero = Character.toUpperCase(sexo);
        if(genero == 'H' || genero == 'M'){
            System.out.println("Genero Correcto.");
            return true;
        }
        else{
            System.out.println("Genero Erroneo.");
            return false;
        }
    }
    
    public int gen(){
        char genero = Character.toUpperCase(sexo);
        if(genero == 'H')
            return 1;
        else if(genero == 'M')
            return 2;
        else
            return 0;
    }
}