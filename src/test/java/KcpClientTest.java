import com.muedsa.taffy.KcpChannelConfig;
import com.muedsa.taffy.utils.HexFormatUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import kcp.highway.KcpClient;
import kcp.highway.KcpListener;
import kcp.highway.Ukcp;
import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;

public class KcpClientTest {

    @Test
    public void kcpClientTest() {
        KcpClient kcpClient = new KcpClient();
        kcpClient.init(KcpChannelConfig.newConfig(0), new KcpListener() {
            @Override
            public void onConnected(Ukcp ukcp) {
                System.out.println("onConnected");
                ukcp.write(Unpooled.wrappedBuffer(new byte[]{0, 0, 0, 0}));
            }

            @Override
            public void handleReceive(ByteBuf byteBuf, Ukcp ukcp) {
                System.out.println("handleReceive:");
                byte[] bytes = new byte[byteBuf.capacity()];
                byteBuf.getBytes(0, bytes);
                System.out.println(HexFormatUtils.toHex(bytes));
            }

            @Override
            public void handleException(Throwable ex, Ukcp ukcp) {
                System.out.println("handleException");
                ex.printStackTrace();
            }

            @Override
            public void handleClose(Ukcp ukcp) {
                System.out.println("handleClose");
                //kcpClient.stop();
            }
        });
        kcpClient.connect(new InetSocketAddress("127.0.0.1", 22102), KcpChannelConfig.newConfig(0));
    }
}
