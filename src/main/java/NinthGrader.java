public class NinthGrader extends Student{
    public NinthGrader(){
        super();
    }   

    public NinthGrader(String f, String l){
        super(f,l,2024);
    }

    @Override public void doSomething() {
        System.out.println("I'm studying physics!");
    }

    @Override public String toString(){
        String str = super.toString();
        str += " (Ninth Grader)";
        return str;
    }

}