<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script charset="utf-8" src="../editor/kindeditor.js"></script>
<script charset="utf-8" src="../editor/lang/zh_CN.js"></script>

<title>修改关于我们</title>
</head>
<body>
<div id="content">
<form action="admin/intro!update" method="post" onsubmit="editor.sync();"
					enctype="multipart/form-data">
					<table class="table">
						<tr>
							<td>公司简介:</td>
							<td><textarea rows="10" cols="80" id="editor_id" name="content" style="width:700px;height:300px;">${intro.content}</textarea>
							</td>
						</tr>
						<tr>
							<td>组织机构图片:</td>
							<td><input type="file" name="upload" /></td>
						</tr>
						<tr>
							<td>资质认证图片:</td>
							<td><input type="file" name="upload1" /></td>
						</tr>
						<tr>
							<td>视频地址:</td>
							<td><input class="t_text" name="videopath" value="${intro.videopath}" />
							</td>
						</tr>
						<tr>
							<td>公司文化:</td>
							<td><textarea rows="10" cols="80" id="editor_id1" name="culture" style="width:700px;height:300px;">${intro.culture}</textarea>
							</td>
						</tr>
						<!-- 
						<tr>
							<td>请选择类别：</td>
							<td><select name="clazz">
									<option value="0">类别A</option>
									<option value="1">类别B</option>
							</select></td>
						</tr>
						<tr>
							<td>是否首页：</td>
							<td><select name="overhead">
									<option value="0">否</option>
									<option value="1">是</option>
							</select></td>
						</tr>
						 -->
					</table>
					<input type="hidden" name="id" value="${intro.id}">
					<input type="hidden" name="savepath" value="${intro.savepath}">
					<input type="hidden" name="savepath1" value="${intro.savepath1}">
					<button class="btn" type="submit">添加</button>
				</form>
				</div>

<script>
        KindEditor.ready(function(K) {
                window.editor = K.create('#editor_id');
        });
</script>
<script>
        KindEditor.ready(function(K) {
                window.editor = K.create('#editor_id1');
        });
</script>
</body>
</html>