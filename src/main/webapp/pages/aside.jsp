<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <ul class="sidebar-menu">
            <%--            <li id="admin-index"><a--%>
            <%--                    href="${pageContext.request.contextPath}/pages/main.jsp"><i--%>
            <%--                    class="fa fa-dashboard"></i> <span>首页</span></a></li>--%>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>榜单管理</span> <span class="pull-right-container"> <i
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
                            href="${pageContext.request.contextPath}/role/findAll.do"> <i
                            class="fa fa-circle-o"></i> 排行榜
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/permission/findAll.do">
                        <i class="fa fa-circle-o"></i> 榜单更新情况
                    </a></li>
                </ul>
            </li>
            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>应用管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>k10</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>


            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>k20</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>多唱.魔镜</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>多唱PAD</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>多唱APP</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>单机魔云</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>微服</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>官网管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>歌曲管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>用户反馈</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>预览设备管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do">
                        <i class="fa fa-circle-o"></i> 产品管理
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> 订单管理
                    </a></li>

                </ul>
            </li>

        </ul>
    </section>
    <!-- /.sidebar -->
</aside>