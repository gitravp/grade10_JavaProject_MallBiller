import java.io.*;
class mall_VIVA_project
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader(read);
        int visits=0;                        //store no of stores visited
        String store[]=new String[15];       //store final bill statement form each store visited
        double total[]=new double[15];       //store total cost for each floor visited
        int k;                               //ctr to run final bill print statements 'visits' times                          
        double finale=0.0;                   //store final bill total
        int floor=0;                         //STORE FLOOR NO.
        String yon="";                    //store choice to continue shopping or not

        //auto stand
        int area;          //store area to go
        int nauto;         //store no of autos
        double autocost;   //store final auto cost
	
        //1ST FLOOR
        String l[]={"1.Fruit Salads with Ice Cream 50/-","2.Brownie with Ice Cream 50/-","3.Chocolate Fudge 50/-",           //store final statements to print 
                "4.Fruit Overload 70/-","5.Death By Chocolate 90/-","6.Lychee with Ice Cream 90/-","7.Malay Kulfi 30/",  //bill for lassi spot
                "8.Pista Malay  40/-","9.Strawberry 50/","10.Banana 50/-", "11.Sweet Lassi 30/",
                "12.Banana Lassi 30/-","13.Mango Lassi 40/-","14.Fruit Lassi 40/-","15.Saffron Lassi 50/-",
                "16.Dry Fruit Lassi 50/-","17.Hard Rock Coffee 40/-","18.Strawberry Coffee 50/-",
                "19.Chocolate Coffee 50/-","20.Mud Coffee 70/-"};                                                                                                     
        String order[]=new String[10];         //store bill statement for all orders of customer
        int lassi;                             //store order no placed
        int lascost=0;                         //store final cost of bill at lassi spot
        int noo=0;                             //store no of orders at lassi spot
        int j;                                 //run loop 'noo'times to print bill

        //2RD FLOOR
        String df[]={"1.Onion(15/kg)","2.Tomato(25/kg)","3.Potato(30/kg)","4.Brinjal(25/kg)",                                  //store final statements to print
                "5.Beans(40/kg)","6.Capsicum(50/kg)","7.Carrot(60/kg)",                                                   //bill for daily fresh
                "8.Banana(70/kg)","9.Apple(150/kg)","10.Papaya(30/kg)",
                "11.Watermelon(30/kg)","12.Guava(100/kg)","13.Pomogranate(100/kg)","14.Orange(30/kg)"
            ,"15.Sugar(40/kg)","16.Salt(15/kg)","17.Rice(40/kg)",
                "18.WheatFlour(30/kg)","19.Oil(85/kg)","20.Ghee(500/kg)"};           
        int dfno=0;                            //store order no in daily fresh
        int dfqtty[]=new int[20];              //store quantity for ordered item
        String dforder[]=new String[20];       //store final statement for item ordered by customer
        int dfcost[]=new int[20];              //store induvidual cost of items ordered by customer
        int h;                                 //ctr to run loop to print bill for daily fresh
        int kg;                                //store weight of item to calculate cost
        int dftot=0;                           //daily fresh total cost
        int nodf=0;                            //store no of items at daily fresh to run loop

        //3TH FLOOR

        //FOODCOURT:
        String chFC=" ";                       //store choice of restaurant at food court
        //DOMINOS
        String pizzasize="";                    //store pizza size
        int pizzatype=0;                       //store pizza type
        int pizzacost=0;                       //store pizza cost
        int pizaddon=0;                        //accept choice of add ons
        String pizza=" ";                      //store billing statement for pizza

        //SUBWAY                                                  
        int nosub=0;                           //store no of sandwiches
        int i;                                 //ctr for runnong loop 'nosub' times
        int subtype;                           //to store type of sandwich
        String subway="";                      //to store name of sandwich
        int subcost=0;                         //to store type of sandwich
        String bread="";                       //to store name of bread
        int brdtype;                           //to store type of bread
        String veggie="";                      //to store vegetables
        int vegno;                             //to store yes or no for the vegetable
        int subsize;                           //to store size of sandwich
        int Subcost;                           //to store cost of sandwich
        int subaddon=0;                        //to store addons
        String v[]={"lettuce","tomato","cucumber","olives",          //to supply name of vegetables
                "jalapeno","mushroom","brocoli"};                                                                       

        //4TH FLOOR:INOX MOVIES
        String movie=" ";                      //store movie selection
        String moviename=" ";                  //store movie name 
        String addon=" ";                      //store choice of addons
        int moviecost=0;                       //store cost of movie
        int movieticket=0;                     // store no of tickets
        char movielang;                        //store language of movie
        int addoncost=0;                       // store cost of add ons        

        System.out.println("                           **********************************************************************************************   ");
        System.out.println("                           *   _____   ____   _____   ____         ____  ___   _        __  __     ___                  *   ");
        System.out.println("                           *  |       |    |  |    | |    | |     |    | |  |  |        | | | |   |   |  |    |         *   ");
        System.out.println("                           *  |   __  |    |  |____| |____| |     |____| |  |  |    __  | |_| |   |___|  |    |         *   ");
        System.out.println("                           *  |_____| |____|  |      |    | |____ |    | |  |__|        |     |   |   |  |___ |___      *   ");
        System.out.println("                           **********************************************************************************************   ");
        do
        {

            System.out.println("  _____                       ");                            
            System.out.println(" |floor|  ___  Inox*movies    ");            
            System.out.println(" |__4__|                      ");
            System.out.println("  _____                       ");                            
            System.out.println(" |floor|  ___  foodCourt      ");            
            System.out.println(" |__3__|                      ");
            System.out.println("  _____                       ");                            
            System.out.println(" |floor|  ___  Daily Fresh    ");            
            System.out.println(" |__2__|                      ");
            System.out.println("  _____                       ");                            
            System.out.println(" |floor|  ___  lassi point    ");            
            System.out.println(" |__1__|                      ");
            System.out.println("  _____                       ");                            
            System.out.println(" |floor|  ___ Auto stand      ");            
            System.out.println(" |__0__|                      ");
            System.out.println(" which floor would you like to visit?");
            floor=Integer.parseInt(in.readLine());

            switch(floor)
            {
                case(0):
                {
                    System.out.println("which area would you like to go?");  
                    System.out.println("1.Malleshwaram\n2.marthanhalli\n3.Kormangala\n4.Banshankari\n5.Jayanagar\n6.Basavangudi\n7.Ulsoor\n8.Whitefield\n9.Electronic city\n10.Yelhanka");
                    area=Integer.parseInt(in.readLine());
                    System.out.println("how many autos would you like?(max 4 per auto)");
                    nauto=Integer.parseInt(in.readLine());
                    if(area==1)
                    {autocost=(13*8)*nauto;
                        System.out.println("AREA:MALLESHWARAM\nDISTANCE:13KM\nCOST(RS.8/KM):"+((13*8)*nauto));}
                    else if(area==2)
                    {autocost=(15*8)*nauto;
                        System.out.println("AREA:MARTHALLI\nDISTANCE:15KM\nCOST(RS.8/KM):"+((15*8)*nauto));}
                    else if(area==3)
                    {autocost=(5*8)*nauto;
                        System.out.println("AREA:KORMANGALA\nDISTANCE:5KM\nCOST(RS.8/KM):"+((5*8)*nauto));}
                    else if(area==4)
                    {autocost=(7.5*8)*nauto;
                        System.out.println("AREA:BANSHANKARI\nDISTANCE:7.5KM\nCOST(RS.8/KM):"+((7.5*8)*nauto));}
                    else if(area==5)
                    {autocost=(2.5*8)*nauto;
                        System.out.println("AREA:JAYANAGAR\nDISTANCE:2.5KM\nCOST(RS.8/KM):"+((2.5*8)*nauto));}
                    else if(area==6)
                    {autocost=(6*8)*nauto;
                        System.out.println("AREA:BASAVANAGUDI\nDISTANCE:6KM\nCOST(RS.8/KM):"+(6*8)*nauto);}
                    else if(area==7)
                    {autocost=(10*8)*nauto;
                        System.out.println("AREA:ULSOOR\nDISTANCE:10KM\nCOST(RS.8/KM):"+((10*8)*nauto));}
                    else if(area==8)
                    {autocost=(20*8)*nauto;
                        System.out.println("AREA:WHITEFIELD\nDISTANCE:20KM\nCOST(RS.8/KM):"+((20*8)*nauto));}
                    else if(area==9)
                    {autocost=(13.5*8)*nauto;
                        System.out.println("AREA:ELECTRONIC CITY\nDISTANCE:13.5KM\nCOST(RS.8/KM):"+((13.5*8)*nauto));}
                    else
                    {autocost=(23*8)*nauto;
                        System.out.println("AREA:YELAHANKA\nDISTANCE:23KM\nCOST(RS.8/KM):"+((23*8)*nauto));}
                    store[visits]="AUTO STAND:";
                    total[visits]=autocost;
                }  
                break;  

                case(1):
                {
                    System.out.println("welcome to LASSI POINT\nMENU:\n1.ICECREAMS-\n1.Fruit Salads with Ice Cream 50/-\n2.Brownie with Ice Cream 50/-\n3.Chocolate Fudge 50/-");
                    System.out.println("4.Fruit Overload 70/-\n5.Death By Chocolate 90/-\n6.Lychee with Ice Cream 90/- ");
                    System.out.println("KULFI:\n7.Malay Kulfi 30/-\n8.Pista Malay 40/-");
                    System.out.println("SMOOTHIE:\n9.Strawberry 50/-\n10.Banana 50/-");
                    System.out.println("LASSI:\n11.Sweet Lassi 30/-\n12.Banana Lassi 30/-\n13.Mango Lassi 40/-\n14.Fruit Lassi 40/-\n15.Saffron Lassi 50/-\n16.Dry Fruit Lassi 50/-");
                    System.out.println("COLD COFFEE:\n17.Hard Rock Coffee 40/-\n18.Strawberry Coffee 50/-\n19.Chocolate Coffee 50/-\n20.Mud Coffee 70/-");
                    System.out.println("what would you like to order??.(max 10 items)(enter 0 if you are done)");
                    for(i=0;i<10;i++)
                    {
                        System.out.println("ITEM :"+(i+1));
                        lassi=Integer.parseInt(in.readLine());
                        if(lassi!=0)
                            noo=noo+1;
                        {if((lassi==1)||(lassi==2)||(lassi==3)||(lassi==9)||(lassi==10)||(lassi==15)||(lassi==16)||(lassi==18)||(lassi==19))
                            {
                                lascost=lascost+50;
                                order[i]=l[(lassi-1)];
                            }
                            if((lassi==4)||(lassi==20)) 
                            {
                                lascost=lascost+70;
                                order[i]=l[(lassi-1)];
                            }
                            if((lassi==5)||(lassi==6)) 
                            {
                                lascost=lascost+90;
                                order[i]=l[(lassi-1)];
                            }
                            if((lassi==7)||(lassi==11)||(lassi==12)) 
                            {
                                lascost=lascost+30;
                                order[i]=l[(lassi-1)];
                            }
                            if((lassi==8)||(lassi==13)||(lassi==14)||(lassi==17)) 
                            {
                                lascost=lascost+40;
                                order[i]=l[(lassi-1)];
                            }
                            if(lassi==0)
                            {break;}
                        }
                    } 
                    for(j=0;j<noo;j++)
                    {System.out.println(order[j]);
                    }
                    System.out.println("TOTAL:Rs"+lascost);

                    store[visits]="LASSI POINT:";
                    total[visits]=lascost;
                }

                break;
                case(2):
                {    
                    System.out.println("welcome to Daily fresh.what would you like to order??(max 20 items)(type 0 when done).....");

                    System.out.println("VEGETABLES:\n1.Onion(15/kg)\n2.Tomato(25/kg)\n3.Potato(30/kg)\n4.Brinjal(25/kg)\n5.Beans(40/kg)\n6.Capsicum(50/kg)\n7.Carrot(60/kg)");
                    System.out.println("FRUITS:\n8.Banana(70/kg)\n9.Apple(150/kg)\n10.Papaya(30/kg)\n11.Watermelon(30/kg)\n12.Guava(100/kg)\n13.Pomogranate(100/kg)\n14.Orange(30/kg)");
                    System.out.println("Confectionaries:\n15.Sugar(40/kg)\n16.Salt(15/kg)\nPULSES:\n17.Rice(40/kg)\n18.WheatFlour(30/kg)\nCONDIMENTS:\n19.Oil(85/kg)\n20.Ghee(500/kg)");
                    for(h=0;h<20;h++)
                    {
                        nodf=nodf+1;
                        System.out.println("ITEM"+(h+1)+":");
                        dfno=Integer.parseInt(in.readLine()); 
                        System.out.println("How many kg would you like?");
                        kg=Integer.parseInt(in.readLine());
                        if((dfno==0))
                        {
                            break;
                        }
                        else if((dfno==1)||(dfno==16))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*15;
                            dftot=dftot+dfcost[h];
                        }
                        else if((dfno==2)||(dfno==4))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*25;
                            dftot=dftot+dfcost[h];
                        }
                        else if((dfno==3)||(dfno==10)||(dfno==14)||(dfno==18)||(dfno==11))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*30;
                            dftot=dftot+dfcost[h];
                        }
                        else if((dfno==5)||(dfno==15)||(dfno==17))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*40;
                            dftot=dftot+dfcost[h];
                        }
                        else if((dfno==6))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*50;
                            dftot=dftot+dfcost[h];

                        }
                        else if((dfno==7))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*60;
                            dftot=dftot+dfcost[h];
                        }
                        else if((dfno==8))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*70;
                            dftot=dftot+dfcost[h];
                        }
                        else if((dfno==9))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*150;
                            dftot=dftot+dfcost[h];

                        }
                        else if((dfno==12)||(dfno==13))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*100;
                            dftot=dftot+dfcost[h];

                        }
                        else if((dfno==19))
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*85;
                            dftot=dftot+dfcost[h];
                        }
                        else
                        {
                            dforder[h]=df[h];
                            dfqtty[h]=kg;
                            dfcost[h]=kg*500;
                            dftot=dftot+dfcost[h];
                        }
                    }
                    for(h=0;(h<nodf-1);h++)
                    {
                        System.out.println(dforder[h]+"-"+dfqtty[h]+"Kg=>"+dfcost[h]);
                    }
                    System.out.println("TOTAL:Rs"+dftot);
                    store[visits]="DAILY FRESH:";
                    total[visits]=dftot;

                }

                break;

                case(3):
                {
                 System.out.println("welcome to the food court...What would you like to eat? \n D.dominos \n S.subway ");
                    chFC=in.readLine();
                    if(chFC.equalsIgnoreCase("d")) 
                    {
                        System.out.println("welcome to dominos pizza...");
                        System.out.println("Which pizza would you like? \n 1.Margherita(classic cheese)  \n 2.Farmhouse(onion,capsicum,mushroom,tomato)  \n 3.vegExtravanganza(onion,capsicum,mushroom,tomato,olives,corn)  \n 4.PaneerPizza(paneer,onion,capsicum)  ");
                        pizzatype=Integer.parseInt(in.readLine());
                        System.out.println("would you like any addons? \n 0.none\n 1.Dip(cheese&jalapeno)(Rs.20) \n 2.chocoLava Cake(Rs.40)\n 3.garlic bread sticks(Rs90) \n 4.cheeseSticks(free dip provided)(rs160) ");
                        pizaddon=Integer.parseInt(in.readLine());
                        System.out.println("what size pizza would you like? \n type 'P' for pan(Rs.100) \n 'S' for small(Rs.150) \n 'M' for medium(Rs.250) \n 'L' for large(Rs.350)");
                        pizzasize=in.readLine();
                        if(pizzasize.equalsIgnoreCase("P"))
                            pizzacost=100;
                        else if(pizzasize.equalsIgnoreCase("S"))
                            pizzacost=150;
                        else if(pizzasize.equalsIgnoreCase("M"))
                            pizzacost=250;
                        else
                            pizzacost=350;
                        if(pizzatype==1)
                            pizza="Margherita \n size:"+pizzasize; 
                        else if(pizzatype==2)
                            pizza="Farmhouse \n size:"+pizzasize;
                        else if (pizzatype==3)
                            pizza="vegExtravanganza \n size:"+pizzasize;
                        else
                            pizza="paneerpizza \n size:"+pizzasize;

                        pizaddon=(10*(pizaddon*pizaddon));
                        pizzacost=pizzacost+(pizaddon);
                        System.out.println("pizza:"+pizza+"\n addon cost:"+pizaddon+"\n subtotal cost:"+pizzacost+"\n tax(18%gst):"+(0.18*pizzacost)+"\n total:"+((0.18*pizzacost)+pizzacost));
                        store[visits]="DOMINOS PIZZA:";
                        total[visits]=(0.18*pizzacost)+pizzacost;

                    }
                    else if(chFC.equalsIgnoreCase("S"))  
                    {  
                        System.out.println("welcome to SUBWAY..."); 
                        System.out.println("SANDWICH:\n1.veggieDelight\n2.peppyPaneer\n3.mexicanPatty\n4.cornNpeas");
                        subtype=Integer.parseInt(in.readLine());
                        if(subtype==1)
                            subway="veggieDelight";
                        if(subtype==2)
                            subway="peppyPaneer";
                        if(subtype==3)
                            subway="mexicanPatty";
                        if(subtype==4)
                            subway="cornNpeas";
                        System.out.println("BREAD SELECTION: \nwhich bread would you like?\n 1.multigrainHoneyOat \n 2.parmesaOregano \n 3.italianBread");
                        brdtype=Integer.parseInt(in.readLine());
                        if(brdtype==1)
                            bread="BREAD:MultiGrainHoneyOat";
                        else if(brdtype==2)
                            bread="BREAD:parmesanOregano";
                        else 
                            bread="BREAD:italianBread";
                        System.out.println("SIZE: \n1.6inch(Rs150)\n2.12inch(Rs250)");
                        subsize=Integer.parseInt(in.readLine());
                        if(subsize==1)
                            Subcost=150;
                        else
                            Subcost=250;
                        System.out.println("VEGETABLE SELECTION:");
                        for(i=0;i<6;i++)
                        {
                            System.out.println("would you like "+v[i]+"?type 1 for yes and 0 for no.") ;  
                            vegno=Integer.parseInt(in.readLine());  
                            if(vegno==1)
                                veggie=veggie+v[i]+",";
                        }

                        System.out.println("ADD ONS: \n 0.none \n 1.Cookie(Rs10) \n 2.Lays(Rs20) \n 3.Pepsi(Rs30)");
                        subaddon=Integer.parseInt(in.readLine());
                        Subcost=Subcost+(10*subaddon);
                        System.out.println("SUBWAY:"+subway+"\n"+bread+"\nSIZE:"+(subsize*6)+"inch\nVEGETABLES:"+veggie+"\nADDON cost:Rs"+(10*subaddon)+"\nsubTotal:Rs"+Subcost);
                        System.out.println("TAX(18%):Rs"+((18/100.0)*Subcost)+"\nTOTAL:Rs"+(Subcost+((18/100.0)*Subcost)));
                        store[visits]="SUBWAY:";
                        total[visits]=Subcost+((18/100.0)*Subcost);
                    }



                }
                break;


                case(4):
                {
                    System.out.println(" welcome to (*) inox movies (*)  ");
                    System.out.println("which movie would you like to watch?   ");
                    System.out.println("  ENGLISH(Rs300/-)               KANNADA(Rs200/-)   HINDI(Rs250/-)    ");
                    System.out.println("E1.Thor Ragnarok(U/A)(3D)       K1.Rajkumaar(U)    H1.Bahubali(U)(3D) ");
                    System.out.println("E2.StarWars the last jedi(U/A)  K2.Tarak(U)        H2.Dangal(U)       ");
                    System.out.println("E3.Avatar(U/A)(3D)              K3.Kirk Party(U/A) H3.Sholay(U)       ");
                    System.out.println("Type E1 for Thor;K2 for Tarak;H3 for Sholay;etc...(language&Number)   ");
                    movie=in.readLine();
                    movielang=movie.charAt(0);

                    if((movielang=='E')||(movielang=='e'))
                    {
                        moviecost=300;
                        if(movie.charAt(1)=='1')
                            moviename="Thor Ragnarok(U/A)(3D)";
                        else if(movie.charAt(1)=='2')
                            moviename="StarWars the last jedi(U/A)";
                        else
                            moviename="Avatar(U/A)(3D)";
                        System.out.println("movie:"+moviename+"\n How many tickets would you like ?");
                        movieticket=Integer.parseInt(in.readLine());
                        moviecost=moviecost*movieticket;
                    }

                    else if((movielang=='k')||(movielang=='K'))
                    {
                        moviecost=200;
                        if(movie.charAt(1)=='1')
                            moviename="Rajkumaar(U)";
                        else if(movie.charAt(1)=='2')
                            moviename="Tarak(U)";
                        else
                            moviename="Kirk Party(U/A)";
                        System.out.println("movie:"+moviename+"\n How many tickets would you like ?");
                        movieticket=Integer.parseInt(in.readLine()); 
                        moviecost=moviecost*movieticket; 
                    }

                    else if((movielang=='H')||(movielang=='h'))
                    {
                        moviecost=250;
                        if(movie.charAt(1)=='1')
                            moviename="Bahubali(U)(3D)";
                        else if(movie.charAt(1)=='2')
                            moviename="Dangal(U)";
                        else
                            moviename="Sholay(U)";
                        System.out.println("movie:"+moviename+"\n How many tickets would you like ?");
                        movieticket=Integer.parseInt(in.readLine()); 
                        moviecost=moviecost*movieticket;     
                    }
                    System.out.println("movie cost:"+ moviecost);
                    System.out.println("would you like any add ons? \n p:popcorn-70 \n n:Nachos-170 \n s:sandwich-100 \n f:fruitSalad-50 \n x:none  ");
                    addon=in.readLine();
                    if(addon.equalsIgnoreCase("P")){addoncost=70;addon="popcorn";}
                    if(addon.equalsIgnoreCase("n")){addoncost=170;addon="nachos";}
                    if(addon.equalsIgnoreCase("s")){addoncost=100;addon="sandwich";}
                    if(addon.equalsIgnoreCase("f")){addoncost=50;addon="fruitsalad";}
                    if(addon.equalsIgnoreCase("x")){addoncost=0;addon="none";}
                    System.out.println("                           (*)  inox movies  (*)");
                    System.out.println("movie:"+moviename+"\n no of tickets:"+movieticket+"\n cost of tickets:"+moviecost);
                    moviecost=moviecost+addoncost;
                    System.out.println("add ons:"+addon+"\n"+addon+"cost:"+addoncost+"\n\n total:"+moviecost);
                    store[visits]="INOX THEATRE:";
                    total[visits]=moviecost;

                }
                break;
            }
            visits=visits+1;
            System.out.println(" would you you like to continue shopping??(Enter 'yes' to continue.)");
            yon=in.readLine();
            if(yon.equalsIgnoreCase("yes")==false)
            break;
        }
        while(yon.equalsIgnoreCase("yes"));

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("                                                             FINAL BILL");

        for(k=0;k<visits;k++)
        {
            System.out.println((k+1)+"."+(store[k])+(total[k]));

        }
        for(k=0;k<visits;k++)
        {
            finale=finale+total[k];
        } 
        System.out.println("TOTAL:Rs"+finale);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}
