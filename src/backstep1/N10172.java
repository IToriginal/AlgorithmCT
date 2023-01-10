package backstep1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * 강아지 출력 - Escape Sequance
 * ------------------------------------------------------------------------------
 * 문자를 출력하기 위해 조합을 만들어 출력
 * BufferWriter 사용
 * 자동 개행이 되지 않기 때문에 newline을 사용해서 개행 처리를 하거나 write 끝에 \n 으로 처리한다.
 * stream에 들어있는 데이터를 처리기 위해 flush()로 비운다
 * Buffered를 사용했기 때문에 반드시 .close()로 스트림을 종료 시킨다
 */
public class N10172 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write("|\\_/|");
        bufferedWriter.newLine();

        bufferedWriter.write("|q p|   /}");
        bufferedWriter.newLine();

        bufferedWriter.write("( 0 )\"\"\"\\");
        bufferedWriter.newLine();

        bufferedWriter.write("|\"^\"`    |");
        bufferedWriter.newLine();

        bufferedWriter.write("||_/=\\\\__|");
        bufferedWriter.newLine();

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}