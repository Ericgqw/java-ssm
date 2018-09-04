<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String path= request.getContextPath();
 request.setAttribute("path", path);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KOIDE</title>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <meta name="description" content="">
    <meta name="author" content="">

    <title>KOIDE</title>
    <link href="../../${path}/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../../${path}/css/iconfont/iconfont.css" rel="stylesheet">
    <link href="../../${path}/css/bootstrap-select.css" rel="stylesheet">
    <link href="../../${path}/css/metroStyle/metroStyle.css" rel="stylesheet">
    <link href="../../${path}/css/green.css" rel="stylesheet">
    <link href="../../${path}/css/webuploader.css" rel="stylesheet">
    <link href="../../${path}/css/simplebar.css" rel="stylesheet">
    <link href="../../${path}/css/style.css" rel="stylesheet">
    <!-------------------js----------------------->
    <script src="../../${path}/js/jquery-1.11.3.min.js"></script>
    <script src="../../${path}/js/bootstrap.min.js"></script>
    <script src="../../${path}/js/simplebar.js"></script>
    <script src="../../${path}/js/jquery.bootpag.min.js"></script>
    <script src="../../${path}/js/bootstrap-select.min.js"></script>
    <script src="../../${path}/js/bootstrap3-validation.js"></script>
    <script src="../../${path}/js/jquery.ztree.all-3.5.min.js"></script>
    <script src="../../${path}/js/icheck.min.js"></script>
    <script src="../../${path}/js/layer/layer.js"></script>
    <script src="../../${path}/js/dms.js"></script>

    <script src="../../${path}/js/summernote.min.js"></script>
    <script src="../../${path}/js/load-image.all.min.js"></script>
    <script src="../../${path}/js/ajaxfileupload.js"></script>
    <script src="../../${path}/js/form/printer.js"></script>
    <script src="../../${path}/js/form/form.js"></script>
    <script src="../../${path}/js/form/form-data.js"></script>
    <script src="../../${path}/js/webuploader.min.js"></script>

    <script src="../../${path}/js/swfobject.js"></script>
    <script src="../../${path}/js/svg.js"></script>
    <script src="../../${path}/js/echarts.min.js"></script>
    <script src="../../${path}/js/customed.js"></script>
    <script src="../../${path}/js/china.js"></script>
    <script src="../../${path}/js/chart.adaptor.js"></script>
    <script src="../../${path}/js/report/js/report.js"></script>
    <script src="../../${path}/js/report/js/reportList.js"></script>
    <script src="../../${path}/js/report/js/jquery.treetable.js"></script>
    <!------------------------------------------>
    <script src="../../${path}/js/bootstrap-closable-tab.js"></script>
    <script src="../../${path}/js/html5shiv.min.js"></script>
    <script src="../../${path}/js/respond.min.js"></script>
    <style>
        .nav-my-tab {
            padding-left: 0px;
            margin-bottom: 0px;
        }

        .nav-my-tab .middletab {
            float: left;
            height: 26px;
            overflow: hidden;
            position: relative;
        }

        .nav-my-tab li {
            list-style-type: none;
        }

        .nav-my-tab li a {
            padding: 5px 8px;
        }

        .nav-my-tab .leftArrow {
            float: left;
            background: #fff;
            padding-top: 1px;
            height: 24px;
        }

        .nav-my-tab .leftArrow a {
            border-left-width: 0px;
            color: #999;
            padding-top: 6px;
            padding-bottom: 2px;
        }

        .nav-my-tab .leftArrow a:hover, .nav-my-tab .leftArrow a:focus {
            text-decoration: none;
            background: #ddd;
        }

        .nav-my-tab .rightArrow {
            float: right;
            position: relative;
            background: #fff;
            height: 24px;
        }

        .nav-my-tab .rightArrow a {
            width: 32px;
            color: #999;
            padding-top: 6px;
            padding-bottom: 3px;
            padding-left: 13px;
        }

        .nav-my-tab .rightArrow a:hover, .nav-my-tab .rightArrow a:focus {
            text-decoration: none;
            background: #ddd;
        }

        .middletab {
            display: block;
            white-space: nowrap;
        }

        .nav-tabss {
            position: relative;
        }

        .nav-tabss li {
            display: inline-block;
        }

        .nav-tabss > li.active > a, .nav-tabss > li.active > a:focus, .nav-tabss > li.active > a:hover {
            color: #555;
            cursor: default;
            background-color: #fff;
            border: 1px solid #ddd;
            border-bottom-color: transparent;
        }

        .nav-tabss > li > a {
            margin-right: 2px;
            line-height: 1.42857143;
            border: 1px solid transparent;
            border-radius: 3px 3px 0 0;
        }

        .nav-tabss > li > a:hover {
            color: #56b0f5;
        }
    </style>
