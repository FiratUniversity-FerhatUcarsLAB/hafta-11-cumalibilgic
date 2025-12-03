public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);       // zoop("just for", 5)
        clink(2 * buzz);              // clink(4)
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);     // zoop("breakfast ", 4)
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}

/*
===============================================
1) PROGRAMIN TAM ÇIKTISI
===============================================

just for
any not more 
It's breakfast 
!

-----------------------------------------------
Açıklama:
- İlk zoop çağrısı: bob = 5 → ping("not ")
- İkinci zoop çağrısı (clink içinde): bob = 4 → else → "!"
-----------------------------------------------


===============================================
2) zoop METODU 2. KEZ ÇAĞRILDIĞINDA STACK DİYAGRAMI
===============================================

Çağrı noktası:
clink(4) → zoop("breakfast ", 4)

STACK (üstten alta doğru):

----------------------------
| zoop                     |
| fred = "breakfast "     |
| bob  = 4                 |
----------------------------
| clink                    |
| fork = 4                 |
----------------------------
| main                     |
| bizz = 5                 |
| buzz = 2                 |
----------------------------

-----------------------------------------------
zoop ikinci çağrıda bob = 4 olduğu için
"!" yazdırılır.
-----------------------------------------------
*/
