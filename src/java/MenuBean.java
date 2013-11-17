import java.util.Collection;
import java.util.ArrayList;
import java.io.Serializable;

public class MenuBean implements Serializable
{
  private static final long serialVersionUID = 7526472295622776147L;  
  private Collection<MenuItem> menus;
  
  public Collection<MenuItem> getMenus(){
    return menus;
  }
  public void setMenus(Collection<MenuItem> menus){
    this.menus=menus;
  }
  
  public MenuBean(){
    menus=new ArrayList<MenuItem>();
    menus.add(new MenuItem("cmmdcInput.jsf","CMMDC automat"));
    menus.add(new MenuItem("cmmdcInput1.jsf","CMMDC manual"));    
    menus.add(new MenuItem("appjudInput.jsf","App judete"));    
  }  
}