webpackJsonp([1],{0:function(t,e){},ATEo:function(t,e){},NHnr:function(t,e,l){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n=l("7+uW"),a={name:"App",methods:{loginOut:function(){this.$http.get("/lzzz_war/loginOut").then(function(t){this.$message({message:"已注销！",type:"success"}),location.href="/lzzz_war/index.html"})}}},s={render:function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("div",{attrs:{id:"app"}},[l("div",{staticStyle:{float:"right"}},[l("el-button",{on:{click:t.loginOut}},[t._v("退出")])],1),t._v(" "),l("router-link",{attrs:{to:"/"}},[l("el-button",[t._v("预占")])],1),t._v(" "),l("router-link",{attrs:{to:"/Fp"}},[l("el-button",[t._v("发票")])],1),t._v(" "),l("router-link",{attrs:{to:"/Dj"}},[l("el-button",[t._v("单据")])],1),t._v(" "),l("router-view")],1)},staticRenderFns:[]};var o=l("VU/8")(a,s,!1,function(t){l("ATEo")},null,null).exports,r=l("/ocq"),u={render:function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("div",{attrs:{id:"centerid"}},[l("el-table",{attrs:{data:t.tableData,"header-cell-style":{"text-align":"center"},"cell-style":{"text-align":"center"}}},[l("el-table-column",{attrs:{label:"序号",type:"index","show-overflow-tooltip":""}}),t._v(" "),l("el-table-column",{attrs:{label:"日期"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("i",{staticClass:"el-icon-time"}),t._v(" "),l("span",[t._v(t._s(e.row.createtime))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"单据编号"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",[t._v(t._s(e.row.billid))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"姓名"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("el-tag",{attrs:{size:"medium"}},[t._v(t._s(e.row.staffname))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"操作"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(l){return t.handleDelete(e.$index,e.row)}}},[t._v("删除\n        ")])]}}])})],1)],1)},staticRenderFns:[]},i=l("VU/8")({data:function(){return this.$http.get("/lzzz_war/getOp").then(function(t){this.tableData=t.data.data}),{tableData:void 0}},methods:{handleDelete:function(t,e){this.$http.post("/lzzz_war/delOp",{billid:e.billid}).then(function(e){this.$message({message:"删除成功！",type:"success"}),this.tableData.splice(t,1)})}}},u,!1,null,null,null).exports,c={render:function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("div",{attrs:{id:"centerid"}},[l("el-table",{attrs:{data:t.tableData,"header-cell-style":{"text-align":"center"},"cell-style":{"text-align":"center"}}},[l("el-table-column",{attrs:{label:"序号",type:"index","show-overflow-tooltip":""}}),t._v(" "),l("el-table-column",{attrs:{label:"申请日期"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("i",{staticClass:"el-icon-time"}),t._v(" "),l("span",[t._v(t._s(e.row.createtime))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"单据编号"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",[t._v(t._s(e.row.billid))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"客户编码"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",[t._v(t._s(e.row.custno))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"客户名称"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",[t._v(t._s(e.row.custname))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"金额"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",{staticStyle:{"margin-left":"10px"}},[t._v(t._s(e.row.amount))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"姓名"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("el-tag",{attrs:{size:"medium"}},[t._v(t._s(e.row.opname))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"操作"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(l){return t.handleDelete(e.$index,e.row)}}},[t._v("删除\n        ")])]}}])})],1)],1)},staticRenderFns:[]},d=l("VU/8")({data:function(){return this.$http.get("/lzzz_war/getFp").then(function(t){this.tableData=t.data.data}),{tableData:void 0}},methods:{handleDelete:function(t,e){this.$http.post("/lzzz_war/delFp",{billid:e.billid}).then(function(e){this.$message({message:"删除成功！",type:"success"}),this.tableData.splice(t,1)})}}},c,!1,null,null,null).exports,p={render:function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("div",{attrs:{id:"centerid"}},[l("el-table",{attrs:{data:t.tableData,"header-cell-style":{"text-align":"center"},"cell-style":{"text-align":"center"}}},[l("el-table-column",{attrs:{label:"序号",type:"index","show-overflow-tooltip":""}}),t._v(" "),l("el-table-column",{attrs:{label:"预占日期"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("i",{staticClass:"el-icon-time"}),t._v(" "),l("span",[t._v(t._s(e.row.createtime))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"客户编码"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",[t._v(t._s(e.row.custno))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"客户名称"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",[t._v(t._s(e.row.custname))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"商品编码"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",{staticStyle:{"margin-left":"10px"}},[t._v(t._s(e.row.prodno))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"商品名称"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",{staticStyle:{"margin-left":"10px"}},[t._v(t._s(e.row.prodname))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"预占数量"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("span",{staticStyle:{"margin-left":"10px"}},[t._v(t._s(e.row.quantity))])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"姓名"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("el-popover",{attrs:{trigger:"hover",placement:"top"}},[l("p",[t._v("商品: "+t._s(e.row.prodname))]),t._v(" "),l("p",[t._v("数量: "+t._s(e.row.quantity))]),t._v(" "),l("div",{staticClass:"name-wrapper",attrs:{slot:"reference"},slot:"reference"},[l("el-tag",{attrs:{size:"medium"}},[t._v(t._s(e.row.staffname))])],1)])]}}])}),t._v(" "),l("el-table-column",{attrs:{label:"操作"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(l){return t.handleDelete(e.$index,e.row)}}},[t._v("删除\n        ")])]}}])})],1)],1)},staticRenderFns:[]},f=l("VU/8")({data:function(){return this.$http.get("/lzzz_war/goYzList").then(function(t){this.tableData=t.data.data}),{tableData:void 0}},methods:{handleDelete:function(t,e){this.$http.post("/lzzz_war/detYz",{pk:e.pk}).then(function(e){this.$message({message:"删除成功！",type:"success"}),this.tableData.splice(t,1)})}}},p,!1,null,null,null).exports;n.default.use(r.a);var _=new r.a({routes:[{path:"/",name:"Yz",component:f},{path:"/Dj",name:"Dj",component:i},{path:"/Fp",name:"Fp",component:d}]}),v=l("zL8q"),m=l.n(v),b=(l("tvR6"),l("8+8L"));n.default.config.productionTip=!1,n.default.use(m.a),n.default.use(b.a),n.default.prototype.HOST="http://localhost:8080/lzzz/delOp",new n.default({el:"#app",router:_,components:{App:o},template:"<App/>"})},tvR6:function(t,e){}},["NHnr"]);
//# sourceMappingURL=app.d2033ae49b74ca908e70.js.map