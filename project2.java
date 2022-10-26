import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
class BankServer{
    static long  acnostarts=324516l;
    String name;
    long acno;
    long debitCardNumber;
    int pin;
    double balance;
    BankServer( long debitCardNumber,int pin,double balance){
this.acno=acnostarts++;
this.debitCardNumber=debitCardNumber;
this.pin=pin;
this.balance=balance;
    }

    void display(){
        System.out.println(acno);
    }
}
class SBI extends BankServer{
    SBI(long debitCardNumber,int pin,double balance){
        super(debitCardNumber,pin, balance);
    }}
    class IndianBank extends BankServer{
        IndianBank(long debitCardNumber,int pin,double balance){
             super(debitCardNumber,pin, balance);
        }
    }
    class HDFC extends BankServer{
    	HDFC(long debitCardNumber,int pin,double balance){
             super(debitCardNumber,pin, balance);
    }}
    class myAccount{
        double myBalance=0;
    }

class RR {

    String Aadhar;
    
    // return values processed data
    String Startpoint;
    String lastloc;
    int totalpassengers;
    String nameofcandidate;
    String Mobile;
long adris;
    int bustimechooseen;
int avbus;
int totalpassengerare;
int toatlseatsavailable;
String combineuesersdata;
int[] SEATIS = new int[51];
    int l1=0;
    int l2=0;
    // PRICE FUNCTION
   
