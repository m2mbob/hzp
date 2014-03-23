var clazz={
	"1":"标准动态跟踪系统",
	"2":"实验室业务管理系统",
	"3":"综合标准服务网",
	"4":"嵌入式标准管理系统",
	"5":"行业(产品)数据库"
};
function select(type){
	document.write(clazz[type]);
}


var types={"1":"知名企业",
		"2":"政府、教育、社会机构",
"3":"电子电器",
"4":"纺织、服装",
"5":"食品、农、林、牧、渔",
"6":"纸品、包装、印刷",
"7":"化工、塑胶",
"8":"建筑、物业管理",
"9":"餐饮、服务业",
"10":"商业、物流",
"11":"软件、网络技术",
"12":"检测机构、咨询服务",
"13":"机械、制造业"
};
function select2(type){
	document.write(types[type]);
}

var services={
		"1":"标准动态跟踪系统",
        "2":"实验室业务管理系统",
        "3":"综合标准服务网",
        "4":"嵌入式标准管理系统",
        "5":"行业(产品)数据库"
};
function selects(type){
	document.write(services[type]);
}

var project={
		"1":"行政许可咨询",
		"2":"管理体系建立辅导",
		"3":"产品认证",
		"4":"定制管理",
		"5":"实验室专项认可",
		"6":"标准化规范管理"
};
function selectp(a){
	document.write(project[a]);
}





var info={
		"1":"业界要闻",
        "2":"公司动态",
        "3":"关注民生",
};
function selecti(type){
	document.write(info[type]);
}
var over={
		"1":"是",
        "0":"否",
};
function overhead(a){
	document.write(over[a]);
}

function sub(a){
	document.write(a.substr(0,10));
}
function change(a){
	if(a==0)
		return false;
    document.getElementById('l1').style.display='none';
    document.getElementById('l2').style.display='block';
    document.getElementById('r').style.display='none';
    for(var i=1;i<5;i++){
        document.getElementById('r'+i).style.display='none';
    }
    document.getElementById('r'+a).style.display='block';
}

