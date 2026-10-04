package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import java.io.InputStream;
import ub.InterfaceC5664b;

/* JADX INFO: loaded from: classes7.dex */
public class A<T> extends y<T> implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f194149a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC5664b f194150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4281c f194151c;

    public long a() {
        return this.f194151c.d();
    }

    public InputStream b() {
        return this.f194151c;
    }

    @Override // com.tencent.qcloud.core.http.y
    public T convert(h<T> hVar) throws QCloudServiceException, QCloudClientException {
        if (this.f194149a) {
            return null;
        }
        h.c(hVar);
        long[] jArrD = yb.d.d(hVar.f194288b.T0("Content-Range"));
        this.f194151c = new C4281c(hVar.a(), jArrD != null ? (jArrD[1] - jArrD[0]) + 1 : hVar.e(), this.f194150b);
        return null;
    }

    public void enableQuic(boolean z10) {
        this.f194149a = z10;
    }

    @Override // com.tencent.qcloud.core.http.u
    public long getBytesTransferred() {
        C4281c c4281c = this.f194151c;
        if (c4281c != null) {
            return c4281c.k();
        }
        return 0L;
    }

    public InterfaceC5664b getProgressListener() {
        return this.f194150b;
    }

    @Override // com.tencent.qcloud.core.http.u
    public void setProgressListener(InterfaceC5664b interfaceC5664b) {
        this.f194150b = interfaceC5664b;
    }
}
