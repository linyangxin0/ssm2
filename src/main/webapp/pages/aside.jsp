<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
                     class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>
                    <security:authentication property="principal.username"></security:authentication>
                </p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>

        <ul class="sidebar-menu">
            <li id="admin-index"><a
                    href="${pageContext.request.contextPath}/pages/main.jsp"><i
                    class="fa fa-dashboard"></i> <span>首页</span></a>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-dashboard"></i>
                <span>用户管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting">
                        <a
                                href="${pageContext.request.contextPath}/user/findAll.do"> <i
                                class="fa fa-circle-o"></i> 用户管理
                        </a>
                    </li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/role/findAll.do"> <i
                            class="fa fa-circle-o"></i> 角色管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/permission/findAll.do">
                        <i class="fa fa-circle-o"></i> 资源权限管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/sysLog/findAll.do"> <i
                            class="fa fa-circle-o"></i> 访问日志
                    </a></li>
                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-files-o"></i>
                <span>设备管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/deviceType/findAll.do">
                        <i class="fa fa-circle-o"></i> 设备类型
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/deviceDetail/findAll.do"> <i
                            class="fa fa-circle-o"></i> 设备详情
                    </a></li>

                </ul>
            </li>


            <li class="treeview"><a href="#"> <i class="fa fa-th"></i>
                <span>音乐管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">
                    <li id="system-setting">
                        <a
                                href="${pageContext.request.contextPath}/songs/findAll.do"> <i
                                class="fa fa-circle-o"></i> 歌单
                        </a>
                    </li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/equipmentMusic/findAll.do">
                        <i class="fa fa-circle-o"></i> 设备音乐管理
                    </a></li>

                </ul>
            </li>

        </ul>
    </section>
    <!-- /.sidebar -->
</aside>