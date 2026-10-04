package org.apache.http.impl.io;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i10, HttpParams httpParams) throws IOException {
        Args.notNull(socket, "Socket");
        i10 = i10 < 0 ? socket.getSendBufferSize() : i10;
        init(socket.getOutputStream(), i10 < 1024 ? 1024 : i10, httpParams);
    }
}
