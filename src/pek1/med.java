package pek1;

public class med {
    private  int id;
    private  String lastname;
    private  String firstname;
    private  String secondname;
    private  String adress;
    private  String number;
    private  int medkarta;
    private  String diagnoz;


    public med (int id,  String lastname,String firstname,String secondname,
                String adress, String number, int medkarta, String diagnoz){
        this.id=id;
        this.lastname=lastname;
        this.firstname=firstname;
        this.secondname=secondname;
        this.adress=adress;
        this.number=number;
        this.medkarta=medkarta;
        this.diagnoz=diagnoz;
    }
    public  int getId(){
        return id;
    }
    public  String getFirstname(){
        return firstname;
    }
    public  String getLastname(){
        return  lastname;
    }
    public  String getSecondname(){
        return secondname;
    }
    public  String getAdress(){
        return adress;
    }
    public  String getNumber(){
        return number;
    }
    public int getMedkarta(){
        return medkarta;
    }
    public  String getDiagnoz(){
        return  diagnoz;
    }
    public  void  setId (int id){
        this.id=id;
    }
    public void  setFirstname(String firstname){this.firstname=firstname;}
    public void  setLastname(String lastname){ this.lastname=lastname;}
    public  void setSecondname(String secondname){ this.secondname=secondname;}
    public  void  setAdress(String adress){ this.adress=adress;}
    public  void  setNumber(String  number){this.number=number;}
    public  void  setMedkarta(int medkarta){this.medkarta=medkarta;}
    public  void  setDiagnoz(String diagnoz){this.diagnoz=diagnoz;}

    public  String inf (){
        return  "id: "+id+", Familiya: "+lastname+", Imya: "+firstname+", otchestvo: "+secondname+", adres: "+
                adress+", phone: "+number+", medkarta: "+medkarta+", diagnoz: "+diagnoz;
    }

}
