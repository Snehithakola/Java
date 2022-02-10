class Cycle{

}
class uniCycle extends Cycle{
    void balance(){}
}
class biCycle extends Cycle{
    void balance(){}
}
class triCycle extends Cycle{

}
abstract class Rodent{
    abstract void Sound();
    abstract void speed();
    abstract void size();
}
class mouse extends Rodent{
    mouse(){
        System.out.println("mouse");
        Sound();
        speed();
        size();
    }
    @Override
    void Sound() {

    }

    @Override
    void speed() {

    }

    @Override
    void size() {

    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster");
        Sound();
        speed();
        size();
    }
    @Override
    void Sound() {

    }

    @Override
    void speed() {

    }

    @Override
    void size() {

    }
}
interface interfaceOne{

}
interface interfaceTwo{

}
interface interfaceThree{

}
interface combinedInterface extends interfaceOne,interfaceTwo,interfaceThree{
    void newMethod();
}
class implementingClass extends concreteClass implements combinedInterface {

    @Override
    public void newMethod() {

    }
    public void one(interfaceOne objectOne){

    }
    public void two(interfaceOne objectTwo){

    }
    public void three(interfaceOne objectThree){

    }
}
class concreteClass{

}
public class Assignment7 {
    public static void main(String[] args){
        Rodent[] object = new Rodent[2];
        object[0]=new Hamster();
        object[1]=new mouse();
        object[0].size();
        object[1].size();
        Cycle[] cycle_object=new Cycle[3];
        cycle_object[0]=(Cycle)new uniCycle();
        cycle_object[1]=(Cycle)new biCycle();
        cycle_object[2]=(Cycle)new triCycle();

    }
}