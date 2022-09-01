package com.proj12.db;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "lokata", eager = true)
@SessionScoped
public class lokata {

	public float kwotaLokaty;
	public String dataZalozenia;
	public float wyliczenieMiesieczne[]; 
	public int miesiace;
	public String smiesiace="";
	ArrayList<lokata> lilokata;
	public float ustawionaKwotaLokaty;
	public float procent;
	
	
	
	public float getProcent() {
		return procent;
	}

	public void setProcent(float procent) {
		this.procent = procent;
	}

	public float getUstawionaKwotaLokaty() {
		return ustawionaKwotaLokaty;
	}

	public void setUstawionaKwotaLokaty(float ustawionaKwotaLokaty) {
		this.ustawionaKwotaLokaty = ustawionaKwotaLokaty;
	}

	public ArrayList<lokata> getLilokata() {
		return lilokata;
	}

	public void setLilokata(ArrayList<lokata> lilokata) {
		this.lilokata = lilokata;
	}

	public String getSmiesiace() {
		return smiesiace;
	}

	public void setSmiesiace(String smiesiace) {
		this.smiesiace = smiesiace;
	}

	public int getMiesiace() {
		return miesiace;
	}

	public void setMiesiace(int miesiace) {
		this.miesiace = miesiace;
	}

	public float getKwotaLokaty() {
		return kwotaLokaty;
	}

	public void setKwotaLokaty(float kwotaLokaty) {
		this.kwotaLokaty = kwotaLokaty;
	}

	public String getDataZalozenia() {
		return dataZalozenia;
	}

	public void setDataZalozenia(String dataZalozenia) {
		this.dataZalozenia = dataZalozenia;
	}

	public void setMlokata1(HashMap<Integer, String> mlokata1) {
		this.mlokata1 = mlokata1;
	}

	public HashMap<Integer,String> mlokata1 = new HashMap<Integer, String>();
	
	
	
	public ArrayList<lokata> sqlLokata_() {
		

			if((getSmiesiace()=="")) {
				setSmiesiace("6");
			}
		ArrayList<lokata> lilokata = new ArrayList();
		setMiesiace(Integer.valueOf(getSmiesiace()));
		float miesiecznyProcent=0;
		
		//"01/01/2005"
		String dzien   = getDataZalozenia().substring(0, 2);
	    String miesiac = getDataZalozenia().substring(3, 5);
	    String rok     = getDataZalozenia().substring(6, 10);
		 
	    int imiesiac = Integer.valueOf(miesiac);
		int irok = Integer.valueOf(rok);
		
	    
	    for(int i=0;i<miesiace;i++) {
			
			lokata lok2 = new lokata();
			imiesiac++;
			if(imiesiac==13) {
				imiesiac=1;
				irok++;
			}
			
			boolean addzero = false;
			String przedrostek ="";
			if(imiesiac<10) {
				addzero=true;
			}
				if(addzero) {przedrostek="0";}
			String smiesiac	= przedrostek + String.valueOf(imiesiac);
			String dataz = dzien + "/"+ smiesiac+"/"+String.valueOf(irok);
			lok2.setDataZalozenia(dataz);
			miesiecznyProcent+=(getUstawionaKwotaLokaty()*0.01*getProcent())/12   ;
			lok2.setKwotaLokaty(getUstawionaKwotaLokaty()+miesiecznyProcent );
		    lilokata.add(lok2);
		    setLilokata(lilokata);
		    
		}
			
		
			
		
		
		
		 
		
			return lilokata;
		}
	
	
	
	
	
	
public ArrayList<lokata> getSqlLokata() {
	
	try{
		if(lilokata.isEmpty()) {
			if((getSmiesiace()=="")) {
				setSmiesiace("6");
			}
			setMiesiace(Integer.valueOf(getSmiesiace()));
		for(int i=0;i<miesiace;i++) {
			lokata lok2 = new lokata();
			lok2.setDataZalozenia("0102/2005");
			lok2.setKwotaLokaty(this.getKwotaLokaty());
		    this.lilokata.add(lok2);
	    	
			
			
	      
		}
			
		}
		
	}
	
	catch(Exception e) {
		if((getSmiesiace()=="")) {
			setSmiesiace("6");
		}
		ArrayList<lokata> listlokata = new ArrayList();
	setMiesiace(Integer.valueOf(getSmiesiace()));
	for(int i=0;i<miesiace;i++) {
		lokata lok2 = new lokata();
		lok2.setDataZalozenia("0102/2005");
		lok2.setKwotaLokaty(762);
	    listlokata.add(lok2);
    	setLilokata(listlokata);
		
		
      
	}
		
	}
		
	
	
	
	 
	
		return lilokata;
	}
    
	
public int sqlLokata2() {
	if((getSmiesiace()=="")) {
		setSmiesiace("18");
	}
	ArrayList<lokata> lilokata = new ArrayList();
	setMiesiace(Integer.valueOf(getSmiesiace()));
	
	for(int i=0;i<miesiace;i++) {
	lokata lok2 = new lokata();
	lok2.setDataZalozenia("0102/2005");
	lok2.setKwotaLokaty(762);
    lilokata.add(lok2);
	
	
}	
  
setLilokata(lilokata);
	
return 1;
}




	
	
}
