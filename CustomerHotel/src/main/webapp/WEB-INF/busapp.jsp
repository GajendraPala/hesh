<!DOCTYPE html>
<html>
   <head>
    <link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-triton/resources/theme-triton-all.css" 
    rel = "stylesheet" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-classic/resources/theme-classic-all.css" 
    rel = "stylesheet" />
 <script type = "text/javascript" 
    src = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/ext-all.js"></script>
      
      <script type = "text/javascript">
          Ext.onReady(function() {
            Ext.create('Ext.form.Panel', {
               id: 'newForm',
               renderTo: 'info',
               border: true,
               width: 450,
               height:300,
               margin:'100 0 0 100',
               padding: '50',
               defaultType: 'checkboxfield',
               items: [{xtype:'button',
               margin:'0 0 0 0',
               iconCls:'fa fa-futbol-o',
              },{
                padding: '-20 0 0 30',
                xtype: 'checkboxgroup',
                cls: 'x-check-group-alt',
           // 
            items: [
                { boxLabel: ' 1', id: '1' },
                { boxLabel: ' 2', id: '2', },
                { boxLabel: ' 3', id: '3' },
                { boxLabel: ' 4', id: '4' },
                { boxLabel: ' 5', id: '5' },
                { boxLabel: ' 6', id: '6' },
                { boxLabel: ' 7', id: '7', },
                { boxLabel: ' 8', id: '8' },
                { boxLabel: ' 9', id: '9' },
                { boxLabel: ' 10', id: '10' }
            ]
            },{padding: '10 0 0 30',
                xtype: 'checkboxgroup',
            cls: 'x-check-group-alt',
            items: [
                { boxLabel: ' 11', id: '11' },
                { boxLabel: ' 12', id: '12', },
                { boxLabel: ' 13',id: '13'},
                { boxLabel: ' 14',id: '14' },
                { boxLabel: ' 15', id: '15' },
                { boxLabel: ' 16', id: '16' },
                { boxLabel: ' 17', id: '17', },
                { boxLabel: ' 18', id: '18' },
                { boxLabel: ' 19',id: '19' },
                { boxLabel: ' 20', id: '20' }
            ]
            },{padding: '10 0 0 30',
                xtype: 'checkboxgroup',
            cls: 'x-check-group-alt',
            items: [
               { boxLabel: ' 21', id: '21' },
                { boxLabel: ' 22', id: '22', },
                { boxLabel: ' 23',id: '23'},
                { boxLabel: ' 24',id: '24' },
                { boxLabel: ' 25', id: '25' },
                { boxLabel: ' 26', id: '26' },
                { boxLabel: ' 27', id: '27', },
                { boxLabel: ' 28', id: '28' },
                { boxLabel: ' 29',id: '29' },
                { boxLabel: ' 30', id: '30' }
            ]
            },{padding: '0 0 0 313',
                xtype:'checkbox',
                boxLabel:'31',
                id:'31',
                style:'color:red',
               
            },{
                padding: '10 0 0 30',
                xtype: 'checkboxgroup',
            cls: 'x-check-group-alt',
            items: [
            { boxLabel: '32', id: '32' },
          { boxLabel: '33', id: '33' },
          { boxLabel: '34', id: '34' },
          { boxLabel: '35',  id: '35' },
          { boxLabel: '36', id: '36' },
          { boxLabel: '37',  id: '37' },
          { boxLabel: '38',  id: '38', },
          { boxLabel: '39',  id: '39' },
          
          { boxLabel: '40',  id: '40',padding: '0 10 10 38' }
      ]
            },{
                
                xtype: 'checkboxgroup',
            cls: 'x-check-group-alt',
            items: [
          { boxLabel: ' 41',  id: '41', },
          { boxLabel: ' 42', id: '42', },
          { boxLabel: ' 43',id: '43', },
          { boxLabel: ' 44',id: '44', },
          { boxLabel: ' 45', id: '45', },
          { boxLabel: ' 46', id: '46', },
          { boxLabel: ' 47', id: '47', },
          { boxLabel: ' 48', id: '48', },
          { boxLabel: ' 49', id: '49',  disabled: true},
          { boxLabel: ' 50', id: '50',padding: '0 10 10 38' }
            ]
            },{
                

            }
            
        ]
               });
               Ext.create('Ext.container.Container', {
            renderTo: 'btn',
            //
          
             items:[{xtype:'button',
             margin:'0 0 0 300',
            //padding:'0 0 0 0',
             text:'book',
             handler: function() {
                  	   debugger;
                         var numbers = [];
                         numbers[0]=0;
                      var ids = new Array("0","1","2","3","4","5","6","7","8","9","10",
                      "11","12","13","14","15","16","17","18","19","20",
                      "21","22","23","24","25","26","27","28","29","30", 
                      "31","32","33","34","35","36","37","38","39","40",
                     "41","42","43","44","45","46","47","48","49","50",
                     );
                      var j=1;
                      for(var i = 1; i < ids.length; i++) {
                      var condition=Ext.getCmp(ids[i]).getValue();
                      if(condition==true){
                        style:color:'red',
                      numbers[j]=i;
                      j++;
                      }
                     }
                     var checkeditems=" ";
                      var values=" ";
                      for(var i=1;i<numbers.length;i++){
                          if(numbers[i]!=0){
                            values=values+numbers[i]+" ,";
                          }
                        }
                        for(var i=1;i<numbers.length;i++){
                        var cb1 = Ext.getCmp(numbers[i]);
                        cb1.setStyle('backgroundColor', 'orange');
                        cb1.disable();}
                        
                        Ext.MessageBox.alert('check','you are selected seats are '+ values);
                        for(var i=1;i<numbers.length;i++){
                        if(numbers[i]%2==0){
                        var hello = Ext.getCmp(numbers[i]);
                        hello.setStyle('border-radius', '50px');
                        }
                    }
                     var  uname="YGHF";
                     var  mobilenumber=5754;
                     var tableno="table";
                        Ext.Ajax.request({
                       	   type: 'ajax',
                       	     // url:'http://192.168.125.77:8180/extjsapi/rest/cruddata/sending/'+numbers,
                       	    	url:'http://192.168.125.77:8180/extjsapi/rest/cruddata/sending/'+uname+'/'+mobilenumber+'/'+tableno+'/'+numbers,
                               method: 'POST',
                                headers: { 'Content-Type': 'application/json; charset=utf-8', 'Accept': '*/*' },                    
                               success:function(response){
                             	  
                             	  // Ext.getCmp("cid").setValue(response.responseText);
                             	  //Ext.getCmp("yourcost").setValue(cost);
                               Ext.Msg.alert('sended data Success','pay amount for your food....then you will get your food'+response.responseText);
                               
                                  
                               },
                               failure:function(response){
                             	  Ext.Msg.alert('fail','error...'+response.responseText);
                               }
                           })
            }
        }]
             });
            });
      </script>
   </head>
   
   <body style="color:azure;background-color: rgb(32, 32, 32);">
      <div id = "info"></div>
      <div id = "btn"></div>
   </body>
</html>