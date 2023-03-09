package J24_Encapsulation.Tasks.Task_04;

public class RentApartments {

    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    //task method
    private int rent;
    public int rentCalculator(){
      if (roomCount==0){
          this.rent=1400;
      }else if (roomCount==1){
          this.rent=1700;
      }else if (roomCount==2){
          this.rent=2200;
      } else if (roomCount == 3) {
          this.rent = 2700;
      }


        return this.rent+=getBalcon();
    }
    public int getBalcon(){

        if (balconyOrNo==true) {
            return 200;
        }else return 0;
    }

    //constructor

    public RentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }

    //toString method

    @Override
    public String toString() {
        return
                "Kiraci adi = " + name + '\'' +
                "oda sayisi = " + roomCount +
                " balconyOrNo= " + balconyOrNo + " Kira miktari ="+
                rentCalculator();
    }
}
class RunnerRentApartments {//inner class level
    public static void main(String[] args) {
    RentApartments obj1 = new RentApartments("QaTester Murat bey",3,true );
        System.out.println("obj1 = " + obj1);
    }

}//inner class sonu