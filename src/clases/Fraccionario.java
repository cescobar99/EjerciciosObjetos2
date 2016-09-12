/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Camilo_Escobar
 */
public class Fraccionario {
     
    private int numerador;
    private int denominador;
    private int entero;
    
    public Fraccionario(int entero,int numerador, int denominador) throws DenominadorCeroException{
        this.numerador=numerador;
        this.denominador=denominador;
        this.entero=entero;
        if (denominador==0) {
            throw new DenominadorCeroException();
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
    
    public Fraccionario sumar(Fraccionario f2) throws DenominadorCeroException{
        Fraccionario f;
        
        int n,d,ent,an1,ad1,an2,ad2,num,den;
        an1=(this.entero*this.denominador)+this.numerador;
        ad1=this.denominador;
        an2=(f2.entero*f2.denominador)+f2.numerador;
        ad2=f2.denominador;
        n=(an1*ad2)+(ad1*an2);
        d=ad1*ad2;
        ent=n/d;
        num=n%d;
        den=d;
        f=new Fraccionario(ent,num, den);
        return f;
    }
    public Fraccionario restar(Fraccionario f2) throws DenominadorCeroException{
        Fraccionario f;
        
        int n,d,ent,an1,ad1,an2,ad2,num,den;
        an1=(this.entero*this.denominador)+this.numerador;
        ad1=this.denominador;
        an2=(f2.entero*f2.denominador)+f2.numerador;
        ad2=f2.denominador;
        n=(an1*ad2)-(ad1*an2);
        d=ad1*ad2;
        ent=n/d;
        num=n%d;
        den=d;
        f=new Fraccionario(ent,num, den);
        return f;
    }
    public Fraccionario multiplicar(Fraccionario f2) throws DenominadorCeroException{
        Fraccionario f;
        
        int num,den,ent,an1,an2,ad1,ad2,n,d;
        an1=(this.entero*this.denominador)+this.numerador;
        ad1=this.denominador;
        an2=(f2.entero*f2.denominador)+f2.numerador;
        ad2=f2.denominador;
        n=an1*an2;
        d=ad1*ad2;
        ent=n/d;
        num=n%d;
        den=d;
        f=new Fraccionario(ent,num, den);
        return f;
    }
    public Fraccionario dividir(Fraccionario f2) throws DenominadorCeroException{
        Fraccionario f;
        
        int num,den,ent,an1,an2,ad1,ad2,n,d;
        an1=(this.entero*this.denominador)+this.numerador;
        ad1=this.denominador;
        an2=(f2.entero*f2.denominador)+f2.numerador;
        ad2=f2.denominador;
        n=an1*ad2;
        d=ad1*an2;
        ent=n/d;
        num=n%d;
        den=d;
        f=new Fraccionario(ent,num, den);
        return f;
    }
    public Fraccionario covertirafraccion() throws DenominadorCeroException{
        Fraccionario f;
        int num,den,ent;
        
        num=(this.entero*this.denominador)+this.numerador;
        den=this.denominador;
        ent=this.entero;
        f=new Fraccionario(ent,num, den);
        return f;
    }
}
