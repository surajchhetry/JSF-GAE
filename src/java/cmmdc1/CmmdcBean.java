package cmmdc1;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.faces.context.*;
import java.io.Serializable;

public class CmmdcBean implements Serializable
{
  private static final long serialVersionUID = 7526472295622776147L;
  
  private String sresult;

  public CmmdcBean(){}
  
  private long cmmdc(long m,long n){
    long r,c;
    do{
      c=n;
	  r=m%n;
	  m=n;
	  n=r;
    }
    while(r!=0);
    return c;
  }
  
  public String getSresult(){
    return sresult;
  }

  public String compute(){
    ExternalContext context =
    FacesContext.getCurrentInstance().getExternalContext();
    HttpServletRequest request=(HttpServletRequest)context.getRequest();
    String sm = request.getParameter("myform:sm");
    String sn = request.getParameter("myform:sn");
	  long m=Long.parseLong(sm);
    long n=Long.parseLong(sn);
	  long c=cmmdc(m,n);
    sresult=(new Long(c)).toString(); 
    return "OK";
  }
}

