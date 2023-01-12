<!DOCTYPE html>
<html>
   <head>
      <link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/classic/theme-classic/resources/theme-classic-all.css" 
         rel = "stylesheet" />
      <script type = "text/javascript" 
         src = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.0.0/ext-all.js"></script>
   
      <script type = "text/javascript">
         Ext.onReady(function() {
            Ext.create('Ext.container.Container', {
               renderTo : 'acr',
               layout : 'accordion' ,
               width : 600,
               
               items : [{
                  title : 'GP',
                  html : '<h2> GAJENDRA</H2>'
               },{
                  title : 'RR',
                  html : '<h2> RAVIKUMAR </h2>'
               },{
                  title :'RK',
                  html : '<h2> RAKESH </h2>'
               },{
                  title : 'VK',
                  html : '<h2> VENKAT </h2>'
               },{
                  title : 'SK',
                  html : '<h2> SUDHAKAR </h2>'
               }]
            });
         });
      </script>
   </head>
   
   <body  style="color:azure;background-color: rgb(32, 32, 32);">
   <div id="acr"></div>
   </body>
</html>