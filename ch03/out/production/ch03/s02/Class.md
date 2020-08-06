# 클래스

## 클래스와 객체

- 클래스 - 객체를 생성하기 위한 설계도 (Class)
- 객체 - 클래스를 구체화하여 값으로 생성된 것(Object, instance)
- 클래스를 객체로 만드는 과정 - Instanciation 라고 함

## 클래스의 구성

```
class Car{ // 클래스 이름은 보통 PascalCase로 적는다.
    int speed = 0; // 속성 = 멤버 변수
    // 속성 : attribute, filed
    // 멤버 변수 : member variable
    // 같은 개념이지만 컨텍스트에 따라 다르게 부르기도 함 그래서 용어를 익숙하게 알아야함

    void move() { // 메소드 (method), (가끔 멤버 함수라고 부르는 사람도잇음), (가끔 함수, 메서드가 더정확한 표현)
         speed = 10; // 행위를 구현, 주로 속성을 변경하는 역할
    }
}
```
- 클래스는 class 클래스명으로 생성할 수 있음
- 클래스는 속성(=멤버 변수), 메서드로 구성됨

## 객체의 생성

```
public class Main {
    public static void main(String[] args) {
        Car carOne = new Car(); // new 키워드로 클래스에서 객체 생성(Instanciation)
                                // 생성방법 : 자료형은 클래스명 변수명은 camelCase = new 클래스명();
        System.out.println(carOne.speed);//0// .으로 속성 접근 가능
        carOne.move();
        System.out.println(carOne.speed);//10 // move()메서드가 속성을 변경함

        Car carTwo = new Car();
        System.out.println(carTwo.speed); // 0 // carOne과는 독립적인 객체로 존재함

        Car carThree = carOne; // 참조형 객체 (가르키는 객체)
        System.out.println(carThree.speed); //10//carThree는 new하지 않았으니 새로운 객체가 생긴 것이 아님
        carThree.speed = 5;
        System.out.println(carThree.speed);//5 
        System.out.println(carOne.speed);//5 carThree가 가르키는 carOne의 값이 바뀐 것이 었음!
        //carThee와 carOne은 다른 변수이지만 같은 값을 가르키고 있다.
        // String은 immutable이기에 참조형 객체이어도 이런 문제가 없다.(수정이 불가하기 때문에)
        // 그러나 보통 class는 mutabl이기 떄문에 신경써서 사용해야 함
```
- new키워드를 통해 인스턴스를 생성할 수 있음
- 같은 클래스라도 new클래스로 생성한 만큼의 독립된 인스턴스(객체)가 생성됨
- .으로 해당 객체의 속성에 접근 가능

## 클래스와 객체의 메모리 구조

 - 클래스 영역 ( Class area, method area, code area, static area)
   - field 정보, method 정보, type 정보, constant pool
   
 - 스택 영역(Stack area)
   - method 호출 시 선언된 로컬 변수 (임시로 있다가 사라짐)

 - 힙 영역 (Heap area)
   -new 키워드로 생성된 객체(객체의 속성(멤버 변수))
   - garbage collection(GC)이 동작하는 영역 
    : 더이상 사용하지 않는 메모리를 알아서 변환하는 JVM의 기능
 
```
        // 메모리 구조 예시
        
    public class MemoryStructure {// 클래스 영역
        int x, y;  // 힙 영역(new 키워드로 생선된 객체에 속한 변수로 생성됨)
        // int x,y의 값은 값이 실제로 힙영역에 메모리가 생성되서 그 값을 담게됨
        
        String string = "String!!!"; // 힙 영역(변수자체는 힙영역에 생성), 상수풀("String!!!"은 상수풀에 생성)
        // string은 클래스이기 때문에 값을 생성하는게 아닌 상수풀에 잡힌 값을 참조하는 참조값이 담기게 됨
        
        public void method(int value) {// 클래스 영역'
            // int value => 스택 영역 // 
            char c = 'w'; // 스택 영역
        } // 메서드 사용시에 임시로 스택영역에 메모리가 할당되고 메서드 사용 후에 사라지는 영역(지역 변수)
        // 참고 : 주소값을 몇bit로 쓰느냐에 따라 32-bit, 64-bit으로 나뉨, 근데 요즘은 대부분 64-bit os를 쓰기 때문에 대부분 64bit
        // 메모리 주소를 몇 bit를 쓰느냐에 따라 운영체제가 32-bit 64-bit나뉘고 ram을 4gb이상쓰기위해 64bit os가 주를 이룸
```

