/**
 * 도메인 뒤집기
 *
 * 주어진 홈페이지 주소를 .을 기준으로 각각 뒤집어 출력하시오.
 *
 * ex) www.google.com -> www.elgoog.moc
 *
 * 인자
 * string: 홈페이지 주소
 */

public class DomainReverse {

        public static void main(String[] args) {

            // #1 replace()
            String string = "www.google.com";

            System.out.println(string.replace("google.com","elgoog.moc"));

            // #2 split()

            String[] strA = string.split("\\.",0);

            for (int i = 0; i <strA.length;i++){

                for(int j = strA[i].length()-1 ; j>=0 ; j-- ) {
                    System.out.print(strA[i].charAt(j));
                }
                if(i != strA.length-1){
                    System.out.print('.');
                }
            }
            System.out.println("");

            // #3 String Buffer

            for(int i = 0 ; i < strA.length;i++  ){
                StringBuffer sBuffer = new StringBuffer(strA[i]);
                System.out.print(sBuffer.reverse());
                if(i != strA.length-1){
                    System.out.print('.');
                }
            }
        }
}
