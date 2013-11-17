package appjud;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.faces.context.*;

public class JudBean{
  private String jud=null;
  private String capit=null;
  private String abrev=null;
  
  public JudBean(){}
  
  public void setJud(String jud){
    this.jud=jud;
    ExternalContext context=FacesContext.getCurrentInstance().getExternalContext();
    HttpSession session=(HttpSession)context.getSession(true);  
    HashMap<String,RefJudet> refJudete=(HashMap<String,RefJudet>)session.getAttribute("refJudete");
    //System.out.println(refJudete.size());
    RefJudet rj=refJudete.get(jud);
    capit=rj.getCapit();
    abrev=rj.getAbrev();
    //System.out.println(jud);
  }
  
  public String getJud(){
    return jud;
  }
  
  public String getCapit(){
    //rj=(RefJudet)refJudete.get(jud);
    //return rj.getCapit();
    return capit;
  }
  
  public String getAbrev(){
    //rj=(RefJudet)refJudete.get(jud);
    //return rj.getAbrev();
    return abrev;
  }
}
