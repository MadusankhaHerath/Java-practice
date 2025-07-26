class car{
    String brand;
    int year;

    public car(String carBrand,int carYear) {
        brand = carBrand;
        year = carYear;
    }

    void display(){
        System.out.println("brand : "+brand);
        System.out.println("year : "+year);
    }
}
    public class consEx1{
        public static void main(String[] args) {
            car car1 = new car("toyota",2013);
            car1.display();
        }
    }

    
