/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.31
 * Generated at: 2024-11-14 16:43:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class doctorlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Doctor Login</title>\n");
      out.write("<link\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<background-image href></background-image>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("	display: flex;\n");
      out.write("	justify-content: center;\n");
      out.write("	align-items: center;\n");
      out.write("	height: 100vh;\n");
      out.write("	background: url(resources/images/docterlogin.jpg) no-repeat center\n");
      out.write("		center fixed;\n");
      out.write("	background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-container {\n");
      out.write("	border-radius: 30px;\n");
      out.write("	width: 100%;\n");
      out.write("	max-width: 400px;\n");
      out.write("	padding: 15px;\n");
      out.write("	background-color: skyblue;\n");
      out.write("	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<!-- Navigation Bar -->\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light fixed-top bg-info\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<a class=\"navbar-brand\" href=\"#\">Healthcare Management System</a>\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("				data-target=\"#navbarNav\" aria-controls=\"navbarNav\"\n");
      out.write("				aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("			</button>\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("				<ul class=\"navbar-nav ml-auto\">\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"adminlogin.jsp\">Admin\n");
      out.write("							Login</a></li>\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\n");
      out.write("						href=\"patientLogin.jsp\">Patient Login</a></li>\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\n");
      out.write("						href=\"doctorlogin.jsp\">Doctor Login</a></li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</nav>\n");
      out.write("\n");
      out.write("	<div class=\"login-container\">\n");
      out.write("		<h3 class=\"text-center\">Doctor Login</h3>\n");
      out.write("		");
String msg=(String)request.getAttribute("login");
		if(msg=="no"){
		
		
      out.write("\n");
      out.write("		<h5 style=\"color:red;\">You are not Register please register</h5>\n");
      out.write("		");
} 
      out.write("\n");
      out.write("		<form action=\"doctorlogin\" method=\"post\">\n");
      out.write("			<div class=\"form-group\">\n");
      out.write("				<label for=\"UserName\">Email</label> <input type=\"text\"\n");
      out.write("					class=\"form-control\" id=\"UserName\" placeholder=\"enter a email\"\n");
      out.write("					name=\"email\">\n");
      out.write("			</div>\n");
      out.write("			<div class=\"form-group\">\n");
      out.write("				<label for=\"patientPassword\">Password</label> <input type=\"password\"\n");
      out.write("					class=\"form-control\" id=\"patientPassword\" placeholder=\"Password\"\n");
      out.write("					name=\"pass\">\n");
      out.write("			</div>\n");
      out.write("			<button type=\"submit\" class=\"btn btn-success btn-block\">Login</button>\n");
      out.write("			<a href=\"register_doctor.jsp\">Don't have account?Register</a>\n");
      out.write("		</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("	<script\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js\"></script>\n");
      out.write("	<script\n");
      out.write("		src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
