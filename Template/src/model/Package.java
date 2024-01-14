package model;

abstract public class Package {
    // Function template merepresentasikan isi function yang tetap dan siap dipakai
    public final void template(){
        preparing();
        delivery();
        arrived();
    }
    public abstract void preparing();
    public abstract void delivery();
    public abstract void arrived();
}
