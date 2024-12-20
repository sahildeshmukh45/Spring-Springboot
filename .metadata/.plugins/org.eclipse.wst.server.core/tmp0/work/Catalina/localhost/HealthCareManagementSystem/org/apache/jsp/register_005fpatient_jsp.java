/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.31
 * Generated at: 2024-11-14 16:26:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class register_005fpatient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Patient Registration - Healthcare Management System</title>\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("	padding-top: 56px; /* Space for fixed navbar */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-brand {\n");
      out.write("	font-size: 1.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".background-section {\n");
      out.write("	background-image: url(resources/images/patientregister.jpg);\n");
      out.write("	background-size: cover;\n");
      out.write("	background-repeat: no-repeat;\n");
      out.write("	background-position: center;\n");
      out.write("	width: 100%;\n");
      out.write("	height: 100vh; /* Full viewport height */\n");
      out.write("	display: flex;\n");
      out.write("	align-items: center;\n");
      out.write("	justify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".background-section h1 {\n");
      out.write("	color: white;\n");
      out.write("	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".registration-form {\n");
      out.write("	background-color: rgba(255, 255, 255, 0.8);\n");
      out.write("	padding: 20px;\n");
      out.write("	border-radius: 10px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
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
      out.write("	<!-- Patient Registration Form -->\n");
      out.write("	<div class=\"background-section\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"row justify-content-center\">\n");
      out.write("				<div class=\"col-md-6\">\n");
      out.write("					<div class=\"registration-form\">\n");
      out.write("\n");
      out.write("\n");
      out.write("						<h2 class=\"mb-4\">Patient Registration</h2>\n");
      out.write("						");

						String msg = (String) request.getAttribute("ErrMsg");
						if (msg == "yes") {
						
      out.write("\n");
      out.write("						<h5 style=\"color: red\">Your a already register please Log In</h5>\n");
      out.write("						");

						}
						
      out.write("\n");
      out.write("						<form action=\"registerPatient\" method=\"post\">\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"firstName\">First Name</label> <input type=\"text\"\n");
      out.write("									class=\"form-control\" id=\"firstName\" name=\"firstName\" required>\n");
      out.write("							</div>\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"lastName\">Last Name</label> <input type=\"text\"\n");
      out.write("									class=\"form-control\" id=\"lastName\" name=\"lastName\" required>\n");
      out.write("							</div>\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"email\">Email</label> <input type=\"email\"\n");
      out.write("									class=\"form-control\" id=\"email\" name=\"email\" required>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-group\">\n");
      out.write("									<label for=\"phoneNumber\">Password</label> <input\n");
      out.write("										type=\"password\" class=\"form-control\" id=\"phoneNumber\"\n");
      out.write("										name=\"pass\" required>\n");
      out.write("								</div>\n");
      out.write("						\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"phoneNumber\">Phone Number</label> <input type=\"text\"\n");
      out.write("									class=\"form-control\" id=\"phoneNumber\" name=\"phoneNumber\"\n");
      out.write("									required>\n");
      out.write("							</div>\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"address\">Address</label>\n");
      out.write("								<textarea class=\"form-control\" id=\"address\" name=\"address\"\n");
      out.write("									rows=\"3\" required></textarea>\n");
      out.write("							</div>\n");
      out.write("							<button type=\"submit\" class=\"btn btn-primary\">Register</button>\n");
      out.write("						</form>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<!-- Bootstrap JS and dependencies -->\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("	<script\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js\"></script>\n");
      out.write("	<script\n");
      out.write("		src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
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
