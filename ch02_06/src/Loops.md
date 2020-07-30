# 반복문 (Loops)

- 종류로는 for 문, while 문 등이 있음
- 초기화 - 반복문을 실행하기 위해서 증감할 변수를 초기화
- 조건식 - 반복문을 실행할 조건(또는 종료할 조건)
- 실행문 - 조건식이 참(또는 거짓)일 경우 실행할 코드
- 증감식 - 실행문이 실행된 후에 변수에 증감을 주는 것

## for문

- for(초기화;조건식;증감식){실행문}
- 초화는 처음 한번만 , 다음 반복에서는 바로 증감식으로 감
- i=0으로 시작 하는 이유는 유구한 전통, 배열과 연관됨

```
      for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("");

        // 증감식에도 대입연산자가 들어갈 수 있음
        for (int i = 0; i < 5; i += 2) {
            System.out.println(i);
        }
        System.out.println("");

        // 4~0 을 출력
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("");
```

### Nested for 문

- Nested if 문과 같이 for문이 중첩된 형태
- i=0 일때 j가 0~5까지 증가 하는 것을 i =5일때까지 반복하는 반복문
```
 // nested for (중첩된 for문)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("(%d, %d)\n", i, j);
            }
        } // 5*5 = 25
```

### for문 유의사항

- for문 다음에 중괄호를 안쓰면 for문 코드 한줄만 실행됨
= 그 그것을 확장 하기 위해 {}을 사용해서 {}안에 코드를 다 실행함

```
for (int i = 0; i < 5; i++)
            System.out.print(i);    // iterated -용어기억
        System.out.println(""); //not iterated(반복되다)
```

        
## while 문
- for문의 초기화 문이 바깥으로가고 실행문 증감식이 수행문안쪽으로 들어온 형태의 반복문
- for문과의 차이점으로 while문에서 int i는 반복문 밖에서 선언 되어서 코드전체에서 사용불가
- 반면 for문에서 선언된 int i 는 지역변수로 for문안에서만 사용되기에 재사용 가능
```
int i = 0;
//        while (i<5) {
//            System.out.println(i);
//            i++;
//        }


```

## 제어문 - break, continue 문

- 제어문(반복문,조건문)에서 countinue문을 만나면 수행문을 더이상 수행하지 않고 바로 증감식으로 올라감
- break문을 만나면 제어문을 빠져나감.
- label을 설정하면 nested 제어문에서 가까운 제어문이 아닌 원하는 위치의 제어문으로 break하거나 continue할 수 잇음
- label은 변수와 같이 이름을 설정할 수 있음
```
 for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i); // if문과 함께 사용됨.
        }

        // label
        outer:
        for(int i = 0; i<5 ; i ++){
            for (int j = 0; j < 5; j ++){
                if(i ==3 ){
                    System.out.println("continue called");
                    continue outer; 
                }
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }

```
       

