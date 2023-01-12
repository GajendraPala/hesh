<!DOCTYPE html>
<html>
   <head>
      <link href="https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-classic/resources/theme-classic-all.css"
         rel = "stylesheet" />
      <script type = "text/javascript"
         src = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/ext-all.js"></script>
      
      <script type = "text/javascript">
         Ext.onReady(function() {
            Ext.create('Ext.tab.Panel', {
               renderTo: Ext.getBody(),
               requires: ['Ext.layout.container.Card'],
               xtype: 'layout-cardtabs',
               width: 600,
               height: 200,
               items:[{
                  title: 'Tab 1',
                  html:   'This is first tab.'
               },{
                  title: 'Tab 2',
                  html: 'This is second tab.'
               },{
                  title: 'Tab 3',
                  html: 'This is third tab.'
               }]
            });
         });
      </script>
   </head>
   
   <body  style="color:azure;background-color: rgb(32, 32, 32);">
   </body>
</html>
