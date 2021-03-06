<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String path= request.getContextPath();
 	request.setAttribute("path", path);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>差旅报销</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

    <link href="../../${path}/css/bootstrap.min.css" rel="stylesheet" />
    <link href="../../${path}/css/bootstrap-select.css" rel="stylesheet">
    <link href="../../${path}/css/green.css" rel="stylesheet">
    <link href="../../${path}/css/summernote.css" rel="stylesheet">
    <link href="../../${path}/css/metroStyle/metroStyle.css" rel="stylesheet">
    <link href="../../${path}/css/upload/fileinput.css" rel="stylesheet">
    <link href="../../${path}/css/iconfont/iconfont.css" rel="stylesheet">
    <link href="../../${path}/css/style.css" rel="stylesheet">
    <link href="../../${path}/css/webuploader.css" rel="stylesheet">
    
    <script src="../../${path}/js/layer/laydate/laydate.js"></script>
    <script src="../../${path}/js/jquery-1.11.3.min.js"></script>
    <script src="../../${path}/js/dms.js"></script>
    <script src="../../${path}/js/bootstrap.min.js"></script>
    <script src="../../${path}/js/bootstrap3-validation.js"></script>
    <script src="../../${path}/js/summernote.min.js"></script>
    <script src="../../${path}/js/icheck.min.js"></script>
    <script src="../../${path}/js/bootstrap-select.min.js"></script>
    <script src="../../${path}/js/jquery.ztree.all-3.5.min.js"></script>
    <script src="../../${path}/js/load-image.all.min.js"></script>
    <script src="../../${path}/js/ajaxfileupload.js"></script>
    <script src="../../${path}/js/layer/layer.js"></script>
    <script src="../../${path}/js/form/printer.js"></script>
    <script src="../../${path}/js/webuploader.min.js"></script>
    <script src="../../${path}/js/swfobject.js"></script>
	<script src="../../${path}/js/tableExport/tableExport.js"></script>
    <script src="../../${path}/js/tableExport/pdfmake/build/pdfmake.js"></script>
    <script src="../../${path}/js/tableExport/pdfmake/build/vfs_fonts.js"></script>
	<script src="../../${path}/js/tableExport/libs/js-xlsx/xlsx.core.min.js"></script>
	</head>
