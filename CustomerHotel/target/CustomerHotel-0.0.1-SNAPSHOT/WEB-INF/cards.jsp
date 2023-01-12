<!DOCTYPE html>
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
               requires: ['Ext.layout.container.Card'],
               layout: 'card',
               width: 600,
               height: 200,
               Padding: 15,
               margin:20,
               defaults: {
                  border:false
               },
               defaultListenerScope: true,
               
               bbar: ['->',
               {
                  itemId: 'card-prev',
                  text: '« Previous',
                  handler: 'showPrevious',
                  disabled: true
               },{
                  itemId: 'card-next',
                  text: 'Next »',
                  handler: 'showNext'
               },{
                   itemId: 'save',
                   text: 'save',
                   handler: 'finish',
                	   disabled: true
                }],
         
               items: [{
                   id: 'card0',
                     html:'Which Set class should be most popular in a multi-threading environment, considering performance constraint?</br>'+
                   ' HashSet<input name="radio" type="radio"/> Linked HashSet<input name="radio"  type="radio"/>  treeset<input  name="radio" type="radio"/>',
                   
                },{
                   id: 'card1',
                   html: ' Who invented Java Programming?<BR/> Guido van Rossum<input name="radio" type="radio"/> James Gosling<input name="radio"  type="radio"/>  Dennis Ritchie<input  name="radio" type="radio"/>'
                },{
                   id: 'card2',
                   html: '  Which component is used to compile, debug and execute the java programs?<BR/>JRE<input name="radio" type="radio"/> JVM<input name="radio"  type="radio"/>  JDK<input  name="radio" type="radio"/>'
                },{
                   id: 'card3',
                   html: 'Which one of the following is not a Java feature?<BR/> Object-oriented<input name="radio" type="radio"/> Use of pointers<input name="radio"  type="radio"/> Portable<input  name="radio" type="radio"/>'
                },{
                    id: 'card4',
                    html: '  Which of these cannot be used for a variable name in Java?<BR/> identifier & keyword<input name="radio" type="radio"/>  identifier<input name="radio"  type="radio"/>  keyword<input  name="radio" type="radio"/>'
                 }],
                
               showNext: function () {
                  this.cardPanelNavigation(1);
               },
            
               showPrevious: function (btn) {
                  this.cardPanelNavigation(-1);
               },
               finish: function (btn) {
                   Ext.MessageBox.alert('saved', 'saved data into the db');
                },
               cardPanelNavigation: function (incr) {
                  var me = this;
                  var l = me.getLayout();
                  var i = l.activeItem.id.split('card')[1];
                  var next = parseInt(i, 10) + incr;
                  l.setActiveItem(next);
                  me.down('#card-prev').setDisabled(next===0);
                  me.down('#card-next').setDisabled(next===4);
                  me.down('#save').setDisabled(next!=4);
                  
               }
            });
         });
      </script>
   </head>

   <body  style="color:azure;background-color: rgb(32, 32, 32);">
   </body>
</html>