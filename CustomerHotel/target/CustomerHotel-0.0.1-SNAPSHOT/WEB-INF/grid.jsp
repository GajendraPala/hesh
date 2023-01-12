
<!DOCTYPE html>
<html>
   <head>
      <link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-classic/resources/theme-classic-all.css" 
         rel = "stylesheet" />
         <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <script type = "text/javascript" 
         src = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/ext-all.js"></script>
      
      <script type = "text/javascript">
        
         Ext.onReady(function() {
        	 
             var data = Ext.create('Ext.data.Store', {
                data:'',
                id:'id1',
             });
        	 debugger;
            var name1;
            let age1=90;
            var numbers = 857;
            Ext.create('Ext.container.Container', {
            renderTo: 'btn',
             width:200,
             height:200,
            margin:'100 0 0 120',
           items:[{
            xtype:'button',
            text:'clickme',
            handler: function() {
            	
               Ext.Ajax.request({
            	   
                       	   type: 'ajax',
                       	      url:'http://192.168.125.77:8180/apijdbc/rest/cruddata/sending/'+numbers,
                       	    	 //url:'http://192.168.125.77:8180/apijdbc/rest/cruddata/sending/'+uname+'/'+mobilenumber+'/'+tableno+'/'+numbers,
                               method: 'POST',
                                headers: { 'Content-Type': 'application/json; charset=utf-8', 'Accept': '*/*' },                    
                               success:function(response){
                            	   var mystore = Ext.data.StoreManager.lookup('id1');
                                   var myData = Ext.JSON.decode(response.responseText);
                                   //console.log(myData.toSource());
                                   var data = Ext.create('Ext.data.Store', {
						                data:myData,
						                id:'id1',
						             });
                                   Ext.create('Ext.grid.Panel', {
                                       store             : data,
                                       stripeRows        : false,
                                       title             : 'mydetails',
                                       renderTo          :'info',         
                                       width:300,
                                   
                                       columns           :
                                       [{ 
                                          header: " Name",
                                          dataIndex: 'name',	
                                       },{
                                          header: "ID", 
                                          dataIndex: 'id'
                                          
                                       },{
                                          header: "location", 
                                          dataIndex: 'loc',
                                          
                                          
                                       }]
                                    });
                                   //mystore.loadData(myData);
                             	 // var jsonData = Ext.JSON.decode(response.responseText);
                               Ext.Msg.alert('sended data Success','getting'+response.responseText);
                               
                                  
                               },
                               failure:function(response){
                             	  Ext.Msg.alert('fail','error...'+response.responseText);
                               }
                           })
            }
           }],
            });
        	 
         
           
           
         });
      </script>
   </head>
   
   <body style="color:azure;background-color: rgb(32, 32, 32);">
      <div id = "info"></div>
      <div id = "btn"></div>
   </body>
</html>