<body style="overflow:hidden;">
    <div class="ifrmain">
    <div class="collapse navbar-collapse page-menu">
        <ul class="nav navbar-nav">
            <li><a href="javascript:void(0);" id="icon-upload" title="上传Excel文件">
                <i class="icon iconfont icon-upload fa-lg deep-green" style="font-size:22px"></i></a></li>
            <li><a href="javascript:void(0);" id="icon-export" title="输出excel">
                <i class="icon iconfont icon-xls fa-lg deep-green" style="font-size:22px"></i></a></li>
            <li><a href="javascript:void(0);" onclick="$('#jform').tableExport({type:'pdf',
				 pdfmake:{
				  enabled:true,
				  fonts:{
					微软雅黑: {
						normal: 'msyh.ttf',
						bold: 'msyhbd.ttf',
						italics: 'msyh.ttf',
						bolditalics: 'msyhbd.ttf'
                             }
                           }
				         }
				 })" id="icon-printer" title="打印">
                <i class="icon iconfont icon-pdfzhijiedayin fa-lg deep-red" style="font-size:22px"></i></a></li>
            <li><a href="javascript:void(0);" id="icon-add" title="保存数据">
                <i class="icon iconfont icon-save1 fa-lg blue" style="font-size:22px"></i></a></li>
            <li style="width:105px;">
                <a href="javascript:void(0);" id="icon-approve1" title="提交审核">
                    <i class="icon iconfont icon-jiekuandingdantijiao5 fa-lg deep-green" style="font-size:22px">
                    </i>&nbsp;提交审核</a></li>
            <li style="width:105px;">
                <a href="/dmp/doc/my_processDoc.htm" id="icon-approve" title="我的申请">
                    <i class="icon iconfont icon-search fa-lg deep-orange" style="font-size:22px">
                    </i>&nbsp;我的申请</a></li>
            <li style="width:90px;"><a href="javascript:void(0);" id="icon-bpm-image" title="流程图">
                <i class="icon iconfont icon-workflow fa-lg blue" style="font-size:22px">
                </i>&nbsp;流程图</a></li>
            <li style="width:100px;">
                <a href="javascript:void(0);" id="form-list" title="数据列表">
                    <i class="icon iconfont icon-square fa-lg blue" style="font-size:21px">
                    </i>&nbsp;数据列表</a></li>
        </ul>
             
    </div>
    <a href="javascript:void(0)" id="excelDiv" style='height:28px;width:28px;position:absolute;top:0px;left:0px;z-index:0;overflow:hidden;'>
        <input class='addfileI' type='file' name='upload-excel-file' id='upload-excel-file'>
    </a>
     <form  action="php/exportExcel.php" id="formExportFile" method="post">
        <input type="hidden" name="formId" value="71" id="formId"/>
		<input type="hidden" name="_pdfType" value="" id="_pdfType"/>
        <input id="exportData" type="hidden" name="exportData"/>
    </form> 
    <div class="panel-box" id="contentDiv">
        <form action="" id="qryForm" name="qryForm" method="post" target="resultIframe">
            <input id="formId1" type="hidden" name="formId" value="71"/>
            <table id="jform" align="center" cellpadding="0" cellspacing="0" style="border-collapse:collapse;" ow="785">
				<colgroup>
                    <col style="width:156px;" ow="156"/>
                    <col style="width:186px;" ow="186"/>
                    <col style="width:123px;" ow="123"/>
                    <col style="width:168px;" ow="168"/>
                    <col style="width:152px;" ow="152"/>
                </colgroup>
                <thead>
                <tr><th printer="true" rn="0" cn="0" orn="0" ocn="0" rowspan="1" colspan="1" style="height:24px;text-align:center;vertical-align:middle;font-weight:bold;border-bottom:#000000 solid 1px;" pos="A1">报销单号：</th>
                    <th printer="true" rn="0" cn="1" orn="0" ocn="1" rowspan="1" colspan="1" style="height:24px;vertical-align:top;border-bottom:#000000 solid 1px;">
                        <input type="text" name="expenseNo" style="width:186px;height:24px;" seq="1" value="BX2018070056" class="inputNoBorder" readonly="readonly" /></th>
                    <th printer="true" rn="0" cn="2" orn="0" ocn="2" rowspan="1" colspan="1" style="height:24px;vertical-align:top;border-bottom:#000000 solid 1px;" pos="C1"></th>
                    <th printer="true" rn="0" cn="3" orn="0" ocn="3" rowspan="1" colspan="1" style="height:24px;vertical-align:top;border-bottom:#000000 solid 1px;" pos="D1"></th>
                    <th printer="true" rn="0" cn="4" orn="0" ocn="4" rowspan="1" colspan="1" style="height:24px;vertical-align:top;border-bottom:#000000 solid 1px;" pos="E1"></th>
                    <th printer="false" rn="0" cn="5" cn="5"></th>
                </tr>
                <tr><th printer="true" rn="1" cn="0" orn="1" ocn="0" rowspan="1" colspan="1" style="height:34px;text-align:center;vertical-align:middle;font-weight:bold;" pos="A2">报销人：</th>
                    <th printer="true" rn="1" cn="1" orn="1" ocn="1" rowspan="1" colspan="1" style="height:34px;vertical-align:middle;">
                        <input type="text" name="expensePerson" style="width:150px;height:25px;" value="demo" class="form-control" /></th>
                    <th printer="true" rn="1" cn="2" orn="1" ocn="2" rowspan="1" colspan="1" style="height:34px;text-align:center;vertical-align:middle;font-weight:bold;" pos="C2">申请报销部门：</th>
                    <th printer="true" rn="1" cn="3" orn="1" ocn="3" rowspan="1" colspan="1" style="height:34px;vertical-align:middle;">
                        <input type="text" treeId="expenseDept" style="width:150px;height:25px;" class="input-tree form-control" data='[{"id":"4","pId":"0","name":"集团总部","queryCode":"集团总部"},{"id":"10","pId":"4","name":"上海分公司","queryCode":"上海分公司"},{"id":"11","pId":"4","name":"北京分公司","queryCode":"北京分公司"},{"id":"12","pId":"4","name":"深圳分公司","queryCode":"深圳分公司"},{"id":"13","pId":"4","name":"成都分公司","queryCode":"成都分公司"},{"id":"14","pId":"4","name":"苏州分公司","queryCode":"苏州分公司"},{"id":"15","pId":"4","name":"南京分公司","queryCode":"南京分公司"},{"id":"16","pId":"10","name":"销售一部","queryCode":"销售一部"},{"id":"17","pId":"10","name":"销售二部","queryCode":"销售二部"},{"id":"18","pId":"10","name":"销售三部","queryCode":"销售三部"},{"id":"19","pId":"11","name":"销售一部","queryCode":"销售一部"},{"id":"20","pId":"11","name":"销售二部","queryCode":"销售二部"},{"id":"21","pId":"11","name":"销售三部","queryCode":"销售三部"},{"id":"22","pId":"12","name":"销售一部","queryCode":"销售一部"},{"id":"23","pId":"12","name":"销售二部","queryCode":"销售二部"},{"id":"24","pId":"12","name":"销售三部","queryCode":"销售三部"},{"id":"25","pId":"4","name":"销售总部","queryCode":"销售总部"},{"id":"26","pId":"13","name":"销售一部","queryCode":"销售一部"},{"id":"27","pId":"13","name":"销售二部","queryCode":"销售二部"},{"id":"28","pId":"13","name":"销售三部","queryCode":"销售三部"},{"id":"29","pId":"14","name":"销售一部","queryCode":"销售一部"},{"id":"30","pId":"14","name":"销售二部","queryCode":"销售二部"},{"id":"31","pId":"14","name":"销售三部","queryCode":"销售三部"},{"id":"32","pId":"15","name":"销售一部","queryCode":"销售一部"},{"id":"33","pId":"15","name":"销售二部","queryCode":"销售二部"},{"id":"34","pId":"15","name":"销售三部","queryCode":"销售三部"}]' />
         
                        <i class="icon iconfont icon-ic_tree form-icon"></i></th>
                    <th printer="true" rn="1" cn="4" orn="1" ocn="4" rowspan="1" colspan="1" style="height:34px;vertical-align:top;" pos="E2"></th>
                    <th printer="false" rn="1" cn="5" cn="5"> </th>
                </tr>
                <tr><th printer="true" rn="2" cn="0" orn="2" ocn="0" rowspan="1" colspan="1" style="height:24px;text-align:center;vertical-align:middle;font-weight:bold;border-bottom:#000000 solid 1px;" pos="A3">报销日期：</th>
                    <th printer="true" rn="2" cn="1" orn="2" ocn="1" rowspan="1" colspan="1" style="height:24px;vertical-align:top;border-bottom:#000000 solid 1px;">
                    <input type="text" name="expenseDate" data-date-format="yyyy-MM-dd" style="width:150px;height:24px;" class="form_time form-control" /></th>
                    <th printer="true" rn="2" cn="2" orn="2" ocn="2" rowspan="1" colspan="1" style="height:24px;text-align:center;vertical-align:middle;font-weight:bold;border-bottom:#000000 solid 1px;" pos="C3">所属项目：</th>
                    <th printer="true" rn="2" cn="3" orn="2" ocn="3" rowspan="1" colspan="2" style="height:24px;vertical-align:top;border-bottom:#000000 solid 1px;">
                        <input type="text" name="expensePj" style="width:250px;height:24px;" class="form-control" /></th>
                    <th printer="false" rn="2" cn="5" cn="5"> </th>
                </tr>
                </thead>
                <tbody>
                <tr><td printer="true" rn="3" cn="0" orn="3" ocn="0" rowspan="1" colspan="1" style="height:40px;text-align:center;vertical-align:middle;border:#000000 solid 1px;" pos="A4">类型</td>
                    <td printer="true" rn="3" cn="1" orn="3" ocn="1" rowspan="1" colspan="1" style="height:40px;text-align:center;vertical-align:middle;border:#000000 solid 1px;" pos="B4">日期</td>
                    <td printer="true" rn="3" cn="2" orn="3" ocn="2" rowspan="1" colspan="2" style="height:40px;text-align:center;vertical-align:middle;border:#000000 solid 1px;" pos="C4">备注</td>
                    <td printer="true" rn="3" cn="4" orn="3" ocn="4" rowspan="1" colspan="1" style="height:40px;text-align:center;vertical-align:middle;border:#000000 solid 1px;" pos="E4">金额</td>
                    <td printer="false" rn="3" cn="5" orn="0" ocn="0" rowspan="1" colspan="1" style="height:25px;vertical-align:top;">
                    <a onclick="addtr()" href="javascript:void(0)" style="margin-left:10px;">
                        <i class="icon iconfont icon-plus green icon-size-16"></i>
                    </a></td>
                </tr>	  
			  <tr id="example" class="row4">
				<td printer="true" rn="4" cn="0" orn="4" ocn="0" rowspan="1" colspan="1" style="height:27px;vertical-align:top;border:#000000 solid 1px;">
                    <select style="width:155px;height:27px" name="pjExpType" data-width="155" multi="0" class="inputNoBorder" check-type="required" required-message="请选择报销类型" data-style="btn-select">
					<option></option>
					<option value="交通费">交通费</option>
					<option value="餐饮费">餐饮费</option>
					<option value="住宿费">住宿费</option>
                    </select></td>
					<td printer="true" rn="4" cn="1" orn="4" ocn="1" rowspan="1" colspan="1" style="height:27px;vertical-align:top;border:#000000 solid 1px;">
                        <input type="text" name="pjExpDate" data-date-format="yyyy-MM-dd" style="width:185px;height:27px;" class="form_time inputNoBorder" />
					</td>
                    <td printer="true" rn="4" cn="2" orn="4" ocn="2" rowspan="1" colspan="2" style="height:27px;vertical-align:top;border:#000000 solid 1px;">
                        <input type="text" name="pjExpNote" style="width:291px;height:27px;" class="inputNoBorder" />
					</td>
                    <td printer="true" rn="4" cn="4" orn="4" ocn="4" rowspan="1" colspan="1" style="height:27px;vertical-align:top;border:#000000 solid 1px;">
                        <input type="text" name="pjExpMoney" style="width:151px;height:27px;" fxTarget="expenseTotal," class="inputNoBorder" check-type="int required" required-message="请填写报销金额" />
				    </td>
                    <td printer="false" rn="4" cn="5" orn="0" ocn="0" rowspan="1" colspan="1" style="height:25px;vertical-align:top;">
                    <a onclick="form.delRow(this)" href="javascript:void(0)" style="margin-left:10px;">
                        <i class="icon iconfont icon-del orange icon-size-16"></i>
                    </a>
					</td>
                </tr>
                <tr class="row4">
				<td printer="true" rn="5" cn="0" orn="4" ocn="0" rowspan="1" colspan="1" style="height:27px;vertical-align:top;border:#000000 solid 1px;">
                    <select style="width:155px;height:27px" name="pjExpType" data-width="155" multi="0" class="inputNoBorder" check-type="required" required-message="请选择报销类型" data-style="btn-select">
                        <option></option>
						<option value="交通费">交通费</option>
                        <option value="餐饮费">餐饮费</option>
                        <option value="住宿费">住宿费</option>
                    </select>
				</td>
				<td printer="true" rn="5" cn="1" orn="4" ocn="1" rowspan="1" colspan="1" style="height:27px;vertical-align:top;border:#000000 solid 1px;">
                    <input type="text" name="pjExpDate" data-date-format="yyyy-MM-dd" style="width:185px;height:27px;" class="form_time inputNoBorder" />
				</td>
                    <td printer="true" rn="5" cn="2" orn="4" ocn="2" rowspan="1" colspan="2" style="height:27px;vertical-align:top;border:#000000 solid 1px;">
                        <input type="text" name="pjExpNote" style="width:291px;height:27px;" class="inputNoBorder" />
					</td>
                    <td printer="true" rn="5" cn="4" orn="4" ocn="4" rowspan="1" colspan="1" style="height:27px;vertical-align:top;border:#000000 solid 1px;">
                        <input type="text" name="pjExpMoney" style="width:151px;height:27px;" fxTarget="expenseTotal," class="inputNoBorder" check-type="int required" required-message="请填写报销金额" />
					</td>
                    <td printer="false" rn="5" cn="5" orn="0" ocn="0" rowspan="1" colspan="1" style="height:25px;vertical-align:top;">
                    <a onclick="form.delRow(this)" href="javascript:void(0)" style="margin-left:10px;">
                        <i class="icon iconfont icon-del orange icon-size-16"></i>
                    </a>
				   </td>
                </tr>
                <tr id="position"><td printer="true" rn="6" cn="0" orn="5" ocn="0" rowspan="1" colspan="1" style="height:33px;vertical-align:middle;" pos="A6">报销金额</td>
                    <td printer="true" rn="6" cn="1" orn="5" ocn="1" rowspan="1" colspan="1" style="height:33px;vertical-align:middle;">
                        <input type="text" name="expenseBigMoney" style="width:150px;height:25px;" class="form-control" /></td>
                    <td printer="true" rn="6" cn="2" orn="5" ocn="2" rowspan="1" colspan="1" style="height:33px;vertical-align:top;" pos="C6"></td>
                    <td printer="true" rn="6" cn="3" orn="5" ocn="3" rowspan="1" colspan="1" style="height:33px;vertical-align:middle;" pos="D6">总金额</td>
                    <td printer="true" rn="6" cn="4" orn="5" ocn="4" rowspan="1" colspan="1" style="height:33px;vertical-align:middle;">
                        <input type="text" name="expenseTotal" style="width:150px;height:25px;" fx="pjExpMoney" value="" class="form-control" /></td>
                        <td printer="false" rn="6" cn="5" cn="5"> </td>
                </tr>
                </tbody>
            </table>

        </form>
    </div>

    <div id="treeDiv" style="display:none;">
        <ul id="tree" class="ztree" style="margin-top:0; width:500px;height:315px;"></ul>
    </div>
    <div id="submitValidate" style="display:none;">

    </div>
    <div id="printerPage" style="display: none;">
    </div>
