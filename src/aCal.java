/**
 * Created by tz6ysq on 10/20/2015.
 */
public abstract class aCal implements iCal{
    private int mass = 0;
    private int acceleration = 0;
    private int force = 0;


    /**
     * Returns the force.
     */
    @Override
    public int computeForce() {
        setForce(acceleration*mass);
        return acceleration*mass;
    }


    /**
     * Getters and setters for mass,
     * acceleration, and force.
     * */
    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getMass() {
        return mass;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getForce() {
        return force;
    }


}
