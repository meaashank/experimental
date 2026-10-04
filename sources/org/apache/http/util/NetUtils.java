package org.apache.http.util;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes6.dex */
public final class NetUtils {
    public static void formatAddress(StringBuilder sb2, SocketAddress socketAddress) {
        Args.notNull(sb2, "Buffer");
        Args.notNull(socketAddress, "Socket address");
        if (!(socketAddress instanceof InetSocketAddress)) {
            sb2.append(socketAddress);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        InetAddress address = inetSocketAddress.getAddress();
        Object hostAddress = address;
        if (address != null) {
            hostAddress = address.getHostAddress();
        }
        sb2.append(hostAddress);
        sb2.append(':');
        sb2.append(inetSocketAddress.getPort());
    }
}
