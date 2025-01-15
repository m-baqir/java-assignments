public class Lab5Q2 {
    public static void main (String[] args){
        int div1 = 0,div2 = 0,div3 = 0,div4 = 0,div5 = 0,div6 = 0,div7 = 0,div8 = 0,div9 = 0;
        
        for (int i=1;i<=1000000;i++){
            if (i%1 == 0){
                div1++;
            }
            if (i%2 == 0){
                div2++;
            }
            if (i%3 == 0){
                div3++;
            }
            if (i%4 == 0){
                div4++;
            }
            if (i%5 == 0){
                div5++;
            }
            if (i%6 == 0){
                div6++;
            }
            if (i%7 == 0){
                div7++;
            }
            if (i%8 == 0){
                div8++;
            }
            if (i%9 == 0){
                div9++;
            }
        }
        System.out.println("There are "+div1+" numbers divisible by 1");
        System.out.println("There are "+div2+" numbers divisible by 2");
        System.out.println("There are "+div3+" numbers divisible by 3");
        System.out.println("There are "+div4+" numbers divisible by 4");
        System.out.println("There are "+div5+" numbers divisible by 5");
        System.out.println("There are "+div6+" numbers divisible by 6");
        System.out.println("There are "+div7+" numbers divisible by 7");
        System.out.println("There are "+div8+" numbers divisible by 8");
        System.out.println("There are "+div9+" numbers divisible by 9");
    }
}
