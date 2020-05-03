<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>ITCAST - AdminLTE2定制版</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">

    <!-- Tell the browser to be responsive to screen width -->
    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>


    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/morris/morris.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/select2/select2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/main.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

    <jsp:include page="header.jsp"></jsp:include>
    <!-- 导航侧栏 -->
    <jsp:include page="aside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">
        <div class="top-bar">
            <div class="left-part">
                <form action="/songs/search.do" method="get" class="left-part-form">
                    <input type="text" placeholder="请输入搜索内容" class="left-input" name="search_text"/>
                    <button class="left-button" type="submit">搜索</button>
                </form>
                <form action="/songs/findAll.do" method="get" class="left-part-form">
                    <button class="left-button" type="submit">全部歌单</button>
                </form>
            </div>
            <div class="right-part">
                <button class="right-button">歌单分类</button>
                <button class="right-button">关联删除</button>
                <button class="right-button" data-toggle="modal" data-target="#myModal">新增歌单</button>
            </div>
        </div>

        <table class="songs-table" id="dataList">
            <thead>
            <tr class="flex-content">
                <th class="check-item">
                    <input id="selall"
                           type="checkbox" class="icheckbox_square-blue select-box">
                </th>
                <th class="flex-item">序号</th>
                <th class="flex-item">歌单名称</th>
                <th class="flex-item">手机副标题</th>
                <th class="flex-item">更新时间</th>
                <th class="flex-item">排序</th>
                <th class="flex-item">状态</th>
                <th class="flex-item">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="song" items="${songsList}">
                <tr class="flex-content">
                    <td class="check-item">
                        <input name="ids" type="checkbox" value="${song.id}" class="icheckbox_square-blue select-box">
                    </td>
                    <td class="flex-item">${song.id}</td>
                    <td class="flex-item">${song.name}</td>
                    <td class="flex-item">${song.title}</td>
                    <td class="flex-item">${song.updateTimeStr}</td>
                    <td class="flex-item">${song.sort}</td>
                    <td class="flex-item">
                        <c:if test="${song.status==0}">设计中</c:if>
                        <c:if test="${song.status==1}">
                            <span style="color: red">
                                发布
                            </span>
                        </c:if>
                    </td>
<%--                    href="/songs/deleteSong.do?id=${song.id}" --%>
                    <td class="flex-item">
                        <c:if test="${song.status==0}">
                            <a id="edit_btn" data-toggle="modal"
                               data-target="#editModal" onclick="value('${song.id}','${song.name}','${song.title}','${song.status}')" href="#">编辑</a>
                            <a onclick="deleteSong(${song.id})" href="#">删除</a>
                            <a href="#">预览</a>
                            <a href="#">歌曲信息</a>
                        </c:if>
                        <c:if test="${song.status==1}">
                            <a href="#" onclick="deleteSong(${song.id})">下架</a>
                            <a href="#">歌曲信息</a>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <%--添加歌曲--%>
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="myModalLabel">
                            歌曲信息
                        </h4>
                    </div>
                    <form action="/songs/addSong.do" method="post">
                        <div class="modal-body">
                            <div class="row">
                                <label for="name" class="col-sm-4 control-label">
                                    歌曲名称:
                                </label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="name" name="name"
                                           placeholder="请输入歌曲名称"/>
                                </div>
                            </div>

                            <div class="row">
                                <label for="title" class="col-sm-4 control-label">
                                    手机副标题:
                                </label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="title" name="title"
                                           placeholder="请输入手机副标题"/>
                                </div>
                            </div>

                            <div class="row">
                                <label for="status" class="col-sm-4 control-label">
                                    状态:
                                </label>
                                <div class="col-sm-8">
                                    <select id="status" class="form-control" name="status">
                                        <option value="0">设计中</option>
                                        <option value="1">发布</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary" id="addUser_btn">
                                添加
                            </button>
                            <button type="button" class="btn btn-default"
                                    data-dismiss="modal">
                                关闭
                            </button>
                        </div>
                    </form>

                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


        <%--编辑按键模态框--%>
        <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="myModalLabel2">
                            用户信息
                        </h4>
                    </div>
                    <form action="/songs/editSong.do">
                        <div class="modal-body">
                            <input id="edit_id" type="hidden" name="id">
                            <div class="row">
                                <label for="edit_name" class="col-sm-4 control-label">
                                    歌曲名称:
                                </label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="edit_name" name="name"
                                           placeholder="请输入歌曲名称"/>
                                </div>
                            </div>

                            <div class="row">
                                <label for="edit_title" class="col-sm-4 control-label">
                                    手机副标题:
                                </label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="edit_title" name="title"
                                           placeholder="请输入手机副标题"/>
                                </div>
                            </div>

                            <div class="row">
                                <label for="edit_status" class="col-sm-4 control-label">
                                    状态:
                                </label>
                                <div class="col-sm-8">
                                    <select id="edit_status" class="form-control" name="status">
                                        <option value="0">设计中</option>
                                        <option value="1">发布</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary" id="edit_song_btn">
                                修改
                            </button>
                            <button type="button" class="btn btn-default"
                                    data-dismiss="modal">
                                关闭
                            </button>
                        </div>
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

    </div>
    <!-- 内容区域 /-->


    <!-- 底部导航 /-->

</div>

<script
        src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script
        src="${pageContext.request.contextPath}/js/main.js"></script>
<script>

    $(document).ready(function () {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
        // 全选操作
        $("#selall").click(function () {
            var clicks = $(this).is(':checked');
            if (!clicks) {
                $("#dataList td input[type='checkbox']").iCheck("uncheck");
            } else {
                $("#dataList td input[type='checkbox']").iCheck("check");
            }
            $(this).data("clicks", !clicks);
        });
    });

    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }

    $(document).ready(function () {
        // 激活导航位置
        setSidebarActive("admin-index");
    });

    function findAll() {
        console.log("123")
        $.post({
            url:"/songs/findAll.do",
            success:function () {
            }
        })
    }

    function deleteSong(id) {
        $.post({
            url:"/songs/deleteSong.do",
            data:{"id":id},
            success:function () {
                alert("删除(下架)成功");
                location.href="/songs/findAll.do";
            }
        })
    }
</script>
</body>

</html>