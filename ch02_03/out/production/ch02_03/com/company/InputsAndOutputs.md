# 자료의 입출력 (Inputs and Outputs)
자료의 입력과 출력을 위한 메서드에 대해 배움

## 출력메서드
### println()
- println은 여러가지 자료형을 입력할 수 있다.
- ln == line에 약자이고 new line을 뜻함 

```
  System.out.println("String cㅜa be printed."); //문자열도 출력가능
        System.out.println('c');//문자도 출력가능
        System.out.println(40234); //정수도 출력가능
        System.out.println(1.52f); //float도 출력가능
        System.out.println(15.2434);// double도 출력가능
```

### printf()

- printf는 포맷문자를 사용하여 출력함
- 자료형에 맞는 포맷문자를 사용하고 ','를 사용하여 포맷문자에 해당하는 내용을 입력함
- %s = string / %b = boolean / %d =10진수 %x=16진수, %o=8진수 / %f = floatin number = double, flaot
 %e = 지수 / \u0 = 유니코드 / %n = new line / 등이 포맷문자가 있음
- %(숫자)d를 통해 숫자만큼의 빈칸을 확보할 수 있음
- 확보한 빈칸의 숫자만큼을 초과하더라도 내용은 모두 출력됨
- 이외에도 시간과 날짜를 출력하는 포맷문자도 존재한다

```$xslt
System.out.printf("%s is for string\n", "STRING"); //%s는 스트링자리, newline은 수동
        System.out.printf("%s %s %s\n","123","456","15234");
        System.out.printf("%b\n", true); // b=boolean
        System.out.printf("%d 0x%x 0X%X 0%o \n",15,15,15,15); //d=10진수, x= 16진수 , o=8진수
                                    //10진수와 구분위해 16진수에는 앞에0x를 붙이고 8진수에는 0을붙임
        System.out.printf("%f\n",14.23); // f는 float 이 아닌 floating number로 float,double둘다 들어갈 수 있음
        System.out.printf("%f\n",14.23f); // %f로 float형도 입력 가능
        System.out.printf("%e\n",14.423); // 지수표현
        System.out.printf("%c %c\n", 'U','\u0042'); //U B 문자, 유니코드표현가능
        System.out.printf("%n"); //%n == new line

        System.out.printf("%5d.\n", 10); //우측정렬하고 5칸확보 // .은 공간보려고 찍음
        System.out.printf("%-5d.\n", 10); // 좌측정렬하고 5칸빈칸확보
        System.out.printf("%05d\n", 234); //5칸 앞에 0을 붙이면 빈곳은 00으로 표현됨
        System.out.printf("%3d\n", 104294);//3칸은 최소한 확보, 넘처도 출력은 다한다
        System.out.println("");

```

## 입력메서드
입력 메서드는 변수의 입력을 리터럴이 아닌 키보드로 입력을 뜻함

