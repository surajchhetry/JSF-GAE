package appjud;
import java.io.Serializable;

public class RefJudet implements Serializable
{
  private static final long serialVersionUID = 7526472295622776147L;

  private String jud;
  private String capit;
  private String abrev;
  
  public RefJudet(){}
  
  public void setJud(String jud){
    this.jud=jud;
  }
  
  public String getJud(){
    return jud;
  }
  
  public void setCapit(String capit){
    this.capit=capit;
  }
  
  public String getCapit(){
    return capit;
  }
  
  public void setAbrev(String abrev){
    this.abrev=abrev;
  }
  
  public String getAbrev(){
    return abrev;
  }
}