class Assignment5{
    public int interger;
    public int character;
    public void printvalues(){
        System.out.println("Integer : "+interger+" Character : "+character);
    }
    public void printLocalValues(int one,int two){
        System.out.println("One : "+one+" Two : "+two);
    }
}
class singleton {
    String variable;
    static singleton method(String string){
        string="a";
        return new singleton();
    }
    void print(){
        System.out.println(variable);
    }
}
