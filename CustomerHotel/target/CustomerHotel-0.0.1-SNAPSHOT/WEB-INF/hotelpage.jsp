
<!DOCTYPE html>
<html>
   <head>
      <link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-classic/resources/theme-classic-all.css" 
         rel = "stylesheet" />
      <script type = "text/javascript" 
         src = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/ext-all.js"></script>
      
      <script type = "text/javascript">
         Ext.onReady(function() {
            Ext.create('Ext.form.Panel', {
               id: 'newForm',
               renderTo: 'myinfo',
               border: true,
               width: 600,
               padding: '50',
               items: [{
                id:'cid',
                  xtype: 'displayfield',
                  fieldLabel: 'Customer Id',
                value:12435,
               },{
                 id:'cname',
                  xtype: 'textfield',
                  fieldLabel: 'name.',
                 
               },{
            	   id:'cmn',  
                   xtype: 'numberfield',
                   minValue: 1,
                    fieldLabel: 'mobile-number',
                    hideTrigger: true,  
                  
               },{
                id:'tno',
                  xtype: 'combobox',
                  fieldLabel: 'table no',
                  store: Ext.create('Ext.data.Store', {
                     fields: ['abbr', 'name'],
                     data: [{
                        'abbr': 'Table 1',
                        'name': 'Table 1',
                     },{
                        'abbr': 'Table 2',
                        'name': 'Table 2'
                     },{
                        'abbr': 'Table 3',
                        'name': 'Table 3'
                     },{
                        'abbr': 'Table 4',
                        'name': 'Table 4'
                     },{
                        'abbr': 'Table 5',
                        'name': 'Table 5'
                     },{
                        'abbr': 'Table 6',
                        'name': 'Table 6'
                     },{
                        'abbr': 'Table 7',
                        'name': 'Table 7'
                     }]
                  }),
                  valueField: 'abbr',
                  displayField: 'name',
               },{
                  xtype: 'fieldcontainer',
                  fieldLabel: 'your items',
                  defaultType: 'checkboxfield',
                  
                  items: [{ 
                	  id: 'check1',
                     boxLabel: 'Rice',
                     inputValue: 'Rice',
                  },{
                	  id: 'check2',
                     boxLabel: 'curry',
                     inputValue: 'curry',
                  },{
                	  id: 'check3',
                     boxLabel: 'water',
                     inputValue: 'water',
                     checked: true,
                    
                  },{ 
                	  id:'items',
                	  xtype: 'displayfield',
                      fieldLabel: 'your items ', 
                  },{
              	 xtype:'button',
                 text: 'Order',
                 
                 handler: function() {
                  	   debugger;
                      var uname=Ext.getCmp("cname").getValue();
                      var mobilenumber=Ext.getCmp("cmn").getValue();
                      var tableno=Ext.getCmp("tno").getValue();
                      var jsonobj ={};
                      jsonobj.customername=uname;
                      jsonobj.customermobileno=mobilenumber;
                      jsonobj.tablenumber=tableno
                      var cost=0;
                      
                      //====================
                 	  var numbers = [];
                      var ids = new Array("check1", "check2", "check3");
                      var j=0;
                      for(var i = 0; i < ids.length; i++) {
                      var condition=Ext.getCmp(ids[i]).getValue();
                      if(condition==true){
                      numbers[j]=i;
                      j++;
                      }
                     }
                      var checkeditems=" ";
                      var values=" ";
                      for(var i=0;i<numbers.length;i++){
                          if(numbers[i]==0){
                        	  cost=cost+50;
                       values="rice ,  ";
                          }else if(numbers[i]==1){
                        	  cost=cost+30;
                              values="curry , ";
                          }else if(numbers[i]==2){
                              values="water , "
                            	  cost=cost+25;
                          }
                          checkeditems=checkeditems+values;
                      }
                      Ext.getCmp("items").setValue(checkeditems);
                      Ext.getCmp("yourcost").setValue(cost);
                      
                      //==============================================================================
                      Ext.Ajax.request({
                      	   type: 'ajax',
                      	      url:'http://192.168.125.77:8180/apijdbc/rest/cruddata/sending/'+uname+'/'+mobilenumber+'/'+tableno+'/'+jsonobj,
                              method: 'POST',
                               headers: { 'Content-Type': 'application/json; charset=utf-8', 'Accept': '*/*' },                    
                              success:function(response){
                            	  
                            	   Ext.getCmp("cid").setValue(response.responseText);
                            	  //Ext.getCmp("yourcost").setValue(cost);
                              Ext.Msg.alert('sended data Success','pay amount for your food....then you will get your food'+response.responseText);
                              
                                 
                              },
                              failure:function(response){
                            	  Ext.Msg.alert('fail','error...');
                              }
                          })
                    }
                  },
               { id:'yourcost',
                  xtype: 'displayfield',
                  fieldLabel: 'yourcost',
               },{
                  xtype: 'combobox',
                  fieldLabel: 'type of netbanking',
                  store: Ext.create('Ext.data.Store', {
                     fields: ['abbr', 'name'],
                     data: [{
                        'abbr': 'Googlepay',
                        'name': 'Googlepay'
                     },{
                        'abbr': 'phonepay',
                        'name': 'phonepay'
                     },{
                        'abbr': 'paytm',
                        'name': 'paytm'
                     },{
                        'abbr': 'cash',
                        'name': 'cash'
                     }]
                  }),
                  valueField: 'abbr',
                  displayField: 'name'
               }]
               }]
            }); 
         });
      </script>
   </head>
   <body  style="color:azure;background-color: rgb(32, 32, 32);">
      <div id = "myinfo"></div>
      
      <h2></h2>
   </body>
</html>