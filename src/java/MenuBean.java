import java.util.Collection;
import java.util.ArrayList;
public class MenuBean{
  private Collection<MenuItem> menus;
  
  public Collection<MenuItem> getMenus(){
    return menus;
  }
  public void setMenus(Collection<MenuItem> menus){
    this.menus=menus;
  }
  
  public MenuBean(){
    menus=new ArrayList<MenuItem>();
    menus.add(new MenuItem("cmmdcInput.xhtml","CMMDC automat"));
    menus.add(new MenuItem("cmmdcInput1.xhtml","CMMDC manual"));    
    menus.add(new MenuItem("appjudInput.xhtml","App judete"));    
  }  
}