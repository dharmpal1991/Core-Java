/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-07-05 16:00:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/home/namostute/Documents/SpringMVC/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/StudentRegistration/WEB-INF/lib/spring-webmvc-3.2.3.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1369024458000L));
    _jspx_dependants.put("jar:file:/home/namostute/Documents/SpringMVC/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/StudentRegistration/WEB-INF/lib/spring-webmvc-3.2.3.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1369024458000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.2.3.RELEASE.jar", Long.valueOf(1497443227000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link rel =\"stylesheet\" href=\"/StudentRegistration/resources/bootstrap/css/bootstrap.min.css\" ></link>\n");
      out.write("<link rel =\"stylesheet\" href=\"/StudentRegistration/resources/bootstrap/css/bootstrap-theme.min.css\" ></link>\n");
      out.write("<script type=\"text/javascript\" src=\"/StudentRegistration/resources/js/jquery-1.12.1.min.js\"></script>\n");
      out.write("<script src=\"/StudentRegistration/resources/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("body{\n");
      out.write("    background-color:  #d9d9d9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body >\n");
      out.write(" <div class=\"col-md-4 col-md-offset-4\"> \n");
      out.write("  <div class=\"form-container off-canvas\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <form role=\"form\" class=\"form-signin\">\n");
      out.write("      <h2>Please sign in...</h2>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"EmailAddress\"><span>*</span> Email Address</label>\n");
      out.write("        <input type=\"email\" class=\"form-control\" name=\"EmailAddress\" id=\"Email_Address\" aria-required=\"true\" style=\"width:400px\" aria-invalid=\"true\" required>\n");
      out.write("      </div>\n");
      out.write("\t\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"EmailAddress\"><span>*</span> Password</label>\n");
      out.write("        \n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" aria-required=\"true\"  style=\"width:400px\" aria-invalid=\"true\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"checkbox\">\n");
      out.write("        <label>\n");
      out.write("          <input type=\"checkbox\" value=\"remember-me\"> Remember me\n");
      out.write("        </label>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <button class=\"btn btn-lg btn-primary btn-block\"  style=\"width:400px\" id=\"submit_id\">Sign in</button>\n");
      out.write("      <a href=\"/StudentRegistration/studentReg\"> Create New Account</a>\n");
      out.write("    </form>\n");
      out.write("  </div> <!-- /container -->\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
