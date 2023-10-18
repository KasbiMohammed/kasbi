
package ma.projet.test;
   
import ma.projet.classes.Employe;
import ma.projet.classes.EmployeTache;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.service.EmployeService;
import ma.projet.service.EmployeTacheService;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;



public class Test {
    public static void main(String[] args) {
      EmployeService es=new EmployeService();
      EmployeTacheService ets=new EmployeTacheService();
      ProjetService ps=new ProjetService();
      TacheService ts=new TacheService();
      
     Employe employe1=new Employe("kasbi","ahmed",068765);
      es.create(employe1);
     
      Projet projet1=new Projet("Hello",generateDateFormat(2020,10,1),generateDateFormat(2023,10,15));
      ps.create(projet1);
      
      Tache tache1=new Tache("test",generateDateFormat(2019,01,01),generateDateFormat(2023,01,01),40);
     ts.create(tache1);
      
      EmployeTache  employeetache1 =new EmployeTache(new EmployeTacheKey(1,1,generateDateFormat(2022,01,01),generateDateFormat(2023,09,09)));
     ets.create(employeetache1);

    }

}
