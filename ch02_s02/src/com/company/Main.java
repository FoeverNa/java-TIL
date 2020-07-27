package com.company;

/**
 * 자료형(DAta Type)
 * 자료형 - 기본형(Primitive Type), 참조형 (Reference Type)
 * 기본형 자료형 - 정수형, 실수형, 문자형, 논리형
 * 참조형 - 문자열 (String) 나머지는 나중에 배우겠습니다.
 */

public class Main {

    public static void main(String[] args) {
        //정수형 : byte, short, int, long
        System.out.println("Byte");
        System.out.println(Byte.BYTES); // Byte자료형은 1BYTE라는 뜻 = 8bit
        byte byteValue = 42;
        System.out.println(byteValue);
        System.out.println(Byte.MAX_VALUE); //2^7 -1  싸인비트를 포현해야되서 2의7승, 0을 표현해야되기떄문에 -1
        System.out.println(Byte.MIN_VALUE); //-2^7  음수까지의 범위를 포함
        // byte byteValue1 = 128; //범위를 넘어선 정수는 에러발생
        System.out.println("");

        System.out.println("Short"); // 2byte = 16bit
        System.out.println(Short.BYTES);
        System.out.println(Short.MAX_VALUE);// 2^15 -1
        System.out.println(Short.MIN_VALUE);// -2^15
        System.out.println("");

        System.out.println("Int");
        System.out.println(Integer.BYTES); // 4byte = 32bit
        System.out.println(Integer.MAX_VALUE);// 2^31 -1
        System.out.println(Integer.MIN_VALUE);// -2^31
        System.out.println("");

        System.out.println("Long");
        System.out.println(Long.BYTES);
        System.out.println(Long.MAX_VALUE);// 2^63 -1
        System.out.println(Long.MIN_VALUE);// -2^63
        System.out.println(""); //한칸띄기임

        //왜 다 Long으로 안하냐 - 메모리 효율성위해, 필요에 따라 사용하여야 한다.

        //Overflow
        // 32676 = 2^15 - 1 ==> 0111111111111111
        // 64000 => 10011111101111011110111 (엄밀하지않은수, 랜덤숫자)
        // 64000을 short로 바꾸면서 중간에 잘라버리고 앞자리가 1로바뀌어 음수가되고 남아있는 비트만큼 숫자가잡힘
        // ==> 음수로출력 , 이런현상을 overflow현상이라고함
        short shortValue = (short) 64000; //숫자를 short형으로 바꿈
        System.out.println(shortValue); // -1536,

        // 정수형은 기본적으로 int
        // byte byteValue3 = 144; // byte지만 기본 형인 int형으로 표현됨 so 4byte자료형으로표현됨

        short shortA = 10;
        short shortB = 20;
        // short shortC = shortA + shortB; //에러, 둘다 shortA와 shortB의 값이 int이기 때문에 shortC에들어갈수가 없음
        short shortC = (short)(shortA + shortB); // 더한값을 캐스팅해줘야 short로 들어갈수가 있음
        // shortA는 인티저가 아니라 변수가 맞다. 근데 언어에서 변수의값이 Integer가 기본값이다.  

        int bigInt = Integer.MAX_VALUE;
        int biggerInt = bigInt + 1;
        System.out.println(biggerInt); // - 2147483648 int의 범위넘어서서 값이 잘려서 음수가됨
                                        // int의경우 에러도 안뜸 기본형이라.. so 직접 overflow조심해야함

        //long veryBigInt = 100000000000; //에러발생 너무커서
        long veryBigInt = 100000000000L; // 라지 L을 붙여줘서 Long인것을 알려줘야함 왜? 앞에서 Long은 자료형이고 값에붙은 Long은 리터럴이기때문
        System.out.println(veryBigInt);
        System.out.println("");

        //진수법- Binary(2진수), Octal(8), Decimal(10), Hexadecimal(16)

        System.out.println(0b1101); // 0b하면 2진수 입력  //13
        System.out.println(071);// 0만있으면 8진수 // 57 //10진수랑 비슷해서 해깔려서 가능하면 쓰지마세요
        System.out.println(1424); // 숫자는 그냥입력
        System.out.println(0x10); //0x를 하면 16진수입력, 0~9까지는 숫자 10~16 : a,b,c,d,e,f 까지쓰면됨
        System.out.println(0xff); //

        //진수법을 언제쓰냐?
        byte flagByte = 0b00101100; // 비트를 쪼개서 쓸때 사용한다.

        //리터럴은 어던 변수의 대입되지 않은 순수한 값 64000은 리터럴  대입이된 수는 리터럴이 아님


    }
}
