var THEME_COLOR=["#4ec5e9","#67e0e4","#f79f7f","#37a2da","#fdd0a2","#4c7e96","#93cbf9","#9d96f5","#8378EA","#96BFFF","#9ecae1","#a1882b"];(function(A,B){if(typeof define==="function"&&define.amd){define(["exports","echarts"],B)}else{if(typeof exports==="object"&&typeof exports.nodeName!=="string"){B(exports,require("echarts"))}else{B({},A.echarts)}}}(this,function(A,C){var B=function(D){if(typeof console!=="undefined"){console&&console.error&&console.error(D)}};if(!C){B("ECharts is not Loaded");return }C.registerTheme("customed",{"color":THEME_COLOR,"backgroundColor":"rgba(0,0,0,0)","textStyle":{},"title":{"textStyle":{"color":"#333333"},"subtextStyle":{"color":"#aaaaaa"}},"line":{"itemStyle":{"normal":{"borderWidth":1}},"lineStyle":{"normal":{"width":2}},"symbolSize":4,"symbol":"circle","smooth":false},"radar":{"itemStyle":{"normal":{"borderWidth":1}},"lineStyle":{"normal":{"width":2}},"symbolSize":4,"symbol":"circle","smooth":false},"bar":{"itemStyle":{"normal":{"barBorderWidth":0,"barBorderColor":"#ccc"},"emphasis":{"barBorderWidth":0,"barBorderColor":"#ccc"}}},"pie":{"itemStyle":{"normal":{"borderWidth":0,"borderColor":"#ccc"},"emphasis":{"borderWidth":0,"borderColor":"#ccc"}}},"scatter":{"itemStyle":{"normal":{"borderWidth":0,"borderColor":"#ccc"},"emphasis":{"borderWidth":0,"borderColor":"#ccc"}}},"boxplot":{"itemStyle":{"normal":{"borderWidth":0,"borderColor":"#ccc"},"emphasis":{"borderWidth":0,"borderColor":"#ccc"}}},"parallel":{"itemStyle":{"normal":{"borderWidth":0,"borderColor":"#ccc"},"emphasis":{"borderWidth":0,"borderColor":"#ccc"}}},"sankey":{"itemStyle":{"normal":{"borderWidth":0,"borderColor":"#ccc"},"emphasis":{"borderWidth":0,"borderColor":"#ccc"}}},"funnel":{"itemStyle":{"normal":{"borderWidth":0,"borderColor":"#ccc"},"emphasis":{"borderWidth":0,"borderColor":"#ccc"}}},"gauge":{"itemStyle":{"normal":{"borderWidth":0,"borderColor":"#ccc"},"emphasis":{"borderWidth":0,"borderColor":"#ccc"}}},"candlestick":{"itemStyle":{"normal":{"color":"#c23531","color0":"#314656","borderColor":"#c23531","borderColor0":"#314656","borderWidth":1}}},"graph":{"itemStyle":{"normal":{"borderWidth":0,"borderColor":"#ccc"}},"lineStyle":{"normal":{"width":1,"color":"#aaaaaa"}},"symbolSize":4,"symbol":"circle","smooth":false,"color":["#3182bd","#fd8d3c","#bdbdbd","#756bb1","#e6550d","#31a354","#fdd0a2","#9e9ac8","#a1d99b","#636363","#9ecae1","#a1882b"],"label":{"normal":{"textStyle":{"color":"#eeeeee"}}}},"map":{"itemStyle":{"normal":{"areaColor":"#eeeeee","borderColor":"#444444","borderWidth":0.5},"emphasis":{"areaColor":"rgba(255,215,0,0.8)","borderColor":"#444444","borderWidth":1}},"label":{"normal":{"textStyle":{"color":"#000000"}},"emphasis":{"textStyle":{"color":"rgb(100,0,0)"}}}},"geo":{"itemStyle":{"normal":{"areaColor":"#eeeeee","borderColor":"#444444","borderWidth":0.5},"emphasis":{"areaColor":"rgba(255,215,0,0.8)","borderColor":"#444444","borderWidth":1}},"label":{"normal":{"textStyle":{"color":"#000000"}},"emphasis":{"textStyle":{"color":"rgb(100,0,0)"}}}},"categoryAxis":{"axisLine":{"show":true,"lineStyle":{"color":"#b8afaf"}},"axisTick":{"show":true,"lineStyle":{"color":"#b8afaf"}},"axisLabel":{"show":true,"textStyle":{"color":"#333"}},"splitLine":{"show":false,"lineStyle":{"color":["#ccc"]}},"splitArea":{"show":false,"areaStyle":{"color":["rgba(250,250,250,0.3)","rgba(200,200,200,0.3)"]}}},"valueAxis":{"axisLine":{"show":true,"lineStyle":{"color":"#b8afaf"}},"axisTick":{"show":true,"lineStyle":{"color":"#b8afaf"}},"axisLabel":{"show":true,"textStyle":{"color":"#333"}},"splitLine":{"show":true,"lineStyle":{"color":["#ccc"]}},"splitArea":{"show":false,"areaStyle":{"color":["rgba(250,250,250,0.3)","rgba(200,200,200,0.3)"]}}},"logAxis":{"axisLine":{"show":true,"lineStyle":{"color":"#333"}},"axisTick":{"show":true,"lineStyle":{"color":"#333"}},"axisLabel":{"show":true,"textStyle":{"color":"#333"}},"splitLine":{"show":true,"lineStyle":{"color":["#ccc"]}},"splitArea":{"show":false,"areaStyle":{"color":["rgba(250,250,250,0.3)","rgba(200,200,200,0.3)"]}}},"timeAxis":{"axisLine":{"show":true,"lineStyle":{"color":"#333"}},"axisTick":{"show":true,"lineStyle":{"color":"#333"}},"axisLabel":{"show":true,"textStyle":{"color":"#333"}},"splitLine":{"show":true,"lineStyle":{"color":["#ccc"]}},"splitArea":{"show":false,"areaStyle":{"color":["rgba(250,250,250,0.3)","rgba(200,200,200,0.3)"]}}},"toolbox":{"iconStyle":{"normal":{"borderColor":"#999999"},"emphasis":{"borderColor":"#666666"}}},"legend":{"textStyle":{"color":"#333333"}},"tooltip":{"axisPointer":{"lineStyle":{"color":"#cccccc","width":1},"crossStyle":{"color":"#cccccc","width":1}}},"timeline":{"lineStyle":{"color":"#293c55","width":1},"itemStyle":{"normal":{"color":"#293c55","borderWidth":1},"emphasis":{"color":"#a9334c"}},"controlStyle":{"normal":{"color":"#293c55","borderColor":"#293c55","borderWidth":0.5},"emphasis":{"color":"#293c55","borderColor":"#293c55","borderWidth":0.5}},"checkpointStyle":{"color":"#e43c59","borderColor":"rgba(194,53,49,0.5)"},"label":{"normal":{"textStyle":{"color":"#293c55"}},"emphasis":{"textStyle":{"color":"#293c55"}}}},"visualMap":{"color":["#007de4","#5faff0","#defaff"]},"dataZoom":{"backgroundColor":"rgba(47,69,84,0)","dataBackgroundColor":"rgba(47,69,84,0.3)","fillerColor":"rgba(167,183,204,0.4)","handleColor":"#a7b7cc","handleSize":"100%","textStyle":{"color":"#333333"}},"markPoint":{"label":{"normal":{"textStyle":{"color":"#eeeeee"}},"emphasis":{"textStyle":{"color":"#eeeeee"}}}}})}))