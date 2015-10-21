/**
 * Created by TZ6YSQ on 10/20/2015.
 */
class CalTest extends GroovyTestCase {
    private Cal cal;
    void testComputeForce() {
        cal = new Cal();

        Random random;

        int i = 90;//random.nextInt(90);
        cal.setAcceleration(i);
        cal.setMass(i);
        assertEquals(i*i, cal.computeForce())
    }
}