<!-- 
<!DOCTYPE html>
<html>
   <head>
      <link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-classic/resources/theme-classic-all.css" 
         rel = "stylesheet" />
         <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <script type = "text/javascript" 
         src = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/ext-all.js"></script>
      
      <script type = "text/javascript">
        
         Ext.onReady(function() {
        	 var plannedGridStore = new Ext.data.JsonStore({
        		    autoLoad: true,
        		    fields: ['id','name'],
        		});
            var name1;
            var age1=90;
            var numbers = 857;
            Ext.create('Ext.container.Container', {
            renderTo: 'btn',
             width:200,
             height:200,
            margin:'0 0 0 20',
           items:[{
            xtype:'button',
            text:'clickme',
            handler: function() {
           	 debugger;
               Ext.Ajax.request({
            	   
                       	   type: 'ajax',
                       	      url:'http://192.168.125.77:8180/apijdbc/rest/cruddata/sending/'+numbers,
                       	    	 //url:'http://192.168.125.77:8180/apijdbc/rest/cruddata/sending/'+uname+'/'+mobilenumber+'/'+tableno+'/'+numbers,
                                method: 'POST',
                                headers: { 'Content-Type': 'application/json; charset=utf-8', 'Accept': '*/*' },                    
                                success: function (response, request) {
                                	
                                    Ext.MessageBox.alert('success', response.responseText);
                                    var jsonData = Ext.util.JSON.decode(response.responseText); 
                                    age1=jsonData.id
                                    //console.log(jsonData);
                                    //if (jsonData.tourDetails.length > 0) {
                                        //plannedGrid.getStore().add(records);
                                      //  plannedGrid.getStore().loadData(jsonData);
                                  //  }
                                    Ext.Msg.show({
                                          title: 'Success',
                                          msg: 'success GetyourDetails'+jsonData,
                                          buttons: Ext.MessageBox.OK,
                                          icon: Ext.MessageBox.INFO
                                    });

                                  },
                                  failure: function (response, request) {
                                    Ext.MessageBox.alert('failure', response.responseText);
                                    Ext.Msg.show({
                                          title: 'Error',
                                          msg: 'error GetTourDetails',
                                          buttons: Ext.MessageBox.OK,
                                          icon: Ext.MessageBox.ERROR
                                    });
                                  }
                           })
            }
           }],
            });
        	 
            var myData = [{name:"gaja",age:age1},
                          {name:"ravikumar",age:25,loc:"hyd"},
                          {name:"rajesh",age:26}
        ];
            
            
            var data = Ext.create('Ext.data.Store', {
               data: myData
            });
            Ext.create('Ext.grid.Panel', {
               store             : data,
               stripeRows        : false,
               title             : 'mydetails',
               renderTo          :'info',         
               width:300,
           
               columns           :
               [{ 
                  header: " Name",
                  dataIndex: 'name',	
               },{
                  header: "Age", 
                  dataIndex: 'age'
                  
               },{
                  header: "location", 
                  dataIndex: 'loc',
                  
                  
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
 -->
<!--
<!DOCTYPE html>
<html>
   <head>
      <link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-classic/resources/theme-classic-all.css" 
         rel = "stylesheet" />
         <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <script type = "text/javascript" 
         src = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/ext-all.js"></script>
      
      <script type = "text/javascript">
      Ext.create('Ext.grid.Panel', {
    	  renderTo:'info',
    	  height:200,
    	  width:200,
    	  store:{
    		  fields:['id','name'],
    		  autoload:true,
    		  proxy:{
    			  type: 'ajax',
    			  url:'http://192.168.125.77:8180/apijdbc/rest/cruddata/sending/'+6757,
    		  }
    	  },
    	  columns:[{ text:'ID' ,dataIndex:'id'},
    		      { text:'Name' ,dataIndex:'name'},],
      });
   	   

      </script>
      </head>
      
      <body style="color:azure;background-color: rgb(32, 32, 32);">
         <div id = "info"></div>
         <div id = "btn"></div>
      </body>
   </html>

-->
<!-- 
<!DOCTYPE html>
<html>
   <head>
      <link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-classic/resources/theme-classic-all.css" 
         rel = "stylesheet" />
         <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <script type = "text/javascript" 
         src = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/ext-all.js"></script>
      
      <script type = "text/javascript">
     
      Ext.onReady(function() {
    	/*  var store = new Ext.data.JsonStore({
        	  url: 'http://192.168.125.77:8180/apijdbc/rest/cruddata/sending/'+numbers,

        	  fields: ['id', 'name']
        	  });
    	*/
    	  
    	  var myData = [{name:"gaja",id=98},
              {name:"ravikumar",id:25},
              {name:"rajesh",id:26}
             ];
    	  
    	  store.load();
    	  var grid = new Ext.grid.GridPanel({
    	  title:'details',
    	  store: myData,
    	  columns: [
    	  { header: "ID", dataIndex: 'id', },
    	  {  header: "Name", dataIndex: 'name',}
    	  ],
    	 
    	  renderTo: 'info',
    	  width: 300,
    	  height: 300,
    	  loadMask: true
    	  });
    	  
    	  });

      
      
      
      
      
      
    
    
      
      /*      var plannedGridStore = new Ext.data.JsonStore({
		    autoLoad: true,
		    fields: ['id','name'],
		});
      var store = Ext.create('Ext.data.Store', {
          model: 'Product',
          proxy: {
              type: 'ajax',
               url:'http://192.168.125.77:8180/apijdbc/rest/cruddata/sending/'+numbers,
        reader: {
                  type: 'json'
              }
          }
     });

     store.load();

      var grid = Ext.create('Ext.grid.Panel', {
          store: store,
          columns: [{ text:'ID' ,dataIndex:'id'},
  		      { text:'Name' ,dataIndex:'name'},],
  		      height:600,
		        width:2000,
		        renderTo: 'grid-example',
		        title:'test list'
   		    });
*/
      
      
      </script>
      </head>
      
      <body style="color:azure;background-color: rgb(32, 32, 32);">
         <div id = "info"></div>
         <div id = "btn"></div>
      </body>
   </html>
    -->
