﻿<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<% request.setAttribute("ctx", request.getContextPath()); %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>小码哥简历管理-教育信息</title>
    <link rel="icon" href="${ctx}/page/asset/admin/img/favicon.png" type="image/x-icon">
    <link href="${ctx}/page/asset/plugin/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="${ctx}/page/asset/plugin/bootstrap-fileinput/bootstrap-fileinput.css" rel="stylesheet">
    <link href="${ctx}/page/asset/plugin/node-waves/waves.css" rel="stylesheet">
    <link href="${ctx}/page/asset/plugin/animate-css/animate.min.css" rel="stylesheet">
    <link href="${ctx}/page/asset/admin/css/material-icons.css" rel="stylesheet">
    <link href="${ctx}/page/asset/admin/css/style.min.css" rel="stylesheet">
    <link href="${ctx}/page/asset/admin/css/theme-blue.min.css" rel="stylesheet">
    <link href="${ctx}/page/asset/admin/css/main.css" rel="stylesheet">
</head>

<body class="theme-blue">
    <!-- Overlay For Sidebars -->
    <div class="overlay"></div>
    <!-- #END# Overlay For Sidebars -->
    <!-- Search Bar -->
    <div class="search-bar">
        <div class="search-icon">
            <i class="material-icons">search</i>
        </div>
        <input type="text" placeholder="输入开始搜索">
        <div class="close-search">
            <i class="material-icons">close</i>
        </div>
    </div>
    <!-- #END# Search Bar -->
    <!-- Top Bar -->
    <nav class="navbar">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="javascript:void(0);" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false"></a>
                <a href="javascript:void(0);" class="bars"></a>
                <a class="navbar-brand" href="#">小码哥简历管理</a>
            </div>
            <div class="collapse navbar-collapse" id="navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <!-- Call Search -->
                    <li><a href="javascript:void(0);" class="js-search" data-close="true"><i class="material-icons">search</i></a></li>
                    <!-- #END# Tasks -->
                    <li><a href="javascript:void(0);" data-close="true"><i class="material-icons">more_vert</i></a></li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- #Top Bar -->
    <section>
        <!-- Left Sidebar -->
        <aside id="leftsidebar" class="sidebar">
            <!-- User Info -->
            <div class="user-info">
                <div class="image">
                    <img src="${ctx}/page/asset/admin/img/avatar.png" alt="User">
                </div>
                <div class="info-container">
                    <div class="name">M了个J</div>
                    <div class="email">小码哥 | 讲师</div>
                    <div class="btn-group user-helper-dropdown">
                        <i class="material-icons" data-toggle="dropdown">keyboard_arrow_down</i>
                        <ul class="dropdown-menu pull-right">
                            <li><a href="${ctx}/page/front/user.html"><i class="material-icons">person</i>个人信息</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="${ctx}/page/login.html"><i class="material-icons">input</i>退出登录</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- #User Info -->
            <!-- Menu -->
            <div class="menu">
                <ul class="list">
                    <li>
                        <a href="user.html">
                            <i class="material-icons">person</i>
                            <span>个人信息</span>
                        </a>
                    </li>
                    <li>
                        <a href="skill.html">
                            <i class="material-icons">accessibility</i>
                            <span>专业技能</span>
                        </a>
                    </li>
                    <li>
                        <a href="password.html">
                            <i class="material-icons">lock</i>
                            <span>修改密码</span>
                        </a>
                    </li>
                    <li class="active">
                        <a href="education.html">
                            <i class="material-icons">school</i>
                            <span>教育经验</span>
                        </a>
                    </li>
                    <li>
                        <a href="company.html">
                            <i class="material-icons">domain</i>
                            <span>公司信息</span>
                        </a>
                    </li>
                    <li>
                        <a href="experience.html">
                            <i class="material-icons">work</i>
                            <span>工作经验</span>
                        </a>
                    </li>
                    <li>
                        <a href="project.html">
                            <i class="material-icons">build</i>
                            <span>项目经验</span>
                        </a>
                    </li>
                    <li>
                        <a href="award.html">
                            <i class="material-icons">plus_one</i>
                            <span>获奖成就</span>
                        </a>
                    </li>
                    <li>
                        <a href="contact.html">
                            <i class="material-icons">comment</i>
                            <span>留言信息</span>
                        </a>
                    </li>
                    <li>
                        <a href="website.html">
                            <i class="material-icons">language</i>
                            <span>网站信息</span>
                        </a>
                    </li>
                </ul>
            </div>
            <!-- #Menu -->
        </aside>
        <!-- #END# Left Sidebar -->
    </section>

    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>教育信息</h2>
                        </div>
                        <div class="body table-responsive">
                            <div class="menus">
                                <div class="buttons">
                                    <button type="button" class="btn bg-blue waves-effect btn-sm"
                                            onclick="add()">
                                        <i class="material-icons">add</i>
                                        <span>添加</span>
                                    </button>
                                    <button type="button"
                                            class="btn bg-pink waves-effect btn-sm removeAll disabled"
                                            disabled
                                            onclick="removeAll()">
                                        <i class="material-icons">delete</i>
                                        <span>删除选中</span>
                                    </button>
                                </div>
                            </div>

                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>
                                        <div class="switch">
                                            <label><input type="checkbox"><span class="lever switch-col-blue"></span></label>
                                        </div>
                                    </th>
                                    <th>名称</th>
                                    <th>开始</th>
                                    <th>结束</th>
                                    <th>类型</th>
                                    <th>简介</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                    <form id="remove-form" action="${ctx}/education/remove" method="post">
                                        <c:forEach items="${educations}" var="education">
                                        <tr>
                                            <td>
                                                <div class="switch">
                                                    <label><input type="checkbox" name="id" value="${education.id}"><span class="lever switch-col-blue"></span></label>
                                                </div>
                                            </td>
                                            <td>${education.name}</td>
                                            <td><fmt:formatDate pattern="yyyy/MM/dd" value="${education.beginDay}"/></td>
                                            <td><fmt:formatDate pattern="yyyy/MM/dd" value="${education.endDay}"/></td>
                                            <td>${education.getTypeString()}</td>
                                            <td>${education.intro}</td>
                                            <td>
                                                <button type="button" class="btn bg-blue waves-effect btn-xs"
                                                        onclick="edit(${education})">
                                                    <i class="material-icons">edit</i>
                                                    <span>编辑</span>
                                                </button>
                                                <button type="button" class="btn bg-pink waves-effect btn-xs"
                                                        onclick="remove('${education.id}', '${education.name}')">
                                                    <i class="material-icons">delete</i>
                                                    <span>删除</span>
                                                </button>
                                            </td>
                                        </tr>
                                        </c:forEach>
                                    </form>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!--  add-form-box  -->
    <div class="modal fade" id="add-form-box" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">添加教育</h4>
                </div>
                <div class="modal-body">
                    <form class="form-validation" method="post" action="${ctx}/education/save">
                        <div class="row">
                            <div class="col-lg-2 col-md-2 col-sm-3 col-xs-3 form-control-label">
                                <label for="name">名称</label>
                            </div>
                            <div class="col-lg-10 col-md-10 col-sm-9 col-xs-9">
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="text" id="name" name="name" maxlength="20" class="form-control"
                                               placeholder="名称"
                                               required>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-2 col-md-2 col-sm-3 col-xs-3 form-control-label">
                                <label>类型</label>
                            </div>
                            <div class="col-lg-10 col-md-10 col-sm-9 col-xs-9">
                                <div class="form-group">
                                    <select name="type">
                                        <option value="1">小学</option>
                                        <option value="2">初中</option>
                                        <option value="3">高中</option>
                                        <option value="4">中专</option>
                                        <option value="5">大专</option>
                                        <option value="6" selected>本科</option>
                                        <option value="7">硕士</option>
                                        <option value="8">博士</option>
                                        <option value="0">其它</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-2 col-md-2 col-sm-3 col-xs-3 form-control-label">
                                <label for="beginDay">入学</label>
                            </div>
                            <div class="col-lg-10 col-md-10 col-sm-9 col-xs-9">
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="date" id="beginDay" name="beginDay" class="form-control"
                                               required>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-2 col-md-2 col-sm-3 col-xs-3 form-control-label">
                                <label for="endDay">毕业</label>
                            </div>
                            <div class="col-lg-10 col-md-10 col-sm-9 col-xs-9">
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="date" id="endDay" name="endDay" class="form-control"
                                               required>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-2 col-md-2 col-sm-3 col-xs-3 form-control-label">
                                <label for="intro">简介</label>
                            </div>
                            <div class="col-lg-10 col-md-10 col-sm-9 col-xs-9">
                                <div class="form-group">
                                    <div class="form-line">
                                        <textarea name="intro" maxlength="1000" id="intro" cols="30" rows="5" class="form-control no-resize" placeholder="简介"></textarea>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-lg-offset-2 col-md-offset-2 col-sm-offset-3 col-xs-offset-3">
                                <button class="btn btn-primary waves-effect m-l-15" type="submit">保存</button>
                                <button class="btn btn-info waves-effect m-l-15" data-dismiss="modal">关闭</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script src="${ctx}/page/asset/plugin/jquery/jquery.min.js"></script>
    <script src="${ctx}/page/asset/plugin/bootstrap/bootstrap.min.js"></script>
    <script src="${ctx}/page/asset/plugin/bootstrap-fileinput/bootstrap-fileinput.js"></script>
    <script src="${ctx}/page/asset/plugin/bootstrap-notify/bootstrap-notify.min.js"></script>
    <script src="${ctx}/page/asset/plugin/node-waves/waves.js"></script>
    <script src="${ctx}/page/asset/plugin/jquery-validation/jquery.validate.js"></script>
    <script src="${ctx}/page/asset/plugin/jquery-validation/messages_zh.js"></script>
    <script src="${ctx}/page/asset/plugin/sweetalert/sweetalert.min.js"></script>

    <!-- Custom Js -->
    <script src="${ctx}/page/asset/admin/js/default.js"></script>
    <script src="${ctx}/page/asset/admin/js/main.js"></script>
    <script>
        addValidatorRules('.form-validation')

        const $addFormBox = $('#add-form-box')
        const $addForm = $addFormBox.find('form')

        function add() {
            $addFormBox.modal()
            $addForm[0].reset()
        }

        function edit(education) {
            add()

            $addForm.find('[name=name]').val(education.name)
            $addForm.find('[name=beginDay]').val(education.beginDay)
            $addForm.find('[name=endDay]').val(education.endDay)
            $addForm.find('[name=type]').val(education.type)
            $addForm.find('[name=intro]').val(education.intro)
        }

        function remove(id, name) {
            swal({
                title: "你确定？",
                text: '你确定要删除【' + name + '】？',
                icon: 'warning',
                dangerMode: true,
                buttons: {
                    cancel: '取消',
                    confirm: '确定'
                }
            }).then(willDelete => {
                if (!willDelete) return
                location.href = '${ctx}/education/remove?id=' + id;
                swal({
                    title: '删除成功',
                    text: '【' + name + '】已经被删除！',
                    icon: 'success',
                    timer: 1500,
                    buttons: false
                })
            })
        }

        function removeAll() {
            swal({
                title: "你确定？",
                text: "你确定要删除所有选中的记录？",
                icon: "warning",
                dangerMode: true,
                buttons: {
                    cancel: "取消",
                    confirm: "确定"
                }
            }).then(willDelete => {
                if (!willDelete) return
                // 拿到表单，发送请求
                $('#remove-form').submit()
                // swal({
                //     title: "删除成功",
                //     text: "被选中的记录已经被删除！",
                //     icon: "success",
                //     timer: 1500,
                //     buttons: false
                // })
            })
        }

        const $set = $(".table tbody tr input[type=checkbox]")
        const $removeAll = $('.table-responsive .removeAll')
        $('.table thead th input[type=checkbox]').change(function () {
            let checked = $(this).is(":checked")
            if (checked) {
                $set.each(function () {
                    $(this).prop("checked", true)
                    $(this).parents('tr').addClass("active")
                })
                $removeAll.removeClass('disabled')
                $removeAll.prop('disabled', false)
            } else {
                $set.each(function () {
                    $(this).prop("checked", false)
                    $(this).parents('tr').removeClass("active")
                })
                $removeAll.addClass('disabled')
                $removeAll.prop('disabled', true)
            }
        })

        $set.change(function () {
            $(this).parents('tr').toggleClass("active")
            if ($('.table tbody tr input[type=checkbox]:checked').length > 0) {
                $removeAll.removeClass('disabled')
                $removeAll.prop('disabled', false)
            } else {
                $removeAll.addClass('disabled')
                $removeAll.prop('disabled', true)
            }
        })
    </script>
</body>

</html>
