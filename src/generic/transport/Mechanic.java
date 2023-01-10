package generic.transport;

public class Mechanic<T extends Transport> {
  private String name;
  private String company;

  public Mechanic(String name, String company){
      this.name=ValidateUtils.validateString(name,"default");
      this.company=ValidateUtils.validateString(company,"default");
  }
public String getName(){return name;}
    public void setName(String name){this.name=ValidateUtils.validateString(name,"default");}
public String getCompany(){return company};
  public void setCompany(String company){this.company=ValidateUtils.validateString(company,)}
public boolean equals(Object o){
      if (this==o) return true;
      if (o==null)||getClass()!=o.getClass())return false;
    Mechanic<?>mechanic=(Mechanic<?>) o;
    Mechanic<?>mechanic=(Mechanic<?>) o;
    return Object.equals(name, mechanic.name)&&Object.equals(company,mechanic company);
}
@Override
    public int hashCode(){
      return Object.hash();}
    public boolean performance(T t){
      if (!t.passDiagnostic()){
          return t.passDiagnostic();
      }else {
          fixTheCar(t);
      }
      return true;
    }
public void fixTheCar(T t){t.repair();}
}
