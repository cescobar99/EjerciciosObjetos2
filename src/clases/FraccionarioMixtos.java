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
public class FraccionarioMixtos {
     
    private int numerador;
    private int denominador;
    private int entero;
    
    public FraccionarioMixtos(int entero,int numerador, int denominador) throws DenominadorCeroException{
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
    
    public FraccionarioMixtos sumar(FraccionarioMixtos f2) throws DenominadorCeroException{
        FraccionarioMixtos f;
        
        int nume,deno,entero,n1,d1,n2,d2,num,den;
        n1=(this.entero*this.denominador)+this.numerador;
        d1=this.denominador;
        n2=(f2.entero*f2.denominador)+f2.numerador;
        d2=f2.denominador;
        nume=(n1*d2)+(d1*n2);
        deno=d1*d2;
        entero=nume/deno;
        nume=nume%deno;
        deno=deno;
        f=new FraccionarioMixtos(entero,nume, deno);
        return f;
    }
    public FraccionarioMixtos restar(FraccionarioMixtos f2) throws DenominadorCeroException{
        FraccionarioMixtos f;
        
        int nume,deno,entero,n1,d1,n2,d2,num,den;
        n1=(this.entero*this.denominador)+this.numerador;
        d1=this.denominador;
        n2=(f2.entero*f2.denominador)+f2.numerador;
        d2=f2.denominador;
        nume=(n1*d2)-(d1*n2);
        deno=d1*d2;
        entero=nume/deno;
        num=nume%deno;
        den=deno;
        f=new FraccionarioMixtos(entero,nume, deno);
        return f;
    }
    public FraccionarioMixtos multiplicar(FraccionarioMixtos f2) throws DenominadorCeroException{
        FraccionarioMixtos f;
        
        int nume,deno,entero,n1,n2,d1,d2,n,d;
        n1=(this.entero*this.denominador)+this.numerador;
        d1=this.denominador;
        n2=(f2.entero*f2.denominador)+f2.numerador;
        d2=f2.denominador;
        n=n1*n2;
        d=d1*d2;
        entero=n/d;
        nume=n%d;
        deno=d;
        f=new FraccionarioMixtos(entero,nume, deno);
        return f;
    }
    public FraccionarioMixtos dividir(FraccionarioMixtos f2) throws DenominadorCeroException{
        FraccionarioMixtos f;
        
        int num,den,ent,n1, n2, d1,d2,n,d;
        n1=(this.entero*this.denominador)+this.numerador;
        d1=this.denominador;
        n2=(f2.entero*f2.denominador)+f2.numerador;
        d2=f2.denominador;
        n=n1*d2;
        d=d1*n2;
        ent=n/d;
        num=n%d;
        den=d;
        f=new FraccionarioMixtos(ent,num, den);
        return f;
    }
    public FraccionarioMixtos covertirafraccion() throws DenominadorCeroException{
        FraccionarioMixtos f;
        int nume,deno,entero;
        
        nume=(this.entero*this.denominador)+this.numerador;
        deno=this.denominador;
        entero=this.entero;
        f=new FraccionarioMixtos(entero,nume, deno);
        return f;
    }
}
