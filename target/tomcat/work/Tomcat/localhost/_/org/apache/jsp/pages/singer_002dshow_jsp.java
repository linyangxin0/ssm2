/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-05 14:21:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class singer_002dshow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- 页面meta -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("<title>数据 - AdminLTE2定制版</title>\r\n");
      out.write("<meta name=\"description\" content=\"AdminLTE2定制版\">\r\n");
      out.write("<meta name=\"keywords\" content=\"AdminLTE2定制版\">\r\n");
      out.write("\r\n");
      out.write("<!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("<meta\r\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\"\r\n");
      out.write("\tname=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionicons/css/ionicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/iCheck/square/blue.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/morris/morris.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/datepicker/datepicker3.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/datatables/dataTables.bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/treeTable/jquery.treetable.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/treeTable/jquery.treetable.theme.default.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/select2/select2.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/colorpicker/bootstrap-colorpicker.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/adminLTE/css/AdminLTE.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/adminLTE/css/skins/_all-skins.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionslider/ion.rangeSlider.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionslider/ion.rangeSlider.skinNice.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap-slider/slider.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 页面头部 -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- 页面头部 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 导航侧栏 -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "aside.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- 导航侧栏 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 内容区域 -->\r\n");
      out.write("\t\t<div class=\"content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 内容头部 -->\r\n");
      out.write("\t\t\t<section class=\"content-header\">\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t用户管理 <small>全部用户</small>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-dashboard\"></i> 首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/findAll.do\">用户管理</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"active\">全部用户</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<!-- 内容头部 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 正文区域 -->\r\n");
      out.write("\t\t\t\t<section class=\"content\"> <!-- .box-body -->\r\n");
      out.write("\t\t\t\t<div class=\"box box-primary\">\r\n");
      out.write("\t\t\t\t\t<div class=\"box-header with-border\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"box-title\">列表</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"box-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 数据表格 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"table-box\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--工具栏-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" title=\"返回\" onclick=\"history.back(-1);\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-file-o\"></i> 返回\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-tools pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"has-feedback\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"/songs/search.do\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control input-sm\" placeholder=\"搜索\" name=\"search_text\" style=\"display: inline-block!important; width: 75%; height: 34px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"submit\">搜索</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--工具栏/-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--数据列表-->\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"dataList\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"table table-bordered table-striped table-hover dataTable\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting_asc\">歌手序号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting_desc\">姓名</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting_asc sorting_asc_disabled\">性别</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting_desc sorting_desc_disabled\">国籍</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\">生日</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${singer.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${singer.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${singer.sexStr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${singer.nationality}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${singer.birthdayStr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\r\n");
      out.write("                            <tfoot>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <th>Rendering engine</th>\r\n");
      out.write("                            <th>Browser</th>\r\n");
      out.write("                            <th>Platform(s)</th>\r\n");
      out.write("                            <th>Engine version</th>\r\n");
      out.write("                            <th>CSS grade</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            </tfoot>-->\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t<!--数据列表/-->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- 数据表格 /-->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.box-body -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t<!-- 正文区域 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- @@close -->\r\n");
      out.write("\t\t\t<!-- 内容区域 /-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/jQueryUI/jquery-ui.min.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/raphael/raphael-min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/morris/morris.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/knob/jquery.knob.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/daterangepicker/daterangepicker.zh-CN.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/adminLTE/js/app.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/treeTable/jquery.treetable.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/select2/select2.full.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/colorpicker/bootstrap-colorpicker.min.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap-markdown/js/bootstrap-markdown.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap-markdown/js/markdown.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap-markdown/js/to-markdown.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/input-mask/jquery.inputmask.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/input-mask/jquery.inputmask.date.extensions.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/input-mask/jquery.inputmask.extensions.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/datatables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/chartjs/Chart.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/flot/jquery.flot.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/flot/jquery.flot.resize.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/flot/jquery.flot.pie.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/flot/jquery.flot.categories.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/ionslider/ion.rangeSlider.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap-slider/bootstrap-slider.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction findAll() {\r\n");
      out.write("\t\t\t\t$.post({\r\n");
      out.write("\t\t\t\t\turl:\"/songs/findAll.do\",\r\n");
      out.write("\t\t\t\t\tsuccess:function () {\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction deleteSong(id) {\r\n");
      out.write("\t\t\t\t$.post({\r\n");
      out.write("\t\t\t\t\turl:\"/songs/deleteSong.do\",\r\n");
      out.write("\t\t\t\t\tdata:{\"id\":id},\r\n");
      out.write("\t\t\t\t\tsuccess:function () {\r\n");
      out.write("\t\t\t\t\t\talert(\"删除(下架)成功\");\r\n");
      out.write("\t\t\t\t\t\tlocation.href=\"/songs/findAll.do\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction value(id,name,title,status) {\r\n");
      out.write("\t\t\t\t$(\"#edit_id\").val(id);\r\n");
      out.write("\t\t\t\t$(\"#edit_name\").val(name);\r\n");
      out.write("\t\t\t\t$(\"#edit_title\").val(title);\r\n");
      out.write("\t\t\t\t$(\"#edit_status\").val(status);\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t// 选择框\r\n");
      out.write("\t\t\t\t$(\".select2\").select2();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// WYSIHTML5编辑器\r\n");
      out.write("\t\t\t\t$(\".textarea\").wysihtml5({\r\n");
      out.write("\t\t\t\t\tlocale : 'zh-CN'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 设置激活菜单\r\n");
      out.write("\t\t\tfunction setSidebarActive(tagUri) {\r\n");
      out.write("\t\t\t\tvar liObj = $(\"#\" + tagUri);\r\n");
      out.write("\t\t\t\tif (liObj.length > 0) {\r\n");
      out.write("\t\t\t\t\tliObj.parent().parent().addClass(\"active\");\r\n");
      out.write("\t\t\t\t\tliObj.addClass(\"active\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(document)\r\n");
      out.write("\t\t\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t// 激活导航位置\r\n");
      out.write("\t\t\t\t\t\t\t\tsetSidebarActive(\"admin-datalist\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t// 列表按钮 \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#dataList td input[type='checkbox']\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.iCheck(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcheckboxClass : 'icheckbox_square-blue',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tincreaseArea : '20%'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t// 全选操作 \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#selall\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clicks = $(this).is(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t':checked');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (!clicks) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#dataList td input[type='checkbox']\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.iCheck(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"uncheck\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#dataList td input[type='checkbox']\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.iCheck(\"check\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(this).data(\"clicks\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t!clicks);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}
