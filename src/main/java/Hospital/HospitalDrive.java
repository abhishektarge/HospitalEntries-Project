package Hospital;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDrive
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hospital");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		
		//Hospital
		Hospital hospital=new Hospital();
		hospital.setId(1);
		hospital.setHname("Corona Multispetiality");
		hospital.setCeo("Abhishek");
		
		
		//Branches
		Branches branch1=new Branches();
		branch1.setId(1);
		branch1.setBname("nashik");
		branch1.setManager("Sujay sir");
		Branches branch2=new Branches();
		branch2.setId(2);
		branch2.setBname("pune");
		branch2.setManager("akshay sir");
		
		
		//Address
		Address address1=new Address();
		address1.setId(1);
		address1.setLocation("nashik");
		address1.setLandmark("panchvati");
		address1.setPincode("422003");
	    Address address2=new Address();
		address2.setId(2);
		address2.setLocation("pune");
		address2.setLandmark("kothrud");
		address2.setPincode("411088");
		
		
		//Patients
		Patients patient1=new Patients();
		patient1.setId(1);
		patient1.setPname("Akshay");
		patient1.setAge(23);
		Patients patient2=new Patients();
		patient2.setId(2);
		patient2.setPname("sujay");
		patient2.setAge(24);
	
		
		//Diseases
		Diseases disease1=new Diseases();
		disease1.setId(1);
		disease1.setDname("Diabetis");
		disease1.setSymtoms("mood Swings");
		Diseases disease2=new Diseases();
		disease2.setId(2);
		disease2.setDname("Weakness");
		disease2.setSymtoms("Blindness");
		Diseases disease3=new Diseases();
		disease3.setId(3);
		disease3.setDname("corona");
		disease3.setSymtoms("knee pain");
		
		
		//Encounters
		Encounters encounter1=new Encounters();
		encounter1.setId(1);
		encounter1.setPname("sujay");
		encounter1.setDate("14 feb");
		encounter1.setLastin(" 1 am");
		encounter1.setLastout("1.01 am");
		Encounters encounter2=new Encounters();
		encounter2.setId(2);
		encounter2.setPname("akshay");
		encounter2.setDate("31 feb");
		encounter2.setLastin("2 am");
		encounter2.setLastout("3 am");
		Encounters encounter3=new Encounters();
		encounter3.setId(3);
		encounter3.setPname("akshay");
		encounter3.setDate("5 may");
		encounter3.setLastin("4 am");
		encounter3.setLastout("8 am");
		Encounters encounter4=new Encounters();
		encounter4.setId(4);
		encounter4.setPname("suajay");
		encounter4.setDate("4 jun");
		encounter4.setLastin("10 am");
		encounter4.setLastout("11 am");
		
	
		
		
		// One to one hospital and branches
		List<Branches> branches=new ArrayList<Branches>();
		branches.add(branch1);
		branches.add(branch2);
		hospital.setBranches(branches);
		
		
		//One to one branch and address
		branch1.setAddress(address1);
		branch2.setAddress(address2);
		
		
		//One to many branch and Patient
		List<Patients> patient11=new ArrayList<Patients>();
		patient11.add(patient1);
		branch1.setPatients(patient11);
		List<Patients> patient22=new ArrayList<Patients>();
		patient22.add(patient2);
		branch2.setPatients(patient22);
		
		
		//Many to many Patient and Disease
		List<Diseases> disease11= new ArrayList<Diseases>();
		disease11.add(disease1);
		disease11.add(disease2);
		patient1.setDiseases(disease11);
		List<Diseases> disease22= new ArrayList<Diseases>();
		disease22.add(disease2);
		disease22.add(disease3);
		patient1.setDiseases(disease22);
		List<Diseases> disease33= new ArrayList<Diseases>();
		disease33.add(disease1);
		disease33.add(disease3);
		patient2.setDiseases(disease33);
		
		
		//Many to Many Disease and Patient
		List<Patients> patient111=new ArrayList<Patients>();
		patient111.add(patient1);
		patient111.add(patient2);
		disease1.setPatients(patient111);
		List<Patients> patient222=new ArrayList<Patients>();
		patient222.add(patient1);
		disease2.setPatients(patient222);
		disease3.setPatients(patient222);
		
		
		//One to Many Patient and Encounters
		List<Encounters> encounter11=new ArrayList<Encounters>();
		encounter11.add(encounter1);
		encounter11.add(encounter4);
		patient1.setEncounters(encounter11);
		List<Encounters> encounter22=new ArrayList<Encounters>();
		encounter22.add(encounter2);
		encounter22.add(encounter3);
		patient2.setEncounters(encounter22);
		
		
		
		
		et.begin();
		em.persist(hospital);
		em.persist(branch1);
		em.persist(branch2);
		em.persist(address1);
		em.persist(address2);
		em.persist(patient1);
		em.persist(patient2);
		em.persist(disease1);
		em.persist(disease2);
		em.persist(disease3);
		em.persist(encounter1);
		em.persist(encounter2);
		em.persist(encounter3);
		em.persist(encounter4);
		et.commit();
		
	}
}
