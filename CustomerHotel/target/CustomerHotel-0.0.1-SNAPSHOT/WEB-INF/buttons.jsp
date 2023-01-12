
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
               defaults: {
            arrowAlign: 'bottom',
            menu: [{
                text: 'Menu Item 1'
            }, {
                text: 'Menu Item 2'
            }, {
                text: 'Menu Item 3'
            }]
        },

               items: [{
                id:'cid',
                  xtype: 'displayfield',
                  fieldLabel: 'Customer Id',
                value:12435,
               },{
                  xtype: 'button',
           text: 'Medium',
           scale: 'medium'
               },{
                id:'cmn',  
                 xtype: 'textfield',
                  fieldLabel: 'mobile-number',
                  
               },{
                id:'tno',},{
           xtype: 'button',
           iconCls: 'button-home-small',
           text: 'Small',
           iconAlign: 'right'
       }, {
           xtype: 'button',
           
           iconCls: 'button-home-medium',
           text: 'home',
           scale: 'medium',
           iconAlign: 'right'
       }, {
           xtype: 'button',
           iconCls: 'button-home-large',
           text: 'Large',
           scale: 'large',
           iconAlign: 'right'
       },{
           xtype: 'button',
           iconCls: 'button-home-small',
           text: 'Small',
           iconAlign: 'top'
       }, {
           xtype: 'button',
           iconCls: 'button-home-medium',
           text: 'Medium',
           scale: 'medium',
           iconAlign: 'top'
       }, {
           xtype: 'button',
           iconCls: 'button-home-large',
           text: 'Large',
           scale: 'large',
           iconAlign: 'top'
       }, {
           xtype: 'button',
           iconCls: 'button-home-small',
           text: 'Small',
           iconAlign: 'bottom'
       }, {
           xtype: 'button',
           iconCls: 'button-home-medium',
           text: 'Medium',
           scale: 'medium',
           iconAlign: 'bottom'
       }, {
           xtype: 'button',
           iconCls: 'button-home-large',
           text: 'Large',
           scale: 'large',
           iconAlign: 'bottom'
       }
               
               
               
               ]
               });
            });
      </script>
   </head>
   <body style="background-color: black;">
      <div id = "myinfo"></div>
      <div id="price"></div>
   </body>
</html>

