<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="decorator"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link href="style/foucs.css" rel="stylesheet" />
    <script src="js/foucs.js" type="text/javascript"></script>
    <title></title>
</head>
<body>
<br />
 <div id="main">
       <div class="left">

           <div class="mod_focus_show" id="divimgplay">
               <ul class="mod_focus_pic" id="divimginfog_imgPlayer">
               <s:iterator value="infoimglist">
                   <li><a href="information!get?id=${id}" target="_blank">
                       <img src="img/info${savepath}" alt="" width="700" height="320" /></a></li>
                       </s:iterator>

               </ul>
               <ul class="mod_focus_title" id="ptitleg_imgPlayer">
                   <li class="current">
                       <h3><a href="http://www.lanrentuku.com/" target="_blank"></a></h3>
                       <p></p>
                   </li>
               </ul>
               <div class="focus_switch"><a href="javascript:;" class="icon_prev"></a><a href="javascript:;" class="icon_next"></a></div>
               <ul class="mod_focus_list" id="divpageinfog_imgPlayer">
               <s:iterator value="infoimglist">
                   <li class="current"><a href="information!get?id=${id}" target="_blank">
                       <img src="img/info${savepath}" alt="${title}" width="60" height="60" /><span class="border"></span><span class="mask"></span></a></li>
                   </s:iterator>
               </ul>
           </div>
           <script type="text/javascript">
               foucsbox(2500);
           </script>
       </div>
       <div id="right">
           <div id="news">
               <div class="news_title">
                   <h4>热点信息</h4>
                   <div class="news_title_r"></div>
               </div>
               <ul class="item">
               <s:iterator value="infolist">
                   <li><a href="information!get?id=${id}">${title}<img src="images/newico.gif" /></a> <span><script>sub('${createtime}');</script></span></li>
                   </s:iterator>
               </ul>
               <a class="more" href="information">更多....</a>
           </div>
           <div id="notice">
               <div class="news_title">
                   <h4>通知公告</h4>
                   <div class="news_title_r"></div>
               </div>
               <ul class="item">
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
                   <li><a href="">今日通知</a> <span>2013-05-30</span></li>
               </ul>
               <a class="more" href="">更多....</a>
           </div>

       </div>
       <br class="clear" />
              <div class="bottom_l bottom">
           <h2>公司简介</h2>
           <p>${intro.content}</p>



       </div>
       <div class="bottom_r bottom">
           <h2><a href="case">成功案例</a></h2>
                   <ul>
                   <s:iterator value="sclist">
                       <li><a href="${address}">${companyName}</a></li>
                     
