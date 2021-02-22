package com.company;

public class Cliente implements Comparable<Cliente> {
    private String categoria;

    public Cliente(String categoria) {
        this.categoria = categoria;

    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public int compareTo(Cliente siguienteCliente) {
        String siguienteCategoria = siguienteCliente.getCategoria();
        if(this.categoria.equals("particular") && siguienteCategoria.equals("particular")){
            return 0;
        }else if(this.categoria.equals("particular")){
            return 1;
        }else if(siguienteCategoria.equals("particular")){
            return -1;
        }
        return 0;
    }


}
