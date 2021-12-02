/*Sóc molt fan de la f1 y he fet un programa que imprimeix per 
pantalla el logo vell de la Formula 1 m'encanta com ha quedat*/


public class logoF1vell {
    public static void main (String[] args){
        int max = 60;
        int max1 = 60;
        for (int x=1; x<=20; x++){
            if (x<5){
                for (int y=1; y<=20; y++){
                    System.out.print("·");
                }
                for(int y=21; y<=35; y++){
                    if ((x==2)&&(y==35)){
                        System.out.print("·");
                    } else if ((x==3)&&(y==35)){
                        System.out.print("·");
                    } else if ((x==3)&&(y==34)){
                        System.out.print("·");
                    } else if ((x==4)&&(y==35)){
                        System.out.print("·");
                    } else if ((x==4)&&(y==34)){
                        System.out.print("·");
                    } else if ((x==4)&&(y==33)){
                        System.out.print("·");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int y=36; y<=41; y++){
                    System.out.print("·");
                }
                int y=42;
                if (x%2 != 0){
                    while (y<=max){
                        System.out.print("·");
                        y++;
                    }
                    max--;
                    }
            }     
            if ((x>=5)&&(x<=7)){
                for (int y=1; y<=5; y++){
                    System.out.print("·");
                }
                for (int y=6; y<=35; y++){
                    if ((x==5)&&(y==35)){
                        System.out.print("·");
                    } else if ((x==5)&&(y==34)){
                        System.out.print("·");
                    } else if ((x==5)&&(y==33)){
                        System.out.print("·");
                    } else if ((x==5)&&(y==32)){
                        System.out.print("·");
                    } else if ((x==6)&&(y==35)){
                        System.out.print("·");
                    } else if ((x==6)&&(y==34)){
                        System.out.print("·");
                    } else if ((x==6)&&(y==33)){
                        System.out.print("·");
                    } else if ((x==6)&&(y==32)){
                        System.out.print("·");
                    } else if ((x==6)&&(y==31)){
                        System.out.print("·");
                    } else if ((x==6)&&(y==30)){
                        System.out.print("·");
                    } else if ((x==7)&&(y==35)){
                        System.out.print("·");
                    } else if ((x==7)&&(y==34)){
                        System.out.print("·");
                    } else if ((x==7)&&(y==33)){
                        System.out.print("·");
                    } else if ((x==7)&&(y==32)){
                        System.out.print("·");
                    } else if ((x==7)&&(y==31)){
                        System.out.print("·");
                    } else if ((x==7)&&(y==30)){
                        System.out.print("·");
                    } else if ((x==7)&&(y==29)){
                        System.out.print("·");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int y=36; y<=41; y++){
                    System.out.print("·");
                }
                int y=42;
                if (x%2 != 0){
                    while (y<=max){
                    System.out.print("·");
                    y++;
                    }
                    max--;
                }
                
            }
            if((x>=8)&&(x<=10)){
                for (int y=1; y<=15; y++){
                    System.out.print("·");
                }
                for(int y=16; y<=35; y++){
                    if ((x==8)&&(y==34)){
                        System.out.print("·");
                    } else if ((x==8)&&(y==33)){
                        System.out.print("·");
                    } else if ((x==8)&&(y==32)){
                        System.out.print("·");
                    } else if ((x==8)&&(y==31)){
                        System.out.print("·");
                    } else if ((x==8)&&(y==30)){
                        System.out.print("·");
                    } else if ((x==8)&&(y==29)){
                        System.out.print("·");
                    } else if ((x==8)&&(y==28)){
                        System.out.print("·");
                    } else if ((x==9)&&(y==33)){
                        System.out.print("·");
                    } else if ((x==9)&&(y==32)){
                        System.out.print("·");
                    } else if ((x==9)&&(y==31)){
                        System.out.print("·");
                    } else if ((x==9)&&(y==30)){
                        System.out.print("·");
                    } else if ((x==9)&&(y==29)){
                        System.out.print("·");
                    } else if ((x==9)&&(y==28)){
                        System.out.print("·");
                    } else if ((x==9)&&(y==27)){
                        System.out.print("·");
                    } else if ((x==10)&&(y==32)){
                        System.out.print("·");
                    } else if ((x==10)&&(y==31)){
                        System.out.print("·");
                    } else if ((x==10)&&(y==30)){
                        System.out.print("·");
                    } else if ((x==10)&&(y==29)){
                        System.out.print("·");
                    } else if ((x==10)&&(y==28)){
                        System.out.print("·");
                    } else if ((x==10)&&(y==27)){
                        System.out.print("·");
                    } else if ((x==10)&&(y==26)){
                        System.out.print("·");
                    } else if ((x==10)&&(y==25)){
                        System.out.print("·");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int y=36; y<=41; y++){
                    System.out.print("·");
                }
                int y=42;
                if (x%2 != 0){
                    while (y<=max){
                        System.out.print("·");
                        y++;
                    }
                    max--;
                }
            }
            if(x>10){
                for (int y=1; y<=41; y++){
                    if (y<=5){
                        System.out.print("·");
                    } else if ((y>=5)&&(y<=35)){
                        System.out.print(" ");  
                    } else {
                        System.out.print("·");
                    }
                }
                int y=42;
                if (x%2 != 0){
                    while (y<=max1){
                        System.out.print("·");
                        y++;
                    }
                    max1--;
                    }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("F o r m u l a  1");
    }
}
