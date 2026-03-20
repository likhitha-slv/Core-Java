package JavaOperators;

public class AssaignmentOperators {

	public static void main(String[] args) {
     int a=10;
     int b=20;
     /*
    //a = a + b;// its op is 30
     // a is the variable and a+b is value
     //System.out.println(a);
     //sop(a)---> 30 and that value comes to next step 
     // 30 += 30 + 20, then first it will add the value then it will assign to the variable
     // a = 80
     a += a + b;// a + (a+b);----> it gives the op as 40
     System.out.println(a);//40
     
    // a =+ a + b;//op as 50 because 30 = 30 +20
     //System.out.println(a);
     /// 
      */
     System.out.println("**********************");
     
     
    // a -= a +b;// here first - will be done then only it will store to the variable
    // System.out.println(a);// -20
       
     
    // a =- a + b;// -10 + 20 = 10
    // System.out.println(a);
     
     //a -= a -b;// op is 20  // a - a - b --> 10 - (10 -20) --->  10-(-10)--> 20
     //System.out.println(a);
     
     
     //a =- a - b;// a =   -a - b -->  -10 - 20 -----> -30
     //System.out.println(a);//-30
     
     
  //   a *= a *b;//  10 *= 10*20 ---> 10*= 200 ----> then it will multiplicate to 10*200-----> 2000
     //System.out.println(a);//2000
     
  //   a =* (a*b); ||    a =* a*b;// it gives the compile time error
     
     //a= a*(a*b);   //  10 *= 10*20 ---> 10*= 200 ----> then it will multiplicate to 10*200-----> 2000
     //System.out.println(a);// 2000
     
     //a /= a/b;// a=100; b=20; a = a/(a/b)  it gives the op as 20
    // System.out.println(a);
     
     //a =/a/b;  //Syntax error on token "/", delete this token
     
     a %= a % b;
     System.out.println(a);//0
     
	}

}