</div>
<iframe id="resultIfr" name="resultIframe" style="display:none;height:0;" frameborder="0"></iframe>

<script src="../../${path}/js/anyrt.js"></script>
<script type="text/javascript" src="../../${path}/js/form/form.js"></script>
<script type="text/javascript">
    var form = new Form("/dmp");
    form.pdId = "43";
    form.listName = "差旅报销列表";
    form.init();

    window.anyrt = new AnyRt("/dmp");
    anyrt.view = "add";

    function closeWin(pkValues) {
        $.ajax({
            type: "POST",
            url: "/dmp/form/querySuccessForm.htm",
            data:{formId:$("#formId").val(), dataId:pkValues},
            dataType: "html",
            success:function(result){
                layer.close(form.loadIndex);
                $(".ifrmain").empty().html(result);
                var contentH = $(document).height() - $(".page-menu").height() - 110;
                $("#contentDiv").height(contentH);
            },
            error:function(e) {
                layer.close(form.loadIndex);
                layer.alert('数据查询出现错误!', {icon: 2});
            }
        });
    }
    function closeLoad() {
        layer.close(form.loadIndex);
    }
	    //创建Document-definition对象 
     function addtr(){
	   var addtr=$("<tr class='row4'>"+
				"<td printer='true' rn='5' cn='0' orn='4' ocn='0' rowspan='1' colspan='1' style='height:27px;vertical-align:top;border:#000000 solid 1px;'>"+
                    "<select style='width:155px;height:27px' name='pjExpType' data-width='155' multi='0' class='inputNoBorder' check-type='required' required-message='请选择报销类型' data-style='btn-select'>"+
                        "<option></option>"+
						"<option value='交通费'>交通费</option>"+
                        "<option value='餐饮费'>餐饮费</option>"+
                        "<option value='住宿费'>住宿费</option>"+
                    "</select>"+
				"</td>"+
				"<td  printer='true' rn='5' cn='1' orn='4' ocn='1' rowspan='1' colspan='1' style='height:27px;vertical-align:top;border:#000000 solid 1px;'>"+
                    "<input class='date' type='text' name='pjExpDate' data-date-format='yyyy-MM-dd' style='width:185px;height:27px;'class='form_time inputNoBorder'> "+
				"</td>"+
                    "<td printer='true' rn='5' cn='2' orn='4' ocn='2' rowspan='1' colspan='2' style='height:27px;vertical-align:top;border:#000000 solid 1px;'>"+
                        "<input type='text'  name='pjExpNote' style='width:291px;height:27px;' class='inputNoBorder' />"+
					"</td>"+
                    "<td printer='true' rn='5' cn='4' orn='4' ocn='4' rowspan='1' colspan='1' style='height:27px;vertical-align:top;border:#000000 solid 1px;'>"+
                        "<input type='text' name='pjExpMoney' style='width:151px;height:27px;' fxTarget='expenseTotal,' class='inputNoBorder' check-type='int required' required-message='请填写报销金额' />"+
					"</td>"+
                    "<td printer='false' rn='5' cn='5' orn='0' ocn='0' rowspan='1' colspan='1' style='height:25px;vertical-align:top;'>"+
                    "<a onclick='form.delRow(this)' href='javascript:void(0)' style='margin-left:10px;'>"+
                        "<i class='icon iconfont icon-del orange icon-size-16'></i>"+
                    "</a>"+
				   "</td>"+
                "</tr>" );
       $("#position").before(addtr);
         lay('.date').each(function(){
             laydate.render({
                 elem: this
                 ,trigger: 'click'
             });
         });
 		//tr.appendTo("#jform");
       //tr.insertBefore("#jform tr:last");
}
</script>

</body>
</html>