public class Liquid_Container extends Container {


    public Liquid_Container(int own_mass, int carried_mass, int max_carried_mass, int height, int depth) {
        String serial_number = "KON-L-" + serial_number_count++;
        this.own_mass = own_mass;
        this.carried_mass = carried_mass;
        this.max_carried_mass = max_carried_mass;
        this.height = height;
        this.depth = depth;
        this.serial_number = serial_number;
    }



}
