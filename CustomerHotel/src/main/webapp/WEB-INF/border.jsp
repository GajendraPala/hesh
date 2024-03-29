
!DOCTYPE html>
<html>
   <head>
      <link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-classic/resources/theme-classic-all.css" 
         rel = "stylesheet" />
      <script type = "text/javascript" 
         src = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/ext-all.js"></script>
      
      <script type = "text/javascript">
         Ext.onReady(function() {
            Ext.create('Ext.panel.Panel', {
               renderTo: Ext.getBody(),
               height: 300,
               width: 600,
               layout:'border',
               
               defaults: {
                  collapsible: true,
                  split: true,
                  bodyStyle: 'padding:15px'
               },
               items: [{
                   title: 'Panel1',
                   region:'west',
                   html: 'This is Panel 1'
                },{
                   title: 'Panel2',
                   region:'center',
                   html: 'This is Panel 2'
                },{
                   title: 'Panel3',
                   region: 'south',
                   html: 'This is Panel 3'
                },{
                   title: 'Panel4',
                   region: 'east',
                   html: 'This is Panel 4'
                },{
                   title: 'Panel5',
                   region: 'north',
                   html: 'This is Panel 5'
                },{
                   title: 'Panel3',
                   region: 'south',
                   html: 'This is Panel 3'
                }]
            });
         });
      </script>
   </head>
   
   <body  style="color:azure;background-color: rgb(32, 32, 32);">
   </body>
</html>
