
package ejerciciocondicional;


public class EjercicioCondicional {

    
    public static void main(String[] args) {
        /* 1
        int temperatura=27;
        
        if(temperatura>25) {
            
            System.out.println(" A LA PLAYA");
        }
        */
        
        
        /* 2
        boolean hacesol=true;
        
        if(hacesol=true){
            
            System.out.println("NO TE OLVIDES LA SOMBRILLA");
        }
        */
        
        /* 3
        
         boolean hacesol=true;
         boolean nevando=true;
        
        if(nevando==true || hacesol==true){
            
            System.out.println("QUE BIEN");
        }
        */
        
        
        /* 4
         
         boolean nevando=true;
         int temperatura=29;
         
        if(nevando==true && temperatura>=20 && temperatura<=30){
            
            System.out.println("NO ME LO CREO");
        }
        */
        
         /* 5
         int temperatura=32;
         boolean hacesol=true;
         
        if(temperatura<0 || temperatura>30 && hacesol==true){
            
            System.out.println("MEJOR ME QUEDO EN CASA");
        }
         */
         
         
         /* 6
         int temperatura=32;
         if(temperatura>25){
            
            System.out.println("A LA PLAYA");
       
        }
      */
    
         /* 7
         int temperatura=10;
         if(temperatura<=25){
            
            System.out.println("ESPERANDO AL BUEN TIEMPO");
       
        }
       */
         
         /*
         int temperatura=10;
         if(temperatura>25){
            
            System.out.println("A LA PLAYA");
       
        }
         else {
              System.out.println("ESPERANDO AL BUEN TIEMPO");
    
         }
    
         */
         
         int temperatura=10;
         boolean nevando=true;
         
         if(temperatura>25){
            
            System.out.println("A LA PLAYA");
       
        }
         else if (temperatura>15) {
              System.out.println("A LA MONTAÑA");
    
         }
         else if (temperatura<5 && nevando==true){
         
             System.out.println("A ESQUIAR");
             }
    
         else {
             System.out.println("A DORMIR");
         }
    }
    
}

 