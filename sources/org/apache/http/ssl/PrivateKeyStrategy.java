package org.apache.http.ssl;

import java.net.Socket;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface PrivateKeyStrategy {
    String chooseAlias(Map<String, PrivateKeyDetails> map, Socket socket);
}
