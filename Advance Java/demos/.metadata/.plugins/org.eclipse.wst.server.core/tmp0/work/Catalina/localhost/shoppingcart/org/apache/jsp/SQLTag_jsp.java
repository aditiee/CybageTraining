/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.8
 * Generated at: 2019-02-08 10:56:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SQLTag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/AdvJavaJan19/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shoppingcart/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/D:/AdvJavaJan19/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shoppingcart/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1486447852341L));
    _jspx_dependants.put("jar:file:/D:/AdvJavaJan19/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shoppingcart/WEB-INF/lib/jstl-1.2.jar!/META-INF/sql.tld", Long.valueOf(1153365282000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fupdate_0026_005fvar_005fdataSource;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsql_005fupdate_0026_005fvar_005fdataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fsql_005fupdate_0026_005fvar_005fdataSource.release();
    _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("  \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("    <title>&lt;sql:dateParam&gt; Demo</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <h1>&lt;sql:dateParam&gt; Demo</h1>\r\n");
      out.write("    <form name=\"my\"   action=\"${pageContext.request.contextPath}/SQLTag.jsp\"\r\n");
      out.write("        method=\"POST\">\r\n");
      out.write("    <table border=\"0\"> <tr>\r\n");
      out.write("        <td>* Enter Emp_ ID:</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"eid\" />\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>* Enter Last Name:</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"name\" />\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>* Enter Salary: </td>\r\n");
      out.write("        <td><input type=\"text\" name=\"sal\" /></td>\r\n");
      out.write("      </tr>           \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><input type=\"submit\" value=\"Submit\"/></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>       \r\n");
      out.write("     </form>\r\n");
      out.write("     <br/><br/>\r\n");
      out.write("     \r\n");
      out.write("    ");
      if (_jspx_meth_sql_005fsetDataSource_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         \r\n");
      out.write("    ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("     \r\n");
      out.write("    <br/><br/>\r\n");
      out.write("    ");
      if (_jspx_meth_sql_005fquery_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <table border=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th>Employee ID</th>\r\n");
      out.write("    <th>Employee Name</th>\r\n");
      out.write("    <th>Employee Salary</th>\r\n");
      out.write("    <th>Action</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_005fsetDataSource_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_005fsetDataSource_005f0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_005fsetDataSource_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fsetDataSource_005f0.setParent(null);
    // /SQLTag.jsp(37,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setVar("myDS");
    // /SQLTag.jsp(37,4) name = driver type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setDriver("com.mysql.jdbc.Driver");
    // /SQLTag.jsp(37,4) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setUrl("jdbc:mysql://localhost:3306/frdb");
    // /SQLTag.jsp(37,4) name = user type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setUser("root");
    // /SQLTag.jsp(37,4) name = password type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fsetDataSource_005f0.setPassword("root");
    int _jspx_eval_sql_005fsetDataSource_005f0 = _jspx_th_sql_005fsetDataSource_005f0.doStartTag();
    if (_jspx_th_sql_005fsetDataSource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /SQLTag.jsp(41,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(false);
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("       \r\n");
        out.write("        ");
        if (_jspx_meth_sql_005fupdate_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_sql_005fupdate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:update
    org.apache.taglibs.standard.tag.rt.sql.UpdateTag _jspx_th_sql_005fupdate_005f0 = (org.apache.taglibs.standard.tag.rt.sql.UpdateTag) _005fjspx_005ftagPool_005fsql_005fupdate_0026_005fvar_005fdataSource.get(org.apache.taglibs.standard.tag.rt.sql.UpdateTag.class);
    _jspx_th_sql_005fupdate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fupdate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /SQLTag.jsp(42,8) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fupdate_005f0.setDataSource("${myDS}");
    // /SQLTag.jsp(42,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fupdate_005f0.setVar("emp");
    int[] _jspx_push_body_count_sql_005fupdate_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_005fupdate_005f0 = _jspx_th_sql_005fupdate_005f0.doStartTag();
      if (_jspx_eval_sql_005fupdate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_005fupdate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_005fupdate_005f0[0]++;
          _jspx_th_sql_005fupdate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_005fupdate_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            INSERT INTO empl VALUES (?, ?, ?)           \r\n");
          out.write("            ");
          if (_jspx_meth_sql_005fparam_005f0(_jspx_th_sql_005fupdate_005f0, _jspx_page_context, _jspx_push_body_count_sql_005fupdate_005f0))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_sql_005fparam_005f1(_jspx_th_sql_005fupdate_005f0, _jspx_page_context, _jspx_push_body_count_sql_005fupdate_005f0))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_sql_005fparam_005f2(_jspx_th_sql_005fupdate_005f0, _jspx_page_context, _jspx_push_body_count_sql_005fupdate_005f0))
            return true;
          out.write("   \r\n");
          out.write("                    \r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_005fupdate_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_005fupdate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_005fupdate_005f0[0]--;
        }
      }
      if (_jspx_th_sql_005fupdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_005fupdate_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_005fupdate_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_005fupdate_005f0.doFinally();
      _005fjspx_005ftagPool_005fsql_005fupdate_0026_005fvar_005fdataSource.reuse(_jspx_th_sql_005fupdate_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_005fupdate_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_005fupdate_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_005fparam_005f0 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_005fupdate_005f0);
    // /SQLTag.jsp(44,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fparam_005f0.setValue("${param.eid}");
    int _jspx_eval_sql_005fparam_005f0 = _jspx_th_sql_005fparam_005f0.doStartTag();
    if (_jspx_th_sql_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_sql_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_005fupdate_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_005fupdate_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_005fparam_005f1 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_005fupdate_005f0);
    // /SQLTag.jsp(45,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fparam_005f1.setValue("${param.name}");
    int _jspx_eval_sql_005fparam_005f1 = _jspx_th_sql_005fparam_005f1.doStartTag();
    if (_jspx_th_sql_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_sql_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_005fupdate_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_005fupdate_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_005fparam_005f2 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_005fupdate_005f0);
    // /SQLTag.jsp(46,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fparam_005f2.setValue("${param.sal}");
    int _jspx_eval_sql_005fparam_005f2 = _jspx_th_sql_005fparam_005f2.doStartTag();
    if (_jspx_th_sql_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_sql_005fparam_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <font color=\"#cc0000\">Please enter mandatory information.</font>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_sql_005fquery_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_005fquery_005f0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_005fquery_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fquery_005f0.setParent(null);
    // /SQLTag.jsp(56,4) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fquery_005f0.setDataSource("${myDS}");
    // /SQLTag.jsp(56,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sql_005fquery_005f0.setVar("emp");
    int[] _jspx_push_body_count_sql_005fquery_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_005fquery_005f0 = _jspx_th_sql_005fquery_005f0.doStartTag();
      if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_005fquery_005f0[0]++;
          _jspx_th_sql_005fquery_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_005fquery_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("        SELECT * from empl;\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_005fquery_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_005fquery_005f0[0]--;
        }
      }
      if (_jspx_th_sql_005fquery_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_005fquery_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_005fquery_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_005fquery_005f0.doFinally();
      _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.reuse(_jspx_th_sql_005fquery_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /SQLTag.jsp(66,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("row");
    // /SQLTag.jsp(66,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/SQLTag.jsp(66,8) '${emp.rows}'",_el_expressionfactory.createValueExpression("${emp.rows}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tr>               \r\n");
          out.write("                <td>");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("                <td>");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("                <td>");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>  \r\n");
          out.write("                   \r\n");
          out.write("             </tr>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /SQLTag.jsp(68,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue("${row.e_id}");
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /SQLTag.jsp(69,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue("${row.ename}");
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /SQLTag.jsp(70,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue("${row.sal}");
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }
}
