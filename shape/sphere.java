package com.pritam.shape;

public class sphere extends shape {
    sphere(int dim1){
        super(dim1, -1);
    }
    public double surfaceArea(){
        return  4*Math.PI* this.dim1*this.dim1;
    }
}
