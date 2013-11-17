import java.io.Serializable;

public class MenuItem implements Serializable
{
  private static final long serialVersionUID = 7526472295622776147L;
  
  private String url;
  private String label;
  
  public void setUrl(String url){
    this.url=url;
  }
  public String getUrl(){
    return url;
  }    
  
  public void setLabel(String label){
    this.label=label;
  }
  public String getLabel(){
    return label;
  }  

  public MenuItem(){}
  public MenuItem(String url,String label){
    this.url=url;
    this.label=label;    
  }  
}