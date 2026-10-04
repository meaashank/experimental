package org.apache.http;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX INFO: loaded from: classes6.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public final class HttpVersion extends ProtocolVersion {
    public static final String HTTP = "HTTP";
    public static final HttpVersion HTTP_0_9 = new HttpVersion(0, 9);
    public static final HttpVersion HTTP_1_0 = new HttpVersion(1, 0);
    public static final HttpVersion HTTP_1_1 = new HttpVersion(1, 1);
    private static final long serialVersionUID = -5856653513894415344L;

    public HttpVersion(int i10, int i11) {
        super(HTTP, i10, i11);
    }

    @Override // org.apache.http.ProtocolVersion
    public ProtocolVersion forVersion(int i10, int i11) {
        if (i10 == this.major && i11 == this.minor) {
            return this;
        }
        if (i10 == 1) {
            if (i11 == 0) {
                return HTTP_1_0;
            }
            if (i11 == 1) {
                return HTTP_1_1;
            }
        }
        return (i10 == 0 && i11 == 9) ? HTTP_0_9 : new HttpVersion(i10, i11);
    }
}