</head>
<body>
<div class="main">
    <div class="header-top navbar fixed-top">
        <div class="navbar-header" style="padding-left:12px;">
            <a class="navbar-brand" href="javascript:void(0);">
                AnyReport
            </a>
        </div>

        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li>
                    <a href="javascript:void(0);" class="sidebar-toggle" id="toggle-btn">
                        <i class="icon iconfont icon-bars1 icon-size-18"></i>
                    </a>
                </li>

                <li class="dropdown">
                    <a href="javascript:void(0)" onclick="addTab(167, '待办流程', '/dmp/doc/wait_processDoc.htm')"
                       class="sidebar-toggle">
                        <i class="icon iconfont icon-tasks icon-size-16"></i>
                        <span class="badge badge-danger taskcount">1</span>
                    </a>
                </li>

            </ul>

            <ul class="nav navbar-nav navbar-right" style="margin-right:0px;">
                <li class="dropdown">
                    <a href="javascript:void(0)" class="sidebar-toggle" title="全屏">
                        <span class="full-screen-btn"><i class="icon iconfont icon-quanping1"></i></span>
                    </a>
                </li>
                <li class="user-profile dropdown">
                    <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="../../${path}/css/image/user.png" class="hidden-sm">

                        <div class="user-admin">demo&nbsp;<i class="icon iconfont icon-down2 icon-size-12"></i></div>
                    </a>
                    <ul class="dropdown-menu dropdown-animated pop-effect" role="menu">
                        <li><a href="javascript:void(0)" onclick="addTab('用户设置', '用户设置', '/dmp/system/profile.htm')"><i
                                class="icon iconfont icon-shijianguanli icon-size-12"></i> 设置</a></li>
                        <li><a href="/dmp/index/logout.htm"><i class="icon iconfont icon-logout icon-size-12"></i>
                            退出</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>

    <div id="treeDiv" style="display:none;">
        <ul id="tree" class="ztree" style="margin-top:0; width:500px;height:315px"></ul>
    </div>
    <!-- printer setting -->
    <div id="printer-setting" style="margin-top:20px;display:none;">
        <table align="center" class="printer-st">
            <tr>
                <td width="60" colspan="1" rowspan="2" valign="top" style="padding-top:6px;">页数</td>
                <td><input type="radio" name="pageSelect" value="0" colspan="2"/>&nbsp;全部</td>
            </tr>
            <tr>
                <td colspan="2"><input type="radio" name="pageSelect" value="2"/>&nbsp;指定页</td>
                <td><input type="text" id="printStart" name="printStart" style="width: 80px;" value="1"
                           class="form-control"/>&nbsp;到&nbsp;<input type="text" id="printEnd" name="printEnd"
                                                                     style="width: 80px;" value="1"
                                                                     class="form-control"/></td>
            </tr>
            <tr>
                <td width="60" colspan="1">缩放</td>
                <td colspan="2" style="vertical-align: middle;"><input type="checkbox" id="scaleEnable"
                                                                       name="scaleEnable" value="1"/>&nbsp;&nbsp;适合页面大小
                </td>
            </tr>
        </table>
    </div>


    <div class="leftbar leftbar-fixed">
        <div class="sidenav-inner" style="overflow: hidden; width: auto; height: 100%;">
            <ul class="side-nav">

                <li id="56" mType="4">
                    <a href="javascript:void(0);" class="toggle-nav">
                        <i class="icon iconfont icon-iconmainedit icon-size-16"></i>
                        <span class="nav-text">表单数据</span>
                        <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                    </a>

                    <div class="sub-menu collapse">
                        <ul>
                            <li id="344" mType="2"><a  onclick="loadPage('差旅报销', '差旅报销', 'print')">
                                <i class="icon iconfont icon-barchart icon-size-14" style="display:none;"></i>&nbsp;差旅报销</a>
                            </li>
                            <li id="295" mType="2"><a  onclick="loadPage('差旅报销列表', '差旅报销列表', 'select.html')">
                                <i class="icon iconfont icon-barchart icon-size-14" style="display:none;"></i>&nbsp;差旅报销列表</a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li id="359" mType="3"><a href="javascript:void(0);" class="toggle-nav">
                    <i class="icon iconfont icon-barchart icon-size-16"></i>
                    <span class="nav-text">报表统计</span>
                    <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                </a>

                    <div class="sub-menu collapse">
                        <ul>
                            <li id="360" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>基本报表</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="363" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('物资信息分页表', '物资信息分页表', '../../kms/test.jsp')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;物资信息分页表</a></li>
                                        <li id="364" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('订单信息主子表', '订单信息主子表', '/52.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;订单信息主子表</a></li>
                                        <li id="365" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('订单信息自由表', '订单信息自由表', '/57.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;订单信息自由表</a></li>
                                        <li id="366" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('库存盘点汇总表', '库存盘点汇总表', '/59.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;库存盘点汇总表</a></li>
                                        <li id="367" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('交叉汇总报表', '交叉汇总报表', '/60.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;交叉汇总报表</a></li>
                                        <li id="368" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('工资条', '工资条', '/136.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;工资条</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="361" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>分组报表</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="440" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('商品额汇总', '商品额汇总', '/354.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;商品额汇总</a></li>
                                        <li id="369" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('单元分组', '单元分组', '/139.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;单元分组</a></li>
                                        <li id="370" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('销售分组表', '销售分组表', '/137.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;销售分组表</a></li>
                                        <li id="371" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('多重分组汇总报表', '多重分组汇总报表', '/122.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;多重分组汇总报表</a></li>
                                        <li id="372" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('条件分组', '条件分组', '/138.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;条件分组</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="362" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>交叉报表</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="373" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('多层汇总交叉表', '多层汇总交叉表', '/141.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;多层汇总交叉表</a></li>
                                        <li id="374" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('销售交叉表', '销售交叉表', '/140.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;销售交叉表</a></li>
                                        <li id="375" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('交叉表客户数', '交叉表客户数', '/50.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;交叉表客户数</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="376" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>分栏报表</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="377" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('纵向分栏', '纵向分栏', '/145.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;纵向分栏</a></li>
                                        <li id="378" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('横向分栏', '横向分栏', '/144.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;横向分栏</a></li>
                                        <li id="379" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('卡片分栏', '卡片分栏', '/146.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;卡片分栏</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="380" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>条件格式</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="381" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('差异图', '差异图', '/152.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;差异图</a></li>
                                        <li id="382" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('数据条', '数据条', '/150.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;数据条</a></li>
                                        <li id="383" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('辅料安全库存预警', '辅料安全库存预警', '/48.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;辅料安全库存预警</a></li>
                                        <li id="384" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('条件图标', '条件图标', '/46.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;条件图标</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="385" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>条形码</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="386" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('条形码', '条形码', '/147.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;条形码</a></li>
                                        <li id="387" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('商品条形码', '商品条形码', '/148.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;商品条形码</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="388" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>交互式报表</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="390" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('数据钻取', '数据钻取', '/155.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;数据钻取</a></li>
                                        <li id="391" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('图表联动', '图表联动', '/65.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;图表联动</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="392" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>动态报表</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="393" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('列排序', '列排序', '/154.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;列排序</a></li>
                                        <li id="394" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('选择列显示', '选择列显示', '/153.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;选择列显示</a></li>
                                        <li id="395" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('树形结构表', '树形结构表', '/131.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;树形结构表</a></li>
                                        <li id="418" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('交叉表折叠', '交叉表折叠', '/178.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;交叉表折叠</a></li>
                                        <li id="425" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('动态列显示-树形', '动态列显示-树形', '/276.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;动态列显示-树形</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="396" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>行列冻结</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="397" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('表头冻结', '表头冻结', '/143.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;表头冻结</a></li>
                                        <li id="398" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('行列冻结', '行列冻结', '/142.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;行列冻结</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="399" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>比例</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="400" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('半年环比', '半年环比', '/158.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;半年环比</a></li>
                                        <li id="401" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('季度环比', '季度环比', '/157.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;季度环比</a></li>
                                        <li id="402" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('同比环比', '同比环比', '/151.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;同比环比</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="403" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>多源报表</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="467" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('横向多源分片', '横向多源分片', '/452.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;横向多源分片</a></li>
                                        <li id="468" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('纵向多源分片', '纵向多源分片', '/449.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;纵向多源分片</a></li>
                                        <li id="404" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('多源商品销售明细账', '多源商品销售明细账', '/49.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;多源商品销售明细账</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="489" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>打印</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="490" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('收据套打', '收据套打', '/545.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;收据套打</a></li>
                                        <li id="491" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('横向打印', '横向打印', '/546.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;横向打印</a></li>
                                        <li id="492" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('分页显示表头', '分页显示表头', '/547.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;分页显示表头</a></li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
                    </div>
                </li>
                <li id="222" mType="3"><a href="javascript:void(0);" class="toggle-nav">
                    <i class="icon iconfont icon-barchart icon-size-16"></i>
                    <span class="nav-text">图表统计</span>
                    <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                </a>

                    <div class="sub-menu collapse">
                        <ul>
                            <li id="480" mType="1"><a href="javascript:void(0)"
                                                      onclick="loadPage('图表示例', '图表示例', '/test/first.html')">
                                <i class="icon iconfont icon-iconmainedit icon-size-14" style="display:none;"></i>&nbsp;图表示例</a>
                            </li>

                        </ul>
                    </div>
                </li>

                <li id="405" mType="3"><a href="javascript:void(0);" class="toggle-nav">
                    <i class="icon iconfont icon-barchart icon-size-16"></i>
                    <span class="nav-text">数据分析</span>
                    <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                </a>

                    <div class="sub-menu collapse">
                        <ul>
                            <li id="485" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>大屏展示</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="493" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('家电市场冰箱销售监控', '家电市场冰箱销售监控', '/359.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;家电市场冰箱销售监控</a></li>
                                        <li id="494" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('订单监控分析', '订单监控分析', '/535.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;订单监控分析</a></li>
                                        <li id="495" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('软件企业情况分析', '软件企业情况分析', '/361.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;软件企业情况分析</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="486" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>数据看板</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="498" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('生产监控看板', '生产监控看板', 'kanban')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;生产监控看板</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="487" mType="3"><a href="javascript:void(0)" class="toggle-nav">
                                <i class="icon iconfont icon-barchart icon-size-16" style="display:none;"></i>
                                <span>驾驶舱</span>
                                <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                            </a>

                                <div class="sub-menu collapse">
                                    <ul>
                                        <li id="496" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('医疗驾驶舱', '医疗驾驶舱', '/538.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;医疗驾驶舱</a></li>
                                        <li id="497" mType="1"><a href="javascript:void(0)"
                                                                  onclick="loadPage('销售驾驶舱', '销售驾驶舱', '/543.rpt')">
                                            <i class="icon iconfont icon-iconmainedit icon-size-14"
                                               style="display:none;"></i>&nbsp;销售驾驶舱</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li id="408" mType="1"><a href="javascript:void(0)"
                                                      onclick="loadPage('KPI分析报告', 'KPI分析报告', '/162.rpt')">
                                <i class="icon iconfont icon-iconmainedit icon-size-14" style="display:none;"></i>&nbsp;KPI分析报告</a>
                            </li>
                            <li id="406" mType="1"><a href="javascript:void(0)"
                                                      onclick="loadPage('销售情况报表', '销售情况报表', 'sale.html')">
                                <i class="icon iconfont icon-iconmainedit icon-size-14" style="display:none;"></i>&nbsp;销售情况报表</a>
                            </li>
                            <li id="407" mType="1"><a href="javascript:void(0)"
                                                      onclick="loadPage('经营分析', '经营分析', '/159.rpt')">
                                <i class="icon iconfont icon-iconmainedit icon-size-14" style="display:none;"></i>&nbsp;经营分析</a>
                            </li>
                            <li id="409" mType="1"><a href="javascript:void(0)"
                                                      onclick="loadPage('全年产品销售分析', '全年产品销售分析', '/55.rpt')">
                                <i class="icon iconfont icon-iconmainedit icon-size-14" style="display:none;"></i>&nbsp;全年产品销售分析</a>
                            </li>
                            <li id="437" mType="1"><a href="javascript:void(0)"
                                                      onclick="loadPage('全国公司盈利分析', '全国公司盈利分析', '/355.rpt')">
                                <i class="icon iconfont icon-iconmainedit icon-size-14" style="display:none;"></i>&nbsp;全国公司盈利分析</a>
                            </li>
                        </ul>
                    </div>
                </li>


                <li mtype="3" id="164">
                    <a href="javascript:void(0);" class="toggle-nav">
                        <i class="icon iconfont icon-workflow icon-size-16"></i>
                        <span class="nav-text">流程管理</span>

                        <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                    </a>

                    <div class="sub-menu collapse ">
                        <ul>

                            <li id="59"><a href="/dmp/wf/define_wf.htm" target="_blank"><i
                                    class="icon iconfont icon-workflow icon-size-14"></i>&nbsp;流程定义</a></li>


                            <li id="165"><a href="javascript:void(0)"
                                            onclick="goPage(165, '流程列表', '/dmp/wf/index.htm')"><i
                                    class="icon iconfont icon-workflow icon-size-14"></i>&nbsp;流程列表</a></li>


                            <li id="166"><a href="javascript:void(0)"
                                            onclick="goPage(166, '我的申请', '/dmp/doc/my_processDoc.htm')"><i
                                    class="icon iconfont icon-file icon-size-14"></i>&nbsp;我的申请</a></li>


                            <li id="167"><a href="javascript:void(0)"
                                            onclick="goPage(167, '我的待办工作', '/dmp/doc/wait_processDoc.htm')"><i
                                    class="icon iconfont icon-file icon-size-14"></i>&nbsp;我的待办工作</a></li>


                            <li id="168"><a href="javascript:void(0)"
                                            onclick="goPage(168, '我的已办工作', '/dmp/doc/finish_processDoc.htm')"><i
                                    class="icon iconfont icon-file icon-size-14"></i>&nbsp;我的已办工作</a></li>


                            <li id="169"><a href="javascript:void(0)"
                                            onclick="goPage(169, '流程监控', '/dmp/doc/monitor_processDoc.htm')"><i
                                    class="icon iconfont icon-workflow icon-size-14"></i>&nbsp;流程监控</a></li>


                            <li id="170"><a href="javascript:void(0)"
                                            onclick="goPage(170, '工作查询', '/dmp/doc/query_processDoc.htm')"><i
                                    class="icon iconfont icon-search icon-size-14"></i>&nbsp;工作查询</a></li>


                            <li id="171"><a href="javascript:void(0)"
                                            onclick="goPage(171, '流程操作日志', '/dmp/doc/log_processDoc.htm')"><i
                                    class="icon iconfont icon-history icon-size-14"></i>&nbsp;流程操作日志</a></li>

                        </ul>
                    </div>
                </li>


                <li id="197" mtype="3">
                    <a href="javascript:void(0)" class="toggle-nav">
                        <i class="icon iconfont icon-shijianguanli icon-size-14"></i>
                        <span class="nav-text">平台设计</span>

                        <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                    </a>

                    <div class="sub-menu collapse ">
                        <ul>

                            <li id="54"><a href="desReport.html" target="_blank"><i
                                    class="icon iconfont icon-pie icon-size-12"></i>&nbsp;报表设计</a></li>


                            <li id="10"><a href="/dmp/rptMgr/def/index.htm" target="_blank"><i
                                    class="icon iconfont icon-pie icon-size-12"></i>&nbsp;报表作品</a></li>


                            <li id="193"><a href="/dmp/rptMgr/app/index.htm" target="_blank"><i
                                    class="icon iconfont icon-pie icon-size-12"></i>&nbsp;移动端报表设计</a></li>


                            <li id="122"><a href="/dmp/formMgr/def/add_form.htm" target="_blank"><i
                                    class="icon iconfont icon-file icon-size-14"></i>&nbsp;表单设计</a></li>


                            <li id="426"><a href="/dmp/formMgr/def/index.htm" target="_blank"><i
                                    class="icon iconfont icon-file icon-size-14"></i>&nbsp;表单作品</a></li>


                            <li id="198"><a href="/dmp/formMgr/app/index.htm" target="_blank"><i
                                    class="icon iconfont icon-file icon-size-14"></i>&nbsp;移动端表单设计</a></li>


                            <li id="161"><a href="javascript:void(0)"
                                            onclick="goPage(161, '报表表单菜单', '/dmp/system/menu.htm')"><i
                                    class="icon iconfont icon-bars1 icon-size-12"></i>&nbsp;报表表单菜单</a></li>


                            <li id="194"><a href="javascript:void(0)"
                                            onclick="goPage(194, '移动端报表菜单', '/dmp/system/app/menu.htm')"><i
                                    class="icon iconfont icon-bars1 icon-size-12"></i>&nbsp;移动端报表菜单</a></li>


                            <li id="262"><a href="javascript:void(0)"
                                            onclick="goPage(262, '报表备份管理', '/dmp/rptMgr/bak/index.htm')"><i
                                    class="icon iconfont icon-beifenguanli icon-size-12"></i>&nbsp;报表备份管理</a></li>


                            <li id="263"><a href="javascript:void(0)"
                                            onclick="goPage(263, '表单备份管理','/dmp/formMgr/bak/index.htm')"><i
                                    class="icon iconfont icon-beifenguanli icon-size-12"></i>&nbsp;表单备份管理</a></li>

                        </ul>
                    </div>
                </li>


                <li id="9" mtype="3">
                    <a href="javascript:void(0)" class="toggle-nav">
                        <i class="icon iconfont icon-shijianguanli icon-size-14"></i>
                        <span class="nav-text">系统管理</span>

                        <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                    </a>

                    <div class="sub-menu collapse ">
                        <ul>

                            <li id="51"><a href="javascript:void(0)"
                                           onclick="goPage(51, '角色管理', '/dmp/system/role.htm')"><i
                                    class="icon iconfont icon-jiaoseguanli icon-size-14"></i>&nbsp;角色管理</a></li>


                            <li id="49"><a href="javascript:void(0)"
                                           onclick="goPage(49, '组织管理', '/dmp/system/org.htm')"><i
                                    class="icon iconfont icon-jiaoseguanli icon-size-14"></i>&nbsp;组织管理</a></li>


                            <li id="50"><a href="javascript:void(0)"
                                           onclick="goPage(50, '用户管理', '/dmp/system/user.htm')"><i
                                    class="icon iconfont icon-user icon-size-12"></i>&nbsp;用户管理</a></li>


                            <li id="162"><a href="javascript:void(0)"
                                            onclick="goPage(162, '角色权限管理', '/dmp/acl/roleAcl.htm')"><i
                                    class="icon iconfont icon-webicon208 icon-size-14"></i>角色权限管理</a></li>


                            <li id="163"><a href="javascript:void(0)"
                                            onclick="goPage(163, '用户权限管理', '/dmp/acl/userAcl.htm')"><i
                                    class="icon iconfont icon-webicon208 icon-size-14"></i>用户权限管理</a></li>


                            <li id="55"><a href="javascript:void(0)"
                                           onclick="goPage(55, '模块管理', '/dmp/system/module.htm')"><i
                                    class="icon iconfont icon-viewmodule icon-size-14"></i>&nbsp;模块管理</a></li>


                            <li id="135"><a href="javascript:void(0)"
                                            onclick="goPage(135, '平台属性', '/dmp/system/sys_attr.htm')"><i
                                    class="icon iconfont icon-shijianguanli icon-size-12"></i>&nbsp;平台属性</a></li>


                            <li id="11"><a href="javascript:void(0)"
                                           onclick="goPage(11, '控制台', '/dmp/system/golog.htm')"><i
                                    class="icon iconfont icon-shijianguanli icon-size-12"></i>&nbsp;控制台</a></li>


                            <li id="140"><a href="javascript:void(0)"
                                            onclick="goPage(140, '监控信息', '/dmp/system/running.htm')"><i
                                    class="icon iconfont icon-jiankong icon-size-14"></i>&nbsp;监控信息</a></li>


                            <li id="121"><a href="javascript:void(0)"
                                            onclick="goPage(121, '监控信息', '/dmp/lic/index.htm')"><i
                                    class="icon iconfont icon-registered icon-size-14"></i>&nbsp;注册信息</a></li>


                            <li id="264"><a href="javascript:void(0)"
                                            onclick="goPage(264, '系统升级', '/dmp/system/updating/index.htm')"><i
                                    class="icon iconfont icon-wrench icon-size-14"></i>&nbsp;系统升级</a></li>

                        </ul>
                    </div>
                </li>


                <li id="136" mtype="3">
                    <a href="javascript:void(0)" class="toggle-nav">
                        <i class="icon iconfont icon-clock icon-size-14"></i>
                        <span class="nav-text">发送管理</span>

                        <span class="pull-right icon iconfont icon-1201youjiantou icon-size-12"></span>
                    </a>

                    <div class="sub-menu collapse ">
                        <ul>

                            <li id="137"><a href="javascript:void(0)"
                                            onclick="goPage(137,'调度服务配置','/dmp/disp/disp_service.htm')"><i
                                    class="icon iconfont icon-shijianguanli icon-size-14"></i>&nbsp;调度服务配置</a></li>


                            <li id="138"><a href="javascript:void(0)"
                                            onclick="goPage(138,'推送服务配置','/dmp/disp/send_service.htm')"><i
                                    class="icon iconfont icon-shijianguanli icon-size-14"></i>&nbsp;推送服务配置</a></li>


                            <li id="139"><a href="javascript:void(0)"
                                            onclick="goPage(139,'报表推送管理','/dmp/disp/task.htm')"><i
                                    class="icon iconfont icon-pie icon-size-14"></i>&nbsp;报表推送管理</a></li>

                        </ul>
                    </div>
                </li>

            </ul>
        </div>
    </div>

    <script type="text/javascript">
        var globalJs = new GlobalJs("/dmp");
        globalJs.init();

        function loadPage(id, name, formUrl, params) {
            if (formUrl == "") {
                return false;
            }
            var formPath = formUrl;
            if (params != undefined) {
                var index = 0;
                for (var key in params) {
                    if (index == 0) {
                        formPath += "?";
                    } else {
                        formPath += "&";
                    }
                    formPath += (key + "=" + params[key]);
                    index++;
                }
            }
            goPage(id, name, formPath);
        }

        function goPage(id, name, url) {
            addTab(id, name, url);
        }

        function goPageId(id) {
            $("#" + id + ">a").click();
        }

        var SideBar = function () {
            this.bgs = ["bg-orange", "bg-green", "bg-blue", "bg-purple", "bg-night-dark"]
        }
        SideBar.prototype = {
            init: function () {
                var sideBar = this;

                new SimpleBar($(".leftbar")[0]);

                $(".toggle-nav").click(function () {
                    if (!$(".main").hasClass("leftbar-close")) {
                        sideBar.toggleNav($(this));
                    }
                })

                $("#toggle-btn").click(function () {
                    if ($(".main").hasClass("leftbar-close")) {
                        $(".main").removeClass("leftbar-close");

                        $(".side-nav>li>a").unbind("mouseenter").unbind("mouseleave");
                        $(".leftbar").unbind("mouseleave");
                    } else {
                        sideBar.slideUpAll();
                        $(".main").addClass("leftbar-close");

                        $(".side-nav>li>a").hover(function () {
                            sideBar.showMenu($(this));
                        }, function () {
                        });

                        $(".leftbar").mouseleave(function () {
                            $(".side-nav.hover").remove();
                        });
                    }
                })

            }
        }

        SideBar.prototype.findSameMenu = function (obj) {
            var arr = new Array();
            arr.push(obj);
            obj.parents(".sub-menu").each(function () {
                arr.push($(this).prev());
            });
            return arr;
        }

        SideBar.prototype.canClose = function (obj, _parents) {
            for (var i = 0; i < _parents.length; i++) {
                if (obj.is(_parents[i])) {
                    return false;
                }
            }
            return true;
        }

        SideBar.prototype.toggleNav = function (obj) {
            var sideBar = this;
            var _this = obj;
            var _parents = sideBar.findSameMenu(_this);
            if (_this.hasClass("open")) {
                _this.removeClass("open");
                _this.find("span").eq(1).removeClass("icon iconfont icon-arrowon").addClass("icon iconfont icon-1201youjiantou");
                _this.next().removeClass("in");
            } else {
                $("a.toggle-nav").each(function () {
                    if ($(this).hasClass("open") && sideBar.canClose($(this), _parents)) {
                        $(this).next().removeClass("in");
                        $(this).next().prev().removeClass("open");
                        $(this).find("span").eq(1).removeClass("icon iconfont icon-arrowon").addClass("icon iconfont icon-1201youjiantou");
                    }
                });
                _this.addClass("open");
                _this.find("span").eq(1).removeClass("icon iconfont icon-1201youjiantou").addClass("icon iconfont icon-arrowon");
                _this.next().addClass("in");
            }
        }

        SideBar.prototype.slideUpAll = function () {
            $("a.toggle-nav").each(function () {
                if ($(this).hasClass("open")) {
                    $(this).next().removeClass("in");
                    $(this).next().prev().removeClass("open");
                    $(this).find("span").eq(1).removeClass("icon iconfont icon-1201youjiantou").addClass("icon iconfont icon-arrowon");
                }
            });
        }

        SideBar.prototype.showMenu = function (obj) {
            var sideBar = this;
            $(".side-nav.hover").remove();

            var itemTop = obj.parent().position().top + $(".fixed-top").height();
            var _li = obj.parent();
            var _ul = $("<ul>").addClass("side-nav").addClass("hover");
            var _newli = _li.clone();
            var _a = _newli.children("a");
            _a.children("i").remove();
            _a.removeClass("toggle-nav");
            _a.children("span").eq(1).remove();
            _ul.append(_newli).append(obj.next().clone());
            _ul.appendTo($(".leftbar")).css({top: itemTop});
            _newli.children("div").slideToggle(100);
            _ul.find(".toggle-nav").click(function () {
                sideBar.toggleNav($(this));
            })
        }

        var _sideBar = new SideBar();
        _sideBar.init();
    </script>

    <div class="main-box">
        <div class="main-content">
            <ul class="nav-my-tab">
                <li class="leftArrow"><a href="javascript:void(0);">
                    <i class="icon iconfont icon-angledoubleleft"></i></a>
                </li>
                <li class="middletab">
                    <ul class="nav nav-tabss" role="tablist" style="left:0px;">
                    </ul>
                </li>
                <li class="rightArrow">
                    <a href="javascript:void(0);">
                        <i class="icon iconfont icon-angledoubleright"></i></a>
                </li>
            </ul>
            <div class="tab-content" style="width:100%;height:100%;"></div>
        </div>
    </div>
    <div class="footer">
        AnyReport. All rights reserved
    </div>
</div>
<script type="text/javascript">
    function addTab(id, name, url) {
        var item = {'id': id, 'name': name, 'url': url, 'closable': true};
        closableTab.addTab(item);
    }

    function refreshTab() {
        closableTab.refreshNoUrl();
    }

    function getActiveIframe() {
        var ifrDiv = $(".tab-content").children(".active");
        return ifrDiv.find("iframe")[0].contentWindow;
    }

    function taskCountReduce() {
        var taskCount = $(".taskcount").html();
        if (taskCount != undefined && taskCount != "") {
            var c = parseInt(taskCount);
            c--;
            if (c < 0) {
                c = 0;
            }
            $(".taskcount").html(c);
        }
    }

    $(function () {
        var h = $(document).height() - 40 - 24 - $(".footer").height();
        $(".main-content").height(h);
        var homeUrl = "${config['homeUrl']}";
        if (homeUrl != "") {
            //addTab('首页', '首页', "11");
        }
    });

    $(window).resize(function () {
        var h = $(document).height() - 40 - 24 - $(".footer").height();
        $(".main-content").height(h);
    });
</script>
</body>
</html>