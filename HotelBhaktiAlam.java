import java.util.Scanner;

public class HotelBhaktiAlam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. duku");
        System.out.println("2. jeruk");
        System.out.println("3. alpukat");
        System.out.println("4. jambu air");
        System.out.println("5. durian");
        System.out.println("6. melon");
        System.out.println("7. belimbing");
        System.out.println("8. mangga");
        System.out.println("9. kedondong");
        System.out.println("pilih kamar");
        
        int kamar= input.nextInt();

        System.out.println("1. Weekday");
        System.out.println("2. Weekend");
        System.out.println("3. Holiday");

        int waktu= input.nextInt();

        System.out.println("Menginap berapa malam?");
        int malam= input.nextInt();

        double KamarDukuWeekday = 915000;
        double KamarDukuWeekend = 1025000;
        double KamarDukuHoliday = 1225000;
        double KamarJerukWeekday = 915000;
        double KamarJerukWeekend = 915000;
        double KamarJerukHoliday = 1225000;
        double KamarAlpukatWeekday = 575000;
        double KamarAlpukatWeekend = 695000;
        double KamarAlpukatHoliday = 895000;
        double KamarJambuAirWeekday = 575000;
        double KamarJambuAirWeekend = 695000;
        double KamarJambuAirHoliday = 895000;
        double KamarDurianWeekday = 595000;
        double KamarDurianWeekend = 715000;
        double KamarDurianHoliday = 715000;
        double KamarMelonnWeekday = 595000;
        double KamarMelonWeekend = 715000;
        double KamarMelonHoliday = 715000;
        double KamarBelimbingWeekday = 495000;
        double KamarBelimbingWeekend = 575000;
        double KamarBelimbingHoliday = 755000;
        double KamarManggaWeekday = 495000;
        double KamarManggaWeekend = 575000;
        double KamarManggaHoliday = 755000;
        double KamarKedondongWeekday = 495000;
        double KamarKedondongWeekend = 575000;
        double KamarKedondongHoliday = 755000;



        double hasil;

        switch(kamar){
            case (1):
                switch(waktu){
                    case(1):
                        hasil = KamarDukuWeekday * malam;
                        System.out.println("Total: "+hasil);
        break;

            }
        }
        switch(kamar){
            case (1):
                switch(waktu){
                    case(2):
                        hasil = KamarDukuWeekend * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (1):
                switch(waktu){
                    case(3):
                        hasil = KamarDukuHoliday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (2):
                switch(waktu){
                    case(1):
                        hasil = KamarJerukWeekday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (2):
                switch(waktu){
                    case(2):
                        hasil = KamarJerukWeekend * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (2):
                switch(waktu){
                    case(3):
                        hasil = KamarJerukHoliday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (3):
                switch(waktu){
                    case(1):
                        hasil = KamarAlpukatWeekday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (3):
                switch(waktu){
                    case(2):
                        hasil = KamarAlpukatWeekend * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (3):
                switch(waktu){
                    case(3):
                        hasil = KamarAlpukatHoliday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (4):
                switch(waktu){
                    case(1):
                        hasil = KamarJambuAirWeekday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (4):
                switch(waktu){
                    case(2):
                        hasil = KamarJambuAirWeekend * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (4):
                switch(waktu){
                    case(3):
                        hasil = KamarJambuAirHoliday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (5):
                switch(waktu){
                    case(1):
                        hasil = KamarDurianWeekday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (5):
                switch(waktu){
                    case(2):
                        hasil = KamarDurianWeekend * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (5):
                switch(waktu){
                    case(3):
                        hasil = KamarDurianHoliday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (6):
                switch(waktu){
                    case(1):
                        hasil = KamarMelonnWeekday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (6):
                switch(waktu){
                    case(2):
                        hasil = KamarMelonWeekend * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (6):
                switch(waktu){
                    case(3):
                        hasil = KamarMelonHoliday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (7):
                switch(waktu){
                    case(1):
                        hasil = KamarBelimbingWeekday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (7):
                switch(waktu){
                    case(2):
                        hasil = KamarBelimbingWeekend * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (7):
                switch(waktu){
                    case(3):
                        hasil = KamarBelimbingHoliday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (8):
                switch(waktu){
                    case(1):
                        hasil = KamarManggaWeekday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (8):
                switch(waktu){
                    case(2):
                        hasil = KamarManggaWeekend * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (8):
                switch(waktu){
                    case(3):
                        hasil = KamarManggaHoliday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (9):
                switch(waktu){
                    case(1):
                        hasil = KamarKedondongWeekday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (9):
                switch(waktu){
                    case(2):
                        hasil = KamarKedondongWeekend * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
        switch(kamar){
            case (9):
                switch(waktu){
                    case(3):
                        hasil = KamarKedondongHoliday * malam;
                        System.out.println("Total: "+hasil);
        break;
        


            }
        }
    }   
}
