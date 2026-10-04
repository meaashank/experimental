package com.mbridge.msdk.tracker.network.toolbox;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ImagesContract;
import com.mbridge.msdk.tracker.network.p;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f160075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f160076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f160077d;

    public j(String str, String str2, p pVar) {
        this.f160075b = str;
        this.f160076c = str2;
        this.f160077d = pVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    @NonNull
    public List<InetAddress> a(@NonNull String str) throws UnknownHostException {
        try {
            List<InetAddress> listA = com.mbridge.msdk.thrid.okhttp.n.f159670a.a(str);
            return (listA.isEmpty() && i.b().c(this.f160075b, this.f160076c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : listA;
        } catch (UnknownHostException e10) {
            if (i.b().c(this.f160075b, this.f160076c, str)) {
                return a(str, new UnknownHostException(e10.getMessage()));
            }
            throw e10;
        }
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        p pVar = this.f160077d;
        if (pVar != null) {
            pVar.c(ImagesContract.LOCAL);
        }
        return i.b().a(str, unknownHostException);
    }
}
