import com.github.clumsy48.io_nio.ByteStreams
import spock.lang.Specification

class ByteStreamsSpec extends Specification {

   def "testByteStreams"(){
       given:
       ByteStreams bs = new ByteStreams();
       when:
       bs.run(getClass().getClassLoader().getResource("in.txt").getPath(),getClass().getClassLoader().getResource("out.txt").getPath())
       then:
       1==1
   }

    def "binary string"(){
        expect:
        printf Integer.toBinaryString(65^255);
    }
}
