            // int hora2 = segons / 3600;
            // while (hora2 >= 24) {
            //     hora2 -= 24;
            // }
            // segons %= 3600;
            // int minuts2 = segons / 60;
            // while (minuts2 > 60) {
            //     minuts2 -= 60;
            // }
            // segons = segons % 60;
            // hores = hores - hora2;
            // minuts = minuts - minuts2;
            // this.segons = this.segons - segons;

            // while (this.segons < 0) {
            //     this.segons++;
            //     if (this.segons == 0) {
            //         this.segons = 59;
            //         minuts--;
            //         if (minuts < 0) {
            //             minuts = 59;
            //             hores--;
            //             if (hores < 0) {
            //                 hores = 23;
            //             }
            //         }
            //     }
            // }
            // while (hores < 0) {
            //     hores += 24; 
            // }
            

            //2System.out.println("hora a restar: " + hora2 + ":" + minuts2 + ":" + segons);
            // int segInicials = hores * 3600 + minuts * 60 + this.segons;
            // segons = segInicials - segons;
            // if (segons >= 0) {
            //     hores = segons / 3600;
            //     while (hores > 24) {
            //         hores -= 24;
            //     }
            //     segons %= 3600;
            //     minuts = segons / 60;
            //     while (minuts > 60) {
            //         minuts -= 60;
            //     }
            //     this.segons = segons % 60;
            // } else {
            //     if (segons > -1000) {
            //         while (segons < 0) {
            //             this.segons--;
            //             if (this.segons < 0) {
            //                 this.segons = 59;
            //                 minuts--;
            //                 if (minuts < 0) {
            //                     minuts = 59;
            //                     hores--;
            //                     if (hores < 0) {
            //                         hores = 23;
            //                     }
            //                 }
            //             }
            //             segons++;
            //         }
            //     } else {
            //         hores = segons / 3600;
            //         float resto = segons % 3600;
            //         while (hores <= -24) {
            //             hores += 24;
            //         }
            //         if (hores < 0 && resto == 0) {
            //             hores = 24 + hores;
            //         }
            //         if (hores < 0 && resto != 0) {
            //             hores = 23 + hores;
            //         }
            //         segons %= 3600;
            //         minuts = segons / 60;
            //         while (minuts < 0) {
            //             minuts += 60;
            //         }
            //         segons %= 60;
            //         while (segons < 0) {
            //             this.segons--;
            //             if (this.segons < 0) {
            //                 this.segons = 59;
            //                 minuts--;
            //                 if (minuts < 0) {
            //                     minuts = 59;
            //                     hores--;
            //                     if (hores < 0) {
            //                         hores = 23;
            //                     }
            //                 }
            //             }
            //             segons++;
            //         }
            //     }
            // }