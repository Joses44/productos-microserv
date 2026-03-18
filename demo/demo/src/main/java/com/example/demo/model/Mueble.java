package com.example.demo.model;


public class Mueble {
    private String nombre;
    private String material;
    private double precio;

    // solo el builder crea
    private Mueble(Builder builder) {
        this.nombre = builder.nombre;
        this.material = builder.material;
        this.precio = builder.precio;
    }

    // getters pa convertir a JSON
    public String getNombre() { return nombre; }
    public String getMaterial() { return material; }
    public double getPrecio() { return precio; }

    // centroPatrón Builder
    public static class Builder {
        private String nombre;
        private String material;
        private double precio;

        public Builder conNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public Builder conMaterial(String material) {
            this.material = material;
            return this;
        }
        public Builder conPrecio(double precio) {
            this.precio = precio;
            return this;
        }
        public Mueble build() {
            return new Mueble(this);
        }
    }
}