# 자료형(Data Type)
## 자료형이란
- 변수의 종류와 타입을 나타내는 용어
- 변수의 선언할 때 리터럴에 따라 자료형을 필수로 표기해야함
- 자료형은 기본형(Primitive Type), 참조형 (Reference Type)으로 구분함
- 기본형 자료형에는 정수형, 실수형, 문자형, 논리형이 있음
- 참조형에는 String(문자형)외 여러가지가 있음

### 정수 자료형
-정수형에는 byte, short, int, long이 있음
-각 자료형 별로 메로리의 크기와 그에 따른 표현범위가 다름
-메모리의 효율적 사용을 위해서 범위에 맞는 자료형을 사용함
-정수 자료형의 기본 형은 int이기에 다른 자료형을 쓸때는 별도로 표기히야함
-정수 자료형은 값의 변동에 따라 overflow가 발생할 수 있으니 유의해야함
-정수 자료형은 10진수 뿐 아니라 2진수 8진수 16진수로도 표현 가능함

```
        // 정수 자료형 

        System.out.println(Byte.BYTES);
        System.out.println("Byte");
        System.out.println(Byte.BYTES); //1 // Byte자료형은 1BYTE라는 뜻 = 8bit
        byte byteValue = 42;
        System.out.println(byteValue);
        System.out.println(Byte.MAX_VALUE); //2^7 -1  싸인비트를 포현해야되서 (8비트-1비트) 7승
                                            // 0을 표현 해야 되기 떄문에 -1 해준다.(정수= 음수,양수,0)
        System.out.println(Byte.MIN_VALUE); //-2^7  음수까지의 범위를 포함
        // byte byteValue1 = 128; //범위를 넘어선 정수는 에러발생
        System.out.println(""); // 줄바꿈 기능


        System.out.println("Short"); // 2byte = 16bit
        System.out.println(Short.BYTES);//2
        System.out.println(Short.MAX_VALUE);// 2^15 -1
        System.out.println(Short.MIN_VALUE);// -2^15
        System.out.println("");

        System.out.println("Int");
        System.out.println(Integer.BYTES); // 4byte = 32bit
        System.out.println(Integer.MAX_VALUE);// 2^31 -1
        System.out.println(Integer.MIN_VALUE);// -2^31
        System.out.println("");

        System.out.println("Long");
        System.out.println(Long.BYTES); // 8
        System.out.println(Long.MAX_VALUE);// 2^63 -1
        System.out.println(Long.MIN_VALUE);// -2^63
        System.out.println("");

        //왜 다 Long으로 자료형을 안하냐 - 메모리 효율성위해, 필요에 따라 사용하여야 한다.

        //정수자료형의 유의할 점

        //Overflow
        // 32676 = 2^15 - 1 ==> 0111111111111111
        // 64000 => 10011111101111011110111 (엄밀하지않은수, 랜덤숫자)
        // 64000을 short로 바꾸면서 중간에 잘라버리고 앞자리가 1로바뀌어 음수가되고 남아있는 비트만큼 숫자가잡힘
        // ==> 음수로출력 , 이런현상을 overflow현상이라고함
        short shortValue = (short) 64000; //숫자를 short형으로 바꿈
        System.out.println(shortValue); // -1536,

        // 정수형은 기본적으로 int이기 때문에 다른 유형의 정수 선언시 별도로 표기해주어야함

        // byte byteValue3 = 144; // byte지만 기본 형인 int형으로 표현됨 so 4byte자료형으로표현됨

        short shortA = 10;
        short shortB = 20;
        // short shortC = shortA + shortB; //에러, 둘다 shortA와 shortB의 값이 int이기 때문에 shortC에들어갈수가 없음
        short shortC = (short)(shortA + shortB); // 더한값을 캐스팅해줘야 short로 들어갈수가 있음
        // shortA는 인티저가 아니라 변수가 맞다. 근데 언어에서 변수의값이 Integer가 기본값이다.  
        //정확한 연산과정
        // shortA와 showrB가 int로 먼저 변환이 된다.
        // +연산이 이루어진다
        // 연산된 값이 short로 변환된다

        int bigInt = Integer.MAX_VALUE;
        int biggerInt = bigInt + 1;
        System.out.println(biggerInt); // - 2147483648 int의 범위넘어서서 값이 잘려서 음수가됨
                                        // int의경우 에러도 안뜸 기본형이라.. so 직접 overflow조심해야함

        //long veryBigInt = 100000000000; //에러발생 너무커서
        long veryBigInt = 100000000000L; // 라지 L을 붙여줘서 Long인것을 알려줘야함 왜? 앞에서 Long은 자료형이고 값에붙은 Long은 리터럴이기때문
        long veryBigint2 = 100_000_000_000L; // 숫자의 가시성을위해 언더바로 구분할 수 있다. 3개씩 아니라 다양하게 할수있지만 3개씩만하늘걸로
        System.out.println(veryBigInt);
        System.out.println("");

        //진수법- Binary(2진수), Octal(8), Decimal(10), Hexadecimal(16)

        System.out.println(0b1101); // 0b하면 2진수 입력  //13
        System.out.println(071);// 0만있으면 8진수 // 57 //10진수랑 비슷해서 해깔려서 가능하면 쓰지마세요
        System.out.println(1424); // 숫자는 그냥입력
        System.out.println(0x10); //0x를 하면 16진수입력, 0~9까지는 숫자 10~16 : a,b,c,d,e,f 까지쓰면됨
        System.out.println(0xff); //

      
        //리터럴은 어던 변수의 대입되지 않은 순수한 값 64000은 리터럴  대입이된 수는 리터럴이 아님


```

### 