</s:iterator>
                   </ul>

       </div>
       <br class="clear" />
       <div class="content">

           <div class="left_part">
               <ul class="box">
               <li class="b6"><h3>标准服务产品</h3>
                       <div class="box_content">
                           <img src="images/box/2.png" /><p>体系认证 体系认证是指企业，通过一个第三方机构对企业的管理体系或产品，进行第三方评价。该机构必须是独立的，公正的。派出合格审核员组成的检查组对申请方...[详细]</p>
                         <ul>
                   <li class="box_item t1"><a href="stdservices?page.clazz=1">综合标准服务网</a></li>
                   <li class="box_item t1"><a href="stdservices?page.clazz=2">嵌入式标准管理系统</a></li>
                   <li class="box_item t1"><a href="stdservices?page.clazz=3">行业（产品）数据库</a></li>
                   <li class="box_item t1"><a href="stdservices?page.clazz=4">实验室业务管理系统</a></li>
                   <li class="box_item t1"><a href="stdservices?page.clazz=5">标准动态管理系统</a></li>

               </ul>
                       </div></li>

                   <li class="b2"><h3>体系认证</h3>
                   <div class="box_content">
                       <img src="images/box/1.png" /><p>体系认证 体系认证是指企业，通过一个第三方机构对企业的管理体系或产品，进行第三方评价。该机构必须是独立的，公正的。派出合格审核员组成的检查组对申请方...[详细]</p>
                       <ul>
                      <s:iterator value="prolist">
                      <s:if test="clazz == 2">
                           <li class="box_item t1"><a href="project!get?id=${id}">${continents}</a></li>
                           </s:if>
                    </s:iterator>
                       </ul>
                   </div></li>
                   <li class="b3"><h3>行政许可咨询</h3>
                       <div class="box_content">
                           <img src="images/box/2.png" /><p>体系认证 体系认证是指企业，通过一个第三方机构对企业的管理体系或产品，进行第三方评价。该机构必须是独立的，公正的。派出合格审核员组成的检查组对申请方...[详细]</p>
                            <ul>
                      <s:iterator value="prolist">
                      <s:if test="clazz == 1">
                           <li class="box_item t1"><a href="project!get?id=${id}">${continents}</a></li>
                           </s:if>
                    </s:iterator>
                       </ul>
                           
                       </div></li>
                   <li class="b4"><h3>产品认证</h3>
                       <div class="box_content">
                           <img src="images/box/3.png" /><p>体系认证 体系认证是指企业，通过一个第三方机构对企业的管理体系或产品，进行第三方评价。该机构必须是独立的，公正的。派出合格审核员组成的检查组对申请方...[详细]</p>
                            <ul>
                      <s:iterator value="prolist">
                      <s:if test="clazz == 3">
                           <li class="box_item t1"><a href="project!get?id=${id}">${continents}</a></li>
                           </s:if>
                    </s:iterator>
                       </ul>
                       </div></li>
                   <li class="b5"><h3>管理咨询</h3>
                       <div class="box_content">
                           <img src="images/box/4.png" /><p>体系认证 体系认证是指企业，通过一个第三方机构对企业的管理体系或产品，进行第三方评价。该机构必须是独立的，公正的。派出合格审核员组成的检查组对申请方...[详细]</p>
                            <ul>
                      <s:iterator value="prolist">
                      <s:if test="clazz == 4">
                           <li class="box_item t1"><a href="project!get?id=${id}">${continents}</a></li>
                           </s:if>
                    </s:iterator>
                       </ul>
                       </div></li>
                   <li class="b1">
                       <h3>国际认证</h3>
                       <div class="box_content">
                           <img src="images/box/5.png" /><p>体系认证 体系认证是指企业，通过一个第三方机构对企业的管理体系或产品，进行第三方评价。该机构必须是独立的，公正的。派出合格审核员组成的检查组对申请方...[详细]</p>
                       </div>
                   </li>
               </ul>

           </div>
           <div id="right_part">
           <div id="video">
                   <embed src="http://www.tudou.com/l/oAatLy4ac8Q/&resourceId=0_05_05_99&iid=172500866&bid=05/v.swf" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" wmode="opaque" width="250" height="200"></embed>
               </div>
           <div class="train">
                   <h3>培训信息</h3>
                   <ul>
                       <li><a href=""> sdfsdfdsfs</a></li>
                       <li><a href=""> sdfsdfdsfs</a></li>
                       <li><a href=""> sdfsdfdsfs</a></li>
                       <li><a href=""> sdfsdfdsfs</a></li>
                       <li><a href=""> sdfsdfdsfs</a></li>
                   </ul>
               </div>
           </div>
           <br class="clear"/>
       </div>
   </div>


    <div id="link">
               <ul>
               <s:iterator value="linklist">
                   <li><a href="${address}" title="${title}"><img src="img/link${savepath}" /></a></li>
                   </s:iterator>
               </ul>
        <br class="clear" />
    </div>

        <script>
        b_RoundCurve("t1","#c8ddff","",1);
        b_RoundCurve("train","#ffffff","#f3f3f3",3,"h3","#dffc88");
        b_RoundCurve("bottom","#F8B3D0","#dffc88",3,"h2","","images/title_bg.png");
        b_RoundCurve("b1","#ffffff","#f3f3f3",3,"h3","","images/title_bg.png");
        b_RoundCurves("b2","#ffffff","#f3f3f3",3,"h3","","images/title_bg.png","-36");
        b_RoundCurves("b3","#ffffff","#f3f3f3",3,"h3","","images/title_bg.png","-72");
        b_RoundCurves("b4","#ffffff","#f3f3f3",3,"h3","","images/title_bg.png","-108");
        b_RoundCurves("b5","#ffffff","#f3f3f3",3,"h3","","images/title_bg.png","-144");
        b_RoundCurves("b6","#ffffff","#f3f3f3",3,"h3","","images/title_bg.png","-180");
        </script>
</body>
</html>