## 변수 (Variables)
- 클래스 멤버 변수 (static variable, class variable)
- 인스턴스 멤버 변수 (member variable, attribute, ..)
- 로컬 변수 (local variable)
- 로컬 파라미터 변수 (local parameter variable) (arguments)
                    
```
// 클래스에서 변수 생성

public class Variables {
    static int classVar; // static 자료형 변수명; // 클래스 멤버 변수, 스태틱 변수(정적 변수)
    int instanceVar; // 인스턴스 멤버 변수, 필드, 속성

    public void method(int paramVar) { // paramVar : 로컬 파라미터 변수
        System.out.println(paramVar);
        int localVar; // 로컬 변수 // 메서드 안에 속하는 로컬 변수
        //System.out.println(localVar); // localVar은 0으로 초기화 안되서 바로 출력 불가
        localVar = 10; //메서드 안에서 자유롭게 접근가능
        System.out.println(localVar); // 값 대입 후에는 출력가능
        {
            localVar = 30; // 메소드 안에 {}에서도 접근 가능
            int localVar2 =20;
        }
        System.out.println(localVar); // 블록 내에서 수정한 것도 반영됨
        // locaVar2 =40;// {}밖에서 접근 불가, 생명주기가 끝났다. Life-Cycle 끝났다.
    }
}
```
- 클래스 변수, 멤버 변수는 0으로 초기화 되고 지역변수는 초기화 되지 않음
- 지역 변수는 {}으로 사용 지역 정해짐



```
// 각 변수에 대한 접근
class variableTest{
    public static void main(String[] args){
        System.out.println("클래스 변수"); // 클래스에 속하기에 인스턴스 만들지 않아도 존재// 특이 케이스
        System.out.println(Variables.classVar);//0 으로 초기화됨 => 어떤 변수는 초기화 하지 않아도 자동으로 된다는 것은 특이한케이스
                                                // 클래스 변수는 0으로 초기화 된다!!
        /// 클래스 변수는 클래스 이름으로 바로 접근 가능
        Variables.classVar = 10;
        System.out.println(Variables.classVar);//10
        System.out.println("");

        System.out.println("인스턴스 멤버 변수");
        Variables var = new Variables();
        System.out.println(var.instanceVar);//0 // 인스턴스 변수도 0으로 초기화됨 - 특이 케이스
        //Variables.instanceVar // 접근 불가능, 인스턴스 만들어야 객체(실체)가 생기기 때문
        var.instanceVar = 20;
        System.out.println(var.instanceVar);//20
        System.out.println("");

        Variables var2 = new Variables();
        System.out.println(var2.instanceVar); // 0// 0으로 초기화된 새로운 객체 생성

       // System.out.println(var2.classVar);//10// 인스턴스로도 클래스변수에 접근 가능, but 이러한 접근은 권장되지 않음
                                          // 클래스명으로해서 클래스전체에 속한 변수라는 것을 명확히 하며 사용하라는 뜻
        System.out.println("");

        //Variables.method(); // 잘못된 접근, 객체로 접근해야함

        var.method(9);
        // System.out.println(var.method(9)); //return값이 있어야 가능함


    }
}
```

- 클래스 변수는 인스턴스 생성하지 않아도 접근가능 이외에 변수에는 인스턴스 생성해야 함
- 객체로도 클래스 변수에 접근 가능하지만 클래스명으로 접근하는걸 권장(클래스 변수라는걸 구분하기 위함)
