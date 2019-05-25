/*
Zadanie nr6 Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/

package com.company;

public class Pierwiastki {

    String nazwa;
    String symbol;
    int atomowa;
    String type;

    public Pierwiastki(String naz, String skr,int atm){
        nazwa = naz;
        symbol = skr;
        atomowa = atm;
    }

    public int getAtomowa(){
         return atomowa;
    }

     public String getSymbol() {
          return symbol;
     }

     public String getNazwa(){
         return nazwa;
     }

     public String getType(){
          return type;
     }

     public String toString(){
        return "Element: "+nazwa+", Symbol: "+symbol+" Atomic number: "+atomowa;
    }

    public static void main(String[] args) {

         Pierwiastki[] tabPr = new Pierwiastki[118];

         tabPr[0] = new Pierwiastki("Hydrogen","H",1);
         tabPr[1] = new Pierwiastki("Helium","He",2);
         tabPr[2] = new Pierwiastki("Lithium","Li",3);
         tabPr[3] = new Pierwiastki("Berylium","Be",4);
         tabPr[4] = new Pierwiastki("Boron","B",5);
         tabPr[5] = new Pierwiastki("Carbon","C",6);
         tabPr[6] = new Pierwiastki("Nitrogen","N",7);
         tabPr[7] = new Pierwiastki("Oxygen","O",8);
         tabPr[8] = new Pierwiastki("Fluorine","F",9);
         tabPr[9] = new Pierwiastki("Neon","Ne",10);
         tabPr[10] = new Pierwiastki("Sodium","Na",11);
         tabPr[11] = new Pierwiastki("Magnesium","Mg",12);
         tabPr[12] = new Pierwiastki("Aluminium","Al",13);
         tabPr[13] = new Pierwiastki("Silicon","Si",14);
         tabPr[14] = new Pierwiastki("Phosphorus","P",15);
         tabPr[15] = new Pierwiastki("Sulfur","S",16);
         tabPr[16] = new Pierwiastki("Chlorine","Cl",17);
         tabPr[17] = new Pierwiastki("Argon","Ar",18);
         tabPr[18] = new Pierwiastki("Potasium","K",19);
         tabPr[19] = new Pierwiastki("Calcium","Ca",20);
         tabPr[20] = new Pierwiastki("Scandium","Sc",21);
         tabPr[21] = new Pierwiastki("Titanium","Ti",22);
         tabPr[22] = new Pierwiastki("Vanadium","V",23);
         tabPr[23] = new Pierwiastki("Chromium","Cr",24);
         tabPr[24] = new Pierwiastki("Magnese","Mn",25);
         tabPr[25] = new Pierwiastki("Iron","Fe",26);
         tabPr[26] = new Pierwiastki("Cobalt","Co",27);
         tabPr[27] = new Pierwiastki("Nickel","Ni",28);
         tabPr[28] = new Pierwiastki("Copper","Cu",29);
         tabPr[29] = new Pierwiastki("Zinc","Zn",30);
         tabPr[30] = new Pierwiastki("Gallium","Ga",31);
         tabPr[31] = new Pierwiastki("Germanium","Ge",32);
         tabPr[32] = new Pierwiastki("Arsenic","As",33);
         tabPr[33] = new Pierwiastki("Sellenium","Se",34);
         tabPr[34] = new Pierwiastki("Bromine","Br",35);
         tabPr[35] = new Pierwiastki("Krypton","Kr",36);
         tabPr[36] = new Pierwiastki("Rubidium","Rb",37);
         tabPr[37] = new Pierwiastki("Strontium","Sr",38);
         tabPr[38] = new Pierwiastki("Yttrium","Y",39);
         tabPr[39] = new Pierwiastki("Zicronium","Zr",40);
         tabPr[40] = new Pierwiastki("Niobium","Nb",41);
         tabPr[41] = new Pierwiastki("Molybendium","Mo",42);
         tabPr[42] = new Pierwiastki("Technetium","Tc",43);
         tabPr[43] = new Pierwiastki("Ruthenium","Ru",44);
         tabPr[44] = new Pierwiastki("Rhodium","Rh",45);
         tabPr[45] = new Pierwiastki("Palladium","Pd",46);
         tabPr[46] = new Pierwiastki("Silver","Ag",47);
         tabPr[47] = new Pierwiastki("Cadmium","Cd",48);
         tabPr[48] = new Pierwiastki("Indium","In",49);
         tabPr[49] = new Pierwiastki("Tin","Sn",50);
         tabPr[50] = new Pierwiastki("Antimony","Sb",51);
         tabPr[51] = new Pierwiastki("Tellurium","Te",52);
         tabPr[52] = new Pierwiastki("Iodine","I",53);
         tabPr[53] = new Pierwiastki("Xenon","Xe",54);
         tabPr[54] = new Pierwiastki("Caesium","Cs",55);
         tabPr[55] = new Pierwiastki("Barium","Ba",56);
         tabPr[56] = new Pierwiastki("Hafnium","Hf",72);
         tabPr[57] = new Pierwiastki("Tantalum","Ta",73);
         tabPr[58] = new Pierwiastki("Tungsten","W",74);
         tabPr[59] = new Pierwiastki("Rhenium","Re",75);
         tabPr[60] = new Pierwiastki("Osmium","Os",76);
         tabPr[61] = new Pierwiastki("Iridium","Ir",77);
         tabPr[62] = new Pierwiastki("Platinum","Pt",78);
         tabPr[63] = new Pierwiastki("Gold","Au",79);
         tabPr[64] = new Pierwiastki("Mercury","Hg",80);
         tabPr[65] = new Pierwiastki("Thallium","Tl",81);
         tabPr[66] = new Pierwiastki("Lead","Pb",82);
         tabPr[67] = new Pierwiastki("Bismuth","Bi",83);
         tabPr[68] = new Pierwiastki("Polonium","Po",84);
         tabPr[69] = new Pierwiastki("Astatine","At",85);
         tabPr[70] = new Pierwiastki("Radon","Rn",86);
         tabPr[71] = new Pierwiastki("Francium","Fr",87);
         tabPr[72] = new Pierwiastki("Radium","Ra",88);
         tabPr[73] = new Pierwiastki("Rutherfodium","Rf",104);
         tabPr[74] = new Pierwiastki("Dubnium","Db",105);
         tabPr[75] = new Pierwiastki("Seaborgium","Sg",106);
         tabPr[76] = new Pierwiastki("Bohrium","Bh",107);
         tabPr[77] = new Pierwiastki("Hassium","Hs",108);
         tabPr[78] = new Pierwiastki("Meitnerium","Mt",109);
         tabPr[79] = new Pierwiastki("Darmstadium","Ds",110);
         tabPr[80] = new Pierwiastki("Roentgenum","Rg",111);
         tabPr[81] = new Pierwiastki("Copernicium","Cn",112);
         tabPr[82] = new Pierwiastki("Ununtrium","Uut",113);
         tabPr[83] = new Pierwiastki("Flevorium","Fl",114);
         tabPr[84] = new Pierwiastki("Ununpentium","Uup",115);
         tabPr[85] = new Pierwiastki("Livermorium","Lv",116);
         tabPr[86] = new Pierwiastki("Tennesine","Ts",117);
         tabPr[87] = new Pierwiastki("Oganesson","Og",118);


         tabPr[88] = new Pierwiastki("Lanhanium","La",57);
         tabPr[89] = new Pierwiastki("Cerium","Ce",58);
         tabPr[90] = new Pierwiastki("Praseodymium","Pr",59);
         tabPr[91] = new Pierwiastki("Neodymium","Nd",60);
         tabPr[92] = new Pierwiastki("Promethium","Pm",61);
         tabPr[93] = new Pierwiastki("Samarium","Sm",62);
         tabPr[94] = new Pierwiastki("Europium","Eu",63);
         tabPr[95] = new Pierwiastki("Gadolinium","Gd",64);
         tabPr[96] = new Pierwiastki("Teribium","Tb",65);
         tabPr[97] = new Pierwiastki("Dysprosium","Dy",66);
         tabPr[98] = new Pierwiastki("Holmium","Ho",67);
         tabPr[99] = new Pierwiastki("Errium","Er",68);
         tabPr[100] = new Pierwiastki("Thulium","Tm",69);
         tabPr[101] = new Pierwiastki("Ytterbium","Yb",70);
         tabPr[102] = new Pierwiastki("Lutetium","Lu",71);

         tabPr[103] = new Pierwiastki("Actinium","Ac",89);
         tabPr[104] = new Pierwiastki("Thorium","Th",90);
         tabPr[105] = new Pierwiastki("Protecinium","Pa",91);
         tabPr[106] = new Pierwiastki("Uranium","U",92);
         tabPr[107] = new Pierwiastki("Neptunium","Np",93);
         tabPr[108] = new Pierwiastki("Plutonium","Pu",94);
         tabPr[109] = new Pierwiastki("Americum","Am",95);
         tabPr[110] = new Pierwiastki("Curium","Cm",96);
         tabPr[111] = new Pierwiastki("Barkelium","Bk",97);
         tabPr[112] = new Pierwiastki("Californium","Cf",98);
         tabPr[113] = new Pierwiastki("Eisteinium","Es",99);
         tabPr[114] = new Pierwiastki("Fermium","Fm",100);
         tabPr[115] = new Pierwiastki("Mendelevium","Md",101);
         tabPr[116] = new Pierwiastki("Nobelium","No",102);
         tabPr[117] = new Pierwiastki("Lawrencium","Lr",103);


         for(int i=0; i<117;i++){
              if(tabPr[i].getAtomowa()==3||
                      tabPr[i].getAtomowa()==11||
                      tabPr[i].getAtomowa()==19||
                      tabPr[i].getAtomowa()==37||
                      tabPr[i].getAtomowa()==55||
                      tabPr[i].getAtomowa()==87){
                   System.out.print("Type: Alkali metals, ");

              }
              else if(tabPr[i].getAtomowa()==13||
                      tabPr[i].getAtomowa()==49||
                      tabPr[i].getAtomowa()==50||
                      tabPr[i].getAtomowa()==81||
                      tabPr[i].getAtomowa()==82||
                      tabPr[i].getAtomowa()==83||
                      tabPr[i].getAtomowa()==113||
                      tabPr[i].getAtomowa()==114||
                      tabPr[i].getAtomowa()==115||
                      tabPr[i].getAtomowa()==116){
                   System.out.print("Type: Metals, ");

              }
              else if((tabPr[i].getAtomowa()>20&&tabPr[i].getAtomowa()<32)||
                      (tabPr[i].getAtomowa()>38&&tabPr[i].getAtomowa()<49)||
                      (tabPr[i].getAtomowa()>71&&tabPr[i].getAtomowa()<81)||
                      (tabPr[i].getAtomowa()>103&&tabPr[i].getAtomowa()<113)){
                   System.out.print("Typ: Transition metals, ");

              }
              System.out.println(tabPr[i].toString());


         }



	// write your code here
        //oxygenium, 8 ,O


        //alkali 3,11,19,55,87
        //Transistion 21 do 31 oraz 39 do 48 oraz 72 do 80 oraz 104 do 112
        //Metals 13,49,50,81,82,83,113,114,115
    }
}