    //--------------------------------------------------------------------availability
    int  availability(int hour){
        System.out.println("LIST OF BUSSES AVAILABLE  @ \n 7:00 am \n 10:00 am \n 17:00 am \n 20:00 am ");
        if ( hour<5 ) {
            System.out.println("LIST OF BUSSES AVAILABLE  @ \n 7:00 am \n 10:00 am \n 17:00 am \n 20:00 am ");
         return 1;
        } else if(hour<8) {
            System.out.println("LIST OF BUSSES AVAILABLE  @  \n 10:00 am \n 17:00 am \n 20:00 am ");
            return 2;
        }
        else if(hour<15) {
            System.out.println("LIST OF BUSSES AVAILABLE  @  \n 17:00 am \n 20:00 am ");
            return 3;
        } else if(hour<18 ) {
            System.out.println("LIST OF BUSSES AVAILABLE @  \n 20:00 am ");
            return 4;
        }else{
            System.out.println(" *'TIME OUT '* YOU CAN BOOK TOMORROW  ");
        }
        return 0;
     }
    //------------------------------------------------------------------------------bus timings from user
    int bustime(int a){
        if(a==7){
            return 7;
         }else if (a==10) {
            return 10;
            } else if(a==17){
            return 17;
        }
        else if(a==20){
            return 20;
        }else{
            return 0;
        }
        }
    // ----------------------------------------------------------------------------BOARDING POINT
    String locate(int loc) {
        String fullloc = "";
        if (loc == 1) {
            this.l1=1;
            System.out.println("YOUR BOARDING POINT IS " + loc + " ITTUMADU ");
            fullloc = " ITTUMADU ";
        } else if (loc == 2) {
            System.out.println("YOUR BOARDING POINT IS " + loc + " KBS BANGALORE " );
            fullloc = " KBS BANGALORE ";
            this.l1=2;
        } else if (loc == 3) {
            System.out.println("YOUR BOARDING POINT IS " + loc + " KR PURAM " );
            fullloc = " KR PURAM ";
            this.l1=3;
        } else {
            System.out.println("IN VALID LOCATION PLEASE CHOOSE 1TO 5 BASED ON YOUR LOCATION LISTED ABOVE " + loc);
            fullloc = " INVALID LOCATION ";
        }
        return fullloc;
    }
    //----------------------------------------------------------------------------last location
    String lastlocation(int loc) {
        String fullloc = "";
        if (loc == 1) {
            System.out.println("YOUR LEAVING POINT IS " + loc + " BALIJAKANDRIGA " );
            fullloc = " BALIJAKANDRIGA ";
            this.l2=1;
        } else if (loc == 2) {
            System.out.println("YOUR LEAVING  POINT IS " + loc + " AMUDALA " );
            fullloc = " AMUDALA ";
            this.l2=2;
        } else if (loc == 3) {
            System.out.println("YOUR LEAVING POINT IS " + loc + " CHITTOOR " );
            fullloc = " CHITTOOR ";
            this.l2=3;
        } else {
            System.out.println("IN VALID LOCATION PLEASE CHOOSE 1TO 4 BASED ON YOUR LOCATION LISTED ABOVE " + loc);
            fullloc = " INVALID LOCATION ";
        }
        return fullloc;
    }
    //-----------------------------------------------------------data for price for particular location
    public int priceforloc(int a,int b)
    {
        if(a==1&b==1){
       return 100;}
        else if(a==2&&b==2){
            return 80;
        }
        else if(a==3&&b==3){
            return 60;
        }
        else if (a==1&&b==2 ||a==2&&b==1) {  
         return 80;}
        else if(a==1&&b==3 ||a==3&&b==1){
        return 80;}
    else if(a==2&&b==3 ||a==3&&b==2){
        return 70;
    }
     return 0;    
        }
    // --------------------------------------------------------------------------MOBILE NUMBER VALIDATION
    Scanner dd = new Scanner(System.in);
              String Cell() {
        long Cellis =dd.nextLong();
        String Cellval=""+Cellis;
        for(int k=0;k<=k+1;k++){
           int length = Cellval.length();
            if (length != 10) {
                System.out.println("INVALID MOBILE  NUMBER PLEASE ENTER 10 DIGITS ");
                Cellval =dd.next();
            }
            else{
                break;
            }
        }
            System.out.println("YOUR MOBILE  NUMBER IS  :" + Cellval);
        return Cellval;
    }
    // ---------------------------------------------------------------------AADHAR NUMBER VALIDATION
    long Adr(Long x) {
        String inttotext=""+x;
        //int length = inttotext.length();
       // String Cellval=""+inttotext;
        for(int k=0;k<=k+1;k++){
           int length = inttotext.length();
            if (length != 12) {
                System.out.println("INVALID AADHAR  NUMBER PLEASE ENTER 12 DIGITS ");
                inttotext =dd.next();
            }
            else{
                break;
            }
        }
        return x;
    }
    //------------------------------------------------------------------------- NAME OF CANDIDATES
    String Name() {
        System.out.println("PLEASE ENTER PASSENGER NAME/HEAD OF THE PASSENGERS");
        String nameis = dd.next();
        System.out.println(nameis);
        return nameis;
    }
     //----------------------------------------------------------------------------..total passenger list
     String totalpass(int tt) {
        //storing seat numbers

         int[] a = new int[tt];
         // storing for names of
         this.totalpassengerare=tt;
         String[] nn=new String[tt];
         String totalpassdata = " ";
         int[] Age=new int[tt];
         String[] gender=new String[tt];
         Scanner o = new Scanner(System.in);
         for (int i = 0; i <= tt; i++) {
             if (i>=tt) {
                 System.out.println();
                 break;}
              System.out.println("PLEASE ENTER SEAT NO FOR "+(i+1)+" PASSENGER ");
             a[i] = o.nextInt();
             for(int l=0;l<=50;l++){
                for(int g=0;g<=50;g++){
              for(int j=1;j<=50;j++){
               if (SEATIS[j]==a[i]){
                System.out.print("  THIS SEAT IS ALREADY BOOKED \n PLEASE ENTER ANY OTHER SEAT NUMBER \n");
                a[i] = o.nextInt();
                continue;
               }
               }
              
              }
              this.SEATIS[a[i]]=a[i];
                if(SEATIS[i]!=0){
                   System.out.print("SEAT IS ALREADY BOOKED PLEASE SELECT");
                   a[i] = o.nextInt();}
                else{break;}
               }
             this.SEATIS[a[i]]=a[i];
             System.out.println("PLEASE ENTER "+(i+1)+" PASSENGER NAME");
             nn[i]=o.next();
             System.out.println("PLEASE ENTER AGE FOR "+(i+1)+" PASSENGER ");
             Age[i]=o.nextInt();
             System.out.println("PLEASE ENTER GENDER NO FOR "+(i+1)+" PASSENGER ");
             //gender[i]=o.next();
             String genderis=o.next();
             if(genderis.equalsIgnoreCase("male")){
                gender[i]="MALE";
             }else if(genderis.equalsIgnoreCase("female")){
                 gender[i]="FEMALE";
             }else{
                genderis="OTHER";
                 System.out.println("INVALID GENDER  ");
                for(int p=0;p<(p+1);p++){
                System.out.println("INVALID GENDER PLEASE ENTER VALID GENDER ");
                genderis=o.next();
               if(genderis.equalsIgnoreCase("male"))
                {
                     gender[i]="MALE";
                     break;
                }else if( genderis.equalsIgnoreCase("female")){
                  gender[i]="FEMALE";
                  break;
               }
                
               }
                }
             
             System.out.println(nn[i] + "  "+ a[i]);
 
             totalpassdata=totalpassdata+"SEAT NO  "+a[i]+" NAME  "+nn[i]+"  AGE IS   "+Age[i]+"  GENDER IS  "+gender[i]+"\n";
         }
         return totalpassdata;
     }
  int Check()
  {
    LocalTime date= LocalTime.now();
int Time=date.getHour();
   // Calendar c= Calendar.getInstance();
   // int Time =c.get(Calendar.HOUR);
    System.out.println("PRESENT TIME IS ------------------------------"+Time);
   
return Time;
  }
  //.....................bus layout...................................
   void layout(){
        System.out.println("------------------");
        for(int k=1;k<=50;k++){
          if(k%5==0){
            if(k==5){
                System.out.print(k+"   @");
                System.out.println();
            }else{
            System.out.print(k);
             System.out.println();}
        }else{
            System.out.print(k+" ");
        }
      }
        System.out.println("----------------------");  
   }
//-----------------------------------for printing the tickets booked--------------------
   void afterselectingseats(){
    System.out.println("---------------");
    for(int k=1;k<=50;k++){
        if(k==this.SEATIS[k]){
            if(k==5){
                System.out.print("*    @");
            }else{
            System.out.print(" * ");}
            if(k%5==0){
            
                System.out.println();}
        }else{
            System.out.print(k+" ");
            if(k%5==0){
                if(k==5){
                    System.out.print("   @");
                }
            
            System.out.println();}
        }   
        }
        System.out.println("---------------");
  }
  int Book_exit(){
    System.out.println("THANK YOU FOR YOUR BOOKED THE TICKET PLEASE ENTER \n MAKE-PAYMENT \n OR \n BOOK-AGAIN");
  String str= dd.next();  
    if(str.equalsIgnoreCase("MAKE-PAYMENT")) {
        System.out.println("THANK YOU FOR YOUR BOOKED THE TICKET");
        return 0;
    }
    if(str.equalsIgnoreCase("BOOK-AGAIN")) {
        return 1;
        }
    return 0;
  }
void online(){
    System.out.println("PLEASE ENTER YOUR PHONE/GOOGLE PAY NUMBER ");
    long PPGP=dd.nextLong();
    String ppgp=""+PPGP;
    
    for(int i=0;i<i++;i++){
        if(ppgp.length()<9){
  System.out.println("ENTERED NUMBER IS INVALID PLEASE ENTER AGAIN \n ");
        PPGP=dd.nextLong();
    }
else{
    break;
}}

}
 void usingcard(){
    System.out.println("PLEASE ENTER YOUR DEBIT CARD NUMBER ");
    long DEBITCARDNO=dd.nextLong();
    String debit=""+DEBITCARDNO;
    System.out.println("PLEASE ENTER YOUR DEBIT CARD ' CVV ' NUMBER ");
    short cvv=dd.nextShort();
    String CVV=cvv+"";
    for(int i=0;i<i+1;i++){
        if(debit.length()<12){
                System.out.println("ENTERED DEBIT CARD NUMBER IS INVALID PLEASE ENTER AGAIN \n ");
                      DEBITCARDNO=dd.nextLong();
        }
        if(CVV.length()<4){
  System.out.println("ENTERED CVV  NUMBER IS INVALID PLEASE ENTER AGAIN \n ");
        cvv=dd.nextShort();
    }
else{
    break;
}}
 }
}
class project2 {
    public static void main(String[] args) {
         myAccount mc=new myAccount();
        int loop=1;
        int totalprice=0;
      //  while(loop==1){
        // reference is created
        RR g = new RR();
        // scanner class
        Scanner ud = new Scanner(System.in);
        //busses available is............................
        g.avbus=(g. availability(g.Check()));
        if(g.avbus!=0){
            System.out.println(" PLEASE ENTER BUS TIME BASED ON AVAILABLE TIMINGS");
         g.bustimechooseen=  g.bustime(ud.nextInt());
            }
        
            for(int x=0;x<x+1;x++){
           if(g.bustimechooseen>g.Check()&&((g.bustimechooseen==7)||(g.bustimechooseen==10)||(g.bustimechooseen==17)||(g.bustimechooseen==20))){
        
            System.out.println("YOUR BUS TIMING IS :  " +g.bustimechooseen);
            
               // System.out.println("your entered mismatched timing please choose based on above listed");
        break;
           }
           else{
            
            System.out.println("-------------BUS TIMING IS INVALID CAN YOU PLEASE ENTER CORRECT TIMING IN AVAILABLE SERVICES -------------");
            
                g.bustimechooseen=g.bustime(ud.nextInt());
            

           }}
    
        System.out.println(
                "PLEASE ENTER NUMBER ACCORDING TO YOUR BOARDING  LOCATON \n 1.ITTUMADU  \n 2.KBS BANGALORE \n 3.KR PURAM ");
               // g.Check();

    //starting point .......................................................
        g.Startpoint = g.locate(ud.nextInt() );
        System.out.println(
            "PLEASE ENTER NUMBER ACCORDING TO YOUR  ENDING LOCATON \n 1.BALIJAKANDRIGA \n 2.AMUDALA 2 \n 3.CHITTOOR");
             g.lastloc=g.lastlocation(ud.nextInt());
             System.out.println(g.lastloc);

             System.out.println("STARTING LOCATION :  "+g.l1);
             System.out.println("ENDING LOCATION   :  "+g.l2);
             int cost=g. priceforloc(g.l1,g.l2);
             //System.out.println("your cost is   "+cost);

        System.out.println(" PLEASE ENTER YOUR MOBILE NUMBER   ");
        g.Mobile = g.Cell();
        g.nameofcandidate = g.Name();
       
        System.out.println(" PLEASE ENTER YOUR AADHAR NUMBER   ");
        // g.Aadhar = ud.next();
        g.adris = g.Adr(ud.nextLong());
         g.layout();
        System.out.println("PLEASE ENTER NO OF TICKETS");
       g.combineuesersdata= g.totalpass(ud.nextInt());
        //System.out.println("TOTAL DETAILS  \n STARTING LOCATION: " + g.Startpoint + "\n MOBILE NO: " + g.Mobile + "\n HEAD OF THE CANDIDATE :" + g.nameofcandidate + "\n AADHAR ID :" + g.adris);
 System.out.println("\n------------------TOTAL DETAILS ---------------------------");
 g.afterselectingseats();
 System.out.println("BUS TIMING CHOOSEN :"+g.bustimechooseen+"\n STARTING LOCATION: " + g.Startpoint +"\n"+"LAST LOCATION IS "+g.lastloc+"\n"+"\n MOBILE NO: " + g.Mobile + "\n HEAD OF THE CANDIDATE :" + g.nameofcandidate + "\n AADHAR ID :" + g.adris);
 System.out.println("NO OF SEATS :"+g.totalpassengerare);
 totalprice=totalprice+ g.totalpassengerare*cost;
 System.out.println("TOTAL PRICE IS : " +totalprice);
 
 System.out.print(g.combineuesersdata);
 int be=g.Book_exit();
 if(be==0){
    loop=0;
//break;
 }else{
    loop=1;
    //loop++;
 }
        //}
        while(loop==1){
   if(loop==1){
    System.out.println(
        "PLEASE ENTER NUMBER ACCORDING TO YOUR BOARDING  LOCATON \n 1.ITTUMADU  \n 2.KBS BANGALORE \n 3.KR PURAM ");
       // g.Check();
     g.Startpoint = g.locate(ud.nextInt() );
     System.out.println(
            "PLEASE ENTER NUMBER ACCORDING TO YOUR  ENDING LOCATON \n 1.BALIJAKANDRIGA \n 2.AMUDALA 2 \n 3.CHITTOOR");
             g.lastloc=g.lastlocation(ud.nextInt());
    System.out.println("PLEASE ENTER NO OF TICKETS");
    g.combineuesersdata= g.totalpass(ud.nextInt());
    g.afterselectingseats();
    System.out.print(g.combineuesersdata);
     cost=g. priceforloc(g.l1,g.l2);
     totalprice=totalprice+( g.totalpassengerare*cost);
     System.out.println("TOTAL PRICE IS : "+totalprice);
     be=g.Book_exit();
    if(be==0){
       loop=0;
   //break;
    }else{
       loop=1;
       //loop++;
    }
   }
   
        }
//------------------------------------------PAYMENT 
System.out.println("-----------------------    TOTAL PRICE IS : "+totalprice+"/-"+"   ---------------------------------------");
//System.out.println("PLEASE ENTER PAYMENT MODE \n 1.PHONE PAY \n 2.GOOGLE PAY \n 3.DEBIT CARD");
//String paymod=ud.next();
   ArrayList<SBI> sbi=new ArrayList<SBI>();
        ArrayList<IndianBank> ind =new ArrayList<IndianBank>();
        ArrayList<HDFC> hdfc =new ArrayList<HDFC>();
        
        Scanner input=new Scanner(System.in);

       BankServer b=new BankServer(87546334,4653,4544);
       b.display();
       SBI sbi1=new SBI(764545l,7544,5653);
        sbi.add(sbi1);
        sbi1.display();
         SBI sbi2=new SBI(764545l,7544,5653);
          SBI sbi3=new SBI(54544544l,7894,154854);
           SBI sbi4=new SBI(54787545l,1549,5653);
            SBI sbi5=new SBI(145545474l,1236,9788455);
             SBI sbi6=new SBI(764545l,5497,5478452);
              SBI sbi7=new SBI(647865l,8576,48854);
              sbi.add(sbi2);
              sbi.add(sbi3);sbi.add(sbi4);
              sbi.add(sbi5);sbi.add(sbi6);sbi.add(sbi7);
           // for(int i=0;i<sbi.size();i++){
             //   System.out.println("pin in the sbi ---------"+sbi.get(i).pin);
               
           // }
           IndianBank ind1=new IndianBank(544454554l,4544,4672);
            IndianBank ind2=new IndianBank(154544542l,1564,14521);
            IndianBank ind3=new IndianBank(744545844l,1246,15445);
            IndianBank ind4=new IndianBank(654454l,5798,145415);
            IndianBank ind5 =new IndianBank(2478544l,1264,78454);
            IndianBank ind6 =new IndianBank(465434l,9854,465456);
            IndianBank ind7 =new IndianBank(14554455l,1297,6795);
            IndianBank ind8 =new IndianBank(2665454l,6597,58545);
            IndianBank ind9 =new IndianBank(5444565l,8647,67845);
            ind.add(ind1);
            ind.add(ind2);
            ind.add(ind3);
            ind.add(ind4);
            ind.add(ind5);
            ind.add(ind6);
            ind.add(ind7);
            ind.add(ind8);
            ind.add(ind9);
   // for(int i=0;i<ind.size();i++){
     //  System.out.println( "balance is in indian  "+ind.get(i).balance);
    //}
HDFC hdfc1=new HDFC(4524521554l,2654,981455);
HDFC hdfc2=new HDFC(545354545l,5684,981455);
HDFC hdfc3=new HDFC(654655l,7899,981455);
HDFC hdfc4=new HDFC(9789653254l,1563,981455);
HDFC hdfc5=new HDFC(76559765l,2974,981455);
HDFC hdfc6=new HDFC(867675446l,1591,981455);
HDFC  hdfc7=new HDFC(9876765456l,9851,981455);
HDFC hdfc8=new HDFC(876345678l,3547,981455);
HDFC hdfc9=new HDFC(8776556212l,3575,981455);
         hdfc.add(hdfc1);
         hdfc.add(hdfc2);
         hdfc.add(hdfc3);
         hdfc.add(hdfc4);
         hdfc.add(hdfc5);
         hdfc.add(hdfc6);
         hdfc.add(hdfc7);
         hdfc.add(hdfc8);
         hdfc.add(hdfc9);
       //  for(int i=0;i<ind.size();i++){
         //    System.out.println( "debit card number of   hdfc  "+hdfc.get(i).debitCardNumber);
         //}
         System.out.println("PLEASE CHOOSE YOUR BANK NAME \n  SBI \n INDIAN-BANK \n HDFC");
        String nameOfBank= input.next();
         System.out.println("PLEASE ENTER YOUR PIN ");
         int pinis= input.nextInt();
         System.out.println("PLEASE ENTER YOUR amount ");

         double balanceWithdraw=input.nextInt();
         double bankBalance=0;
         int j;
         BankServer bs = null;
         if(nameOfBank.equalsIgnoreCase("sbi")==true) {
        	 for( int i=0;i<sbi.size();i++){
                 if(sbi.get(i).pin==pinis) {
                	 j=i;
                	 bs=sbi.get(i);
                	bankBalance= sbi.get(i).balance;
                 }
             } 
             

         }
         else if(nameOfBank.equalsIgnoreCase("indian")==true) {
        	 for(int i=0;i<ind.size();i++){
                 if(ind.get(i).pin==pinis) {
                	 j=i;
                	 bs=sbi.get(i);
                	bankBalance= ind.get(i).balance;
                 }
             }
        	 
         }else if(nameOfBank.equalsIgnoreCase("hdfc")==true)
         {
        	 for(int i=0;i<hdfc.size();i++){
                 if(hdfc.get(i).pin==pinis) {
                	 j=i;
                	 bs=sbi.get(i);
                	bankBalance= hdfc.get(i).balance;
                 }
             }}
         else {
        	 System.out.println("INVALID BANK NAME ");
         }
         System.out.println(bankBalance);
         if(bankBalance>balanceWithdraw) {
    
        	 //my account want to upload...........
        	 bs.balance=bankBalance-balanceWithdraw;
             mc.myBalance=balanceWithdraw;
         }else {
        	 System.out.println("-----------------------IN-SUFFICIENT BALANCE------------------");
         }
         System.out.println(" amount balance after  becomes-----"+bs.balance);
         System.out.println("KSRTC BALANCE AFTER BOOKING ::"+ mc.myBalance);
    }


/*
if(paymod.equalsIgnoreCase("PHONE PAY")||paymod.equalsIgnoreCase("GOOGLE PAY")){
  g.online();
}else{
    g.usingcard();
}*/
//-----------------------------------------------------------------main ended
}

